package org.hl7.fhir.emf.resource;

import org.eclipse.emf.common.util.URI;
import org.emfjson.jackson.resource.JsonResource;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FHIREMFResource extends JsonResource {

	public FHIREMFResource(URI uri, ObjectMapper mapper) {
		super(uri);
		setObjectMapper(mapper);
	}

	public FHIREMFResource(URI uri) {
		super(uri);
	}
}
