/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guidance Response Related Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.GuidanceResponseRelatedAction#getActionIdentifier <em>Action Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponseRelatedAction#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponseRelatedAction#getOffsetDuration <em>Offset Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponseRelatedAction#getOffsetRange <em>Offset Range</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponseRelatedAction#getAnchor <em>Anchor</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseRelatedAction()
 * @model extendedMetaData="name='GuidanceResponse.RelatedAction' kind='elementOnly'"
 * @generated
 */
public interface GuidanceResponseRelatedAction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Action Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique identifier of the related action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Identifier</em>' containment reference.
	 * @see #setActionIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseRelatedAction_ActionIdentifier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='actionIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getActionIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponseRelatedAction#getActionIdentifier <em>Action Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Identifier</em>' containment reference.
	 * @see #getActionIdentifier()
	 * @generated
	 */
	void setActionIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship of this action to the related action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(Code)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseRelatedAction_Relationship()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getRelationship();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponseRelatedAction#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(Code value);

	/**
	 * Returns the value of the '<em><b>Offset Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A duration or range of durations to apply to the relationship. For example, 30-60 minutes before. (choose any one of offset*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset Duration</em>' containment reference.
	 * @see #setOffsetDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseRelatedAction_OffsetDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offsetDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getOffsetDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponseRelatedAction#getOffsetDuration <em>Offset Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset Duration</em>' containment reference.
	 * @see #getOffsetDuration()
	 * @generated
	 */
	void setOffsetDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Offset Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A duration or range of durations to apply to the relationship. For example, 30-60 minutes before. (choose any one of offset*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset Range</em>' containment reference.
	 * @see #setOffsetRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseRelatedAction_OffsetRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offsetRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getOffsetRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponseRelatedAction#getOffsetRange <em>Offset Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset Range</em>' containment reference.
	 * @see #getOffsetRange()
	 * @generated
	 */
	void setOffsetRange(Range value);

	/**
	 * Returns the value of the '<em><b>Anchor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional indicator for how the relationship is anchored to the related action. For example "before the start" or "before the end" of the related action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anchor</em>' containment reference.
	 * @see #setAnchor(Code)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponseRelatedAction_Anchor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anchor' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getAnchor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponseRelatedAction#getAnchor <em>Anchor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor</em>' containment reference.
	 * @see #getAnchor()
	 * @generated
	 */
	void setAnchor(Code value);

} // GuidanceResponseRelatedAction
