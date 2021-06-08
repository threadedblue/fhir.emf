/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.RiskEvidenceSynthesisCertainty;
import org.hl7.fhir.RiskEvidenceSynthesisCertaintySubcomponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Evidence Synthesis Certainty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.RiskEvidenceSynthesisCertaintyImpl#getRating <em>Rating</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskEvidenceSynthesisCertaintyImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskEvidenceSynthesisCertaintyImpl#getCertaintySubcomponent <em>Certainty Subcomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskEvidenceSynthesisCertaintyImpl extends BackboneElementImpl implements RiskEvidenceSynthesisCertainty {
	/**
	 * The cached value of the '{@link #getRating() <em>Rating</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> rating;

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
	 * The cached value of the '{@link #getCertaintySubcomponent() <em>Certainty Subcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertaintySubcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<RiskEvidenceSynthesisCertaintySubcomponent> certaintySubcomponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskEvidenceSynthesisCertaintyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getRiskEvidenceSynthesisCertainty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getRating() {
		if (rating == null) {
			rating = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY__RATING);
		}
		return rating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RiskEvidenceSynthesisCertaintySubcomponent> getCertaintySubcomponent() {
		if (certaintySubcomponent == null) {
			certaintySubcomponent = new EObjectContainmentEList<RiskEvidenceSynthesisCertaintySubcomponent>(RiskEvidenceSynthesisCertaintySubcomponent.class, this, FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY__CERTAINTY_SUBCOMPONENT);
		}
		return certaintySubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY__RATING:
				return ((InternalEList<?>)getRating()).basicRemove(otherEnd, msgs);
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY__CERTAINTY_SUBCOMPONENT:
				return ((InternalEList<?>)getCertaintySubcomponent()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY__RATING:
				return getRating();
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY__NOTE:
				return getNote();
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY__CERTAINTY_SUBCOMPONENT:
				return getCertaintySubcomponent();
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
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY__RATING:
				getRating().clear();
				getRating().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY__CERTAINTY_SUBCOMPONENT:
				getCertaintySubcomponent().clear();
				getCertaintySubcomponent().addAll((Collection<? extends RiskEvidenceSynthesisCertaintySubcomponent>)newValue);
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
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY__RATING:
				getRating().clear();
				return;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY__NOTE:
				getNote().clear();
				return;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY__CERTAINTY_SUBCOMPONENT:
				getCertaintySubcomponent().clear();
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
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY__RATING:
				return rating != null && !rating.isEmpty();
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY__CERTAINTY_SUBCOMPONENT:
				return certaintySubcomponent != null && !certaintySubcomponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RiskEvidenceSynthesisCertaintyImpl
