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

import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.MedicationOrder;
import org.hl7.fhir.MedicationOrderCategory;
import org.hl7.fhir.MedicationOrderDispenseRequest;
import org.hl7.fhir.MedicationOrderDosageInstruction;
import org.hl7.fhir.MedicationOrderEventHistory;
import org.hl7.fhir.MedicationOrderStatus;
import org.hl7.fhir.MedicationOrderSubstitution;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationOrderImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationOrderImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationOrderImpl#getMedicationCodeableConcept <em>Medication Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationOrderImpl#getMedicationReference <em>Medication Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationOrderImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationOrderImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationOrderImpl#getDateWritten <em>Date Written</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationOrderImpl#getPrescriber <em>Prescriber</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationOrderImpl#getReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationOrderImpl#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationOrderImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationOrderImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationOrderImpl#getDosageInstruction <em>Dosage Instruction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationOrderImpl#getDispenseRequest <em>Dispense Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationOrderImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationOrderImpl#getPriorPrescription <em>Prior Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationOrderImpl#getEventHistory <em>Event History</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationOrderImpl extends DomainResourceImpl implements MedicationOrder {
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
	protected MedicationOrderStatus status;

	/**
	 * The cached value of the '{@link #getMedicationCodeableConcept() <em>Medication Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept medicationCodeableConcept;

	/**
	 * The cached value of the '{@link #getMedicationReference() <em>Medication Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationReference()
	 * @generated
	 * @ordered
	 */
	protected Reference medicationReference;

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
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Reference encounter;

	/**
	 * The cached value of the '{@link #getDateWritten() <em>Date Written</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateWritten()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateWritten;

	/**
	 * The cached value of the '{@link #getPrescriber() <em>Prescriber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriber()
	 * @generated
	 * @ordered
	 */
	protected Reference prescriber;

	/**
	 * The cached value of the '{@link #getReasonCode() <em>Reason Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonCode;

	/**
	 * The cached value of the '{@link #getReasonReference() <em>Reason Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reasonReference;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected MedicationOrderCategory category;

	/**
	 * The cached value of the '{@link #getDosageInstruction() <em>Dosage Instruction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosageInstruction()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationOrderDosageInstruction> dosageInstruction;

	/**
	 * The cached value of the '{@link #getDispenseRequest() <em>Dispense Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispenseRequest()
	 * @generated
	 * @ordered
	 */
	protected MedicationOrderDispenseRequest dispenseRequest;

	/**
	 * The cached value of the '{@link #getSubstitution() <em>Substitution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitution()
	 * @generated
	 * @ordered
	 */
	protected MedicationOrderSubstitution substitution;

	/**
	 * The cached value of the '{@link #getPriorPrescription() <em>Prior Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorPrescription()
	 * @generated
	 * @ordered
	 */
	protected Reference priorPrescription;

	/**
	 * The cached value of the '{@link #getEventHistory() <em>Event History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationOrderEventHistory> eventHistory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationOrder();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MEDICATION_ORDER__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrderStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(MedicationOrderStatus newStatus, NotificationChain msgs) {
		MedicationOrderStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(MedicationOrderStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMedicationCodeableConcept() {
		return medicationCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationCodeableConcept(CodeableConcept newMedicationCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldMedicationCodeableConcept = medicationCodeableConcept;
		medicationCodeableConcept = newMedicationCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER__MEDICATION_CODEABLE_CONCEPT, oldMedicationCodeableConcept, newMedicationCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationCodeableConcept(CodeableConcept newMedicationCodeableConcept) {
		if (newMedicationCodeableConcept != medicationCodeableConcept) {
			NotificationChain msgs = null;
			if (medicationCodeableConcept != null)
				msgs = ((InternalEObject)medicationCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER__MEDICATION_CODEABLE_CONCEPT, null, msgs);
			if (newMedicationCodeableConcept != null)
				msgs = ((InternalEObject)newMedicationCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER__MEDICATION_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetMedicationCodeableConcept(newMedicationCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER__MEDICATION_CODEABLE_CONCEPT, newMedicationCodeableConcept, newMedicationCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getMedicationReference() {
		return medicationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationReference(Reference newMedicationReference, NotificationChain msgs) {
		Reference oldMedicationReference = medicationReference;
		medicationReference = newMedicationReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER__MEDICATION_REFERENCE, oldMedicationReference, newMedicationReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationReference(Reference newMedicationReference) {
		if (newMedicationReference != medicationReference) {
			NotificationChain msgs = null;
			if (medicationReference != null)
				msgs = ((InternalEObject)medicationReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER__MEDICATION_REFERENCE, null, msgs);
			if (newMedicationReference != null)
				msgs = ((InternalEObject)newMedicationReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER__MEDICATION_REFERENCE, null, msgs);
			msgs = basicSetMedicationReference(newMedicationReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER__MEDICATION_REFERENCE, newMedicationReference, newMedicationReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER__PATIENT, oldPatient, newPatient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Reference newEncounter, NotificationChain msgs) {
		Reference oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER__ENCOUNTER, oldEncounter, newEncounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Reference newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateWritten() {
		return dateWritten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateWritten(DateTime newDateWritten, NotificationChain msgs) {
		DateTime oldDateWritten = dateWritten;
		dateWritten = newDateWritten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER__DATE_WRITTEN, oldDateWritten, newDateWritten);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateWritten(DateTime newDateWritten) {
		if (newDateWritten != dateWritten) {
			NotificationChain msgs = null;
			if (dateWritten != null)
				msgs = ((InternalEObject)dateWritten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER__DATE_WRITTEN, null, msgs);
			if (newDateWritten != null)
				msgs = ((InternalEObject)newDateWritten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER__DATE_WRITTEN, null, msgs);
			msgs = basicSetDateWritten(newDateWritten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER__DATE_WRITTEN, newDateWritten, newDateWritten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPrescriber() {
		return prescriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrescriber(Reference newPrescriber, NotificationChain msgs) {
		Reference oldPrescriber = prescriber;
		prescriber = newPrescriber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER__PRESCRIBER, oldPrescriber, newPrescriber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescriber(Reference newPrescriber) {
		if (newPrescriber != prescriber) {
			NotificationChain msgs = null;
			if (prescriber != null)
				msgs = ((InternalEObject)prescriber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER__PRESCRIBER, null, msgs);
			if (newPrescriber != null)
				msgs = ((InternalEObject)newPrescriber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER__PRESCRIBER, null, msgs);
			msgs = basicSetPrescriber(newPrescriber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER__PRESCRIBER, newPrescriber, newPrescriber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonCode() {
		if (reasonCode == null) {
			reasonCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICATION_ORDER__REASON_CODE);
		}
		return reasonCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReasonReference() {
		if (reasonReference == null) {
			reasonReference = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_ORDER__REASON_REFERENCE);
		}
		return reasonReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.MEDICATION_ORDER__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrderCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(MedicationOrderCategory newCategory, NotificationChain msgs) {
		MedicationOrderCategory oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER__CATEGORY, oldCategory, newCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(MedicationOrderCategory newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationOrderDosageInstruction> getDosageInstruction() {
		if (dosageInstruction == null) {
			dosageInstruction = new EObjectContainmentEList<MedicationOrderDosageInstruction>(MedicationOrderDosageInstruction.class, this, FhirPackage.MEDICATION_ORDER__DOSAGE_INSTRUCTION);
		}
		return dosageInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrderDispenseRequest getDispenseRequest() {
		return dispenseRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDispenseRequest(MedicationOrderDispenseRequest newDispenseRequest, NotificationChain msgs) {
		MedicationOrderDispenseRequest oldDispenseRequest = dispenseRequest;
		dispenseRequest = newDispenseRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER__DISPENSE_REQUEST, oldDispenseRequest, newDispenseRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispenseRequest(MedicationOrderDispenseRequest newDispenseRequest) {
		if (newDispenseRequest != dispenseRequest) {
			NotificationChain msgs = null;
			if (dispenseRequest != null)
				msgs = ((InternalEObject)dispenseRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER__DISPENSE_REQUEST, null, msgs);
			if (newDispenseRequest != null)
				msgs = ((InternalEObject)newDispenseRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER__DISPENSE_REQUEST, null, msgs);
			msgs = basicSetDispenseRequest(newDispenseRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER__DISPENSE_REQUEST, newDispenseRequest, newDispenseRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrderSubstitution getSubstitution() {
		return substitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstitution(MedicationOrderSubstitution newSubstitution, NotificationChain msgs) {
		MedicationOrderSubstitution oldSubstitution = substitution;
		substitution = newSubstitution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER__SUBSTITUTION, oldSubstitution, newSubstitution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstitution(MedicationOrderSubstitution newSubstitution) {
		if (newSubstitution != substitution) {
			NotificationChain msgs = null;
			if (substitution != null)
				msgs = ((InternalEObject)substitution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER__SUBSTITUTION, null, msgs);
			if (newSubstitution != null)
				msgs = ((InternalEObject)newSubstitution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER__SUBSTITUTION, null, msgs);
			msgs = basicSetSubstitution(newSubstitution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER__SUBSTITUTION, newSubstitution, newSubstitution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPriorPrescription() {
		return priorPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriorPrescription(Reference newPriorPrescription, NotificationChain msgs) {
		Reference oldPriorPrescription = priorPrescription;
		priorPrescription = newPriorPrescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER__PRIOR_PRESCRIPTION, oldPriorPrescription, newPriorPrescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorPrescription(Reference newPriorPrescription) {
		if (newPriorPrescription != priorPrescription) {
			NotificationChain msgs = null;
			if (priorPrescription != null)
				msgs = ((InternalEObject)priorPrescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER__PRIOR_PRESCRIPTION, null, msgs);
			if (newPriorPrescription != null)
				msgs = ((InternalEObject)newPriorPrescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ORDER__PRIOR_PRESCRIPTION, null, msgs);
			msgs = basicSetPriorPrescription(newPriorPrescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ORDER__PRIOR_PRESCRIPTION, newPriorPrescription, newPriorPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationOrderEventHistory> getEventHistory() {
		if (eventHistory == null) {
			eventHistory = new EObjectContainmentEList<MedicationOrderEventHistory>(MedicationOrderEventHistory.class, this, FhirPackage.MEDICATION_ORDER__EVENT_HISTORY);
		}
		return eventHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_ORDER__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_ORDER__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.MEDICATION_ORDER__MEDICATION_CODEABLE_CONCEPT:
				return basicSetMedicationCodeableConcept(null, msgs);
			case FhirPackage.MEDICATION_ORDER__MEDICATION_REFERENCE:
				return basicSetMedicationReference(null, msgs);
			case FhirPackage.MEDICATION_ORDER__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.MEDICATION_ORDER__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.MEDICATION_ORDER__DATE_WRITTEN:
				return basicSetDateWritten(null, msgs);
			case FhirPackage.MEDICATION_ORDER__PRESCRIBER:
				return basicSetPrescriber(null, msgs);
			case FhirPackage.MEDICATION_ORDER__REASON_CODE:
				return ((InternalEList<?>)getReasonCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_ORDER__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReference()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_ORDER__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_ORDER__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.MEDICATION_ORDER__DOSAGE_INSTRUCTION:
				return ((InternalEList<?>)getDosageInstruction()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_ORDER__DISPENSE_REQUEST:
				return basicSetDispenseRequest(null, msgs);
			case FhirPackage.MEDICATION_ORDER__SUBSTITUTION:
				return basicSetSubstitution(null, msgs);
			case FhirPackage.MEDICATION_ORDER__PRIOR_PRESCRIPTION:
				return basicSetPriorPrescription(null, msgs);
			case FhirPackage.MEDICATION_ORDER__EVENT_HISTORY:
				return ((InternalEList<?>)getEventHistory()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICATION_ORDER__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEDICATION_ORDER__STATUS:
				return getStatus();
			case FhirPackage.MEDICATION_ORDER__MEDICATION_CODEABLE_CONCEPT:
				return getMedicationCodeableConcept();
			case FhirPackage.MEDICATION_ORDER__MEDICATION_REFERENCE:
				return getMedicationReference();
			case FhirPackage.MEDICATION_ORDER__PATIENT:
				return getPatient();
			case FhirPackage.MEDICATION_ORDER__ENCOUNTER:
				return getEncounter();
			case FhirPackage.MEDICATION_ORDER__DATE_WRITTEN:
				return getDateWritten();
			case FhirPackage.MEDICATION_ORDER__PRESCRIBER:
				return getPrescriber();
			case FhirPackage.MEDICATION_ORDER__REASON_CODE:
				return getReasonCode();
			case FhirPackage.MEDICATION_ORDER__REASON_REFERENCE:
				return getReasonReference();
			case FhirPackage.MEDICATION_ORDER__NOTE:
				return getNote();
			case FhirPackage.MEDICATION_ORDER__CATEGORY:
				return getCategory();
			case FhirPackage.MEDICATION_ORDER__DOSAGE_INSTRUCTION:
				return getDosageInstruction();
			case FhirPackage.MEDICATION_ORDER__DISPENSE_REQUEST:
				return getDispenseRequest();
			case FhirPackage.MEDICATION_ORDER__SUBSTITUTION:
				return getSubstitution();
			case FhirPackage.MEDICATION_ORDER__PRIOR_PRESCRIPTION:
				return getPriorPrescription();
			case FhirPackage.MEDICATION_ORDER__EVENT_HISTORY:
				return getEventHistory();
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
			case FhirPackage.MEDICATION_ORDER__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MEDICATION_ORDER__STATUS:
				setStatus((MedicationOrderStatus)newValue);
				return;
			case FhirPackage.MEDICATION_ORDER__MEDICATION_CODEABLE_CONCEPT:
				setMedicationCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_ORDER__MEDICATION_REFERENCE:
				setMedicationReference((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_ORDER__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_ORDER__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_ORDER__DATE_WRITTEN:
				setDateWritten((DateTime)newValue);
				return;
			case FhirPackage.MEDICATION_ORDER__PRESCRIBER:
				setPrescriber((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_ORDER__REASON_CODE:
				getReasonCode().clear();
				getReasonCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICATION_ORDER__REASON_REFERENCE:
				getReasonReference().clear();
				getReasonReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_ORDER__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.MEDICATION_ORDER__CATEGORY:
				setCategory((MedicationOrderCategory)newValue);
				return;
			case FhirPackage.MEDICATION_ORDER__DOSAGE_INSTRUCTION:
				getDosageInstruction().clear();
				getDosageInstruction().addAll((Collection<? extends MedicationOrderDosageInstruction>)newValue);
				return;
			case FhirPackage.MEDICATION_ORDER__DISPENSE_REQUEST:
				setDispenseRequest((MedicationOrderDispenseRequest)newValue);
				return;
			case FhirPackage.MEDICATION_ORDER__SUBSTITUTION:
				setSubstitution((MedicationOrderSubstitution)newValue);
				return;
			case FhirPackage.MEDICATION_ORDER__PRIOR_PRESCRIPTION:
				setPriorPrescription((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_ORDER__EVENT_HISTORY:
				getEventHistory().clear();
				getEventHistory().addAll((Collection<? extends MedicationOrderEventHistory>)newValue);
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
			case FhirPackage.MEDICATION_ORDER__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MEDICATION_ORDER__STATUS:
				setStatus((MedicationOrderStatus)null);
				return;
			case FhirPackage.MEDICATION_ORDER__MEDICATION_CODEABLE_CONCEPT:
				setMedicationCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_ORDER__MEDICATION_REFERENCE:
				setMedicationReference((Reference)null);
				return;
			case FhirPackage.MEDICATION_ORDER__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.MEDICATION_ORDER__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.MEDICATION_ORDER__DATE_WRITTEN:
				setDateWritten((DateTime)null);
				return;
			case FhirPackage.MEDICATION_ORDER__PRESCRIBER:
				setPrescriber((Reference)null);
				return;
			case FhirPackage.MEDICATION_ORDER__REASON_CODE:
				getReasonCode().clear();
				return;
			case FhirPackage.MEDICATION_ORDER__REASON_REFERENCE:
				getReasonReference().clear();
				return;
			case FhirPackage.MEDICATION_ORDER__NOTE:
				getNote().clear();
				return;
			case FhirPackage.MEDICATION_ORDER__CATEGORY:
				setCategory((MedicationOrderCategory)null);
				return;
			case FhirPackage.MEDICATION_ORDER__DOSAGE_INSTRUCTION:
				getDosageInstruction().clear();
				return;
			case FhirPackage.MEDICATION_ORDER__DISPENSE_REQUEST:
				setDispenseRequest((MedicationOrderDispenseRequest)null);
				return;
			case FhirPackage.MEDICATION_ORDER__SUBSTITUTION:
				setSubstitution((MedicationOrderSubstitution)null);
				return;
			case FhirPackage.MEDICATION_ORDER__PRIOR_PRESCRIPTION:
				setPriorPrescription((Reference)null);
				return;
			case FhirPackage.MEDICATION_ORDER__EVENT_HISTORY:
				getEventHistory().clear();
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
			case FhirPackage.MEDICATION_ORDER__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MEDICATION_ORDER__STATUS:
				return status != null;
			case FhirPackage.MEDICATION_ORDER__MEDICATION_CODEABLE_CONCEPT:
				return medicationCodeableConcept != null;
			case FhirPackage.MEDICATION_ORDER__MEDICATION_REFERENCE:
				return medicationReference != null;
			case FhirPackage.MEDICATION_ORDER__PATIENT:
				return patient != null;
			case FhirPackage.MEDICATION_ORDER__ENCOUNTER:
				return encounter != null;
			case FhirPackage.MEDICATION_ORDER__DATE_WRITTEN:
				return dateWritten != null;
			case FhirPackage.MEDICATION_ORDER__PRESCRIBER:
				return prescriber != null;
			case FhirPackage.MEDICATION_ORDER__REASON_CODE:
				return reasonCode != null && !reasonCode.isEmpty();
			case FhirPackage.MEDICATION_ORDER__REASON_REFERENCE:
				return reasonReference != null && !reasonReference.isEmpty();
			case FhirPackage.MEDICATION_ORDER__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.MEDICATION_ORDER__CATEGORY:
				return category != null;
			case FhirPackage.MEDICATION_ORDER__DOSAGE_INSTRUCTION:
				return dosageInstruction != null && !dosageInstruction.isEmpty();
			case FhirPackage.MEDICATION_ORDER__DISPENSE_REQUEST:
				return dispenseRequest != null;
			case FhirPackage.MEDICATION_ORDER__SUBSTITUTION:
				return substitution != null;
			case FhirPackage.MEDICATION_ORDER__PRIOR_PRESCRIPTION:
				return priorPrescription != null;
			case FhirPackage.MEDICATION_ORDER__EVENT_HISTORY:
				return eventHistory != null && !eventHistory.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationOrderImpl
