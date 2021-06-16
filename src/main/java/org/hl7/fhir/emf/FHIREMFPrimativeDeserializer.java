package org.hl7.fhir.emf;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Boolean;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Integer;
import org.hl7.fhir.String;
import org.hl7.fhir.Time;
import org.hl7.fhir.Uri;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

public class FHIREMFPrimativeDeserializer<T> extends StdDeserializer<T> {

	private static final Logger LOG = LoggerFactory.getLogger(FHIREMFPrimativeDeserializer.class);

	private static final long serialVersionUID = -8784891711775214918L;

	public static final java.lang.String PACKAGE_NAME = "org.hl7.fhir";

	public final PRIMATIVE INSTANCE;

	public enum PRIMATIVE {
		BASE64(Base64Binary.class), BOOLEAN(Boolean.class), DATE(Date.class), DATETIME(DateTime.class),
		DECIMAL(Decimal.class), INTEGER(Integer.class), STRING(String.class), TIME(Time.class), URI(Uri.class);

		public final Class<?> clazz;
		private static final Map<java.lang.String, PRIMATIVE> BY_LABEL = new HashMap<>();

		static {
			for (PRIMATIVE primative : values()) {
				BY_LABEL.put(primative.name(), primative);
			}
		}

		private PRIMATIVE(Class<?> clazz) {
			this.clazz = clazz;
		}

		public static PRIMATIVE valueOfLabel(java.lang.String label) {
			return BY_LABEL.get(label);
		}
	}

	public FHIREMFPrimativeDeserializer() {
		this(null);
	}

	public FHIREMFPrimativeDeserializer(Class<T> clazz) {
		super(clazz);
		this.INSTANCE = PRIMATIVE.valueOfLabel(clazz.getSimpleName());
	}

	@SuppressWarnings("unchecked")
	@Override
	public T deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		LOG.debug("Called deser==>");
		JsonNode node = jp.getCodec().readTree(jp);
		switch (INSTANCE) {
		case BASE64:
			Base64Binary base64Binary = FhirFactory.eINSTANCE.createBase64Binary();
			base64Binary.setValue(node.binaryValue());
			return (T) base64Binary;
		case BOOLEAN:
			Boolean b = FhirFactory.eINSTANCE.createBoolean();
			b.setValue(node.asBoolean());
			return (T) b;
		case DATE:
			Date date = FhirFactory.eINSTANCE.createDate();
			XMLGregorianCalendar xmlGC1 = null;
			try {
				xmlGC1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(node.asText());
			} catch (DatatypeConfigurationException e) {
				LOG.error("", e);
				e.printStackTrace();
			}
			date.setValue(xmlGC1);
			return (T) date;
		case DATETIME:
			DateTime dt = FhirFactory.eINSTANCE.createDateTime();
			XMLGregorianCalendar xmlGC2 = null;
			try {
				xmlGC2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(node.asText());
			} catch (DatatypeConfigurationException e) {
				LOG.error("", e);
				e.printStackTrace();
			}
			dt.setValue(xmlGC2);
			return (T) dt;
		case DECIMAL:
			Decimal decimal = FhirFactory.eINSTANCE.createDecimal();
			decimal.setValue(node.asDouble());
			return (T) decimal;
		case INTEGER:
			Integer integer = FhirFactory.eINSTANCE.createInteger();
			integer.setValue(node.asInt());
			return (T) integer;
		case TIME:
			Time t = FhirFactory.eINSTANCE.createTime();
			XMLGregorianCalendar xmlGC3 = null;
			try {
				xmlGC3 = DatatypeFactory.newInstance().newXMLGregorianCalendar(node.asText());
			} catch (DatatypeConfigurationException e) {
				LOG.error("", e);
				e.printStackTrace();
			}
			t.setValue(xmlGC3);
			return (T) t;
		case URI:
			Uri uri = FhirFactory.eINSTANCE.createUri();
			uri.setValue(node.asText());
			return (T) uri;
		case STRING:
		default:
			String s = FhirFactory.eINSTANCE.createString();
			s.setValue(node.asText(PACKAGE_NAME));
			return (T) s;
		}
	}

	@Override
	public Object deserializeWithType(JsonParser p, DeserializationContext ctxt, TypeDeserializer typeDeserializer)
			throws IOException {
		LOG.debug("Called deserType==>");
		return super.deserializeWithType(p, ctxt, typeDeserializer);
	}

}
