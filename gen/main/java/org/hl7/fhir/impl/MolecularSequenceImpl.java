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

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.MolecularSequence;
import org.hl7.fhir.MolecularSequenceQuality;
import org.hl7.fhir.MolecularSequenceReferenceSeq;
import org.hl7.fhir.MolecularSequenceRepository;
import org.hl7.fhir.MolecularSequenceStructureVariant;
import org.hl7.fhir.MolecularSequenceVariant;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SequenceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Molecular Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceImpl#getCoordinateSystem <em>Coordinate System</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceImpl#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceImpl#getReferenceSeq <em>Reference Seq</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceImpl#getObservedSeq <em>Observed Seq</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceImpl#getQuality <em>Quality</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceImpl#getReadCoverage <em>Read Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceImpl#getPointer <em>Pointer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceImpl#getStructureVariant <em>Structure Variant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MolecularSequenceImpl extends DomainResourceImpl implements MolecularSequence {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SequenceType type;

	/**
	 * The cached value of the '{@link #getCoordinateSystem() <em>Coordinate System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateSystem()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer coordinateSystem;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * The cached value of the '{@link #getSpecimen() <em>Specimen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimen()
	 * @generated
	 * @ordered
	 */
	protected Reference specimen;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected Reference device;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected Reference performer;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getReferenceSeq() <em>Reference Seq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceSeq()
	 * @generated
	 * @ordered
	 */
	protected MolecularSequenceReferenceSeq referenceSeq;

	/**
	 * The cached value of the '{@link #getVariant() <em>Variant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
	protected EList<MolecularSequenceVariant> variant;

	/**
	 * The cached value of the '{@link #getObservedSeq() <em>Observed Seq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedSeq()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String observedSeq;

	/**
	 * The cached value of the '{@link #getQuality() <em>Quality</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuality()
	 * @generated
	 * @ordered
	 */
	protected EList<MolecularSequenceQuality> quality;

	/**
	 * The cached value of the '{@link #getReadCoverage() <em>Read Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadCoverage()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer readCoverage;

	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected EList<MolecularSequenceRepository> repository;

	/**
	 * The cached value of the '{@link #getPointer() <em>Pointer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointer()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> pointer;

	/**
	 * The cached value of the '{@link #getStructureVariant() <em>Structure Variant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureVariant()
	 * @generated
	 * @ordered
	 */
	protected EList<MolecularSequenceStructureVariant> structureVariant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MolecularSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMolecularSequence();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MOLECULAR_SEQUENCE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequenceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(SequenceType newType, NotificationChain msgs) {
		SequenceType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE__TYPE, oldType, newType);
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
	public void setType(SequenceType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getCoordinateSystem() {
		return coordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateSystem(org.hl7.fhir.Integer newCoordinateSystem, NotificationChain msgs) {
		org.hl7.fhir.Integer oldCoordinateSystem = coordinateSystem;
		coordinateSystem = newCoordinateSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE__COORDINATE_SYSTEM, oldCoordinateSystem, newCoordinateSystem);
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
	public void setCoordinateSystem(org.hl7.fhir.Integer newCoordinateSystem) {
		if (newCoordinateSystem != coordinateSystem) {
			NotificationChain msgs = null;
			if (coordinateSystem != null)
				msgs = ((InternalEObject)coordinateSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE__COORDINATE_SYSTEM, null, msgs);
			if (newCoordinateSystem != null)
				msgs = ((InternalEObject)newCoordinateSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE__COORDINATE_SYSTEM, null, msgs);
			msgs = basicSetCoordinateSystem(newCoordinateSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE__COORDINATE_SYSTEM, newCoordinateSystem, newCoordinateSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE__PATIENT, oldPatient, newPatient);
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
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSpecimen() {
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecimen(Reference newSpecimen, NotificationChain msgs) {
		Reference oldSpecimen = specimen;
		specimen = newSpecimen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE__SPECIMEN, oldSpecimen, newSpecimen);
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
	public void setSpecimen(Reference newSpecimen) {
		if (newSpecimen != specimen) {
			NotificationChain msgs = null;
			if (specimen != null)
				msgs = ((InternalEObject)specimen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE__SPECIMEN, null, msgs);
			if (newSpecimen != null)
				msgs = ((InternalEObject)newSpecimen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE__SPECIMEN, null, msgs);
			msgs = basicSetSpecimen(newSpecimen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE__SPECIMEN, newSpecimen, newSpecimen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevice(Reference newDevice, NotificationChain msgs) {
		Reference oldDevice = device;
		device = newDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE__DEVICE, oldDevice, newDevice);
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
	public void setDevice(Reference newDevice) {
		if (newDevice != device) {
			NotificationChain msgs = null;
			if (device != null)
				msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE__DEVICE, null, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE__DEVICE, null, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE__DEVICE, newDevice, newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPerformer() {
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformer(Reference newPerformer, NotificationChain msgs) {
		Reference oldPerformer = performer;
		performer = newPerformer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE__PERFORMER, oldPerformer, newPerformer);
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
	public void setPerformer(Reference newPerformer) {
		if (newPerformer != performer) {
			NotificationChain msgs = null;
			if (performer != null)
				msgs = ((InternalEObject)performer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE__PERFORMER, null, msgs);
			if (newPerformer != null)
				msgs = ((InternalEObject)newPerformer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE__PERFORMER, null, msgs);
			msgs = basicSetPerformer(newPerformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE__PERFORMER, newPerformer, newPerformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE__QUANTITY, oldQuantity, newQuantity);
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
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequenceReferenceSeq getReferenceSeq() {
		return referenceSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceSeq(MolecularSequenceReferenceSeq newReferenceSeq, NotificationChain msgs) {
		MolecularSequenceReferenceSeq oldReferenceSeq = referenceSeq;
		referenceSeq = newReferenceSeq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE__REFERENCE_SEQ, oldReferenceSeq, newReferenceSeq);
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
	public void setReferenceSeq(MolecularSequenceReferenceSeq newReferenceSeq) {
		if (newReferenceSeq != referenceSeq) {
			NotificationChain msgs = null;
			if (referenceSeq != null)
				msgs = ((InternalEObject)referenceSeq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE__REFERENCE_SEQ, null, msgs);
			if (newReferenceSeq != null)
				msgs = ((InternalEObject)newReferenceSeq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE__REFERENCE_SEQ, null, msgs);
			msgs = basicSetReferenceSeq(newReferenceSeq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE__REFERENCE_SEQ, newReferenceSeq, newReferenceSeq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MolecularSequenceVariant> getVariant() {
		if (variant == null) {
			variant = new EObjectContainmentEList<MolecularSequenceVariant>(MolecularSequenceVariant.class, this, FhirPackage.MOLECULAR_SEQUENCE__VARIANT);
		}
		return variant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getObservedSeq() {
		return observedSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObservedSeq(org.hl7.fhir.String newObservedSeq, NotificationChain msgs) {
		org.hl7.fhir.String oldObservedSeq = observedSeq;
		observedSeq = newObservedSeq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE__OBSERVED_SEQ, oldObservedSeq, newObservedSeq);
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
	public void setObservedSeq(org.hl7.fhir.String newObservedSeq) {
		if (newObservedSeq != observedSeq) {
			NotificationChain msgs = null;
			if (observedSeq != null)
				msgs = ((InternalEObject)observedSeq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE__OBSERVED_SEQ, null, msgs);
			if (newObservedSeq != null)
				msgs = ((InternalEObject)newObservedSeq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE__OBSERVED_SEQ, null, msgs);
			msgs = basicSetObservedSeq(newObservedSeq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE__OBSERVED_SEQ, newObservedSeq, newObservedSeq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MolecularSequenceQuality> getQuality() {
		if (quality == null) {
			quality = new EObjectContainmentEList<MolecularSequenceQuality>(MolecularSequenceQuality.class, this, FhirPackage.MOLECULAR_SEQUENCE__QUALITY);
		}
		return quality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getReadCoverage() {
		return readCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadCoverage(org.hl7.fhir.Integer newReadCoverage, NotificationChain msgs) {
		org.hl7.fhir.Integer oldReadCoverage = readCoverage;
		readCoverage = newReadCoverage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE__READ_COVERAGE, oldReadCoverage, newReadCoverage);
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
	public void setReadCoverage(org.hl7.fhir.Integer newReadCoverage) {
		if (newReadCoverage != readCoverage) {
			NotificationChain msgs = null;
			if (readCoverage != null)
				msgs = ((InternalEObject)readCoverage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE__READ_COVERAGE, null, msgs);
			if (newReadCoverage != null)
				msgs = ((InternalEObject)newReadCoverage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE__READ_COVERAGE, null, msgs);
			msgs = basicSetReadCoverage(newReadCoverage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE__READ_COVERAGE, newReadCoverage, newReadCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MolecularSequenceRepository> getRepository() {
		if (repository == null) {
			repository = new EObjectContainmentEList<MolecularSequenceRepository>(MolecularSequenceRepository.class, this, FhirPackage.MOLECULAR_SEQUENCE__REPOSITORY);
		}
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPointer() {
		if (pointer == null) {
			pointer = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MOLECULAR_SEQUENCE__POINTER);
		}
		return pointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MolecularSequenceStructureVariant> getStructureVariant() {
		if (structureVariant == null) {
			structureVariant = new EObjectContainmentEList<MolecularSequenceStructureVariant>(MolecularSequenceStructureVariant.class, this, FhirPackage.MOLECULAR_SEQUENCE__STRUCTURE_VARIANT);
		}
		return structureVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MOLECULAR_SEQUENCE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE__COORDINATE_SYSTEM:
				return basicSetCoordinateSystem(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE__SPECIMEN:
				return basicSetSpecimen(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE__DEVICE:
				return basicSetDevice(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE__PERFORMER:
				return basicSetPerformer(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE__REFERENCE_SEQ:
				return basicSetReferenceSeq(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE__VARIANT:
				return ((InternalEList<?>)getVariant()).basicRemove(otherEnd, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE__OBSERVED_SEQ:
				return basicSetObservedSeq(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE__QUALITY:
				return ((InternalEList<?>)getQuality()).basicRemove(otherEnd, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE__READ_COVERAGE:
				return basicSetReadCoverage(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE__REPOSITORY:
				return ((InternalEList<?>)getRepository()).basicRemove(otherEnd, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE__POINTER:
				return ((InternalEList<?>)getPointer()).basicRemove(otherEnd, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE__STRUCTURE_VARIANT:
				return ((InternalEList<?>)getStructureVariant()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MOLECULAR_SEQUENCE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MOLECULAR_SEQUENCE__TYPE:
				return getType();
			case FhirPackage.MOLECULAR_SEQUENCE__COORDINATE_SYSTEM:
				return getCoordinateSystem();
			case FhirPackage.MOLECULAR_SEQUENCE__PATIENT:
				return getPatient();
			case FhirPackage.MOLECULAR_SEQUENCE__SPECIMEN:
				return getSpecimen();
			case FhirPackage.MOLECULAR_SEQUENCE__DEVICE:
				return getDevice();
			case FhirPackage.MOLECULAR_SEQUENCE__PERFORMER:
				return getPerformer();
			case FhirPackage.MOLECULAR_SEQUENCE__QUANTITY:
				return getQuantity();
			case FhirPackage.MOLECULAR_SEQUENCE__REFERENCE_SEQ:
				return getReferenceSeq();
			case FhirPackage.MOLECULAR_SEQUENCE__VARIANT:
				return getVariant();
			case FhirPackage.MOLECULAR_SEQUENCE__OBSERVED_SEQ:
				return getObservedSeq();
			case FhirPackage.MOLECULAR_SEQUENCE__QUALITY:
				return getQuality();
			case FhirPackage.MOLECULAR_SEQUENCE__READ_COVERAGE:
				return getReadCoverage();
			case FhirPackage.MOLECULAR_SEQUENCE__REPOSITORY:
				return getRepository();
			case FhirPackage.MOLECULAR_SEQUENCE__POINTER:
				return getPointer();
			case FhirPackage.MOLECULAR_SEQUENCE__STRUCTURE_VARIANT:
				return getStructureVariant();
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
			case FhirPackage.MOLECULAR_SEQUENCE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__TYPE:
				setType((SequenceType)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__COORDINATE_SYSTEM:
				setCoordinateSystem((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__SPECIMEN:
				setSpecimen((Reference)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__DEVICE:
				setDevice((Reference)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__PERFORMER:
				setPerformer((Reference)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__REFERENCE_SEQ:
				setReferenceSeq((MolecularSequenceReferenceSeq)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__VARIANT:
				getVariant().clear();
				getVariant().addAll((Collection<? extends MolecularSequenceVariant>)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__OBSERVED_SEQ:
				setObservedSeq((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__QUALITY:
				getQuality().clear();
				getQuality().addAll((Collection<? extends MolecularSequenceQuality>)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__READ_COVERAGE:
				setReadCoverage((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__REPOSITORY:
				getRepository().clear();
				getRepository().addAll((Collection<? extends MolecularSequenceRepository>)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__POINTER:
				getPointer().clear();
				getPointer().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__STRUCTURE_VARIANT:
				getStructureVariant().clear();
				getStructureVariant().addAll((Collection<? extends MolecularSequenceStructureVariant>)newValue);
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
			case FhirPackage.MOLECULAR_SEQUENCE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__TYPE:
				setType((SequenceType)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__COORDINATE_SYSTEM:
				setCoordinateSystem((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__SPECIMEN:
				setSpecimen((Reference)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__DEVICE:
				setDevice((Reference)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__PERFORMER:
				setPerformer((Reference)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__REFERENCE_SEQ:
				setReferenceSeq((MolecularSequenceReferenceSeq)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__VARIANT:
				getVariant().clear();
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__OBSERVED_SEQ:
				setObservedSeq((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__QUALITY:
				getQuality().clear();
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__READ_COVERAGE:
				setReadCoverage((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__REPOSITORY:
				getRepository().clear();
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__POINTER:
				getPointer().clear();
				return;
			case FhirPackage.MOLECULAR_SEQUENCE__STRUCTURE_VARIANT:
				getStructureVariant().clear();
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
			case FhirPackage.MOLECULAR_SEQUENCE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MOLECULAR_SEQUENCE__TYPE:
				return type != null;
			case FhirPackage.MOLECULAR_SEQUENCE__COORDINATE_SYSTEM:
				return coordinateSystem != null;
			case FhirPackage.MOLECULAR_SEQUENCE__PATIENT:
				return patient != null;
			case FhirPackage.MOLECULAR_SEQUENCE__SPECIMEN:
				return specimen != null;
			case FhirPackage.MOLECULAR_SEQUENCE__DEVICE:
				return device != null;
			case FhirPackage.MOLECULAR_SEQUENCE__PERFORMER:
				return performer != null;
			case FhirPackage.MOLECULAR_SEQUENCE__QUANTITY:
				return quantity != null;
			case FhirPackage.MOLECULAR_SEQUENCE__REFERENCE_SEQ:
				return referenceSeq != null;
			case FhirPackage.MOLECULAR_SEQUENCE__VARIANT:
				return variant != null && !variant.isEmpty();
			case FhirPackage.MOLECULAR_SEQUENCE__OBSERVED_SEQ:
				return observedSeq != null;
			case FhirPackage.MOLECULAR_SEQUENCE__QUALITY:
				return quality != null && !quality.isEmpty();
			case FhirPackage.MOLECULAR_SEQUENCE__READ_COVERAGE:
				return readCoverage != null;
			case FhirPackage.MOLECULAR_SEQUENCE__REPOSITORY:
				return repository != null && !repository.isEmpty();
			case FhirPackage.MOLECULAR_SEQUENCE__POINTER:
				return pointer != null && !pointer.isEmpty();
			case FhirPackage.MOLECULAR_SEQUENCE__STRUCTURE_VARIANT:
				return structureVariant != null && !structureVariant.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MolecularSequenceImpl
