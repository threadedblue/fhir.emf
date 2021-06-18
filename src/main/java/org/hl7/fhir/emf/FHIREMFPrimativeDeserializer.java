package org.hl7.fhir.emf;

import java.io.IOException;

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

public class FHIREMFPrimativeDeserializer<T> extends StdDeserializer<T> {

	private static final Logger LOG = LoggerFactory.getLogger(FHIREMFPrimativeDeserializer.class);

	private static final long serialVersionUID = -8784891711775214918L;

	public final PRIMATIVE INSTANCE;
	
	public FHIREMFPrimativeDeserializer() {
		this(null);
	}

	public FHIREMFPrimativeDeserializer(Class<T> clazz) {
		super(clazz);
		INSTANCE = PRIMATIVE.BY_LABEL.get(clazz.getSimpleName());
	}

	@SuppressWarnings("unchecked")
	@Override
	public T deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		LOG.debug("Called deser==>" + INSTANCE.name());
		JsonNode node = jp.getCodec().readTree(jp);
		switch (INSTANCE) {
		case BASE64:
			Base64Binary base64Binary = FhirFactory.eINSTANCE.createBase64Binary();
			base64Binary.setValue(node.binaryValue());
			return (T) base64Binary;
		case BOOLEAN:
			Boolean b = FhirFactory.eINSTANCE.createBoolean();
			b.setValue(node.asBoolean());
			LOG.trace("switch BOOLEAN==>" + node);
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
			LOG.trace("switch DATE==>" + node);
			date.setValue(xmlGC1);
			return (T) date;
		case DATETIME:
			LOG.trace("1=>");
			DateTime dt = FhirFactory.eINSTANCE.createDateTime();
			LOG.trace("2=>" + node.toPrettyString());
			XMLGregorianCalendar xmlGC2 = null;
			try {
				xmlGC2 = DatatypeFactory.newInstance().newXMLGregorianCalendar("2001-01-01T00:00:00");
				LOG.trace("3=>");
			} catch (DatatypeConfigurationException e) {
				LOG.error("", e);
				e.printStackTrace();
			}
			LOG.trace("switch DATETIME==>" + node);
			dt.setValue(xmlGC2);
			return (T) dt;
		case DECIMAL:
			Decimal decimal = FhirFactory.eINSTANCE.createDecimal();
			decimal.setValue(node.asDouble());
			LOG.trace("switch DECIMAL==>" + node);
			return (T) decimal;
		case INTEGER:
			Integer integer = FhirFactory.eINSTANCE.createInteger();
			integer.setValue(node.asInt());
			LOG.trace("switch INTEGER==>" + node);
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
			LOG.trace("switch TIME==>" + node);
			t.setValue(xmlGC3);
			return (T) t;
		case URI:
			Uri uri = FhirFactory.eINSTANCE.createUri();
			uri.setValue(node.asText());
			LOG.trace("switch URI==>" + node);
			return (T) uri;
		case STRING:
			LOG.trace("switch STRING==>" + node);
		default:
			String s = FhirFactory.eINSTANCE.createString();
			s.setValue(node.asText(node.asText()));
			LOG.trace("switch default==>" + node);
			return (T) s;
		}
	}
}
