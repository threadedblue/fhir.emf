package org.hl7.fhir.emf.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.emfjson.jackson.module.EMFModule;
import org.emfjson.jackson.resource.JsonResourceFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FHIREMFResourceFactory extends JsonResourceFactory {

	public FHIREMFResourceFactory() {
		super();
	}

	public FHIREMFResourceFactory(ObjectMapper mapper) {
		super(mapper);
	}

	@Override
	public Resource createResource(URI uri) {
		return new FHIREMFResource(uri);
	}
}
