package org.hl7.fhir.emf;

import java.io.IOException;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Uri;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.IntNode;

public class FHIREMFUriDeserializer extends StdDeserializer<Uri> {

	private static final Logger LOG = LoggerFactory.getLogger(FHIREMFUriDeserializer.class);

	private static final long serialVersionUID = -8784891711775214918L;

	protected FHIREMFUriDeserializer() {
		this(null);
	}
	
	protected FHIREMFUriDeserializer(Class<Uri> t) {
		super(t);
	}
	
	@Override
	public Uri deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		LOG.debug("Called deser==>");
		JsonNode node = jp.getCodec().readTree(jp);
		Uri uri = FhirFactory.eINSTANCE.createUri();
		uri.setValue(node.textValue());
		return uri;
	}

	@Override
	public Object deserializeWithType(JsonParser p, DeserializationContext ctxt, TypeDeserializer typeDeserializer)
			throws IOException {
		LOG.debug("Called deserType==>");
		return super.deserializeWithType(p, ctxt, typeDeserializer);
	}

}
