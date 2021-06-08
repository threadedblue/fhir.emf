/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eligibility Response Financial</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides eligibility and plan details from the processing of an Eligibility resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EligibilityResponseFinancial#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseFinancial#getBenefitUnsignedInt <em>Benefit Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseFinancial#getBenefitString <em>Benefit String</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseFinancial#getBenefitMoney <em>Benefit Money</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseFinancial#getBenefitUsedUnsignedInt <em>Benefit Used Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseFinancial#getBenefitUsedMoney <em>Benefit Used Money</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseFinancial()
 * @model extendedMetaData="name='EligibilityResponse.Financial' kind='elementOnly'"
 * @generated
 */
public interface EligibilityResponseFinancial extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deductable, visits, benefit amount.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseFinancial_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseFinancial#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Benefit Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Benefits allowed. (choose any one of benefit*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Benefit Unsigned Int</em>' containment reference.
	 * @see #setBenefitUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseFinancial_BenefitUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='benefitUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getBenefitUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseFinancial#getBenefitUnsignedInt <em>Benefit Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefit Unsigned Int</em>' containment reference.
	 * @see #getBenefitUnsignedInt()
	 * @generated
	 */
	void setBenefitUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Benefit String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Benefits allowed. (choose any one of benefit*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Benefit String</em>' containment reference.
	 * @see #setBenefitString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseFinancial_BenefitString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='benefitString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getBenefitString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseFinancial#getBenefitString <em>Benefit String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefit String</em>' containment reference.
	 * @see #getBenefitString()
	 * @generated
	 */
	void setBenefitString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Benefit Money</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Benefits allowed. (choose any one of benefit*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Benefit Money</em>' containment reference.
	 * @see #setBenefitMoney(Money)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseFinancial_BenefitMoney()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='benefitMoney' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getBenefitMoney();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseFinancial#getBenefitMoney <em>Benefit Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefit Money</em>' containment reference.
	 * @see #getBenefitMoney()
	 * @generated
	 */
	void setBenefitMoney(Money value);

	/**
	 * Returns the value of the '<em><b>Benefit Used Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Benefits used. (choose any one of benefitUsed*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Benefit Used Unsigned Int</em>' containment reference.
	 * @see #setBenefitUsedUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseFinancial_BenefitUsedUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='benefitUsedUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getBenefitUsedUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseFinancial#getBenefitUsedUnsignedInt <em>Benefit Used Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefit Used Unsigned Int</em>' containment reference.
	 * @see #getBenefitUsedUnsignedInt()
	 * @generated
	 */
	void setBenefitUsedUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Benefit Used Money</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Benefits used. (choose any one of benefitUsed*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Benefit Used Money</em>' containment reference.
	 * @see #setBenefitUsedMoney(Money)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseFinancial_BenefitUsedMoney()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='benefitUsedMoney' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getBenefitUsedMoney();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseFinancial#getBenefitUsedMoney <em>Benefit Used Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefit Used Money</em>' containment reference.
	 * @see #getBenefitUsedMoney()
	 * @generated
	 */
	void setBenefitUsedMoney(Money value);

} // EligibilityResponseFinancial
