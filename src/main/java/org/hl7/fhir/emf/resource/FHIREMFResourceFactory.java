package org.hl7.fhir.emf.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.emfjson.jackson.module.EMFModule;
import org.emfjson.jackson.resource.JsonResource;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FHIREMFResourceFactory extends ResourceFactoryImpl {

	private final ObjectMapper mapper;

	public FHIREMFResourceFactory() {
		this.mapper = EMFModule.setupDefaultMapper();
	}

	public FHIREMFResourceFactory(ObjectMapper mapper) {
		if (mapper == null) throw new IllegalArgumentException();
		this.mapper = mapper;
	}

	@Override
	public Resource createResource(URI uri) {
		return new JsonResource(uri, mapper);
	}

	public ObjectMapper getMapper() {
		return mapper;
	}
}
