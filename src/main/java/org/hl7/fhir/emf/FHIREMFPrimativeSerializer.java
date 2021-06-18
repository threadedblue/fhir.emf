package org.hl7.fhir.emf;

import java.io.IOException;
import java.io.OutputStream;

import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Boolean;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.Integer;
import org.hl7.fhir.String;
import org.hl7.fhir.Time;
import org.hl7.fhir.Uri;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class FHIREMFPrimativeSerializer<T> extends StdSerializer<T> {

	private static final Logger LOG = LoggerFactory.getLogger(FHIREMFPrimativeSerializer.class);

	private static final long serialVersionUID = -8784891711775214918L;

	public final PRIMATIVE INSTANCE;

	public java.lang.String marker = "<+init=>";

	public FHIREMFPrimativeSerializer() {
		this(null);
	}

	public FHIREMFPrimativeSerializer(Class<T> clazz) {
		super(clazz);
		INSTANCE = PRIMATIVE.BY_LABEL.get(clazz.getSimpleName().toUpperCase());
	}

	@Override
	public void serialize(T value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		LOG.trace("1 getCurrentName=" + gen.getOutputContext().getCurrentName());
		LOG.trace("1 OBJ=" + gen.getOutputContext().inObject());
		LOG.trace("1 ARR=" + gen.getOutputContext().inArray());
		LOG.trace("1 getParent=" + gen.getOutputContext().getParent().getCurrentName());
		LOG.trace("1 OBJ=" + gen.getOutputContext().getParent().inObject());
		LOG.trace("1 ARR=" + gen.getOutputContext().getParent().inArray());
		switch (INSTANCE) {
		case BASE64:
			java.lang.String s1 = new java.lang.String(((Base64Binary) value).getValue());
			if (gen.getOutputContext().inObject()) {
				gen.writeFieldName(marker);
			}
			gen.writeString(s1);
			break;
		case BOOLEAN:
			java.lang.Boolean b = new java.lang.Boolean(((Boolean) value).isValue());
			LOG.trace("switch BOOLEAN==>" + b);
			gen.writeBoolean(b);
			break;
		case DATE:
			java.lang.String s2 = ((Date) value).getValue().toXMLFormat();
			LOG.trace("switch DATE==>" + s2);
			gen.writeString(s2);
			break;
		case DATETIME:
			java.lang.String s3 = ((DateTime) value).getValue().toXMLFormat();
			LOG.trace("switch DATETIME==>" + s3);
			break;
		case DECIMAL:
			java.lang.Double dd = (java.lang.Double) ((Decimal) value).getValue();
			LOG.trace("switch DECIMAL==>" + dd);
			gen.writeNumber(dd);
			break;
		case INTEGER:
			int i = ((Integer) value).getValue();
			LOG.trace("switch INTEGER==>" + i);
			gen.writeNumber(i);
			break;
		case TIME:
			java.lang.String s4 = ((Time) value).getValue().toXMLFormat();
			LOG.trace("switch DATE==>" + s4);
			gen.writeString(s4);
			break;
		case URI:
			java.lang.String s5 = ((Uri) value).getValue();
			LOG.trace("switch URI==>" + s5);
			gen.writeString(s5);
			break;
		case STRING:
			LOG.trace("switch STRING==>" + ((String) value).getValue());
		default:
			java.lang.String s6 = ((String) value).getValue();
			LOG.trace("switch default==>" + s6);
			gen.writeString(s6);
			break;
		}
		LOG.trace("2 getCurrentName=" + gen.getOutputContext().getCurrentName());
		LOG.trace("2 OBJ=" + gen.getOutputContext().inObject());
		LOG.trace("2 ARR=" + gen.getOutputContext().inArray());
		LOG.trace("2 getParent=" + gen.getOutputContext().getParent().getCurrentName());
		LOG.trace("2 OBJ=" + gen.getOutputContext().getParent().inObject());
		LOG.trace("2 ARR=" + gen.getOutputContext().getParent().inArray());
	}
}
