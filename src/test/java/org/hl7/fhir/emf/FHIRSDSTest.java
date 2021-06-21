package org.hl7.fhir.emf;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.InputStream;

import org.eclipse.emf.ecore.EObject;
import org.hl7.fhir.Bundle;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class FHIRSDSTest {
	
	private static final Logger LOG = LoggerFactory.getLogger(FHIRSDSTest.class);

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		LOG.debug("HERE");
	}

	@Test
	void testLoadInputStreamFORMAT() {
		InputStream reader = FHIRSDSTest.class.getClassLoader().getResourceAsStream("Alicia.json");
		EObject eObject = FHIRSDS.load(reader, FHIRSDS.FORMAT.JSON);
		assertNotNull(eObject);
		Bundle bundle = (Bundle)eObject;
		assertEquals(3, bundle.getEntry().size());
	}
}
