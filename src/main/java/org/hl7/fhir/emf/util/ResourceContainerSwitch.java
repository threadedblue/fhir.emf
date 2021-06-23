package org.hl7.fhir.emf.util;

import org.hl7.fhir.*;
import org.hl7.fhir.util.FhirSwitch;

public class ResourceContainerSwitch extends FhirSwitch<ResourceContainer> {

	public ResourceContainerSwitch() {
		super();
	}

	@Override
	public ResourceContainer caseAccount(Account eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setAccount(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseActivityDefinition(ActivityDefinition eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setActivityDefinition(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseAdverseEvent(AdverseEvent eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setAdverseEvent(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseAllergyIntolerance(AllergyIntolerance eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setAllergyIntolerance(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseAppointment(Appointment eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setAppointment(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseAppointmentResponse(AppointmentResponse eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setAppointmentResponse(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseAuditEvent(AuditEvent eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setAuditEvent(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseBasic(Basic eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setBasic(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseBinary(Binary eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setBinary(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseBiologicallyDerivedProduct(BiologicallyDerivedProduct eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setBiologicallyDerivedProduct(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseBodyStructure(BodyStructure eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setBodyStructure(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseBundle(Bundle eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setBundle(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseCapabilityStatement(CapabilityStatement eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setCapabilityStatement(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseCarePlan(CarePlan eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setCarePlan(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseCareTeam(CareTeam eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setCareTeam(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseCatalogEntry(CatalogEntry eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setCatalogEntry(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseChargeItem(ChargeItem eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setChargeItem(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseChargeItemDefinition(ChargeItemDefinition eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setChargeItemDefinition(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseClaim(Claim eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setClaim(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseClaimResponse(ClaimResponse eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setClaimResponse(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseClinicalImpression(ClinicalImpression eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setClinicalImpression(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseCodeSystem(CodeSystem eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setCodeSystem(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseCommunication(Communication eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setCommunication(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseCommunicationRequest(CommunicationRequest eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setCommunicationRequest(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseCompartmentDefinition(CompartmentDefinition eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setCompartmentDefinition(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseComposition(Composition eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setComposition(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseConceptMap(ConceptMap eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setConceptMap(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseCondition(Condition eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setCondition(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseConsent(Consent eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setConsent(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseContract(Contract eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setContract(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseCoverage(Coverage eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setCoverage(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseCoverageEligibilityRequest(CoverageEligibilityRequest eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setCoverageEligibilityRequest(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseCoverageEligibilityResponse(CoverageEligibilityResponse eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setCoverageEligibilityResponse(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseDetectedIssue(DetectedIssue eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setDetectedIssue(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseDevice(Device eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setDevice(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseDeviceDefinition(DeviceDefinition eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setDeviceDefinition(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseDeviceMetric(DeviceMetric eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setDeviceMetric(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseDeviceRequest(DeviceRequest eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setDeviceRequest(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseDeviceUseStatement(DeviceUseStatement eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setDeviceUseStatement(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseDiagnosticReport(DiagnosticReport eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setDiagnosticReport(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseDocumentManifest(DocumentManifest eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setDocumentManifest(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseDocumentReference(DocumentReference eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setDocumentReference(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseEffectEvidenceSynthesis(EffectEvidenceSynthesis eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setEffectEvidenceSynthesis(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseEncounter(Encounter eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setEncounter(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseEndpoint(Endpoint eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setEndpoint(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseEnrollmentRequest(EnrollmentRequest eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setEnrollmentRequest(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseEnrollmentResponse(EnrollmentResponse eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setEnrollmentResponse(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseEpisodeOfCare(EpisodeOfCare eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setEpisodeOfCare(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseEventDefinition(EventDefinition eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setEventDefinition(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseEvidence(Evidence eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setEvidence(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseEvidenceVariable(EvidenceVariable eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setEvidenceVariable(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseExampleScenario(ExampleScenario eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setExampleScenario(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseExplanationOfBenefit(ExplanationOfBenefit eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setExplanationOfBenefit(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseFamilyMemberHistory(FamilyMemberHistory eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setFamilyMemberHistory(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseFlag(Flag eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setFlag(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseGoal(Goal eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setGoal(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseGraphDefinition(GraphDefinition eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setGraphDefinition(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseGroup(Group eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setGroup(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseGuidanceResponse(GuidanceResponse eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setGuidanceResponse(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseHealthcareService(HealthcareService eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setHealthcareService(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseImagingStudy(ImagingStudy eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setImagingStudy(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseImmunization(Immunization eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setImmunization(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseImmunizationEvaluation(ImmunizationEvaluation eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setImmunizationEvaluation(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseImmunizationRecommendation(ImmunizationRecommendation eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setImmunizationRecommendation(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseImplementationGuide(ImplementationGuide eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setImplementationGuide(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseInsurancePlan(InsurancePlan eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setInsurancePlan(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseInvoice(Invoice eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setInvoice(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseLibrary(Library eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setLibrary(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseLinkage(Linkage eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setLinkage(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseList(List eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setList(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseLocation(Location eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setLocation(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseMeasure(Measure eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setMeasure(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseMeasureReport(MeasureReport eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setMeasureReport(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseMedia(Media eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setMedia(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseMedication(Medication eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setMedication(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseMedicationAdministration(MedicationAdministration eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setMedicationAdministration(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseMedicationDispense(MedicationDispense eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setMedicationDispense(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseMedicationKnowledge(MedicationKnowledge eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setMedicationKnowledge(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseMedicationRequest(MedicationRequest eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setMedicationRequest(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseMedicationStatement(MedicationStatement eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setMedicationStatement(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseMedicinalProduct(MedicinalProduct eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setMedicinalProduct(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseMedicinalProductAuthorization(MedicinalProductAuthorization eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setMedicinalProductAuthorization(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseMedicinalProductContraindication(MedicinalProductContraindication eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setMedicinalProductContraindication(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseMedicinalProductIndication(MedicinalProductIndication eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setMedicinalProductIndication(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseMedicinalProductIngredient(MedicinalProductIngredient eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setMedicinalProductIngredient(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseMedicinalProductInteraction(MedicinalProductInteraction eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setMedicinalProductInteraction(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseMedicinalProductManufactured(MedicinalProductManufactured eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setMedicinalProductManufactured(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseMedicinalProductPackaged(MedicinalProductPackaged eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setMedicinalProductPackaged(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseMedicinalProductPharmaceutical(MedicinalProductPharmaceutical eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setMedicinalProductPharmaceutical(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseMedicinalProductUndesirableEffect(MedicinalProductUndesirableEffect eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setMedicinalProductUndesirableEffect(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseMessageDefinition(MessageDefinition eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setMessageDefinition(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseMessageHeader(MessageHeader eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setMessageHeader(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseMolecularSequence(MolecularSequence eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setMolecularSequence(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseNamingSystem(NamingSystem eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setNamingSystem(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseNutritionOrder(NutritionOrder eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setNutritionOrder(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseObservation(Observation eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setObservation(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseObservationDefinition(ObservationDefinition eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setObservationDefinition(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseOperationDefinition(OperationDefinition eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setOperationDefinition(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseOperationOutcome(OperationOutcome eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setOperationOutcome(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseOrganization(Organization eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setOrganization(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseOrganizationAffiliation(OrganizationAffiliation eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setOrganizationAffiliation(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseParameters(Parameters eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setParameters(eObject);
		return container;
	}

	@Override
	public ResourceContainer casePatient(Patient eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setPatient(eObject);
		return container;
	}

	@Override
	public ResourceContainer casePaymentNotice(PaymentNotice eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setPaymentNotice(eObject);
		return container;
	}

	@Override
	public ResourceContainer casePaymentReconciliation(PaymentReconciliation eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setPaymentReconciliation(eObject);
		return container;
	}

	@Override
	public ResourceContainer casePerson(Person eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setPerson(eObject);
		return container;
	}

	@Override
	public ResourceContainer casePlanDefinition(PlanDefinition eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setPlanDefinition(eObject);
		return container;
	}

	@Override
	public ResourceContainer casePractitioner(Practitioner eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setPractitioner(eObject);
		return container;
	}

	@Override
	public ResourceContainer casePractitionerRole(PractitionerRole eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setPractitionerRole(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseProcedure(Procedure eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setProcedure(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseProvenance(Provenance eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setProvenance(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseQuestionnaire(Questionnaire eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setQuestionnaire(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseQuestionnaireResponse(QuestionnaireResponse eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setQuestionnaireResponse(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseRelatedPerson(RelatedPerson eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setRelatedPerson(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseRequestGroup(RequestGroup eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setRequestGroup(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseResearchDefinition(ResearchDefinition eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setResearchDefinition(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseResearchElementDefinition(ResearchElementDefinition eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setResearchElementDefinition(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseResearchStudy(ResearchStudy eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setResearchStudy(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseResearchSubject(ResearchSubject eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setResearchSubject(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseRiskAssessment(RiskAssessment eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setRiskAssessment(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseRiskEvidenceSynthesis(RiskEvidenceSynthesis eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setRiskEvidenceSynthesis(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseSchedule(Schedule eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setSchedule(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseSearchParameter(SearchParameter eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setSearchParameter(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseServiceRequest(ServiceRequest eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setServiceRequest(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseSlot(Slot eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setSlot(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseSpecimen(Specimen eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setSpecimen(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseSpecimenDefinition(SpecimenDefinition eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setSpecimenDefinition(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseStructureDefinition(StructureDefinition eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setStructureDefinition(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseStructureMap(StructureMap eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setStructureMap(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseSubscription(Subscription eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setSubscription(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseSubstance(Substance eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setSubstance(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseSubstancePolymer(SubstancePolymer eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setSubstancePolymer(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseSubstanceProtein(SubstanceProtein eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setSubstanceProtein(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseSubstanceReferenceInformation(SubstanceReferenceInformation eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setSubstanceReferenceInformation(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseSubstanceSpecification(SubstanceSpecification eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setSubstanceSpecification(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseSubstanceSourceMaterial(SubstanceSourceMaterial eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setSubstanceSourceMaterial(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseSupplyDelivery(SupplyDelivery eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setSupplyDelivery(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseSupplyRequest(SupplyRequest eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setSupplyRequest(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseTask(Task eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setTask(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseTerminologyCapabilities(TerminologyCapabilities eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setTerminologyCapabilities(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseTestReport(TestReport eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setTestReport(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseTestScript(TestScript eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setTestScript(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseValueSet(ValueSet eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setValueSet(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseVerificationResult(VerificationResult eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setVerificationResult(eObject);
		return container;
	}

	@Override
	public ResourceContainer caseVisionPrescription(VisionPrescription eObject) {
		ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();
		container.setVisionPrescription(eObject);
		return container;
	}
}
