package org.hl7.fhir.emf;

import java.io.IOException;

import org.hl7.fhir.Bundle;
import org.hl7.fhir.FhirFactory;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.IntNode;

public class FHIREMFBundleDeserializer extends StdDeserializer<Bundle> {

	private static final long serialVersionUID = -8784891711775214918L;

	protected FHIREMFBundleDeserializer() {
		this(null);
	}

	protected FHIREMFBundleDeserializer(Class<?> vc) {
		super(vc);
	}

	@Override
	public Bundle deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		JsonNode node = jp.getCodec().readTree(jp);
		int id = (Integer) ((IntNode) node.get("id")).numberValue();
		String itemName = node.get("itemName").asText();
		int userId = (Integer) ((IntNode) node.get("createdBy")).numberValue();

		return FhirFactory.eINSTANCE.createBundle();
	}

	@Override
	public Object deserializeWithType(JsonParser p, DeserializationContext ctxt, TypeDeserializer typeDeserializer)
			throws IOException {
		return super.deserializeWithType(p, ctxt, typeDeserializer);
	}

}
