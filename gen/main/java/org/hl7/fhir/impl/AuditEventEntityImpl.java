/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.AuditEventDetail;
import org.hl7.fhir.AuditEventEntity;
import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Coding;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audit Event Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AuditEventEntityImpl#getWhat <em>What</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventEntityImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventEntityImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventEntityImpl#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventEntityImpl#getSecurityLabel <em>Security Label</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventEntityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventEntityImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventEntityImpl#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuditEventEntityImpl extends BackboneElementImpl implements AuditEventEntity {
	/**
	 * The cached value of the '{@link #getWhat() <em>What</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhat()
	 * @generated
	 * @ordered
	 */
	protected Reference what;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Coding role;

	/**
	 * The cached value of the '{@link #getLifecycle() <em>Lifecycle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycle()
	 * @generated
	 * @ordered
	 */
	protected Coding lifecycle;

	/**
	 * The cached value of the '{@link #getSecurityLabel() <em>Security Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> securityLabel;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary query;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected EList<AuditEventDetail> detail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditEventEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAuditEventEntity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getWhat() {
		return what;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhat(Reference newWhat, NotificationChain msgs) {
		Reference oldWhat = what;
		what = newWhat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_ENTITY__WHAT, oldWhat, newWhat);
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
	public void setWhat(Reference newWhat) {
		if (newWhat != what) {
			NotificationChain msgs = null;
			if (what != null)
				msgs = ((InternalEObject)what).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_ENTITY__WHAT, null, msgs);
			if (newWhat != null)
				msgs = ((InternalEObject)newWhat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_ENTITY__WHAT, null, msgs);
			msgs = basicSetWhat(newWhat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_ENTITY__WHAT, newWhat, newWhat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Coding newType, NotificationChain msgs) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_ENTITY__TYPE, oldType, newType);
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
	public void setType(Coding newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_ENTITY__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_ENTITY__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_ENTITY__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(Coding newRole, NotificationChain msgs) {
		Coding oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_ENTITY__ROLE, oldRole, newRole);
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
	public void setRole(Coding newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_ENTITY__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_ENTITY__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_ENTITY__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getLifecycle() {
		return lifecycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLifecycle(Coding newLifecycle, NotificationChain msgs) {
		Coding oldLifecycle = lifecycle;
		lifecycle = newLifecycle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_ENTITY__LIFECYCLE, oldLifecycle, newLifecycle);
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
	public void setLifecycle(Coding newLifecycle) {
		if (newLifecycle != lifecycle) {
			NotificationChain msgs = null;
			if (lifecycle != null)
				msgs = ((InternalEObject)lifecycle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_ENTITY__LIFECYCLE, null, msgs);
			if (newLifecycle != null)
				msgs = ((InternalEObject)newLifecycle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_ENTITY__LIFECYCLE, null, msgs);
			msgs = basicSetLifecycle(newLifecycle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_ENTITY__LIFECYCLE, newLifecycle, newLifecycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coding> getSecurityLabel() {
		if (securityLabel == null) {
			securityLabel = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.AUDIT_EVENT_ENTITY__SECURITY_LABEL);
		}
		return securityLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_ENTITY__NAME, oldName, newName);
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
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_ENTITY__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_ENTITY__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_ENTITY__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_ENTITY__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_ENTITY__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_ENTITY__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_ENTITY__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64Binary getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuery(Base64Binary newQuery, NotificationChain msgs) {
		Base64Binary oldQuery = query;
		query = newQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_ENTITY__QUERY, oldQuery, newQuery);
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
	public void setQuery(Base64Binary newQuery) {
		if (newQuery != query) {
			NotificationChain msgs = null;
			if (query != null)
				msgs = ((InternalEObject)query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_ENTITY__QUERY, null, msgs);
			if (newQuery != null)
				msgs = ((InternalEObject)newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT_ENTITY__QUERY, null, msgs);
			msgs = basicSetQuery(newQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT_ENTITY__QUERY, newQuery, newQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AuditEventDetail> getDetail() {
		if (detail == null) {
			detail = new EObjectContainmentEList<AuditEventDetail>(AuditEventDetail.class, this, FhirPackage.AUDIT_EVENT_ENTITY__DETAIL);
		}
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.AUDIT_EVENT_ENTITY__WHAT:
				return basicSetWhat(null, msgs);
			case FhirPackage.AUDIT_EVENT_ENTITY__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.AUDIT_EVENT_ENTITY__ROLE:
				return basicSetRole(null, msgs);
			case FhirPackage.AUDIT_EVENT_ENTITY__LIFECYCLE:
				return basicSetLifecycle(null, msgs);
			case FhirPackage.AUDIT_EVENT_ENTITY__SECURITY_LABEL:
				return ((InternalEList<?>)getSecurityLabel()).basicRemove(otherEnd, msgs);
			case FhirPackage.AUDIT_EVENT_ENTITY__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.AUDIT_EVENT_ENTITY__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.AUDIT_EVENT_ENTITY__QUERY:
				return basicSetQuery(null, msgs);
			case FhirPackage.AUDIT_EVENT_ENTITY__DETAIL:
				return ((InternalEList<?>)getDetail()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.AUDIT_EVENT_ENTITY__WHAT:
				return getWhat();
			case FhirPackage.AUDIT_EVENT_ENTITY__TYPE:
				return getType();
			case FhirPackage.AUDIT_EVENT_ENTITY__ROLE:
				return getRole();
			case FhirPackage.AUDIT_EVENT_ENTITY__LIFECYCLE:
				return getLifecycle();
			case FhirPackage.AUDIT_EVENT_ENTITY__SECURITY_LABEL:
				return getSecurityLabel();
			case FhirPackage.AUDIT_EVENT_ENTITY__NAME:
				return getName();
			case FhirPackage.AUDIT_EVENT_ENTITY__DESCRIPTION:
				return getDescription();
			case FhirPackage.AUDIT_EVENT_ENTITY__QUERY:
				return getQuery();
			case FhirPackage.AUDIT_EVENT_ENTITY__DETAIL:
				return getDetail();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.AUDIT_EVENT_ENTITY__WHAT:
				setWhat((Reference)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__TYPE:
				setType((Coding)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__ROLE:
				setRole((Coding)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__LIFECYCLE:
				setLifecycle((Coding)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__SECURITY_LABEL:
				getSecurityLabel().clear();
				getSecurityLabel().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__QUERY:
				setQuery((Base64Binary)newValue);
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__DETAIL:
				getDetail().clear();
				getDetail().addAll((Collection<? extends AuditEventDetail>)newValue);
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
			case FhirPackage.AUDIT_EVENT_ENTITY__WHAT:
				setWhat((Reference)null);
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__TYPE:
				setType((Coding)null);
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__ROLE:
				setRole((Coding)null);
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__LIFECYCLE:
				setLifecycle((Coding)null);
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__SECURITY_LABEL:
				getSecurityLabel().clear();
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__QUERY:
				setQuery((Base64Binary)null);
				return;
			case FhirPackage.AUDIT_EVENT_ENTITY__DETAIL:
				getDetail().clear();
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
			case FhirPackage.AUDIT_EVENT_ENTITY__WHAT:
				return what != null;
			case FhirPackage.AUDIT_EVENT_ENTITY__TYPE:
				return type != null;
			case FhirPackage.AUDIT_EVENT_ENTITY__ROLE:
				return role != null;
			case FhirPackage.AUDIT_EVENT_ENTITY__LIFECYCLE:
				return lifecycle != null;
			case FhirPackage.AUDIT_EVENT_ENTITY__SECURITY_LABEL:
				return securityLabel != null && !securityLabel.isEmpty();
			case FhirPackage.AUDIT_EVENT_ENTITY__NAME:
				return name != null;
			case FhirPackage.AUDIT_EVENT_ENTITY__DESCRIPTION:
				return description != null;
			case FhirPackage.AUDIT_EVENT_ENTITY__QUERY:
				return query != null;
			case FhirPackage.AUDIT_EVENT_ENTITY__DETAIL:
				return detail != null && !detail.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AuditEventEntityImpl
