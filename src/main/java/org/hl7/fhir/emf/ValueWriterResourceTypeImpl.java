package org.hl7.fhir.emf;

import org.eclipse.emf.ecore.EClass;
import org.emfjson.jackson.utils.ValueWriter;
import org.hl7.fhir.String;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.SerializerProvider;

@Deprecated
public class ValueWriterResourceTypeImpl implements ValueWriter<EClass, java.lang.String> {
	
	private static final Logger LOG = LoggerFactory.getLogger(ValueWriterResourceTypeImpl.class);

	@Override
	public java.lang.String writeValue(EClass value, SerializerProvider context) {
		LOG.info(value.toString());
		return value.getName().toString();
	}
}
