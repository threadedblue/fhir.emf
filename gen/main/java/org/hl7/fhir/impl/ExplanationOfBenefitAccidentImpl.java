/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Address;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Date;
import org.hl7.fhir.ExplanationOfBenefitAccident;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit Accident</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitAccidentImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitAccidentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitAccidentImpl#getLocationAddress <em>Location Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitAccidentImpl#getLocationReference <em>Location Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitAccidentImpl extends BackboneElementImpl implements ExplanationOfBenefitAccident {
	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getLocationAddress() <em>Location Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationAddress()
	 * @generated
	 * @ordered
	 */
	protected Address locationAddress;

	/**
	 * The cached value of the '{@link #getLocationReference() <em>Location Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationReference()
	 * @generated
	 * @ordered
	 */
	protected Reference locationReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitAccidentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExplanationOfBenefitAccident();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(Date newDate, NotificationChain msgs) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__DATE, oldDate, newDate);
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
	public void setDate(Date newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Address getLocationAddress() {
		return locationAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationAddress(Address newLocationAddress, NotificationChain msgs) {
		Address oldLocationAddress = locationAddress;
		locationAddress = newLocationAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__LOCATION_ADDRESS, oldLocationAddress, newLocationAddress);
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
	public void setLocationAddress(Address newLocationAddress) {
		if (newLocationAddress != locationAddress) {
			NotificationChain msgs = null;
			if (locationAddress != null)
				msgs = ((InternalEObject)locationAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__LOCATION_ADDRESS, null, msgs);
			if (newLocationAddress != null)
				msgs = ((InternalEObject)newLocationAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__LOCATION_ADDRESS, null, msgs);
			msgs = basicSetLocationAddress(newLocationAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__LOCATION_ADDRESS, newLocationAddress, newLocationAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getLocationReference() {
		return locationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationReference(Reference newLocationReference, NotificationChain msgs) {
		Reference oldLocationReference = locationReference;
		locationReference = newLocationReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__LOCATION_REFERENCE, oldLocationReference, newLocationReference);
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
	public void setLocationReference(Reference newLocationReference) {
		if (newLocationReference != locationReference) {
			NotificationChain msgs = null;
			if (locationReference != null)
				msgs = ((InternalEObject)locationReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__LOCATION_REFERENCE, null, msgs);
			if (newLocationReference != null)
				msgs = ((InternalEObject)newLocationReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__LOCATION_REFERENCE, null, msgs);
			msgs = basicSetLocationReference(newLocationReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__LOCATION_REFERENCE, newLocationReference, newLocationReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__LOCATION_ADDRESS:
				return basicSetLocationAddress(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__LOCATION_REFERENCE:
				return basicSetLocationReference(null, msgs);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__DATE:
				return getDate();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__TYPE:
				return getType();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__LOCATION_ADDRESS:
				return getLocationAddress();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__LOCATION_REFERENCE:
				return getLocationReference();
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__DATE:
				setDate((Date)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__LOCATION_ADDRESS:
				setLocationAddress((Address)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__LOCATION_REFERENCE:
				setLocationReference((Reference)newValue);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__DATE:
				setDate((Date)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__LOCATION_ADDRESS:
				setLocationAddress((Address)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__LOCATION_REFERENCE:
				setLocationReference((Reference)null);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__DATE:
				return date != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__TYPE:
				return type != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__LOCATION_ADDRESS:
				return locationAddress != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT__LOCATION_REFERENCE:
				return locationReference != null;
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitAccidentImpl
