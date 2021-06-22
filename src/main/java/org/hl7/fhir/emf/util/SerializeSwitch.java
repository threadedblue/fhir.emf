package org.hl7.fhir.emf.util;

import java.io.IOException;
import java.math.BigInteger;

import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Boolean;
import org.hl7.fhir.BundleType;
import org.hl7.fhir.ContactPointSystem;
import org.hl7.fhir.ContactPointUse;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Decimal;
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
import org.hl7.fhir.util.FhirSwitch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonGenerator;

public class SerializeSwitch extends FhirSwitch<JsonGenerator> {

	private static final Logger LOG = LoggerFactory.getLogger(SerializeSwitch.class);

	JsonGenerator gen;

	public SerializeSwitch() {
		super();
	}

	@Override
	public JsonGenerator caseBase64Binary(Base64Binary eObject) {
		try {
			gen.writeString(new java.lang.String(eObject.getValue()));
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseBoolean(Boolean eObject) {
		try {
			gen.writeBoolean(eObject.isValue());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseBundleType(BundleType eObject) {
		try {
			gen.writeString(eObject.getValue().getLiteral());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseContactPointSystem(ContactPointSystem eObject) {
		try {
			gen.writeString(eObject.getValue().getLiteral());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseContactPointUse(ContactPointUse eObject) {
		try {
			gen.writeString(eObject.getValue().getLiteral());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseDate(Date eObject) {
		try {
			gen.writeString(eObject.getValue().toXMLFormat());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseDateTime(DateTime eObject) {
		try {
			gen.writeString(eObject.getValue().toXMLFormat());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseDecimal(Decimal eObject) {
		try {
			gen.writeNumber((java.lang.Double) eObject.getValue());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseIdentifierUse(IdentifierUse eObject) {
		try {
			gen.writeString(eObject.getValue().getLiteral());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseInteger(Integer eObject) {
		try {
			gen.writeNumber((java.lang.Integer) eObject.getValue());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseMarkdown(Markdown eObject) {
		try {
			gen.writeString(eObject.getValue());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseNameUse(NameUse eObject) {
		try {
			gen.writeString(eObject.getValue().getLiteral());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseOid(Oid eObject) {
		try {
			gen.writeString(eObject.getValue());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator casePositiveInt(PositiveInt eObject) {
		try {
			gen.writeNumber((BigInteger) eObject.getValue());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseString(String eObject) {
		try {
			gen.writeString(eObject.getValue());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseTime(Time eObject) {
		try {
			gen.writeString(eObject.getValue().toXMLFormat());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseUnsignedInt(UnsignedInt eObject) {
		try {
			gen.writeNumber((BigInteger) eObject.getValue());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseUri(Uri eObject) {
		try {
			gen.writeString(eObject.getValue());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseUrl(Url eObject) {
		try {
			gen.writeString(eObject.getValue());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseUuid(Uuid eObject) {
		try {
			gen.writeString(eObject.getValue());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	public JsonGenerator getGen() {
		return gen;
	}

	public void setGen(JsonGenerator gen) {
		this.gen = gen;
	}

}
