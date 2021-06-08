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

import org.hl7.fhir.CodeSystem;
import org.hl7.fhir.CodeSystemConcept;
import org.hl7.fhir.CodeSystemContact;
import org.hl7.fhir.CodeSystemContentMode;
import org.hl7.fhir.CodeSystemFilter;
import org.hl7.fhir.CodeSystemHierarchyMeaning;
import org.hl7.fhir.CodeSystemProperty;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.ConformanceResourceStatus;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.UnsignedInt;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemImpl#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemImpl#getCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemImpl#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemImpl#getHierarchyMeaning <em>Hierarchy Meaning</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemImpl#getCompositional <em>Compositional</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemImpl#getVersionNeeded <em>Version Needed</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CodeSystemImpl#getConcept <em>Concept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeSystemImpl extends DomainResourceImpl implements CodeSystem {
	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String version;

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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ConformanceResourceStatus status;

	/**
	 * The cached value of the '{@link #getExperimental() <em>Experimental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimental()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean experimental;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String publisher;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemContact> contact;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

	/**
	 * The cached value of the '{@link #getUseContext() <em>Use Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseContext()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> useContext;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected Markdown requirements;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String copyright;

	/**
	 * The cached value of the '{@link #getCaseSensitive() <em>Case Sensitive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseSensitive()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean caseSensitive;

	/**
	 * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected Uri valueSet;

	/**
	 * The cached value of the '{@link #getHierarchyMeaning() <em>Hierarchy Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchyMeaning()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemHierarchyMeaning hierarchyMeaning;

	/**
	 * The cached value of the '{@link #getCompositional() <em>Compositional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositional()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean compositional;

	/**
	 * The cached value of the '{@link #getVersionNeeded() <em>Version Needed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionNeeded()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean versionNeeded;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemContentMode content;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt count;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemFilter> filter;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemProperty> property;

	/**
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemConcept> concept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCodeSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Uri newUrl, NotificationChain msgs) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Uri newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(org.hl7.fhir.String newVersion, NotificationChain msgs) {
		org.hl7.fhir.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(org.hl7.fhir.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceResourceStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ConformanceResourceStatus newStatus, NotificationChain msgs) {
		ConformanceResourceStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ConformanceResourceStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getExperimental() {
		return experimental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimental(org.hl7.fhir.Boolean newExperimental, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldExperimental = experimental;
		experimental = newExperimental;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__EXPERIMENTAL, oldExperimental, newExperimental);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExperimental(org.hl7.fhir.Boolean newExperimental) {
		if (newExperimental != experimental) {
			NotificationChain msgs = null;
			if (experimental != null)
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__EXPERIMENTAL, newExperimental, newExperimental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(org.hl7.fhir.String newPublisher, NotificationChain msgs) {
		org.hl7.fhir.String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__PUBLISHER, oldPublisher, newPublisher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(org.hl7.fhir.String newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeSystemContact> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<CodeSystemContact>(CodeSystemContact.class, this, FhirPackage.CODE_SYSTEM__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Markdown newDescription, NotificationChain msgs) {
		Markdown oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getUseContext() {
		if (useContext == null) {
			useContext = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CODE_SYSTEM__USE_CONTEXT);
		}
		return useContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getRequirements() {
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirements(Markdown newRequirements, NotificationChain msgs) {
		Markdown oldRequirements = requirements;
		requirements = newRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__REQUIREMENTS, oldRequirements, newRequirements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirements(Markdown newRequirements) {
		if (newRequirements != requirements) {
			NotificationChain msgs = null;
			if (requirements != null)
				msgs = ((InternalEObject)requirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__REQUIREMENTS, null, msgs);
			if (newRequirements != null)
				msgs = ((InternalEObject)newRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__REQUIREMENTS, null, msgs);
			msgs = basicSetRequirements(newRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__REQUIREMENTS, newRequirements, newRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyright(org.hl7.fhir.String newCopyright, NotificationChain msgs) {
		org.hl7.fhir.String oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__COPYRIGHT, oldCopyright, newCopyright);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(org.hl7.fhir.String newCopyright) {
		if (newCopyright != copyright) {
			NotificationChain msgs = null;
			if (copyright != null)
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getCaseSensitive() {
		return caseSensitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaseSensitive(org.hl7.fhir.Boolean newCaseSensitive, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldCaseSensitive = caseSensitive;
		caseSensitive = newCaseSensitive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__CASE_SENSITIVE, oldCaseSensitive, newCaseSensitive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseSensitive(org.hl7.fhir.Boolean newCaseSensitive) {
		if (newCaseSensitive != caseSensitive) {
			NotificationChain msgs = null;
			if (caseSensitive != null)
				msgs = ((InternalEObject)caseSensitive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__CASE_SENSITIVE, null, msgs);
			if (newCaseSensitive != null)
				msgs = ((InternalEObject)newCaseSensitive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__CASE_SENSITIVE, null, msgs);
			msgs = basicSetCaseSensitive(newCaseSensitive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__CASE_SENSITIVE, newCaseSensitive, newCaseSensitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getValueSet() {
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSet(Uri newValueSet, NotificationChain msgs) {
		Uri oldValueSet = valueSet;
		valueSet = newValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__VALUE_SET, oldValueSet, newValueSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSet(Uri newValueSet) {
		if (newValueSet != valueSet) {
			NotificationChain msgs = null;
			if (valueSet != null)
				msgs = ((InternalEObject)valueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__VALUE_SET, null, msgs);
			if (newValueSet != null)
				msgs = ((InternalEObject)newValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__VALUE_SET, null, msgs);
			msgs = basicSetValueSet(newValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__VALUE_SET, newValueSet, newValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemHierarchyMeaning getHierarchyMeaning() {
		return hierarchyMeaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHierarchyMeaning(CodeSystemHierarchyMeaning newHierarchyMeaning, NotificationChain msgs) {
		CodeSystemHierarchyMeaning oldHierarchyMeaning = hierarchyMeaning;
		hierarchyMeaning = newHierarchyMeaning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__HIERARCHY_MEANING, oldHierarchyMeaning, newHierarchyMeaning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHierarchyMeaning(CodeSystemHierarchyMeaning newHierarchyMeaning) {
		if (newHierarchyMeaning != hierarchyMeaning) {
			NotificationChain msgs = null;
			if (hierarchyMeaning != null)
				msgs = ((InternalEObject)hierarchyMeaning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__HIERARCHY_MEANING, null, msgs);
			if (newHierarchyMeaning != null)
				msgs = ((InternalEObject)newHierarchyMeaning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__HIERARCHY_MEANING, null, msgs);
			msgs = basicSetHierarchyMeaning(newHierarchyMeaning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__HIERARCHY_MEANING, newHierarchyMeaning, newHierarchyMeaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getCompositional() {
		return compositional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositional(org.hl7.fhir.Boolean newCompositional, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldCompositional = compositional;
		compositional = newCompositional;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__COMPOSITIONAL, oldCompositional, newCompositional);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositional(org.hl7.fhir.Boolean newCompositional) {
		if (newCompositional != compositional) {
			NotificationChain msgs = null;
			if (compositional != null)
				msgs = ((InternalEObject)compositional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__COMPOSITIONAL, null, msgs);
			if (newCompositional != null)
				msgs = ((InternalEObject)newCompositional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__COMPOSITIONAL, null, msgs);
			msgs = basicSetCompositional(newCompositional, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__COMPOSITIONAL, newCompositional, newCompositional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getVersionNeeded() {
		return versionNeeded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionNeeded(org.hl7.fhir.Boolean newVersionNeeded, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldVersionNeeded = versionNeeded;
		versionNeeded = newVersionNeeded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__VERSION_NEEDED, oldVersionNeeded, newVersionNeeded);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionNeeded(org.hl7.fhir.Boolean newVersionNeeded) {
		if (newVersionNeeded != versionNeeded) {
			NotificationChain msgs = null;
			if (versionNeeded != null)
				msgs = ((InternalEObject)versionNeeded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__VERSION_NEEDED, null, msgs);
			if (newVersionNeeded != null)
				msgs = ((InternalEObject)newVersionNeeded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__VERSION_NEEDED, null, msgs);
			msgs = basicSetVersionNeeded(newVersionNeeded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__VERSION_NEEDED, newVersionNeeded, newVersionNeeded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemContentMode getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(CodeSystemContentMode newContent, NotificationChain msgs) {
		CodeSystemContentMode oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__CONTENT, oldContent, newContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(CodeSystemContentMode newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__CONTENT, newContent, newContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCount(UnsignedInt newCount, NotificationChain msgs) {
		UnsignedInt oldCount = count;
		count = newCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__COUNT, oldCount, newCount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(UnsignedInt newCount) {
		if (newCount != count) {
			NotificationChain msgs = null;
			if (count != null)
				msgs = ((InternalEObject)count).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__COUNT, null, msgs);
			if (newCount != null)
				msgs = ((InternalEObject)newCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CODE_SYSTEM__COUNT, null, msgs);
			msgs = basicSetCount(newCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CODE_SYSTEM__COUNT, newCount, newCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeSystemFilter> getFilter() {
		if (filter == null) {
			filter = new EObjectContainmentEList<CodeSystemFilter>(CodeSystemFilter.class, this, FhirPackage.CODE_SYSTEM__FILTER);
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeSystemProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<CodeSystemProperty>(CodeSystemProperty.class, this, FhirPackage.CODE_SYSTEM__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeSystemConcept> getConcept() {
		if (concept == null) {
			concept = new EObjectContainmentEList<CodeSystemConcept>(CodeSystemConcept.class, this, FhirPackage.CODE_SYSTEM__CONCEPT);
		}
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CODE_SYSTEM__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.CODE_SYSTEM__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.CODE_SYSTEM__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.CODE_SYSTEM__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.CODE_SYSTEM__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CODE_SYSTEM__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FhirPackage.CODE_SYSTEM__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.CODE_SYSTEM__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.CODE_SYSTEM__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.CODE_SYSTEM__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.CODE_SYSTEM__USE_CONTEXT:
				return ((InternalEList<?>)getUseContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.CODE_SYSTEM__REQUIREMENTS:
				return basicSetRequirements(null, msgs);
			case FhirPackage.CODE_SYSTEM__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case FhirPackage.CODE_SYSTEM__CASE_SENSITIVE:
				return basicSetCaseSensitive(null, msgs);
			case FhirPackage.CODE_SYSTEM__VALUE_SET:
				return basicSetValueSet(null, msgs);
			case FhirPackage.CODE_SYSTEM__HIERARCHY_MEANING:
				return basicSetHierarchyMeaning(null, msgs);
			case FhirPackage.CODE_SYSTEM__COMPOSITIONAL:
				return basicSetCompositional(null, msgs);
			case FhirPackage.CODE_SYSTEM__VERSION_NEEDED:
				return basicSetVersionNeeded(null, msgs);
			case FhirPackage.CODE_SYSTEM__CONTENT:
				return basicSetContent(null, msgs);
			case FhirPackage.CODE_SYSTEM__COUNT:
				return basicSetCount(null, msgs);
			case FhirPackage.CODE_SYSTEM__FILTER:
				return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
			case FhirPackage.CODE_SYSTEM__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case FhirPackage.CODE_SYSTEM__CONCEPT:
				return ((InternalEList<?>)getConcept()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CODE_SYSTEM__URL:
				return getUrl();
			case FhirPackage.CODE_SYSTEM__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CODE_SYSTEM__VERSION:
				return getVersion();
			case FhirPackage.CODE_SYSTEM__NAME:
				return getName();
			case FhirPackage.CODE_SYSTEM__STATUS:
				return getStatus();
			case FhirPackage.CODE_SYSTEM__EXPERIMENTAL:
				return getExperimental();
			case FhirPackage.CODE_SYSTEM__PUBLISHER:
				return getPublisher();
			case FhirPackage.CODE_SYSTEM__CONTACT:
				return getContact();
			case FhirPackage.CODE_SYSTEM__DATE:
				return getDate();
			case FhirPackage.CODE_SYSTEM__DESCRIPTION:
				return getDescription();
			case FhirPackage.CODE_SYSTEM__USE_CONTEXT:
				return getUseContext();
			case FhirPackage.CODE_SYSTEM__REQUIREMENTS:
				return getRequirements();
			case FhirPackage.CODE_SYSTEM__COPYRIGHT:
				return getCopyright();
			case FhirPackage.CODE_SYSTEM__CASE_SENSITIVE:
				return getCaseSensitive();
			case FhirPackage.CODE_SYSTEM__VALUE_SET:
				return getValueSet();
			case FhirPackage.CODE_SYSTEM__HIERARCHY_MEANING:
				return getHierarchyMeaning();
			case FhirPackage.CODE_SYSTEM__COMPOSITIONAL:
				return getCompositional();
			case FhirPackage.CODE_SYSTEM__VERSION_NEEDED:
				return getVersionNeeded();
			case FhirPackage.CODE_SYSTEM__CONTENT:
				return getContent();
			case FhirPackage.CODE_SYSTEM__COUNT:
				return getCount();
			case FhirPackage.CODE_SYSTEM__FILTER:
				return getFilter();
			case FhirPackage.CODE_SYSTEM__PROPERTY:
				return getProperty();
			case FhirPackage.CODE_SYSTEM__CONCEPT:
				return getConcept();
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
			case FhirPackage.CODE_SYSTEM__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.CODE_SYSTEM__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CODE_SYSTEM__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CODE_SYSTEM__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CODE_SYSTEM__STATUS:
				setStatus((ConformanceResourceStatus)newValue);
				return;
			case FhirPackage.CODE_SYSTEM__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.CODE_SYSTEM__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CODE_SYSTEM__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends CodeSystemContact>)newValue);
				return;
			case FhirPackage.CODE_SYSTEM__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.CODE_SYSTEM__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.CODE_SYSTEM__USE_CONTEXT:
				getUseContext().clear();
				getUseContext().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CODE_SYSTEM__REQUIREMENTS:
				setRequirements((Markdown)newValue);
				return;
			case FhirPackage.CODE_SYSTEM__COPYRIGHT:
				setCopyright((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CODE_SYSTEM__CASE_SENSITIVE:
				setCaseSensitive((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.CODE_SYSTEM__VALUE_SET:
				setValueSet((Uri)newValue);
				return;
			case FhirPackage.CODE_SYSTEM__HIERARCHY_MEANING:
				setHierarchyMeaning((CodeSystemHierarchyMeaning)newValue);
				return;
			case FhirPackage.CODE_SYSTEM__COMPOSITIONAL:
				setCompositional((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.CODE_SYSTEM__VERSION_NEEDED:
				setVersionNeeded((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.CODE_SYSTEM__CONTENT:
				setContent((CodeSystemContentMode)newValue);
				return;
			case FhirPackage.CODE_SYSTEM__COUNT:
				setCount((UnsignedInt)newValue);
				return;
			case FhirPackage.CODE_SYSTEM__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends CodeSystemFilter>)newValue);
				return;
			case FhirPackage.CODE_SYSTEM__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends CodeSystemProperty>)newValue);
				return;
			case FhirPackage.CODE_SYSTEM__CONCEPT:
				getConcept().clear();
				getConcept().addAll((Collection<? extends CodeSystemConcept>)newValue);
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
			case FhirPackage.CODE_SYSTEM__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.CODE_SYSTEM__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.CODE_SYSTEM__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CODE_SYSTEM__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CODE_SYSTEM__STATUS:
				setStatus((ConformanceResourceStatus)null);
				return;
			case FhirPackage.CODE_SYSTEM__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.CODE_SYSTEM__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CODE_SYSTEM__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.CODE_SYSTEM__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.CODE_SYSTEM__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.CODE_SYSTEM__USE_CONTEXT:
				getUseContext().clear();
				return;
			case FhirPackage.CODE_SYSTEM__REQUIREMENTS:
				setRequirements((Markdown)null);
				return;
			case FhirPackage.CODE_SYSTEM__COPYRIGHT:
				setCopyright((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CODE_SYSTEM__CASE_SENSITIVE:
				setCaseSensitive((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.CODE_SYSTEM__VALUE_SET:
				setValueSet((Uri)null);
				return;
			case FhirPackage.CODE_SYSTEM__HIERARCHY_MEANING:
				setHierarchyMeaning((CodeSystemHierarchyMeaning)null);
				return;
			case FhirPackage.CODE_SYSTEM__COMPOSITIONAL:
				setCompositional((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.CODE_SYSTEM__VERSION_NEEDED:
				setVersionNeeded((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.CODE_SYSTEM__CONTENT:
				setContent((CodeSystemContentMode)null);
				return;
			case FhirPackage.CODE_SYSTEM__COUNT:
				setCount((UnsignedInt)null);
				return;
			case FhirPackage.CODE_SYSTEM__FILTER:
				getFilter().clear();
				return;
			case FhirPackage.CODE_SYSTEM__PROPERTY:
				getProperty().clear();
				return;
			case FhirPackage.CODE_SYSTEM__CONCEPT:
				getConcept().clear();
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
			case FhirPackage.CODE_SYSTEM__URL:
				return url != null;
			case FhirPackage.CODE_SYSTEM__IDENTIFIER:
				return identifier != null;
			case FhirPackage.CODE_SYSTEM__VERSION:
				return version != null;
			case FhirPackage.CODE_SYSTEM__NAME:
				return name != null;
			case FhirPackage.CODE_SYSTEM__STATUS:
				return status != null;
			case FhirPackage.CODE_SYSTEM__EXPERIMENTAL:
				return experimental != null;
			case FhirPackage.CODE_SYSTEM__PUBLISHER:
				return publisher != null;
			case FhirPackage.CODE_SYSTEM__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.CODE_SYSTEM__DATE:
				return date != null;
			case FhirPackage.CODE_SYSTEM__DESCRIPTION:
				return description != null;
			case FhirPackage.CODE_SYSTEM__USE_CONTEXT:
				return useContext != null && !useContext.isEmpty();
			case FhirPackage.CODE_SYSTEM__REQUIREMENTS:
				return requirements != null;
			case FhirPackage.CODE_SYSTEM__COPYRIGHT:
				return copyright != null;
			case FhirPackage.CODE_SYSTEM__CASE_SENSITIVE:
				return caseSensitive != null;
			case FhirPackage.CODE_SYSTEM__VALUE_SET:
				return valueSet != null;
			case FhirPackage.CODE_SYSTEM__HIERARCHY_MEANING:
				return hierarchyMeaning != null;
			case FhirPackage.CODE_SYSTEM__COMPOSITIONAL:
				return compositional != null;
			case FhirPackage.CODE_SYSTEM__VERSION_NEEDED:
				return versionNeeded != null;
			case FhirPackage.CODE_SYSTEM__CONTENT:
				return content != null;
			case FhirPackage.CODE_SYSTEM__COUNT:
				return count != null;
			case FhirPackage.CODE_SYSTEM__FILTER:
				return filter != null && !filter.isEmpty();
			case FhirPackage.CODE_SYSTEM__PROPERTY:
				return property != null && !property.isEmpty();
			case FhirPackage.CODE_SYSTEM__CONCEPT:
				return concept != null && !concept.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CodeSystemImpl
