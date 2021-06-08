package org.hl7.fhir.emf;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import org.eclipse.emf.ecore.EObject;
import org.hl7.fhir.Bundle;
import org.hl7.fhir.BundleEntry;
import org.hl7.fhir.BundleType;
import org.hl7.fhir.BundleTypeList;
import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Id;
import org.hl7.fhir.Organization;
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
	}

//	@Test
	void testLoad() {
		URL patientURL = getClass().getClassLoader().getResource("patient.xml");
		EObject eObject = FHIRSDS.load(patientURL);
		assertNotNull(eObject);
	}

	@Test
	void testLoadJSONBundle() {
//		URL bundleURL = getClass().getClassLoader().getResource("Alicia.json");
		InputStream reader = null;
		try {
			reader = new FileInputStream("data/Alicia.json");
		} catch (IOException e) {
			e.printStackTrace();
		}
		EObject eObject = FHIRSDS.loadFromJSON(reader, "data/Alicia.json", Bundle.class);
		assertNotNull(eObject);
		Bundle bundle = (Bundle) eObject;
		assertNotNull(bundle);
		for (EObject eO : bundle.getEntry()) {
			LOG.info(eO.eClass().getName());
		}
	}

//	@Test
	void testLoadJSONOrg() {
		URL bundleURL = getClass().getClassLoader().getResource("organization.json");
		InputStream reader = null;
		try {
			reader = bundleURL.openStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		EObject eObject = FHIRSDS.loadFromJSON(reader, "data/organization.json", Organization.class);
		assertNotNull(eObject);
		Organization bundle = (Organization) eObject;
		assertNotNull(bundle);
	}

//	@Test
	void testLoadJSONPat() {
		URL bundleURL = getClass().getClassLoader().getResource("patient.json");
		InputStream reader = null;
		try {
			reader = bundleURL.openStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		EObject eObject = FHIRSDS.loadFromJSON(reader, "data/patient.json", Patient.class);
		assertNotNull(eObject);
		Patient bundle = (Patient) eObject;
		assertNotNull(bundle);
	}
	
//	@Test
	void testLoadXMLDR() {
		URL bundleURL = getClass().getClassLoader().getResource("diagnostic-report-genomics.xml");
		InputStream reader = null;
		try {
			reader = bundleURL.openStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		EObject eObject = FHIRSDS.load(bundleURL);
		assertNotNull(eObject);
		Bundle bundle = (Bundle) eObject;
		assertNotNull(bundle);
	}
	
	//	@Test
	void testSave() {
		URL patientURL = getClass().getClassLoader().getResource("patient.xml");
		EObject eObject = FHIRSDS.load(patientURL);
		assertNotNull(eObject);
		OutputStream out = null;
		out = FHIRSDS.saveAsJSON(eObject, "data/patient.json");
		assertNotNull(out);
	}

//	@Test
	void testSaveBundle() {
		Bundle bundle = createBundle();
		OutputStream os = FHIRSDS.saveAsJSON(bundle, "data/bundle.json");
		assertNotNull(os);
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
