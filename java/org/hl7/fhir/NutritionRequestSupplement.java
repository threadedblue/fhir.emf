/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Request Supplement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.NutritionRequestSupplement#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionRequestSupplement#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionRequestSupplement#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionRequestSupplement#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionRequestSupplement#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getNutritionRequestSupplement()
 * @model extendedMetaData="name='NutritionRequest.Supplement' kind='elementOnly'"
 * @generated
 */
public interface NutritionRequestSupplement extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of nutritional supplement product required such as a high protein or pediatric clear liquid supplement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getNutritionRequestSupplement_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionRequestSupplement#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Product Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The product or brand name of the nutritional supplement such as "Acme Protein Shake".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Name</em>' containment reference.
	 * @see #setProductName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getNutritionRequestSupplement_ProductName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productName' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getProductName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionRequestSupplement#getProductName <em>Product Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' containment reference.
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Timing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time period and frequency at which the supplement(s) should be given.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionRequestSupplement_Schedule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='schedule' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Timing> getSchedule();

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of the nutritional supplement to be given.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getNutritionRequestSupplement_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionRequestSupplement#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free text or additional instructions or information pertaining to the oral supplement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instruction</em>' containment reference.
	 * @see #setInstruction(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getNutritionRequestSupplement_Instruction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instruction' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getInstruction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionRequestSupplement#getInstruction <em>Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' containment reference.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(org.hl7.fhir.String value);

} // NutritionRequestSupplement
