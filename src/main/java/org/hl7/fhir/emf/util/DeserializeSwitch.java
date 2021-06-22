package org.hl7.fhir.emf.util;

import java.io.IOException;
import java.math.BigInteger;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Boolean;
import org.hl7.fhir.BundleType;
import org.hl7.fhir.BundleTypeList;
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
	public T caseBase64Binary(Base64Binary eObject) {
		eObject = FhirFactory.eINSTANCE.createBase64Binary();
		try {
			eObject.setValue(node.binaryValue());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return (T) eObject;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseBoolean(Boolean eObject) {
		eObject = FhirFactory.eINSTANCE.createBoolean();
		eObject.setValue(node.asBoolean());
		return (T) eObject;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseBundleType(BundleType eObject) {
		eObject = FhirFactory.eINSTANCE.createBundleType();
		eObject.setValue(BundleTypeList.get(node.asText()));
		return (T) eObject;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseContactPointSystem(ContactPointSystem eObject) {
		eObject = FhirFactory.eINSTANCE.createContactPointSystem();
		eObject.setValue(ContactPointSystemList.get(node.asText()));
		return (T) eObject;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseContactPointUse(ContactPointUse eObject) {
		eObject = FhirFactory.eINSTANCE.createContactPointUse();
		eObject.setValue(ContactPointUseList.get(node.asText()));
		return (T) eObject;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseDate(Date eObject) {
		eObject = FhirFactory.eINSTANCE.createDate();
		try {
			eObject.setValue(DatatypeFactory.newInstance().newXMLGregorianCalendar(node.asText()));
		} catch (DatatypeConfigurationException e) {
			LOG.error("", e);
		}
		return (T) eObject;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseDateTime(DateTime eObject) {
		eObject = FhirFactory.eINSTANCE.createDateTime();
		try {
			eObject.setValue(DatatypeFactory.newInstance().newXMLGregorianCalendar(node.asText()));
		} catch (DatatypeConfigurationException e) {
			LOG.error("", e);
		}
		return (T) eObject;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseDecimal(Decimal eObject) {
		eObject = FhirFactory.eINSTANCE.createDecimal();
		eObject.setValue(node.asDouble());
		return (T) eObject;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseIdentifierUse(IdentifierUse eObject) {
		eObject = FhirFactory.eINSTANCE.createIdentifierUse();
		eObject.setValue(IdentifierUseList.get(node.asText()));
		return (T) eObject;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseInteger(Integer eObject) {
		eObject = FhirFactory.eINSTANCE.createInteger();
		eObject.setValue(node.asInt(0));
		return (T) eObject;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseMarkdown(Markdown eObject) {
		eObject = FhirFactory.eINSTANCE.createMarkdown();
		eObject.setValue(node.asText());
		return (T) eObject;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseNameUse(NameUse eObject) {
		eObject = FhirFactory.eINSTANCE.createNameUse();
		eObject.setValue(NameUseList.get(node.asText()));
		return (T) eObject;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseOid(Oid eObject) {
		eObject = FhirFactory.eINSTANCE.createOid();
		eObject.setValue(node.asText());
		return (T) eObject;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T casePositiveInt(PositiveInt eObject) {
		eObject = FhirFactory.eINSTANCE.createPositiveInt();
		eObject.setValue(BigInteger.valueOf(node.asInt()));
		return (T) eObject;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseString(String eObject) {
		eObject = FhirFactory.eINSTANCE.createString();
		eObject.setValue(node.asText());
		return (T) eObject;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseTime(Time eObject) {
		eObject = FhirFactory.eINSTANCE.createTime();
		try {
			eObject.setValue(DatatypeFactory.newInstance().newXMLGregorianCalendar(node.asText()));
		} catch (DatatypeConfigurationException e) {
			LOG.error("", e);
		}
		return (T) eObject;

	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseUnsignedInt(UnsignedInt eObject) {
		eObject = FhirFactory.eINSTANCE.createUnsignedInt();
		eObject.setValue(BigInteger.valueOf(node.asInt()));
		return (T) eObject;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseUri(Uri eObject) {
		eObject = FhirFactory.eINSTANCE.createUri();
		eObject.setValue(node.asText());
		return (T) eObject;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseUrl(Url eObject) {
		eObject = FhirFactory.eINSTANCE.createUrl();
		eObject.setValue(node.asText());
		return (T) eObject;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T caseUuid(Uuid eObject) {
		eObject = FhirFactory.eINSTANCE.createUuid();
		eObject.setValue(node.asText());
		return (T) eObject;
	}

	public JsonNode getNode() {
		return node;
	}

	public void setNode(JsonNode node) {
		this.node = node;
	}
}
