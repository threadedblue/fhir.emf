package org.hl7.fhir.emf;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.emfjson.jackson.annotations.EcoreTypeInfo;
import org.emfjson.jackson.databind.EMFContext;
import org.emfjson.jackson.databind.deser.ReferenceEntry;
import org.emfjson.jackson.module.EMFModule;
import org.emfjson.jackson.resource.JsonResource;
import org.emfjson.jackson.resource.JsonResourceFactory;
import org.emfjson.jackson.utils.ValueReader;
import org.emfjson.jackson.utils.ValueWriter;
import org.hl7.fhir.Bundle;
import org.hl7.fhir.BundleType;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.String;
import org.hl7.fhir.impl.ResourceContainerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3._1999.xhtml.XhtmlPackage;
import org.w3.xml._1998.namespace.NamespacePackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;

public class FHIRSDS implements Runnable {

	private static final Logger LOG = LoggerFactory.getLogger(FHIRSDS.class);

	private static ResourceSet resourceSet = new ResourceSetImpl();
	private static Resource resource;
	private static EMFModule module = new EMFModule();
	private static ObjectMapper mapper = new ObjectMapper();

	static {
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		mapper.disable(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS);
		mapper.disable(DeserializationFeature.WRAP_EXCEPTIONS);
		mapper.disable(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE);
		resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(FhirPackage.eNS_URI, FhirPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(XhtmlPackage.eNS_URI, XhtmlPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(NamespacePackage.eNS_URI, NamespacePackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());

		module.setTypeInfo(new EcoreTypeInfo("type", new ValueReader<java.lang.String, EClass>() {
			@Override
			public EClass readValue(java.lang.String value, DeserializationContext context) {
				return (EClass) FhirPackage.eINSTANCE.getEClassifier(value);
			}
		}, new ValueWriter<EClass, java.lang.String>() {
			@Override
			public java.lang.String writeValue(EClass value, SerializerProvider context) {
				return value.getName();
			}
		}));

		mapper.registerModule(module);
		JsonResourceFactory factory = new JsonResourceFactory(mapper);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("json", factory);

		module.setReferenceSerializer(new JsonSerializer<EObject>() {
			@Override
			public void serialize(EObject v, JsonGenerator g, SerializerProvider s) throws IOException {
				LOG.debug(((JsonResource) v.eResource()).getID(v));
				g.writeString(((JsonResource) v.eResource()).getID(v));
			}
		});
		module.setReferenceDeserializer(new JsonDeserializer<ReferenceEntry>() {
			@Override
			public ReferenceEntry deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException {
				final EObject parent = EMFContext.getParent(ctxt);
				final EReference reference = EMFContext.getReference(ctxt);

				if (parser.getCurrentToken() == JsonToken.FIELD_NAME) {
					parser.nextToken();
				}

				return new ReferenceEntry.Base(parent, reference, parser.getText());
			}
		});
		JsonNode data = mapper.createObjectNode()
				.put("_id", 1)
				.put("userId", "u1");
		
		module.addDeserializer(org.hl7.fhir.Resource.class, new ResourceDeserializer());
		module.addDeserializer(Bundle.class, new FHIREMFBundleDeserializer());
		module.addDeserializer(ResourceContainerImpl.class, new FHIREMFResourceContainerDeserializer(ResourceContainerImpl.class));
		module.addDeserializer(BundleType.class, new FHIREMFBundleTypeDeserializer());
	}

	public static EObject load(URL url) {
		URI uri = URI.createURI(url.toString());
		BufferedInputStream reader = null;
		try {
			resource = resourceSet.createResource(uri);
			reader = new BufferedInputStream(url.openConnection().getInputStream());
			resource.load(reader, Collections.EMPTY_MAP);
			EList<EObject> eList = resource.getContents();
			if (eList.size() > 0) {
				EObject eObject = (EObject) resource.getContents().get(0);
				return eObject;
			} else {
				LOG.error("json=" + resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().get("json"));
				LOG.error("xml=" + resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().get("xml"));
				LOG.error("Resource had no contents; returning null");
			}
		} catch (IOException e) {
			LOG.error("", e);
		} catch (ClassCastException e) {
			LOG.error("Cast", e);
		} catch (NullPointerException e) {
			LOG.debug("reader=" + reader);
			LOG.debug("url=" + url);
			LOG.debug("uri=" + uri);
			LOG.debug("resourceSet=" + resourceSet);
			LOG.debug("resource=" + resource);
			for (Map.Entry<java.lang.String, Object> entry : resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.entrySet()) {
				LOG.debug("key=" + entry.getKey() + " value=" + entry.getValue().getClass().getName());
			}
			LOG.error("NPE", e);
		} catch (Exception e) {
			LOG.error("", e);
		}
		return null;
	}

	public static EObject loadFromJSON(InputStream reader, java.lang.String url, Class<?> clazz) {
		URI uri = URI.createURI(url);
		resource = resourceSet.createResource(uri);
		EObject eObject = null;
		try {
			eObject = (EObject) mapper.reader()
					.withAttribute(EMFContext.Attributes.RESOURCE, resource)
					.forType(clazz)
					.readValue(reader);
		} catch (IOException e) {
			LOG.error("" , e);
		}
		return eObject;
	}

	public static OutputStream save(EObject eObject, java.lang.String url) {
		URI uri = URI.createURI(url);
		BufferedOutputStream writer = null;
		resource = resourceSet.createResource(uri);
		resource.getContents().add(eObject);
		try {
			writer = new BufferedOutputStream(new FileOutputStream(url));
			resource.save(writer, Collections.EMPTY_MAP);
			writer.close();
		} catch (IOException e) {
			LOG.error("" , e);
		}
		return writer;
	}

	public static OutputStream saveAsJSON(EObject eObject, java.lang.String url) {
		URI uri = URI.createURI(url);
		BufferedOutputStream writer = null;
		resource = resourceSet.createResource(uri);
		resource.getContents().add(eObject);

		try {
			writer = new BufferedOutputStream(new FileOutputStream(url));
			java.lang.String s = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(resource);
			writer.write(s.getBytes());
			writer.close();
		} catch (JsonProcessingException e) {
			LOG.error("" , e);
		} catch (IOException e) {
			LOG.error("" , e);
		}
		return writer;
	}

	@Override
	public void run() {
	}

	public static void main(String[] args) {
		FHIRSDS app = new FHIRSDS();
		URL patientURL = app.getClass().getClassLoader().getResource("Alicia.json");
		FHIRSDS.load(patientURL);
	}
}
