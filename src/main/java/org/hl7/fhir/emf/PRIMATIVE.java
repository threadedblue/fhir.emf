package org.hl7.fhir.emf;

import java.util.HashMap;
import java.util.Map;

import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Boolean;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.Integer;
import org.hl7.fhir.String;
import org.hl7.fhir.Time;
import org.hl7.fhir.Uri;

public enum PRIMATIVE {
	BASE64(Base64Binary.class), 
	BOOLEAN(Boolean.class), 
	DATE(Date.class), 
	DATETIME(DateTime.class),
	DECIMAL(Decimal.class), 
	INTEGER(Integer.class), 
	STRING(String.class), 
	TIME(Time.class), 
	URI(Uri.class);

	public final Class<?> clazz;
	public static final Map<java.lang.String, PRIMATIVE> BY_LABEL = new HashMap<>();

	static {
		for (PRIMATIVE primative : values()) {
			BY_LABEL.put(primative.name(), primative);
		}
	}

	private PRIMATIVE(Class<?> clazz) {
		this.clazz = clazz;
	}

	public static PRIMATIVE valueOfLabel(java.lang.String label) {
		return BY_LABEL.get(label.toUpperCase());
	}
}
