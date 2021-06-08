/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ValueSetInclude#getSystem <em>System</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetInclude#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetInclude#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetInclude#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetInclude#getValueSet <em>Value Set</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getValueSetInclude()
 * @model extendedMetaData="name='ValueSet.Include' kind='elementOnly'"
 * @generated
 */
public interface ValueSetInclude extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URI which is the code system from which the selected codes come from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(Uri)
	 * @see org.hl7.fhir.FhirPackage#getValueSetInclude_System()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='system' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getSystem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetInclude#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(Uri value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the code system that the codes are selected from, or the special version '*' for all versions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getValueSetInclude_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetInclude#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ValueSetConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a concept to be included or excluded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getValueSetInclude_Concept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='concept' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueSetConcept> getConcept();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ValueSetFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Select concepts by specify a matching criterion based on the properties (including relationships) defined by the system, or on filters defined by the system. If multiple filters are specified, they SHALL all be true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getValueSetInclude_Filter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueSetFilter> getFilter();

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Canonical}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Selects the concepts found in this value set (based on its value set definition). This is an absolute URI that is a reference to ValueSet.url.  If multiple value sets are specified this includes the union of the contents of all of the referenced value sets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getValueSetInclude_ValueSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Canonical> getValueSet();

} // ValueSetInclude
