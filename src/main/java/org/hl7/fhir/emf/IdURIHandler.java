package org.hl7.fhir.emf;

import org.eclipse.emf.common.util.URI;
import org.emfjson.jackson.handlers.BaseURIHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Deprecated
public class IdURIHandler extends BaseURIHandler {

	private static final Logger LOG = LoggerFactory.getLogger(IdURIHandler.class);

	@Override
	public URI resolve(URI baseURI, URI uri) {
		URI uri1 = super.resolve(baseURI ,uri);
		LOG.info(uri1.toString());
		return uri1;
	}

	@Override
	public URI deresolve(URI baseURI, URI uri) {
		LOG.info(uri.toString());
		return super.deresolve(baseURI, uri);
	}
}
