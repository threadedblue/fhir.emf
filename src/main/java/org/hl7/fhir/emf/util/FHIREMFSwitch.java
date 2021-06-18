package org.hl7.fhir.emf.util;

import java.io.IOException;
import java.math.BigInteger;

import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Boolean;
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

public class FHIREMFSwitch extends FhirSwitch<JsonGenerator> {

	private static final Logger LOG = LoggerFactory.getLogger(FHIREMFSwitch.class);

	JsonGenerator gen;

	public FHIREMFSwitch() {
		super();
		this.gen = gen;
	}

	@Override
	public JsonGenerator caseBase64Binary(Base64Binary object) {
		try {
			gen.writeString(new java.lang.String(object.getValue()));
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseBoolean(Boolean object) {
		try {
			gen.writeBoolean(object.isValue());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseContactPointSystem(ContactPointSystem object) {
		try {
			gen.writeString(object.getValue().getLiteral());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseContactPointUse(ContactPointUse object) {
		try {
			gen.writeString(object.getValue().getLiteral());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseDate(Date object) {
		try {
			gen.writeString(object.getValue().toXMLFormat());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseDateTime(DateTime object) {
		try {
			gen.writeString(object.getValue().toXMLFormat());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseDecimal(Decimal object) {
		try {
			gen.writeNumber((java.lang.Double) object.getValue());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseIdentifierUse(IdentifierUse object) {
		try {
			gen.writeString(object.getValue().getLiteral());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseInteger(Integer object) {
		try {
			gen.writeNumber((java.lang.Integer) object.getValue());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseMarkdown(Markdown object) {
		try {
			gen.writeString(object.getValue());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseNameUse(NameUse object) {
		try {
			gen.writeString(object.getValue().getLiteral());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseOid(Oid object) {
		try {
			gen.writeString(object.getValue());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator casePositiveInt(PositiveInt object) {
		try {
			gen.writeNumber((BigInteger) object.getValue());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseString(String object) {
		try {
			gen.writeString(object.getValue());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseTime(Time object) {
		try {
			gen.writeString(object.getValue().toXMLFormat());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseUnsignedInt(UnsignedInt object) {
		try {
			gen.writeNumber((BigInteger) object.getValue());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseUri(Uri object) {
		try {
			gen.writeString(object.getValue());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseUrl(Url object) {
		try {
			gen.writeString(object.getValue());
		} catch (IOException e) {
			LOG.error("", e);
		}
		return gen;
	}

	@Override
	public JsonGenerator caseUuid(Uuid object) {
		try {
			gen.writeString(object.getValue());
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
