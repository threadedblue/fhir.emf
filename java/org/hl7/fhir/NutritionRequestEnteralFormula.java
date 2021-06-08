/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Request Enteral Formula</b></em>'.
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
 *   <li>{@link org.hl7.fhir.NutritionRequestEnteralFormula#getBaseFormulaType <em>Base Formula Type</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionRequestEnteralFormula#getBaseFormulaProductName <em>Base Formula Product Name</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionRequestEnteralFormula#getAdditiveType <em>Additive Type</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionRequestEnteralFormula#getAdditiveProductName <em>Additive Product Name</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionRequestEnteralFormula#getCaloricDensity <em>Caloric Density</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionRequestEnteralFormula#getRouteofAdministration <em>Routeof Administration</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionRequestEnteralFormula#getAdministration <em>Administration</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionRequestEnteralFormula#getMaxVolumeToDeliver <em>Max Volume To Deliver</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionRequestEnteralFormula#getAdministrationInstruction <em>Administration Instruction</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getNutritionRequestEnteralFormula()
 * @model extendedMetaData="name='NutritionRequest.EnteralFormula' kind='elementOnly'"
 * @generated
 */
public interface NutritionRequestEnteralFormula extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Base Formula Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of enteral or infant formula such as an adult standard formula with fiber or a soy-based infant formula.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Formula Type</em>' containment reference.
	 * @see #setBaseFormulaType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getNutritionRequestEnteralFormula_BaseFormulaType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='baseFormulaType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getBaseFormulaType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionRequestEnteralFormula#getBaseFormulaType <em>Base Formula Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Formula Type</em>' containment reference.
	 * @see #getBaseFormulaType()
	 * @generated
	 */
	void setBaseFormulaType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Base Formula Product Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The product or brand name of the enteral or infant formula product such as "ACME Adult Standard Formula".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Formula Product Name</em>' containment reference.
	 * @see #setBaseFormulaProductName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getNutritionRequestEnteralFormula_BaseFormulaProductName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='baseFormulaProductName' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getBaseFormulaProductName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionRequestEnteralFormula#getBaseFormulaProductName <em>Base Formula Product Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Formula Product Name</em>' containment reference.
	 * @see #getBaseFormulaProductName()
	 * @generated
	 */
	void setBaseFormulaProductName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Additive Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the type of modular component such as protein, carbohydrate, fat or fiber to be provided in addition to or mixed with the base formula.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additive Type</em>' containment reference.
	 * @see #setAdditiveType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getNutritionRequestEnteralFormula_AdditiveType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additiveType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAdditiveType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionRequestEnteralFormula#getAdditiveType <em>Additive Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additive Type</em>' containment reference.
	 * @see #getAdditiveType()
	 * @generated
	 */
	void setAdditiveType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Additive Product Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The product or brand name of the type of modular component to be added to the formula.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additive Product Name</em>' containment reference.
	 * @see #setAdditiveProductName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getNutritionRequestEnteralFormula_AdditiveProductName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additiveProductName' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAdditiveProductName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionRequestEnteralFormula#getAdditiveProductName <em>Additive Product Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additive Product Name</em>' containment reference.
	 * @see #getAdditiveProductName()
	 * @generated
	 */
	void setAdditiveProductName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Caloric Density</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of energy (Calories) that the formula should provide per specified volume, typically per mL or fluid oz.  For example, an infant may require a formula that provides 24 Calories per fluid ounce or an adult may require an enteral formula that provides 1.5 Calorie/mL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Caloric Density</em>' containment reference.
	 * @see #setCaloricDensity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getNutritionRequestEnteralFormula_CaloricDensity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='caloricDensity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getCaloricDensity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionRequestEnteralFormula#getCaloricDensity <em>Caloric Density</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caloric Density</em>' containment reference.
	 * @see #getCaloricDensity()
	 * @generated
	 */
	void setCaloricDensity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Routeof Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The route or physiological path of administration into the patient's gastrointestinal  tract for purposes of providing the formula feeding, e.g. nasogastric tube.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Routeof Administration</em>' containment reference.
	 * @see #setRouteofAdministration(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getNutritionRequestEnteralFormula_RouteofAdministration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='routeofAdministration' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRouteofAdministration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionRequestEnteralFormula#getRouteofAdministration <em>Routeof Administration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routeof Administration</em>' containment reference.
	 * @see #getRouteofAdministration()
	 * @generated
	 */
	void setRouteofAdministration(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Administration</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.NutritionRequestAdministration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Formula administration instructions as structured data.  This repeating structure allows for changing the administration rate or volume over time for both bolus and continuous feeding.  An example of this would be an instruction to increase the rate of continuous feeding every 2 hours.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Administration</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionRequestEnteralFormula_Administration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='administration' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NutritionRequestAdministration> getAdministration();

	/**
	 * Returns the value of the '<em><b>Max Volume To Deliver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum total quantity of formula that may be administered to a subject over the period of time, e.g. 1440 mL over 24 hours.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Volume To Deliver</em>' containment reference.
	 * @see #setMaxVolumeToDeliver(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getNutritionRequestEnteralFormula_MaxVolumeToDeliver()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxVolumeToDeliver' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getMaxVolumeToDeliver();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionRequestEnteralFormula#getMaxVolumeToDeliver <em>Max Volume To Deliver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Volume To Deliver</em>' containment reference.
	 * @see #getMaxVolumeToDeliver()
	 * @generated
	 */
	void setMaxVolumeToDeliver(Quantity value);

	/**
	 * Returns the value of the '<em><b>Administration Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free text formula administration, feeding instructions or additional instructions or information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Administration Instruction</em>' containment reference.
	 * @see #setAdministrationInstruction(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getNutritionRequestEnteralFormula_AdministrationInstruction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='administrationInstruction' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAdministrationInstruction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionRequestEnteralFormula#getAdministrationInstruction <em>Administration Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administration Instruction</em>' containment reference.
	 * @see #getAdministrationInstruction()
	 * @generated
	 */
	void setAdministrationInstruction(org.hl7.fhir.String value);

} // NutritionRequestEnteralFormula
