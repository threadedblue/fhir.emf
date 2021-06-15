package org.hl7.fhir.emf;

import java.io.IOException;

import org.hl7.fhir.Uri;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class FHIREMFUriSerializer extends StdSerializer<Uri> {

	private static final Logger LOG = LoggerFactory.getLogger(FHIREMFUriSerializer.class);

	private static final long serialVersionUID = -8784891711775214918L;

	public FHIREMFUriSerializer() {
		this(null);
	}

	public FHIREMFUriSerializer(Class<Uri> t) {
		super(t);
	}

	@Override
	public void serialize(Uri value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		gen.writeStartObject();
		gen.writeString(value.getValue());
		gen.writeEndObject();	}
}
