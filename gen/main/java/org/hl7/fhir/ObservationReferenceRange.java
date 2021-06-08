/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation Reference Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Measurements and simple assertions made about a patient, device or other subject.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ObservationReferenceRange#getLow <em>Low</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationReferenceRange#getHigh <em>High</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationReferenceRange#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationReferenceRange#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationReferenceRange#getAge <em>Age</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationReferenceRange#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getObservationReferenceRange()
 * @model extendedMetaData="name='Observation.ReferenceRange' kind='elementOnly'"
 * @generated
 */
public interface ObservationReferenceRange extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the low bound of the reference range.  The low bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9). If the low bound is omitted,  it is assumed to be meaningless (e.g. reference range is <=2.3).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Low</em>' containment reference.
	 * @see #setLow(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getObservationReferenceRange_Low()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='low' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getLow();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationReferenceRange#getLow <em>Low</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low</em>' containment reference.
	 * @see #getLow()
	 * @generated
	 */
	void setLow(Quantity value);

	/**
	 * Returns the value of the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the high bound of the reference range.  The high bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9). If the high bound is omitted,  it is assumed to be meaningless (e.g. reference range is >= 2.3).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>High</em>' containment reference.
	 * @see #setHigh(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getObservationReferenceRange_High()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='high' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getHigh();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationReferenceRange#getHigh <em>High</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High</em>' containment reference.
	 * @see #getHigh()
	 * @generated
	 */
	void setHigh(Quantity value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codes to indicate the what part of the targeted reference population it applies to. For example, the normal or therapeutic range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getObservationReferenceRange_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationReferenceRange#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codes to indicate the target population this reference range applies to.  For example, a reference range may be based on the normal population or a particular sex or race.  Multiple `appliesTo`  are interpreted as an "AND" of the target populations.  For example, to represent a target population of African American females, both a code of female and a code for African American would be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applies To</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getObservationReferenceRange_AppliesTo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='appliesTo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getAppliesTo();

	/**
	 * Returns the value of the '<em><b>Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The age at which this reference range is applicable. This is a neonatal age (e.g. number of weeks at term) if the meaning says so.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Age</em>' containment reference.
	 * @see #setAge(Range)
	 * @see org.hl7.fhir.FhirPackage#getObservationReferenceRange_Age()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='age' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getAge();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationReferenceRange#getAge <em>Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' containment reference.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(Range value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text based reference range in an observation which may be used when a quantitative range is not appropriate for an observation.  An example would be a reference value of "Negative" or a list or table of "normals".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getObservationReferenceRange_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getText();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationReferenceRange#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(org.hl7.fhir.String value);

} // ObservationReferenceRange
