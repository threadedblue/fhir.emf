/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Signer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ContractSigner#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractSigner#getParty <em>Party</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractSigner#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getContractSigner()
 * @model extendedMetaData="name='Contract.Signer' kind='elementOnly'"
 * @generated
 */
public interface ContractSigner extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Role of this Contract signer, e.g. notary, grantee.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getContractSigner_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractSigner#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Party which is a signator to this Contract.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Party</em>' containment reference.
	 * @see #setParty(Reference)
	 * @see org.hl7.fhir.FhirPackage#getContractSigner_Party()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='party' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getParty();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractSigner#getParty <em>Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' containment reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Reference value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Signature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Legally binding Contract DSIG signature contents in Base64.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractSigner_Signature()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='signature' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Signature> getSignature();

} // ContractSigner
