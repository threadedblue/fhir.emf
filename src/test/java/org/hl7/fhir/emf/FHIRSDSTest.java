package org.hl7.fhir.emf;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.emf.ecore.EObject;
import org.hl7.fhir.Bundle;
import org.hl7.fhir.BundleEntry;
import org.hl7.fhir.BundleType;
import org.hl7.fhir.BundleTypeList;
import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Id;
import org.hl7.fhir.Patient;
import org.hl7.fhir.Practitioner;
import org.hl7.fhir.ResourceContainer;
import org.hl7.fhir.Uri;
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
		EObject eObject = FHIRSDS.load(reader, FHIRSDS.FORMAT.json);
		assertNotNull(eObject);
		Bundle bundle = (Bundle) eObject;
		assertEquals(3, bundle.getEntry().size());
	}

//	@Test
	void testSaveOnputStreamFORMAT() {
		Bundle bundle = createBundle();
		OutputStream writer = FHIRSDS.save(bundle, "data/bundle.json", FHIRSDS.FORMAT.json);
		assertNotNull(writer);
	}
	

	Bundle createBundle() {
		Bundle bundle = FhirFactory.eINSTANCE.createBundle();
		BundleType bundleType = FhirFactory.eINSTANCE.createBundleType();
		bundleType.setValue(BundleTypeList.TRANSACTION);
		bundle.setType(bundleType);
		BundleEntry bundleEntry1 = FhirFactory.eINSTANCE.createBundleEntry();
		bundle.getEntry().add(bundleEntry1);
		ResourceContainer resourceContainer1 = FhirFactory.eINSTANCE.createResourceContainer();
		bundleEntry1.setResource(resourceContainer1);
		Patient patient = FhirFactory.eINSTANCE.createPatient();
		resourceContainer1.setPatient(patient);
		Id id1 = FhirFactory.eINSTANCE.createId();
		id1.setId("111");
		Uri uri1 = FhirFactory.eINSTANCE.createUri();
		uri1.setId("111");
		uri1.setValue("urn:uuid:0c0652be-de47-46c3-9f40-54aaf0c30d8f");
		bundleEntry1.setFullUrl(uri1);
		bundleEntry1.setId("111");
		patient.setId(id1);

		BundleEntry bundleEntry2 = FhirFactory.eINSTANCE.createBundleEntry();
		bundle.getEntry().add(bundleEntry2);
		ResourceContainer resourceContainer2 = FhirFactory.eINSTANCE.createResourceContainer();
		bundleEntry2.setResource(resourceContainer2);
		Practitioner practitioner = FhirFactory.eINSTANCE.createPractitioner();
		resourceContainer2.setPractitioner(practitioner);
		Id id2 = FhirFactory.eINSTANCE.createId();
		id2.setId("222");
		Uri uri2 = FhirFactory.eINSTANCE.createUri();
		uri2.setValue("urn:bbb");
		bundleEntry2.setFullUrl(uri2);
		bundleEntry2.setId("222");
		practitioner.setId(id2);

//		BundleEntry bundleEntry3 = FhirFactory.eINSTANCE.createBundleEntry();
//		bundle.getEntry().add(bundleEntry3);
//		ResourceContainer resourceContainer3 = FhirFactory.eINSTANCE.createResourceContainer();
//		bundleEntry3.setResource(resourceContainer3);
//		Organization organization = FhirFactory.eINSTANCE.createOrganization();
//		resourceContainer3.setOrganization(organization);
//		Id id3 = FhirFactory.eINSTANCE.createId();
//		id3.setId("333");
//		Uri uri3 = FhirFactory.eINSTANCE.createUri();
//		uri3.setValue("urn:ccc");
//		bundleEntry3.setFullUrl(uri3);
//		bundleEntry3.setId("333");
//		organization.setId(id3);
//		
		return bundle;
	}
}
