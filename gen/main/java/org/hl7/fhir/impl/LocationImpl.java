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

import org.hl7.fhir.Address;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Location;
import org.hl7.fhir.LocationHoursOfOperation;
import org.hl7.fhir.LocationMode;
import org.hl7.fhir.LocationPosition;
import org.hl7.fhir.LocationStatus;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.LocationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LocationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LocationImpl#getOperationalStatus <em>Operational Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LocationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LocationImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LocationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LocationImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LocationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LocationImpl#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LocationImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LocationImpl#getPhysicalType <em>Physical Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LocationImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LocationImpl#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LocationImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LocationImpl#getHoursOfOperation <em>Hours Of Operation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LocationImpl#getAvailabilityExceptions <em>Availability Exceptions</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LocationImpl#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends DomainResourceImpl implements Location {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected LocationStatus status;

	/**
	 * The cached value of the '{@link #getOperationalStatus() <em>Operational Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalStatus()
	 * @generated
	 * @ordered
	 */
	protected Coding operationalStatus;

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
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> alias;

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
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected LocationMode mode;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> type;

	/**
	 * The cached value of the '{@link #getTelecom() <em>Telecom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecom()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> telecom;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected Address address;

	/**
	 * The cached value of the '{@link #getPhysicalType() <em>Physical Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept physicalType;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected LocationPosition position;

	/**
	 * The cached value of the '{@link #getManagingOrganization() <em>Managing Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagingOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference managingOrganization;

	/**
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected Reference partOf;

	/**
	 * The cached value of the '{@link #getHoursOfOperation() <em>Hours Of Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoursOfOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationHoursOfOperation> hoursOfOperation;

	/**
	 * The cached value of the '{@link #getAvailabilityExceptions() <em>Availability Exceptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityExceptions()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String availabilityExceptions;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> endpoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getLocation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.LOCATION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(LocationStatus newStatus, NotificationChain msgs) {
		LocationStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION__STATUS, oldStatus, newStatus);
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
	public void setStatus(LocationStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getOperationalStatus() {
		return operationalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationalStatus(Coding newOperationalStatus, NotificationChain msgs) {
		Coding oldOperationalStatus = operationalStatus;
		operationalStatus = newOperationalStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION__OPERATIONAL_STATUS, oldOperationalStatus, newOperationalStatus);
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
	public void setOperationalStatus(Coding newOperationalStatus) {
		if (newOperationalStatus != operationalStatus) {
			NotificationChain msgs = null;
			if (operationalStatus != null)
				msgs = ((InternalEObject)operationalStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION__OPERATIONAL_STATUS, null, msgs);
			if (newOperationalStatus != null)
				msgs = ((InternalEObject)newOperationalStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION__OPERATIONAL_STATUS, null, msgs);
			msgs = basicSetOperationalStatus(newOperationalStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION__OPERATIONAL_STATUS, newOperationalStatus, newOperationalStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getAlias() {
		if (alias == null) {
			alias = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.LOCATION__ALIAS);
		}
		return alias;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMode(LocationMode newMode, NotificationChain msgs) {
		LocationMode oldMode = mode;
		mode = newMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION__MODE, oldMode, newMode);
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
	public void setMode(LocationMode newMode) {
		if (newMode != mode) {
			NotificationChain msgs = null;
			if (mode != null)
				msgs = ((InternalEObject)mode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION__MODE, null, msgs);
			if (newMode != null)
				msgs = ((InternalEObject)newMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION__MODE, null, msgs);
			msgs = basicSetMode(newMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION__MODE, newMode, newMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.LOCATION__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactPoint> getTelecom() {
		if (telecom == null) {
			telecom = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, FhirPackage.LOCATION__TELECOM);
		}
		return telecom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Address getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(Address newAddress, NotificationChain msgs) {
		Address oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION__ADDRESS, oldAddress, newAddress);
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
	public void setAddress(Address newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION__ADDRESS, newAddress, newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPhysicalType() {
		return physicalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalType(CodeableConcept newPhysicalType, NotificationChain msgs) {
		CodeableConcept oldPhysicalType = physicalType;
		physicalType = newPhysicalType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION__PHYSICAL_TYPE, oldPhysicalType, newPhysicalType);
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
	public void setPhysicalType(CodeableConcept newPhysicalType) {
		if (newPhysicalType != physicalType) {
			NotificationChain msgs = null;
			if (physicalType != null)
				msgs = ((InternalEObject)physicalType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION__PHYSICAL_TYPE, null, msgs);
			if (newPhysicalType != null)
				msgs = ((InternalEObject)newPhysicalType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION__PHYSICAL_TYPE, null, msgs);
			msgs = basicSetPhysicalType(newPhysicalType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION__PHYSICAL_TYPE, newPhysicalType, newPhysicalType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationPosition getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(LocationPosition newPosition, NotificationChain msgs) {
		LocationPosition oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION__POSITION, oldPosition, newPosition);
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
	public void setPosition(LocationPosition newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getManagingOrganization() {
		return managingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManagingOrganization(Reference newManagingOrganization, NotificationChain msgs) {
		Reference oldManagingOrganization = managingOrganization;
		managingOrganization = newManagingOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION__MANAGING_ORGANIZATION, oldManagingOrganization, newManagingOrganization);
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
	public void setManagingOrganization(Reference newManagingOrganization) {
		if (newManagingOrganization != managingOrganization) {
			NotificationChain msgs = null;
			if (managingOrganization != null)
				msgs = ((InternalEObject)managingOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION__MANAGING_ORGANIZATION, null, msgs);
			if (newManagingOrganization != null)
				msgs = ((InternalEObject)newManagingOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION__MANAGING_ORGANIZATION, null, msgs);
			msgs = basicSetManagingOrganization(newManagingOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION__MANAGING_ORGANIZATION, newManagingOrganization, newManagingOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPartOf() {
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(Reference newPartOf, NotificationChain msgs) {
		Reference oldPartOf = partOf;
		partOf = newPartOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION__PART_OF, oldPartOf, newPartOf);
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
	public void setPartOf(Reference newPartOf) {
		if (newPartOf != partOf) {
			NotificationChain msgs = null;
			if (partOf != null)
				msgs = ((InternalEObject)partOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION__PART_OF, null, msgs);
			if (newPartOf != null)
				msgs = ((InternalEObject)newPartOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION__PART_OF, null, msgs);
			msgs = basicSetPartOf(newPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION__PART_OF, newPartOf, newPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LocationHoursOfOperation> getHoursOfOperation() {
		if (hoursOfOperation == null) {
			hoursOfOperation = new EObjectContainmentEList<LocationHoursOfOperation>(LocationHoursOfOperation.class, this, FhirPackage.LOCATION__HOURS_OF_OPERATION);
		}
		return hoursOfOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getAvailabilityExceptions() {
		return availabilityExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailabilityExceptions(org.hl7.fhir.String newAvailabilityExceptions, NotificationChain msgs) {
		org.hl7.fhir.String oldAvailabilityExceptions = availabilityExceptions;
		availabilityExceptions = newAvailabilityExceptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION__AVAILABILITY_EXCEPTIONS, oldAvailabilityExceptions, newAvailabilityExceptions);
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
	public void setAvailabilityExceptions(org.hl7.fhir.String newAvailabilityExceptions) {
		if (newAvailabilityExceptions != availabilityExceptions) {
			NotificationChain msgs = null;
			if (availabilityExceptions != null)
				msgs = ((InternalEObject)availabilityExceptions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION__AVAILABILITY_EXCEPTIONS, null, msgs);
			if (newAvailabilityExceptions != null)
				msgs = ((InternalEObject)newAvailabilityExceptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION__AVAILABILITY_EXCEPTIONS, null, msgs);
			msgs = basicSetAvailabilityExceptions(newAvailabilityExceptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION__AVAILABILITY_EXCEPTIONS, newAvailabilityExceptions, newAvailabilityExceptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getEndpoint() {
		if (endpoint == null) {
			endpoint = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.LOCATION__ENDPOINT);
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.LOCATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.LOCATION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.LOCATION__OPERATIONAL_STATUS:
				return basicSetOperationalStatus(null, msgs);
			case FhirPackage.LOCATION__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.LOCATION__ALIAS:
				return ((InternalEList<?>)getAlias()).basicRemove(otherEnd, msgs);
			case FhirPackage.LOCATION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.LOCATION__MODE:
				return basicSetMode(null, msgs);
			case FhirPackage.LOCATION__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.LOCATION__TELECOM:
				return ((InternalEList<?>)getTelecom()).basicRemove(otherEnd, msgs);
			case FhirPackage.LOCATION__ADDRESS:
				return basicSetAddress(null, msgs);
			case FhirPackage.LOCATION__PHYSICAL_TYPE:
				return basicSetPhysicalType(null, msgs);
			case FhirPackage.LOCATION__POSITION:
				return basicSetPosition(null, msgs);
			case FhirPackage.LOCATION__MANAGING_ORGANIZATION:
				return basicSetManagingOrganization(null, msgs);
			case FhirPackage.LOCATION__PART_OF:
				return basicSetPartOf(null, msgs);
			case FhirPackage.LOCATION__HOURS_OF_OPERATION:
				return ((InternalEList<?>)getHoursOfOperation()).basicRemove(otherEnd, msgs);
			case FhirPackage.LOCATION__AVAILABILITY_EXCEPTIONS:
				return basicSetAvailabilityExceptions(null, msgs);
			case FhirPackage.LOCATION__ENDPOINT:
				return ((InternalEList<?>)getEndpoint()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.LOCATION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.LOCATION__STATUS:
				return getStatus();
			case FhirPackage.LOCATION__OPERATIONAL_STATUS:
				return getOperationalStatus();
			case FhirPackage.LOCATION__NAME:
				return getName();
			case FhirPackage.LOCATION__ALIAS:
				return getAlias();
			case FhirPackage.LOCATION__DESCRIPTION:
				return getDescription();
			case FhirPackage.LOCATION__MODE:
				return getMode();
			case FhirPackage.LOCATION__TYPE:
				return getType();
			case FhirPackage.LOCATION__TELECOM:
				return getTelecom();
			case FhirPackage.LOCATION__ADDRESS:
				return getAddress();
			case FhirPackage.LOCATION__PHYSICAL_TYPE:
				return getPhysicalType();
			case FhirPackage.LOCATION__POSITION:
				return getPosition();
			case FhirPackage.LOCATION__MANAGING_ORGANIZATION:
				return getManagingOrganization();
			case FhirPackage.LOCATION__PART_OF:
				return getPartOf();
			case FhirPackage.LOCATION__HOURS_OF_OPERATION:
				return getHoursOfOperation();
			case FhirPackage.LOCATION__AVAILABILITY_EXCEPTIONS:
				return getAvailabilityExceptions();
			case FhirPackage.LOCATION__ENDPOINT:
				return getEndpoint();
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
			case FhirPackage.LOCATION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.LOCATION__STATUS:
				setStatus((LocationStatus)newValue);
				return;
			case FhirPackage.LOCATION__OPERATIONAL_STATUS:
				setOperationalStatus((Coding)newValue);
				return;
			case FhirPackage.LOCATION__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.LOCATION__ALIAS:
				getAlias().clear();
				getAlias().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.LOCATION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.LOCATION__MODE:
				setMode((LocationMode)newValue);
				return;
			case FhirPackage.LOCATION__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.LOCATION__TELECOM:
				getTelecom().clear();
				getTelecom().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FhirPackage.LOCATION__ADDRESS:
				setAddress((Address)newValue);
				return;
			case FhirPackage.LOCATION__PHYSICAL_TYPE:
				setPhysicalType((CodeableConcept)newValue);
				return;
			case FhirPackage.LOCATION__POSITION:
				setPosition((LocationPosition)newValue);
				return;
			case FhirPackage.LOCATION__MANAGING_ORGANIZATION:
				setManagingOrganization((Reference)newValue);
				return;
			case FhirPackage.LOCATION__PART_OF:
				setPartOf((Reference)newValue);
				return;
			case FhirPackage.LOCATION__HOURS_OF_OPERATION:
				getHoursOfOperation().clear();
				getHoursOfOperation().addAll((Collection<? extends LocationHoursOfOperation>)newValue);
				return;
			case FhirPackage.LOCATION__AVAILABILITY_EXCEPTIONS:
				setAvailabilityExceptions((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.LOCATION__ENDPOINT:
				getEndpoint().clear();
				getEndpoint().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.LOCATION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.LOCATION__STATUS:
				setStatus((LocationStatus)null);
				return;
			case FhirPackage.LOCATION__OPERATIONAL_STATUS:
				setOperationalStatus((Coding)null);
				return;
			case FhirPackage.LOCATION__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.LOCATION__ALIAS:
				getAlias().clear();
				return;
			case FhirPackage.LOCATION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.LOCATION__MODE:
				setMode((LocationMode)null);
				return;
			case FhirPackage.LOCATION__TYPE:
				getType().clear();
				return;
			case FhirPackage.LOCATION__TELECOM:
				getTelecom().clear();
				return;
			case FhirPackage.LOCATION__ADDRESS:
				setAddress((Address)null);
				return;
			case FhirPackage.LOCATION__PHYSICAL_TYPE:
				setPhysicalType((CodeableConcept)null);
				return;
			case FhirPackage.LOCATION__POSITION:
				setPosition((LocationPosition)null);
				return;
			case FhirPackage.LOCATION__MANAGING_ORGANIZATION:
				setManagingOrganization((Reference)null);
				return;
			case FhirPackage.LOCATION__PART_OF:
				setPartOf((Reference)null);
				return;
			case FhirPackage.LOCATION__HOURS_OF_OPERATION:
				getHoursOfOperation().clear();
				return;
			case FhirPackage.LOCATION__AVAILABILITY_EXCEPTIONS:
				setAvailabilityExceptions((org.hl7.fhir.String)null);
				return;
			case FhirPackage.LOCATION__ENDPOINT:
				getEndpoint().clear();
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
			case FhirPackage.LOCATION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.LOCATION__STATUS:
				return status != null;
			case FhirPackage.LOCATION__OPERATIONAL_STATUS:
				return operationalStatus != null;
			case FhirPackage.LOCATION__NAME:
				return name != null;
			case FhirPackage.LOCATION__ALIAS:
				return alias != null && !alias.isEmpty();
			case FhirPackage.LOCATION__DESCRIPTION:
				return description != null;
			case FhirPackage.LOCATION__MODE:
				return mode != null;
			case FhirPackage.LOCATION__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.LOCATION__TELECOM:
				return telecom != null && !telecom.isEmpty();
			case FhirPackage.LOCATION__ADDRESS:
				return address != null;
			case FhirPackage.LOCATION__PHYSICAL_TYPE:
				return physicalType != null;
			case FhirPackage.LOCATION__POSITION:
				return position != null;
			case FhirPackage.LOCATION__MANAGING_ORGANIZATION:
				return managingOrganization != null;
			case FhirPackage.LOCATION__PART_OF:
				return partOf != null;
			case FhirPackage.LOCATION__HOURS_OF_OPERATION:
				return hoursOfOperation != null && !hoursOfOperation.isEmpty();
			case FhirPackage.LOCATION__AVAILABILITY_EXCEPTIONS:
				return availabilityExceptions != null;
			case FhirPackage.LOCATION__ENDPOINT:
				return endpoint != null && !endpoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LocationImpl
