/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Derivation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * How a type relates to its baseDefinition.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.TypeDerivationRule#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTypeDerivationRule()
 * @model extendedMetaData="name='TypeDerivationRule' kind='elementOnly'"
 * @generated
 */
public interface TypeDerivationRule extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.TypeDerivationRuleList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.TypeDerivationRuleList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(TypeDerivationRuleList)
	 * @see org.hl7.fhir.FhirPackage#getTypeDerivationRule_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	TypeDerivationRuleList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TypeDerivationRule#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.TypeDerivationRuleList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(TypeDerivationRuleList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.TypeDerivationRule#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(TypeDerivationRuleList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.TypeDerivationRule#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(TypeDerivationRuleList)
	 * @generated
	 */
	boolean isSetValue();

} // TypeDerivationRule
