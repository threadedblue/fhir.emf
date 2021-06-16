package org.hl7.fhir.emf;

import java.io.IOException;

import org.hl7.fhir.Uri;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class FHIREMFPrimativeSerializer<T> extends StdSerializer<T> {

	private static final Logger LOG = LoggerFactory.getLogger(FHIREMFPrimativeSerializer.class);

	private static final long serialVersionUID = -8784891711775214918L;

	public FHIREMFPrimativeSerializer() {
		this(null);
	}

	public FHIREMFPrimativeSerializer(Class<T> clazz) {
		super(clazz);
	}

	@Override
	public void serialize(T value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		gen.writeStartObject();
//		gen.writeString(value.getValue());
		gen.writeEndObject();
	}

}
