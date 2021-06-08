package org.hl7.fhir.emf;

import java.io.IOException;

import org.hl7.fhir.impl.ResourceContainerImpl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class FHIREMFResourceContainerDeserializer extends StdDeserializer<ResourceContainerImpl> {

	private static final long serialVersionUID = -2870593110926596959L;

	public FHIREMFResourceContainerDeserializer() {
		this(null);
	}
	
	public FHIREMFResourceContainerDeserializer(Class<?> vc) {
		super(vc);
	}

	@Override
	public ResourceContainerImpl deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		return null;
	}

}
