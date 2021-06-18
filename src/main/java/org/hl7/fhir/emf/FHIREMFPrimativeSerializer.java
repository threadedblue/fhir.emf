package org.hl7.fhir.emf;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Boolean;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.Integer;
import org.hl7.fhir.String;
import org.hl7.fhir.Time;
import org.hl7.fhir.Uri;
import org.hl7.fhir.emf.util.FHIREMFSwitch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class FHIREMFPrimativeSerializer extends StdSerializer<EObject> {

	private static final Logger LOG = LoggerFactory.getLogger(FHIREMFPrimativeSerializer.class);

	private static final long serialVersionUID = -8784891711775214918L;

	public java.lang.String marker = "<+init=>";
	
	private FHIREMFSwitch sSwitch = new FHIREMFSwitch();
	
	public FHIREMFPrimativeSerializer() {
		this(null);
	}

	public FHIREMFPrimativeSerializer(Class<EObject> clazz) {
		super(clazz);
	}

	@Override
	public void serialize(EObject value, JsonGenerator gen, SerializerProvider provider) throws IOException {

		sSwitch.setGen(gen);
		LOG.trace("EObject=" + value.eClass().getName());
		LOG.trace("getCurrentName=" + gen.getOutputContext().getCurrentName());
		LOG.trace("OBJ=" + gen.getOutputContext().inObject());
		LOG.trace("ARR=" + gen.getOutputContext().inArray());
		LOG.trace("getParent=" + gen.getOutputContext().getParent().getCurrentName());
		LOG.trace("OBJ=" + gen.getOutputContext().getParent().inObject());
		LOG.trace("ARR=" + gen.getOutputContext().getParent().inArray());
		gen = sSwitch.doSwitch(value);
	}
}
