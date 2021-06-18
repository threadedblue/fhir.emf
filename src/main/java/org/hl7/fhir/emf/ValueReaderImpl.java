package org.hl7.fhir.emf;

import org.eclipse.emf.ecore.EClass;
import org.emfjson.jackson.utils.ValueReader;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.String;

import com.fasterxml.jackson.databind.DeserializationContext;

@Deprecated
public class ValueReaderImpl implements ValueReader<java.lang.String, EClass> {
	@Override
	public EClass readValue(java.lang.String value, DeserializationContext context) {
		return (EClass) FhirPackage.eINSTANCE.getEClassifier(value);
	}
}
