/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MedicationIngredient;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Ingredient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationIngredientImpl#getItemCodeableConcept <em>Item Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationIngredientImpl#getItemReference <em>Item Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationIngredientImpl#getIsActive <em>Is Active</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationIngredientImpl#getStrength <em>Strength</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationIngredientImpl extends BackboneElementImpl implements MedicationIngredient {
	/**
	 * The cached value of the '{@link #getItemCodeableConcept() <em>Item Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept itemCodeableConcept;

	/**
	 * The cached value of the '{@link #getItemReference() <em>Item Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemReference()
	 * @generated
	 * @ordered
	 */
	protected Reference itemReference;

	/**
	 * The cached value of the '{@link #getIsActive() <em>Is Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsActive()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean isActive;

	/**
	 * The cached value of the '{@link #getStrength() <em>Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected Ratio strength;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationIngredientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationIngredient();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getItemCodeableConcept() {
		return itemCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemCodeableConcept(CodeableConcept newItemCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldItemCodeableConcept = itemCodeableConcept;
		itemCodeableConcept = newItemCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_INGREDIENT__ITEM_CODEABLE_CONCEPT, oldItemCodeableConcept, newItemCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemCodeableConcept(CodeableConcept newItemCodeableConcept) {
		if (newItemCodeableConcept != itemCodeableConcept) {
			NotificationChain msgs = null;
			if (itemCodeableConcept != null)
				msgs = ((InternalEObject)itemCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_INGREDIENT__ITEM_CODEABLE_CONCEPT, null, msgs);
			if (newItemCodeableConcept != null)
				msgs = ((InternalEObject)newItemCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_INGREDIENT__ITEM_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetItemCodeableConcept(newItemCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_INGREDIENT__ITEM_CODEABLE_CONCEPT, newItemCodeableConcept, newItemCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getItemReference() {
		return itemReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemReference(Reference newItemReference, NotificationChain msgs) {
		Reference oldItemReference = itemReference;
		itemReference = newItemReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_INGREDIENT__ITEM_REFERENCE, oldItemReference, newItemReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemReference(Reference newItemReference) {
		if (newItemReference != itemReference) {
			NotificationChain msgs = null;
			if (itemReference != null)
				msgs = ((InternalEObject)itemReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_INGREDIENT__ITEM_REFERENCE, null, msgs);
			if (newItemReference != null)
				msgs = ((InternalEObject)newItemReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_INGREDIENT__ITEM_REFERENCE, null, msgs);
			msgs = basicSetItemReference(newItemReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_INGREDIENT__ITEM_REFERENCE, newItemReference, newItemReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsActive(org.hl7.fhir.Boolean newIsActive, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_INGREDIENT__IS_ACTIVE, oldIsActive, newIsActive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsActive(org.hl7.fhir.Boolean newIsActive) {
		if (newIsActive != isActive) {
			NotificationChain msgs = null;
			if (isActive != null)
				msgs = ((InternalEObject)isActive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_INGREDIENT__IS_ACTIVE, null, msgs);
			if (newIsActive != null)
				msgs = ((InternalEObject)newIsActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_INGREDIENT__IS_ACTIVE, null, msgs);
			msgs = basicSetIsActive(newIsActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_INGREDIENT__IS_ACTIVE, newIsActive, newIsActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getStrength() {
		return strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrength(Ratio newStrength, NotificationChain msgs) {
		Ratio oldStrength = strength;
		strength = newStrength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_INGREDIENT__STRENGTH, oldStrength, newStrength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrength(Ratio newStrength) {
		if (newStrength != strength) {
			NotificationChain msgs = null;
			if (strength != null)
				msgs = ((InternalEObject)strength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_INGREDIENT__STRENGTH, null, msgs);
			if (newStrength != null)
				msgs = ((InternalEObject)newStrength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_INGREDIENT__STRENGTH, null, msgs);
			msgs = basicSetStrength(newStrength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_INGREDIENT__STRENGTH, newStrength, newStrength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_INGREDIENT__ITEM_CODEABLE_CONCEPT:
				return basicSetItemCodeableConcept(null, msgs);
			case FhirPackage.MEDICATION_INGREDIENT__ITEM_REFERENCE:
				return basicSetItemReference(null, msgs);
			case FhirPackage.MEDICATION_INGREDIENT__IS_ACTIVE:
				return basicSetIsActive(null, msgs);
			case FhirPackage.MEDICATION_INGREDIENT__STRENGTH:
				return basicSetStrength(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.MEDICATION_INGREDIENT__ITEM_CODEABLE_CONCEPT:
				return getItemCodeableConcept();
			case FhirPackage.MEDICATION_INGREDIENT__ITEM_REFERENCE:
				return getItemReference();
			case FhirPackage.MEDICATION_INGREDIENT__IS_ACTIVE:
				return getIsActive();
			case FhirPackage.MEDICATION_INGREDIENT__STRENGTH:
				return getStrength();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.MEDICATION_INGREDIENT__ITEM_CODEABLE_CONCEPT:
				setItemCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_INGREDIENT__ITEM_REFERENCE:
				setItemReference((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_INGREDIENT__IS_ACTIVE:
				setIsActive((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.MEDICATION_INGREDIENT__STRENGTH:
				setStrength((Ratio)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.MEDICATION_INGREDIENT__ITEM_CODEABLE_CONCEPT:
				setItemCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_INGREDIENT__ITEM_REFERENCE:
				setItemReference((Reference)null);
				return;
			case FhirPackage.MEDICATION_INGREDIENT__IS_ACTIVE:
				setIsActive((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.MEDICATION_INGREDIENT__STRENGTH:
				setStrength((Ratio)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.MEDICATION_INGREDIENT__ITEM_CODEABLE_CONCEPT:
				return itemCodeableConcept != null;
			case FhirPackage.MEDICATION_INGREDIENT__ITEM_REFERENCE:
				return itemReference != null;
			case FhirPackage.MEDICATION_INGREDIENT__IS_ACTIVE:
				return isActive != null;
			case FhirPackage.MEDICATION_INGREDIENT__STRENGTH:
				return strength != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationIngredientImpl
