package org.hl7.fhir.emf.util;

import java.io.IOException;
import java.math.BigInteger;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Boolean;
import org.hl7.fhir.ContactPointSystem;
import org.hl7.fhir.ContactPointSystemList;
import org.hl7.fhir.ContactPointUse;
import org.hl7.fhir.ContactPointUseList;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.IdentifierUse;
import org.hl7.fhir.IdentifierUseList;
import org.hl7.fhir.Integer;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.NameUse;
import org.hl7.fhir.NameUseList;
import org.hl7.fhir.Oid;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.String;
import org.hl7.fhir.Time;
import org.hl7.fhir.UnsignedInt;
import org.hl7.fhir.Uri;
import org.hl7.fhir.Url;
import org.hl7.fhir.Uuid;
import org.hl7.fhir.util.FhirSwitch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;

public class DeserializeSwitch<T> extends FhirSwitch<T> {

	private static final Logger LOG = LoggerFactory.getLogger(DeserializeSwitch.class);
	JsonNode node;

	public DeserializeSwitch() {
		super();
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseBase64Binary(Base64Binary object) {
		object = FhirFactory.eINSTANCE.createBase64Binary();
		try {
			object.setValue(node.binaryValue());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return (T) object;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseBoolean(Boolean object) {
		object = FhirFactory.eINSTANCE.createBoolean();
		object.setValue(node.asBoolean());
		return (T) object;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseContactPointSystem(ContactPointSystem object) {
		object = FhirFactory.eINSTANCE.createContactPointSystem();
		object.setValue(ContactPointSystemList.get(node.asText()));
		return (T) object;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseContactPointUse(ContactPointUse object) {
		object = FhirFactory.eINSTANCE.createContactPointUse();
		object.setValue(ContactPointUseList.get(node.asText()));
		return (T) object;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseDate(Date object) {
		object = FhirFactory.eINSTANCE.createDate();
		try {
			object.setValue(DatatypeFactory.newInstance().newXMLGregorianCalendar(node.asText()));
		} catch (DatatypeConfigurationException e) {
			LOG.error("", e);
		}
		return (T) object;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseDateTime(DateTime object) {
		object = FhirFactory.eINSTANCE.createDateTime();
		try {
			object.setValue(DatatypeFactory.newInstance().newXMLGregorianCalendar(node.asText()));
		} catch (DatatypeConfigurationException e) {
			LOG.error("", e);
		}
		return (T) object;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseDecimal(Decimal object) {
		object = FhirFactory.eINSTANCE.createDecimal();
		object.setValue(node.asDouble());
		return (T) object;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseIdentifierUse(IdentifierUse object) {
		object = FhirFactory.eINSTANCE.createIdentifierUse();
		object.setValue(IdentifierUseList.get(node.asText()));
		return (T) object;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseInteger(Integer object) {
		object = FhirFactory.eINSTANCE.createInteger();
		object.setValue(node.asInt(0));
		return (T) object;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseMarkdown(Markdown object) {
		object = FhirFactory.eINSTANCE.createMarkdown();
		object.setValue(node.asText());
		return (T) object;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseNameUse(NameUse object) {
		object = FhirFactory.eINSTANCE.createNameUse();
		object.setValue(NameUseList.get(node.asText()));
		return (T) object;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseOid(Oid object) {
		object = FhirFactory.eINSTANCE.createOid();
		object.setValue(node.asText());
		return (T) object;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T casePositiveInt(PositiveInt object) {
		object = FhirFactory.eINSTANCE.createPositiveInt();
		object.setValue(BigInteger.valueOf(node.asInt()));
		return (T) object;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseString(String object) {
		object = FhirFactory.eINSTANCE.createString();
		object.setValue(node.asText());
		return (T) object;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseTime(Time object) {
		object = FhirFactory.eINSTANCE.createTime();
		try {
			object.setValue(DatatypeFactory.newInstance().newXMLGregorianCalendar(node.asText()));
		} catch (DatatypeConfigurationException e) {
			LOG.error("", e);
		}
		return (T) object;

	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseUnsignedInt(UnsignedInt object) {
		object = FhirFactory.eINSTANCE.createUnsignedInt();
		object.setValue(BigInteger.valueOf(node.asInt()));
		return (T) object;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseUri(Uri object) {
		object = FhirFactory.eINSTANCE.createUri();
		object.setValue(node.asText());
		return (T) object;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseUrl(Url object) {
		object = FhirFactory.eINSTANCE.createUrl();
		object.setValue(node.asText());
		return (T) object;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseUuid(Uuid object) {
		object = FhirFactory.eINSTANCE.createUuid();
		object.setValue(node.asText());
		return (T) object;
	}

	public JsonNode getNode() {
		return node;
	}

	public void setNode(JsonNode node) {
		this.node = node;
	}
}
