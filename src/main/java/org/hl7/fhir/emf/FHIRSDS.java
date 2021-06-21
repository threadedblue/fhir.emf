package org.hl7.fhir.emf;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emfjson.jackson.annotations.EcoreTypeInfo;
import org.emfjson.jackson.databind.EMFContext;
import org.emfjson.jackson.databind.deser.ReferenceEntry;
import org.emfjson.jackson.resource.JsonResource;
import org.emfjson.jackson.resource.JsonResourceFactory;
import org.emfjson.jackson.utils.ValueReader;
import org.emfjson.jackson.utils.ValueWriter;
import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Boolean;
import org.hl7.fhir.ContactPointSystem;
import org.hl7.fhir.ContactPointUse;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.IdentifierUse;
import org.hl7.fhir.Integer;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.NameUse;
import org.hl7.fhir.Oid;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.String;
import org.hl7.fhir.Time;
import org.hl7.fhir.UnsignedInt;
import org.hl7.fhir.Uri;
import org.hl7.fhir.Url;
import org.hl7.fhir.Uuid;
import org.hl7.fhir.emf.module.FHIREMFModule;
import org.hl7.fhir.emf.util.Registrar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3._1999.xhtml.XhtmlPackage;
import org.w3.xml._1998.namespace.NamespacePackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;

public class FHIRSDS implements Runnable {

	private static final Logger LOG = LoggerFactory.getLogger(FHIRSDS.class);

	public enum FORMAT {
		XML, JSON, RDF_TTL, RDF_N3, FHIR_PATH
	}

	private static ResourceSet resourceSet = Registrar.getResourceSet();
	private static Resource resource;
	private static FHIREMFModule module = new FHIREMFModule();
	private static ObjectMapper mapper = new ObjectMapper();
	public static final java.lang.String RESOURCE_TYPE = "resourceType";
	public static final java.lang.String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
	public static final URI DEFAULT_URI = URI.createURI("http://localhost");
	static {
		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		mapper.setDateFormat(new SimpleDateFormat(DATE_FORMAT, Locale.ENGLISH));
		mapper.setTimeZone(TimeZone.getDefault());
		LOG.debug("mapper set==>");
		Registrar.registerPackage(FhirPackage.eNS_URI, FhirPackage.eINSTANCE);
		Registrar.registerPackage(XhtmlPackage.eNS_URI, XhtmlPackage.eINSTANCE);
		Registrar.registerPackage(NamespacePackage.eNS_URI, NamespacePackage.eINSTANCE);

		module.setTypeInfo(new EcoreTypeInfo("resourceType", new ValueReader<java.lang.String, EClass>() {
			@Override
			public EClass readValue(java.lang.String value, DeserializationContext context) {
				LOG.trace("Called type deser==>");
				return (EClass) FhirPackage.eINSTANCE.getEClassifier(value);
			}
		}, new ValueWriter<EClass, java.lang.String>() {
			@Override
			public java.lang.String writeValue(EClass value, SerializerProvider context) {
				LOG.trace("Called type ser==>");
				return value.getName();
			}
		}));

		module.setReferenceSerializer(new JsonSerializer<EObject>() {
			@Override
			public void serialize(EObject v, JsonGenerator g, SerializerProvider s) throws IOException {
				LOG.trace("Called ref ser==>");
				g.writeString(((JsonResource) v.eResource()).getID(v));
			}
		});
		module.setReferenceDeserializer(new JsonDeserializer<ReferenceEntry>() {
			@Override
			public ReferenceEntry deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException {
				LOG.trace("Called ref deser==>");
				final EObject parent = EMFContext.getParent(ctxt);
				final EReference reference = EMFContext.getReference(ctxt);

				if (parser.getCurrentToken() == JsonToken.FIELD_NAME) {
					parser.nextToken();
				}

				return new ReferenceEntry.Base(parent, reference, parser.getText());
			}
		});
		
		LOG.trace("Called add ser/deser==>");
		
		module.addSerializer(Base64Binary.class, new FHIREMFPrimativeSerializer());
		module.addDeserializer(Base64Binary.class, new FHIREMFPrimativeDeserializer<Base64Binary>());

		module.addSerializer(Boolean.class, new FHIREMFPrimativeSerializer());
		module.addDeserializer(Boolean.class, new FHIREMFPrimativeDeserializer<Boolean>());

		module.addSerializer(ContactPointSystem.class, new FHIREMFPrimativeSerializer());
		module.addDeserializer(ContactPointSystem.class, new FHIREMFPrimativeDeserializer<ContactPointSystem>());

		module.addSerializer(ContactPointUse.class, new FHIREMFPrimativeSerializer());
		module.addDeserializer(ContactPointUse.class, new FHIREMFPrimativeDeserializer<ContactPointUse>());

		module.addSerializer(Date.class, new FHIREMFPrimativeSerializer());
		module.addDeserializer(Date.class, new FHIREMFPrimativeDeserializer<Date>());

		module.addSerializer(DateTime.class, new FHIREMFPrimativeSerializer());
		module.addDeserializer(DateTime.class, new FHIREMFPrimativeDeserializer<DateTime>());

		module.addSerializer(Decimal.class, new FHIREMFPrimativeSerializer());
		module.addDeserializer(Decimal.class, new FHIREMFPrimativeDeserializer<Decimal>());

		module.addSerializer(IdentifierUse.class, new FHIREMFPrimativeSerializer());
		module.addDeserializer(IdentifierUse.class, new FHIREMFPrimativeDeserializer<IdentifierUse>());

		module.addSerializer(Integer.class, new FHIREMFPrimativeSerializer());
		module.addDeserializer(Integer.class, new FHIREMFPrimativeDeserializer<Integer>());

		module.addSerializer(Markdown.class, new FHIREMFPrimativeSerializer());
		module.addDeserializer(Markdown.class, new FHIREMFPrimativeDeserializer<Markdown>());

		module.addSerializer(NameUse.class, new FHIREMFPrimativeSerializer());
		module.addDeserializer(NameUse.class, new FHIREMFPrimativeDeserializer<NameUse>());

		module.addSerializer(Oid.class, new FHIREMFPrimativeSerializer());
		module.addDeserializer(Oid.class, new FHIREMFPrimativeDeserializer<Oid>());

		module.addSerializer(PositiveInt.class, new FHIREMFPrimativeSerializer());
		module.addDeserializer(PositiveInt.class, new FHIREMFPrimativeDeserializer<PositiveInt>());

		module.addSerializer(String.class, new FHIREMFPrimativeSerializer());
		module.addDeserializer(String.class, new FHIREMFPrimativeDeserializer<String>());

		module.addSerializer(Time.class, new FHIREMFPrimativeSerializer());
		module.addDeserializer(Time.class, new FHIREMFPrimativeDeserializer<Time>());

		module.addSerializer(UnsignedInt.class, new FHIREMFPrimativeSerializer());
		module.addDeserializer(UnsignedInt.class, new FHIREMFPrimativeDeserializer<UnsignedInt>());

		module.addSerializer(Uri.class, new FHIREMFPrimativeSerializer());
		module.addDeserializer(Uri.class, new FHIREMFPrimativeDeserializer<Uri>());

		module.addSerializer(Url.class, new FHIREMFPrimativeSerializer());
		module.addDeserializer(Url.class, new FHIREMFPrimativeDeserializer<Url>());

		module.addSerializer(Uuid.class, new FHIREMFPrimativeSerializer());
		module.addDeserializer(Uuid.class, new FHIREMFPrimativeDeserializer<Uuid>());

		mapper.registerModule(module);
	}

	public static EObject load(java.lang.String url, FORMAT fmt) {
		java.net.URI uri = java.net.URI.create(url);
		return load(uri, fmt);
	}

	public static EObject load(java.net.URI uri, FORMAT fmt) {
		InputStream reader = null;
		try {
			reader = uri.toURL().openStream();
		} catch (IOException e) {
			LOG.error("", e);
		}
		return load(reader, fmt);
	}

	public static EObject load(InputStream reader, FORMAT fmt) {
		EObject eObject = null;
		switch (fmt) {
		case XML:
			try {
				Resource resource = Registrar.createResource(DEFAULT_URI);
				resource.load(reader, Collections.EMPTY_MAP);
				EList<EObject> eList = resource.getContents();
				if (eList.size() > 0) {
					eObject = (EObject) resource.getContents().get(0);
					return eObject;
				} else {
					LOG.error(
							"json=" + resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().get("json"));
					LOG.error("xml=" + resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().get("xml"));
					LOG.error("Resource had no contents; returning null");
				}
			} catch (IOException e) {
				LOG.error("", e);
			} catch (ClassCastException e) {
				LOG.error("Cast", e);
			} catch (NullPointerException e) {
				LOG.debug("reader=" + reader);
				LOG.debug("resourceSet=" + resourceSet);
				LOG.debug("resource=" + resource);
				for (Map.Entry<java.lang.String, Object> entry : resourceSet.getResourceFactoryRegistry()
						.getExtensionToFactoryMap().entrySet()) {
					LOG.debug("key=" + entry.getKey() + " value=" + entry.getValue().getClass().getName());
				}
				LOG.error("NPE", e);
			} catch (Exception e) {
				LOG.error("", e);
			}
			return null;
		case JSON:
			Registrar.associateExtension("json", new JsonResourceFactory(mapper));
			try {
				JsonNode data = mapper.readTree(reader);
				Class<?> clazz = findResourceType(data);
				eObject = (EObject) mapper.reader()
						.withAttribute(EMFContext.Attributes.RESOURCE_SET, resourceSet)
						.withAttribute(EMFContext.Attributes.RESOURCE_URI, DEFAULT_URI)
						.forType(clazz)
						.readValue(data);
			} catch (IOException | ClassNotFoundException e) {
				LOG.error("", e);
			}
			break;
		case RDF_TTL:
//			Registrar.associateExtension("ttl", new TTLResourceFactoryImpl());
			break;
		case RDF_N3:
//			Registrar.associateExtension("n3", new N3ResourceFactory());
			break;
		case FHIR_PATH:
//			Registrar.associateExtension("path", new FHIRPatHResourceFactory());
			break;
		default:
		}
		return eObject;
	}

	static Class<?> findResourceType(JsonNode json) throws ClassNotFoundException {
		JsonNode rT = json.findPath(RESOURCE_TYPE);
		java.lang.String className = rT.asText();
		return Class.forName(java.lang.String.format("org.hl7.fhir.%s", className));
	}

//	public static OutputStream save(EObject eObject, java.lang.String url) {
//		URI uri = URI.createURI(url);
//		BufferedOutputStream writer = null;
//		resource = resourceSet.createResource(uri);
//		resource.getContents().add(eObject);
//		try {
//			writer = new BufferedOutputStream(new FileOutputStream(url));
//			resource.save(writer, Collections.EMPTY_MAP);
//			writer.close();
//		} catch (IOException e) {
//			LOG.error("", e);
//		}
//		return writer;
//	}

	public static OutputStream save(EObject eObject, java.lang.String url, FORMAT fmt) {
		URI uri = URI.createURI(url);
		BufferedOutputStream writer = null;
		resource = resourceSet.createResource(uri);
		resource.getContents().add(eObject);
		java.lang.String s = null;
		try {
			writer = new BufferedOutputStream(new FileOutputStream(url));
			s = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(resource);
			writer.write(s.getBytes());
			writer.close();
		} catch (JsonProcessingException e) {
			LOG.error("", e);
		} catch (IOException e) {
			LOG.error("", e);
		} catch (NullPointerException e) {
			LOG.error("mapper=" + mapper);
			LOG.error("resource=" + resource);
			LOG.error("s=" + s);
			LOG.error("writer=" + writer);
		}
		return writer;
	}

	@Override
	public void run() {
	}

	public static void main(String[] args) {
		FHIRSDS app = new FHIRSDS();
//		URL patientURL = app.getClass().getClassLoader().getResource("Alicia.json");
//		FHIRSDS.load(patientURL);
	}
}
