/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detected Issue Severity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indicates the potential degree of impact of the identified issue on the patient.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DetectedIssueSeverity#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDetectedIssueSeverity()
 * @model extendedMetaData="name='DetectedIssueSeverity' kind='elementOnly'"
 * @generated
 */
public interface DetectedIssueSeverity extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.DetectedIssueSeverityList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.DetectedIssueSeverityList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(DetectedIssueSeverityList)
	 * @see org.hl7.fhir.FhirPackage#getDetectedIssueSeverity_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	DetectedIssueSeverityList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DetectedIssueSeverity#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.DetectedIssueSeverityList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DetectedIssueSeverityList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.DetectedIssueSeverity#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(DetectedIssueSeverityList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.DetectedIssueSeverity#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(DetectedIssueSeverityList)
	 * @generated
	 */
	boolean isSetValue();

} // DetectedIssueSeverity
