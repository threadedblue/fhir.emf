package org.hl7.fhir.emf;

import java.io.IOException;

import org.hl7.fhir.BundleType;
import org.hl7.fhir.BundleTypeList;
import org.hl7.fhir.FhirFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

@Deprecated
public class FHIREMFBundleTypeDeserializer extends StdDeserializer<BundleType> {

	private static final Logger LOG = LoggerFactory.getLogger(FHIREMFBundleTypeDeserializer.class);

	private static final long serialVersionUID = -8678452067025932268L;

	public FHIREMFBundleTypeDeserializer() {
		this(null);
	}
	
	public FHIREMFBundleTypeDeserializer(Class<?> vc) {
		super(vc);
	}

	@Override
	public BundleType deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		LOG.debug("Called deser==>");
		BundleType bundleType = FhirFactory.eINSTANCE.createBundleType();
		BundleTypeList.getByName(p.currentToken().asString());
		bundleType.setValue(BundleTypeList.getByName(p.currentToken().asString()));
		return bundleType;
	}

	@Override
	public Object deserializeWithType(JsonParser p, DeserializationContext ctxt, TypeDeserializer typeDeserializer)
			throws IOException {
		return super.deserializeWithType(p, ctxt, typeDeserializer);
	}
	
}
