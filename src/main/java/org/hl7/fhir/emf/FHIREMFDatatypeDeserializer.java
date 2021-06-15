package org.hl7.fhir.emf;

import static org.eclipse.emf.ecore.EcorePackage.Literals.EJAVA_CLASS;
import static org.eclipse.emf.ecore.EcorePackage.Literals.EJAVA_OBJECT;

import java.io.IOException;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emfjson.jackson.databind.EMFContext;
import org.emfjson.jackson.databind.deser.EDataTypeDeserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;

public class FHIREMFDatatypeDeserializer extends EDataTypeDeserializer {

	@Override
	public Object deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
		final EDataType dataType = EMFContext.getDataType(ctxt);

		if (dataType == null) {
			return null;
		} else {
			Class<?> type = dataType.getInstanceClass();

			if (type == null || dataType instanceof EEnum || EJAVA_CLASS.equals(dataType) || EJAVA_OBJECT.equals(dataType)) {
				return EcoreUtil.createFromString(dataType, jp.getText());
			} else {
				return ctxt.readValue(jp, type);
			}
		}
	}

}
