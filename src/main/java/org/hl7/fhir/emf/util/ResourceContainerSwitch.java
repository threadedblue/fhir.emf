package org.hl7.fhir.emf.util;

import org.hl7.fhir.*;
import org.hl7.fhir.util.FhirSwitch;

public class ResourceContainerSwitch<T> extends FhirSwitch<T> {

	ResourceContainer container;

	public ResourceContainerSwitch(ResourceContainer container) {
		super();
		this.container = container;
	}

	@Override
	public T caseAccount(Account eObject) {
		container.setAccount(eObject);
		return (T) container;
	}

	@Override
	public T caseActivityDefinition(ActivityDefinition eObject) {
		container.setActivityDefinition(eObject);
		return (T) container;
	}

	@Override
	public T caseAdverseEvent(AdverseEvent eObject) {
		container.setAdverseEvent(eObject);
		return (T) container;
	}

	@Override
	public T caseAllergyIntolerance(AllergyIntolerance eObject) {
		container.setAllergyIntolerance(eObject);
		return (T) container;
	}

	@Override
	public T caseAppointment(Appointment eObject) {
		container.setAppointment(eObject);
		return (T) container;
	}

	@Override
	public T caseAppointmentResponse(AppointmentResponse eObject) {
		container.setAppointmentResponse(eObject);
		return (T) container;
	}

	@Override
	public T caseAuditEvent(AuditEvent eObject) {
		container.setAuditEvent(eObject);
		return (T) container;
	}

	@Override
	public T caseBasic(Basic eObject) {
		container.setBasic(eObject);
		return (T) container;
	}

	@Override
	public T caseBinary(Binary eObject) {
		container.setBinary(eObject);
		return (T) container;
	}

	@Override
	public T caseBiologicallyDerivedProduct(BiologicallyDerivedProduct eObject) {
		container.setBiologicallyDerivedProduct(eObject);
		return (T) container;
	}

	@Override
	public T caseBodyStructure(BodyStructure eObject) {
		container.setBodyStructure(eObject);
		return (T) container;
	}

	@Override
	public T caseBundle(Bundle eObject) {
		container.setBundle(eObject);
		return (T) container;
	}

	@Override
	public T caseCapabilityStatement(CapabilityStatement eObject) {
		container.setCapabilityStatement(eObject);
		return (T) container;
	}

	@Override
	public T caseCarePlan(CarePlan eObject) {
		container.setCarePlan(eObject);
		return (T) container;
	}

	@Override
	public T caseCareTeam(CareTeam eObject) {
		container.setCareTeam(eObject);
		return (T) container;
	}

	@Override
	public T caseCatalogEntry(CatalogEntry eObject) {
		container.setCatalogEntry(eObject);
		return (T) container;
	}

	@Override
	public T caseChargeItem(ChargeItem eObject) {
		container.setChargeItem(eObject);
		return (T) container;
	}

	@Override
	public T caseChargeItemDefinition(ChargeItemDefinition eObject) {
		container.setChargeItemDefinition(eObject);
		return (T) container;
	}

	@Override
	public T caseClaim(Claim eObject) {
		container.setClaim(eObject);
		return (T) container;
	}

	@Override
	public T caseClaimResponse(ClaimResponse eObject) {
		container.setClaimResponse(eObject);
		return (T) container;
	}

	@Override
	public T caseClinicalImpression(ClinicalImpression eObject) {
		container.setClinicalImpression(eObject);
		return (T) container;
	}

	@Override
	public T caseCodeSystem(CodeSystem eObject) {
		container.setCodeSystem(eObject);
		return (T) container;
	}

	@Override
	public T caseCommunication(Communication eObject) {
		container.setCommunication(eObject);
		return (T) container;
	}

	@Override
	public T caseCommunicationRequest(CommunicationRequest eObject) {
		container.setCommunicationRequest(eObject);
		return (T) container;
	}

	@Override
	public T caseCompartmentDefinition(CompartmentDefinition eObject) {
		container.setCompartmentDefinition(eObject);
		return (T) container;
	}

	@Override
	public T caseComposition(Composition eObject) {
		container.setComposition(eObject);
		return (T) container;
	}

	@Override
	public T caseConceptMap(ConceptMap eObject) {
		container.setConceptMap(eObject);
		return (T) container;
	}

	@Override
	public T caseCondition(Condition eObject) {
		container.setCondition(eObject);
		return (T) container;
	}

	@Override
	public T caseConsent(Consent eObject) {
		container.setConsent(eObject);
		return (T) container;
	}

	@Override
	public T caseContract(Contract eObject) {
		container.setContract(eObject);
		return (T) container;
	}

	@Override
	public T caseCoverage(Coverage eObject) {
		container.setCoverage(eObject);
		return (T) container;
	}

	@Override
	public T caseCoverageEligibilityRequest(CoverageEligibilityRequest eObject) {
		container.setCoverageEligibilityRequest(eObject);
		return (T) container;
	}

	@Override
	public T caseCoverageEligibilityResponse(CoverageEligibilityResponse eObject) {
		container.setCoverageEligibilityResponse(eObject);
		return (T) container;
	}

	@Override
	public T caseDetectedIssue(DetectedIssue eObject) {
		container.setDetectedIssue(eObject);
		return (T) container;
	}

	@Override
	public T caseDevice(Device eObject) {
		container.setDevice(eObject);
		return (T) container;
	}

	@Override
	public T caseDeviceDefinition(DeviceDefinition eObject) {
		container.setDeviceDefinition(eObject);
		return (T) container;
	}

	@Override
	public T caseDeviceMetric(DeviceMetric eObject) {
		container.setDeviceMetric(eObject);
		return (T) container;
	}

	@Override
	public T caseDeviceRequest(DeviceRequest eObject) {
		container.setDeviceRequest(eObject);
		return (T) container;
	}

	@Override
	public T caseDeviceUseStatement(DeviceUseStatement eObject) {
		container.setDeviceUseStatement(eObject);
		return (T) container;
	}

	@Override
	public T caseDiagnosticReport(DiagnosticReport eObject) {
		container.setDiagnosticReport(eObject);
		return (T) container;
	}

	@Override
	public T caseDocumentManifest(DocumentManifest eObject) {
		container.setDocumentManifest(eObject);
		return (T) container;
	}

	@Override
	public T caseDocumentReference(DocumentReference eObject) {
		container.setDocumentReference(eObject);
		return (T) container;
	}

	@Override
	public T caseEffectEvidenceSynthesis(EffectEvidenceSynthesis eObject) {
		container.setEffectEvidenceSynthesis(eObject);
		return (T) container;
	}

	@Override
	public T caseEncounter(Encounter eObject) {
		container.setEncounter(eObject);
		return (T) container;
	}

	@Override
	public T caseEndpoint(Endpoint eObject) {
		container.setEndpoint(eObject);
		return (T) container;
	}

	@Override
	public T caseEnrollmentRequest(EnrollmentRequest eObject) {
		container.setEnrollmentRequest(eObject);
		return (T) container;
	}

	@Override
	public T caseEnrollmentResponse(EnrollmentResponse eObject) {
		container.setEnrollmentResponse(eObject);
		return (T) container;
	}

	@Override
	public T caseEpisodeOfCare(EpisodeOfCare eObject) {
		container.setEpisodeOfCare(eObject);
		return (T) container;
	}

	@Override
	public T caseEventDefinition(EventDefinition eObject) {
		container.setEventDefinition(eObject);
		return (T) container;
	}

	@Override
	public T caseEvidence(Evidence eObject) {
		container.setEvidence(eObject);
		return (T) container;
	}

	@Override
	public T caseEvidenceVariable(EvidenceVariable eObject) {
		container.setEvidenceVariable(eObject);
		return (T) container;
	}

	@Override
	public T caseExampleScenario(ExampleScenario eObject) {
		container.setExampleScenario(eObject);
		return (T) container;
	}

	@Override
	public T caseExplanationOfBenefit(ExplanationOfBenefit eObject) {
		container.setExplanationOfBenefit(eObject);
		return (T) container;
	}

	@Override
	public T caseFamilyMemberHistory(FamilyMemberHistory eObject) {
		container.setFamilyMemberHistory(eObject);
		return (T) container;
	}

	@Override
	public T caseFlag(Flag eObject) {
		container.setFlag(eObject);
		return (T) container;
	}

	@Override
	public T caseGoal(Goal eObject) {
		container.setGoal(eObject);
		return (T) container;
	}

	@Override
	public T caseGraphDefinition(GraphDefinition eObject) {
		container.setGraphDefinition(eObject);
		return (T) container;
	}

	@Override
	public T caseGroup(Group eObject) {
		container.setGroup(eObject);
		return (T) container;
	}

	@Override
	public T caseGuidanceResponse(GuidanceResponse eObject) {
		container.setGuidanceResponse(eObject);
		return (T) container;
	}

	@Override
	public T caseHealthcareService(HealthcareService eObject) {
		container.setHealthcareService(eObject);
		return (T) container;
	}

	@Override
	public T caseImagingStudy(ImagingStudy eObject) {
		container.setImagingStudy(eObject);
		return (T) container;
	}

	@Override
	public T caseImmunization(Immunization eObject) {
		container.setImmunization(eObject);
		return (T) container;
	}

	@Override
	public T caseImmunizationEvaluation(ImmunizationEvaluation eObject) {
		container.setImmunizationEvaluation(eObject);
		return (T) container;
	}

	@Override
	public T caseImmunizationRecommendation(ImmunizationRecommendation eObject) {
		container.setImmunizationRecommendation(eObject);
		return (T) container;
	}

	@Override
	public T caseImplementationGuide(ImplementationGuide eObject) {
		container.setImplementationGuide(eObject);
		return (T) container;
	}

	@Override
	public T caseInsurancePlan(InsurancePlan eObject) {
		container.setInsurancePlan(eObject);
		return (T) container;
	}

	@Override
	public T caseInvoice(Invoice eObject) {
		container.setInvoice(eObject);
		return (T) container;
	}

	@Override
	public T caseLibrary(Library eObject) {
		container.setLibrary(eObject);
		return (T) container;
	}

	@Override
	public T caseLinkage(Linkage eObject) {
		container.setLinkage(eObject);
		return (T) container;
	}

	@Override
	public T caseList(List eObject) {
		container.setList(eObject);
		return (T) container;
	}

	@Override
	public T caseLocation(Location eObject) {
		container.setLocation(eObject);
		return (T) container;
	}

	@Override
	public T caseMeasure(Measure eObject) {
		container.setMeasure(eObject);
		return (T) container;
	}

	@Override
	public T caseMeasureReport(MeasureReport eObject) {
		container.setMeasureReport(eObject);
		return (T) container;
	}

	@Override
	public T caseMedia(Media eObject) {
		container.setMedia(eObject);
		return (T) container;
	}

	@Override
	public T caseMedication(Medication eObject) {
		container.setMedication(eObject);
		return (T) container;
	}

	@Override
	public T caseMedicationAdministration(MedicationAdministration eObject) {
		container.setMedicationAdministration(eObject);
		return (T) container;
	}

	@Override
	public T caseMedicationDispense(MedicationDispense eObject) {
		container.setMedicationDispense(eObject);
		return (T) container;
	}

	@Override
	public T caseMedicationKnowledge(MedicationKnowledge eObject) {
		container.setMedicationKnowledge(eObject);
		return (T) container;
	}

	@Override
	public T caseMedicationRequest(MedicationRequest eObject) {
		container.setMedicationRequest(eObject);
		return (T) container;
	}

	@Override
	public T caseMedicationStatement(MedicationStatement eObject) {
		container.setMedicationStatement(eObject);
		return (T) container;
	}

	@Override
	public T caseMedicinalProduct(MedicinalProduct eObject) {
		container.setMedicinalProduct(eObject);
		return (T) container;
	}

	@Override
	public T caseMedicinalProductAuthorization(MedicinalProductAuthorization eObject) {
		container.setMedicinalProductAuthorization(eObject);
		return (T) container;
	}

	@Override
	public T caseMedicinalProductContraindication(MedicinalProductContraindication eObject) {
		container.setMedicinalProductContraindication(eObject);
		return (T) container;
	}

	@Override
	public T caseMedicinalProductIndication(MedicinalProductIndication eObject) {
		container.setMedicinalProductIndication(eObject);
		return (T) container;
	}

	@Override
	public T caseMedicinalProductIngredient(MedicinalProductIngredient eObject) {
		container.setMedicinalProductIngredient(eObject);
		return (T) container;
	}

	@Override
	public T caseMedicinalProductInteraction(MedicinalProductInteraction eObject) {
		container.setMedicinalProductInteraction(eObject);
		return (T) container;
	}

	@Override
	public T caseMedicinalProductManufactured(MedicinalProductManufactured eObject) {
		container.setMedicinalProductManufactured(eObject);
		return (T) container;
	}

	@Override
	public T caseMedicinalProductPackaged(MedicinalProductPackaged eObject) {
		container.setMedicinalProductPackaged(eObject);
		return (T) container;
	}

	@Override
	public T caseMedicinalProductPharmaceutical(MedicinalProductPharmaceutical eObject) {
		container.setMedicinalProductPharmaceutical(eObject);
		return (T) container;
	}

	@Override
	public T caseMedicinalProductUndesirableEffect(MedicinalProductUndesirableEffect eObject) {
		container.setMedicinalProductUndesirableEffect(eObject);
		return (T) container;
	}

	@Override
	public T caseMessageDefinition(MessageDefinition eObject) {
		container.setMessageDefinition(eObject);
		return (T) container;
	}

	@Override
	public T caseMessageHeader(MessageHeader eObject) {
		container.setMessageHeader(eObject);
		return (T) container;
	}

	@Override
	public T caseMolecularSequence(MolecularSequence eObject) {
		container.setMolecularSequence(eObject);
		return (T) container;
	}

	@Override
	public T caseNamingSystem(NamingSystem eObject) {
		container.setNamingSystem(eObject);
		return (T) container;
	}

	@Override
	public T caseNutritionOrder(NutritionOrder eObject) {
		container.setNutritionOrder(eObject);
		return (T) container;
	}

	@Override
	public T caseObservation(Observation eObject) {
		container.setObservation(eObject);
		return (T) container;
	}

	@Override
	public T caseObservationDefinition(ObservationDefinition eObject) {
		container.setObservationDefinition(eObject);
		return (T) container;
	}

	@Override
	public T caseOperationDefinition(OperationDefinition eObject) {
		container.setOperationDefinition(eObject);
		return (T) container;
	}

	@Override
	public T caseOperationOutcome(OperationOutcome eObject) {
		container.setOperationOutcome(eObject);
		return (T) container;
	}

	@Override
	public T caseOrganization(Organization eObject) {
		container.setOrganization(eObject);
		return (T) container;
	}

	@Override
	public T caseOrganizationAffiliation(OrganizationAffiliation eObject) {
		container.setOrganizationAffiliation(eObject);
		return (T) container;
	}

	@Override
	public T caseParameters(Parameters eObject) {
		container.setParameters(eObject);
		return (T) container;
	}

	@Override
	public T casePatient(Patient eObject) {
		container.setPatient(eObject);
		return (T) container;
	}

	@Override
	public T casePaymentNotice(PaymentNotice eObject) {
		container.setPaymentNotice(eObject);
		return (T) container;
	}

	@Override
	public T casePaymentReconciliation(PaymentReconciliation eObject) {
		container.setPaymentReconciliation(eObject);
		return (T) container;
	}

	@Override
	public T casePerson(Person eObject) {
		container.setPerson(eObject);
		return (T) container;
	}

	@Override
	public T casePlanDefinition(PlanDefinition eObject) {
		container.setPlanDefinition(eObject);
		return (T) container;
	}

	@Override
	public T casePractitioner(Practitioner eObject) {
		container.setPractitioner(eObject);
		return (T) container;
	}

	@Override
	public T casePractitionerRole(PractitionerRole eObject) {
		container.setPractitionerRole(eObject);
		return (T) container;
	}

	@Override
	public T caseProcedure(Procedure eObject) {
		container.setProcedure(eObject);
		return (T) container;
	}

	@Override
	public T caseProvenance(Provenance eObject) {
		container.setProvenance(eObject);
		return (T) container;
	}

	@Override
	public T caseQuestionnaire(Questionnaire eObject) {
		container.setQuestionnaire(eObject);
		return (T) container;
	}

	@Override
	public T caseQuestionnaireResponse(QuestionnaireResponse eObject) {
		container.setQuestionnaireResponse(eObject);
		return (T) container;
	}

	@Override
	public T caseRelatedPerson(RelatedPerson eObject) {
		container.setRelatedPerson(eObject);
		return (T) container;
	}

	@Override
	public T caseRequestGroup(RequestGroup eObject) {
		container.setRequestGroup(eObject);
		return (T) container;
	}

	@Override
	public T caseResearchDefinition(ResearchDefinition eObject) {
		container.setResearchDefinition(eObject);
		return (T) container;
	}

	@Override
	public T caseResearchElementDefinition(ResearchElementDefinition eObject) {
		container.setResearchElementDefinition(eObject);
		return (T) container;
	}

	@Override
	public T caseResearchStudy(ResearchStudy eObject) {
		container.setResearchStudy(eObject);
		return (T) container;
	}

	@Override
	public T caseResearchSubject(ResearchSubject eObject) {
		container.setResearchSubject(eObject);
		return (T) container;
	}

	@Override
	public T caseRiskAssessment(RiskAssessment eObject) {
		container.setRiskAssessment(eObject);
		return (T) container;
	}

	@Override
	public T caseRiskEvidenceSynthesis(RiskEvidenceSynthesis eObject) {
		container.setRiskEvidenceSynthesis(eObject);
		return (T) container;
	}

	@Override
	public T caseSchedule(Schedule eObject) {
		container.setSchedule(eObject);
		return (T) container;
	}

	@Override
	public T caseSearchParameter(SearchParameter eObject) {
		container.setSearchParameter(eObject);
		return (T) container;
	}

	@Override
	public T caseServiceRequest(ServiceRequest eObject) {
		container.setServiceRequest(eObject);
		return (T) container;
	}

	@Override
	public T caseSlot(Slot eObject) {
		container.setSlot(eObject);
		return (T) container;
	}

	@Override
	public T caseSpecimen(Specimen eObject) {
		container.setSpecimen(eObject);
		return (T) container;
	}

	@Override
	public T caseSpecimenDefinition(SpecimenDefinition eObject) {
		container.setSpecimenDefinition(eObject);
		return (T) container;
	}

	@Override
	public T caseStructureDefinition(StructureDefinition eObject) {
		container.setStructureDefinition(eObject);
		return (T) container;
	}

	@Override
	public T caseStructureMap(StructureMap eObject) {
		container.setStructureMap(eObject);
		return (T) container;
	}

	@Override
	public T caseSubscription(Subscription eObject) {
		container.setSubscription(eObject);
		return (T) container;
	}

	@Override
	public T caseSubstance(Substance eObject) {
		container.setSubstance(eObject);
		return (T) container;
	}

	@Override
	public T caseSubstancePolymer(SubstancePolymer eObject) {
		container.setSubstancePolymer(eObject);
		return (T) container;
	}

	@Override
	public T caseSubstanceProtein(SubstanceProtein eObject) {
		container.setSubstanceProtein(eObject);
		return (T) container;
	}

	@Override
	public T caseSubstanceReferenceInformation(SubstanceReferenceInformation eObject) {
		container.setSubstanceReferenceInformation(eObject);
		return (T) container;
	}

	@Override
	public T caseSubstanceSpecification(SubstanceSpecification eObject) {
		container.setSubstanceSpecification(eObject);
		return (T) container;
	}

	@Override
	public T caseSubstanceSourceMaterial(SubstanceSourceMaterial eObject) {
		container.setSubstanceSourceMaterial(eObject);
		return (T) container;
	}

	@Override
	public T caseSupplyDelivery(SupplyDelivery eObject) {
		container.setSupplyDelivery(eObject);
		return (T) container;
	}

	@Override
	public T caseSupplyRequest(SupplyRequest eObject) {
		container.setSupplyRequest(eObject);
		return (T) container;
	}

	@Override
	public T caseTask(Task eObject) {
		container.setTask(eObject);
		return (T) container;
	}

	@Override
	public T caseTerminologyCapabilities(TerminologyCapabilities eObject) {
		container.setTerminologyCapabilities(eObject);
		return (T) container;
	}

	@Override
	public T caseTestReport(TestReport eObject) {
		container.setTestReport(eObject);
		return (T) container;
	}

	@Override
	public T caseTestScript(TestScript eObject) {
		container.setTestScript(eObject);
		return (T) container;
	}

	@Override
	public T caseValueSet(ValueSet eObject) {
		container.setValueSet(eObject);
		return (T) container;
	}

	@Override
	public T caseVerificationResult(VerificationResult eObject) {
		container.setVerificationResult(eObject);
		return (T) container;
	}

	@Override
	public T caseVisionPrescription(VisionPrescription eObject) {
		container.setVisionPrescription(eObject);
		return (T) container;
	}

	public ResourceContainer getContainer() {
		return container;
	}

	public void setContainer(ResourceContainer container) {
		this.container = container;
	}
}
