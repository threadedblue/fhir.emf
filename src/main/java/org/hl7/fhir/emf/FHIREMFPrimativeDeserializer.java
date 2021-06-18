package org.hl7.fhir.emf;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.hl7.fhir.emf.util.DeserializeSwitch;
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

	private DeserializeSwitch<T> dSwitch = new DeserializeSwitch<T>();
	
	public FHIREMFPrimativeDeserializer() {
		this(null);
	}

	public FHIREMFPrimativeDeserializer(Class<EObject> clazz) {
		super(clazz);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {

		JsonNode node = jp.getCodec().readTree(jp);
		dSwitch.setNode(node);
		return dSwitch.doSwitch(null);
	}
}
