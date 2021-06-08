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
import org.hl7.fhir.Age;
import org.hl7.fhir.Annotation;
import org.hl7.fhir.Attachment;
import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Canonical;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.ContactDetail;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.Contributor;
import org.hl7.fhir.Count;
import org.hl7.fhir.DataRequirement;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.Distance;
import org.hl7.fhir.Dosage;
import org.hl7.fhir.Duration;
import org.hl7.fhir.Expression;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.HumanName;
import org.hl7.fhir.Id;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Meta;
import org.hl7.fhir.Money;
import org.hl7.fhir.Oid;
import org.hl7.fhir.ParameterDefinition;
import org.hl7.fhir.ParametersParameter;
import org.hl7.fhir.Period;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RelatedArtifact;
import org.hl7.fhir.ResourceContainer;
import org.hl7.fhir.SampledData;
import org.hl7.fhir.Signature;
import org.hl7.fhir.Time;
import org.hl7.fhir.Timing;
import org.hl7.fhir.TriggerDefinition;
import org.hl7.fhir.UnsignedInt;
import org.hl7.fhir.Uri;
import org.hl7.fhir.Url;
import org.hl7.fhir.UsageContext;
import org.hl7.fhir.Uuid;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameters Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueBase64Binary <em>Value Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueCanonical <em>Value Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueCode <em>Value Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueDate <em>Value Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueDateTime <em>Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueDecimal <em>Value Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueId <em>Value Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueInstant <em>Value Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueInteger <em>Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueMarkdown <em>Value Markdown</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueOid <em>Value Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValuePositiveInt <em>Value Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueTime <em>Value Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueUnsignedInt <em>Value Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueUri <em>Value Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueUrl <em>Value Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueUuid <em>Value Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueAddress <em>Value Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueAge <em>Value Age</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueAnnotation <em>Value Annotation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueAttachment <em>Value Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueCodeableConcept <em>Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueCoding <em>Value Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueContactPoint <em>Value Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueCount <em>Value Count</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueDistance <em>Value Distance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueDuration <em>Value Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueHumanName <em>Value Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueIdentifier <em>Value Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueMoney <em>Value Money</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValuePeriod <em>Value Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueRange <em>Value Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueRatio <em>Value Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueReference <em>Value Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueSampledData <em>Value Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueSignature <em>Value Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueTiming <em>Value Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueContactDetail <em>Value Contact Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueContributor <em>Value Contributor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueDataRequirement <em>Value Data Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueParameterDefinition <em>Value Parameter Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueRelatedArtifact <em>Value Related Artifact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueTriggerDefinition <em>Value Trigger Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueUsageContext <em>Value Usage Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueDosage <em>Value Dosage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getValueMeta <em>Value Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ParametersParameterImpl#getPart <em>Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParametersParameterImpl extends BackboneElementImpl implements ParametersParameter {
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
	 * The cached value of the '{@link #getValueBase64Binary() <em>Value Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueBase64Binary()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary valueBase64Binary;

	/**
	 * The cached value of the '{@link #getValueBoolean() <em>Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean valueBoolean;

	/**
	 * The cached value of the '{@link #getValueCanonical() <em>Value Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCanonical()
	 * @generated
	 * @ordered
	 */
	protected Canonical valueCanonical;

	/**
	 * The cached value of the '{@link #getValueCode() <em>Value Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCode()
	 * @generated
	 * @ordered
	 */
	protected Code valueCode;

	/**
	 * The cached value of the '{@link #getValueDate() <em>Value Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDate()
	 * @generated
	 * @ordered
	 */
	protected Date valueDate;

	/**
	 * The cached value of the '{@link #getValueDateTime() <em>Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime valueDateTime;

	/**
	 * The cached value of the '{@link #getValueDecimal() <em>Value Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDecimal()
	 * @generated
	 * @ordered
	 */
	protected Decimal valueDecimal;

	/**
	 * The cached value of the '{@link #getValueId() <em>Value Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueId()
	 * @generated
	 * @ordered
	 */
	protected Id valueId;

	/**
	 * The cached value of the '{@link #getValueInstant() <em>Value Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueInstant()
	 * @generated
	 * @ordered
	 */
	protected Instant valueInstant;

	/**
	 * The cached value of the '{@link #getValueInteger() <em>Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueInteger()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer valueInteger;

	/**
	 * The cached value of the '{@link #getValueMarkdown() <em>Value Markdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueMarkdown()
	 * @generated
	 * @ordered
	 */
	protected Markdown valueMarkdown;

	/**
	 * The cached value of the '{@link #getValueOid() <em>Value Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueOid()
	 * @generated
	 * @ordered
	 */
	protected Oid valueOid;

	/**
	 * The cached value of the '{@link #getValuePositiveInt() <em>Value Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuePositiveInt()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt valuePositiveInt;

	/**
	 * The cached value of the '{@link #getValueString() <em>Value String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String valueString;

	/**
	 * The cached value of the '{@link #getValueTime() <em>Value Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTime()
	 * @generated
	 * @ordered
	 */
	protected Time valueTime;

	/**
	 * The cached value of the '{@link #getValueUnsignedInt() <em>Value Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt valueUnsignedInt;

	/**
	 * The cached value of the '{@link #getValueUri() <em>Value Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueUri()
	 * @generated
	 * @ordered
	 */
	protected Uri valueUri;

	/**
	 * The cached value of the '{@link #getValueUrl() <em>Value Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueUrl()
	 * @generated
	 * @ordered
	 */
	protected Url valueUrl;

	/**
	 * The cached value of the '{@link #getValueUuid() <em>Value Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueUuid()
	 * @generated
	 * @ordered
	 */
	protected Uuid valueUuid;

	/**
	 * The cached value of the '{@link #getValueAddress() <em>Value Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueAddress()
	 * @generated
	 * @ordered
	 */
	protected Address valueAddress;

	/**
	 * The cached value of the '{@link #getValueAge() <em>Value Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueAge()
	 * @generated
	 * @ordered
	 */
	protected Age valueAge;

	/**
	 * The cached value of the '{@link #getValueAnnotation() <em>Value Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation valueAnnotation;

	/**
	 * The cached value of the '{@link #getValueAttachment() <em>Value Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment valueAttachment;

	/**
	 * The cached value of the '{@link #getValueCodeableConcept() <em>Value Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept valueCodeableConcept;

	/**
	 * The cached value of the '{@link #getValueCoding() <em>Value Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCoding()
	 * @generated
	 * @ordered
	 */
	protected Coding valueCoding;

	/**
	 * The cached value of the '{@link #getValueContactPoint() <em>Value Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueContactPoint()
	 * @generated
	 * @ordered
	 */
	protected ContactPoint valueContactPoint;

	/**
	 * The cached value of the '{@link #getValueCount() <em>Value Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCount()
	 * @generated
	 * @ordered
	 */
	protected Count valueCount;

	/**
	 * The cached value of the '{@link #getValueDistance() <em>Value Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDistance()
	 * @generated
	 * @ordered
	 */
	protected Distance valueDistance;

	/**
	 * The cached value of the '{@link #getValueDuration() <em>Value Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration valueDuration;

	/**
	 * The cached value of the '{@link #getValueHumanName() <em>Value Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueHumanName()
	 * @generated
	 * @ordered
	 */
	protected HumanName valueHumanName;

	/**
	 * The cached value of the '{@link #getValueIdentifier() <em>Value Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier valueIdentifier;

	/**
	 * The cached value of the '{@link #getValueMoney() <em>Value Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueMoney()
	 * @generated
	 * @ordered
	 */
	protected Money valueMoney;

	/**
	 * The cached value of the '{@link #getValuePeriod() <em>Value Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period valuePeriod;

	/**
	 * The cached value of the '{@link #getValueQuantity() <em>Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity valueQuantity;

	/**
	 * The cached value of the '{@link #getValueRange() <em>Value Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRange()
	 * @generated
	 * @ordered
	 */
	protected Range valueRange;

	/**
	 * The cached value of the '{@link #getValueRatio() <em>Value Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio valueRatio;

	/**
	 * The cached value of the '{@link #getValueReference() <em>Value Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueReference()
	 * @generated
	 * @ordered
	 */
	protected Reference valueReference;

	/**
	 * The cached value of the '{@link #getValueSampledData() <em>Value Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSampledData()
	 * @generated
	 * @ordered
	 */
	protected SampledData valueSampledData;

	/**
	 * The cached value of the '{@link #getValueSignature() <em>Value Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSignature()
	 * @generated
	 * @ordered
	 */
	protected Signature valueSignature;

	/**
	 * The cached value of the '{@link #getValueTiming() <em>Value Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing valueTiming;

	/**
	 * The cached value of the '{@link #getValueContactDetail() <em>Value Contact Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueContactDetail()
	 * @generated
	 * @ordered
	 */
	protected ContactDetail valueContactDetail;

	/**
	 * The cached value of the '{@link #getValueContributor() <em>Value Contributor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueContributor()
	 * @generated
	 * @ordered
	 */
	protected Contributor valueContributor;

	/**
	 * The cached value of the '{@link #getValueDataRequirement() <em>Value Data Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDataRequirement()
	 * @generated
	 * @ordered
	 */
	protected DataRequirement valueDataRequirement;

	/**
	 * The cached value of the '{@link #getValueExpression() <em>Value Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression valueExpression;

	/**
	 * The cached value of the '{@link #getValueParameterDefinition() <em>Value Parameter Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueParameterDefinition()
	 * @generated
	 * @ordered
	 */
	protected ParameterDefinition valueParameterDefinition;

	/**
	 * The cached value of the '{@link #getValueRelatedArtifact() <em>Value Related Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRelatedArtifact()
	 * @generated
	 * @ordered
	 */
	protected RelatedArtifact valueRelatedArtifact;

	/**
	 * The cached value of the '{@link #getValueTriggerDefinition() <em>Value Trigger Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTriggerDefinition()
	 * @generated
	 * @ordered
	 */
	protected TriggerDefinition valueTriggerDefinition;

	/**
	 * The cached value of the '{@link #getValueUsageContext() <em>Value Usage Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueUsageContext()
	 * @generated
	 * @ordered
	 */
	protected UsageContext valueUsageContext;

	/**
	 * The cached value of the '{@link #getValueDosage() <em>Value Dosage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDosage()
	 * @generated
	 * @ordered
	 */
	protected Dosage valueDosage;

	/**
	 * The cached value of the '{@link #getValueMeta() <em>Value Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueMeta()
	 * @generated
	 * @ordered
	 */
	protected Meta valueMeta;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected ResourceContainer resource;

	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected EList<ParametersParameter> part;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParametersParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getParametersParameter();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64Binary getValueBase64Binary() {
		return valueBase64Binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueBase64Binary(Base64Binary newValueBase64Binary, NotificationChain msgs) {
		Base64Binary oldValueBase64Binary = valueBase64Binary;
		valueBase64Binary = newValueBase64Binary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_BASE64_BINARY, oldValueBase64Binary, newValueBase64Binary);
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
	public void setValueBase64Binary(Base64Binary newValueBase64Binary) {
		if (newValueBase64Binary != valueBase64Binary) {
			NotificationChain msgs = null;
			if (valueBase64Binary != null)
				msgs = ((InternalEObject)valueBase64Binary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_BASE64_BINARY, null, msgs);
			if (newValueBase64Binary != null)
				msgs = ((InternalEObject)newValueBase64Binary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_BASE64_BINARY, null, msgs);
			msgs = basicSetValueBase64Binary(newValueBase64Binary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_BASE64_BINARY, newValueBase64Binary, newValueBase64Binary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getValueBoolean() {
		return valueBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueBoolean(org.hl7.fhir.Boolean newValueBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldValueBoolean = valueBoolean;
		valueBoolean = newValueBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_BOOLEAN, oldValueBoolean, newValueBoolean);
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
	public void setValueBoolean(org.hl7.fhir.Boolean newValueBoolean) {
		if (newValueBoolean != valueBoolean) {
			NotificationChain msgs = null;
			if (valueBoolean != null)
				msgs = ((InternalEObject)valueBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_BOOLEAN, null, msgs);
			if (newValueBoolean != null)
				msgs = ((InternalEObject)newValueBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_BOOLEAN, null, msgs);
			msgs = basicSetValueBoolean(newValueBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_BOOLEAN, newValueBoolean, newValueBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getValueCanonical() {
		return valueCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueCanonical(Canonical newValueCanonical, NotificationChain msgs) {
		Canonical oldValueCanonical = valueCanonical;
		valueCanonical = newValueCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_CANONICAL, oldValueCanonical, newValueCanonical);
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
	public void setValueCanonical(Canonical newValueCanonical) {
		if (newValueCanonical != valueCanonical) {
			NotificationChain msgs = null;
			if (valueCanonical != null)
				msgs = ((InternalEObject)valueCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_CANONICAL, null, msgs);
			if (newValueCanonical != null)
				msgs = ((InternalEObject)newValueCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_CANONICAL, null, msgs);
			msgs = basicSetValueCanonical(newValueCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_CANONICAL, newValueCanonical, newValueCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getValueCode() {
		return valueCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueCode(Code newValueCode, NotificationChain msgs) {
		Code oldValueCode = valueCode;
		valueCode = newValueCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_CODE, oldValueCode, newValueCode);
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
	public void setValueCode(Code newValueCode) {
		if (newValueCode != valueCode) {
			NotificationChain msgs = null;
			if (valueCode != null)
				msgs = ((InternalEObject)valueCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_CODE, null, msgs);
			if (newValueCode != null)
				msgs = ((InternalEObject)newValueCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_CODE, null, msgs);
			msgs = basicSetValueCode(newValueCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_CODE, newValueCode, newValueCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getValueDate() {
		return valueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueDate(Date newValueDate, NotificationChain msgs) {
		Date oldValueDate = valueDate;
		valueDate = newValueDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_DATE, oldValueDate, newValueDate);
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
	public void setValueDate(Date newValueDate) {
		if (newValueDate != valueDate) {
			NotificationChain msgs = null;
			if (valueDate != null)
				msgs = ((InternalEObject)valueDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_DATE, null, msgs);
			if (newValueDate != null)
				msgs = ((InternalEObject)newValueDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_DATE, null, msgs);
			msgs = basicSetValueDate(newValueDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_DATE, newValueDate, newValueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getValueDateTime() {
		return valueDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueDateTime(DateTime newValueDateTime, NotificationChain msgs) {
		DateTime oldValueDateTime = valueDateTime;
		valueDateTime = newValueDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_DATE_TIME, oldValueDateTime, newValueDateTime);
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
	public void setValueDateTime(DateTime newValueDateTime) {
		if (newValueDateTime != valueDateTime) {
			NotificationChain msgs = null;
			if (valueDateTime != null)
				msgs = ((InternalEObject)valueDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_DATE_TIME, null, msgs);
			if (newValueDateTime != null)
				msgs = ((InternalEObject)newValueDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_DATE_TIME, null, msgs);
			msgs = basicSetValueDateTime(newValueDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_DATE_TIME, newValueDateTime, newValueDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getValueDecimal() {
		return valueDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueDecimal(Decimal newValueDecimal, NotificationChain msgs) {
		Decimal oldValueDecimal = valueDecimal;
		valueDecimal = newValueDecimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_DECIMAL, oldValueDecimal, newValueDecimal);
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
	public void setValueDecimal(Decimal newValueDecimal) {
		if (newValueDecimal != valueDecimal) {
			NotificationChain msgs = null;
			if (valueDecimal != null)
				msgs = ((InternalEObject)valueDecimal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_DECIMAL, null, msgs);
			if (newValueDecimal != null)
				msgs = ((InternalEObject)newValueDecimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_DECIMAL, null, msgs);
			msgs = basicSetValueDecimal(newValueDecimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_DECIMAL, newValueDecimal, newValueDecimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getValueId() {
		return valueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueId(Id newValueId, NotificationChain msgs) {
		Id oldValueId = valueId;
		valueId = newValueId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_ID, oldValueId, newValueId);
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
	public void setValueId(Id newValueId) {
		if (newValueId != valueId) {
			NotificationChain msgs = null;
			if (valueId != null)
				msgs = ((InternalEObject)valueId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_ID, null, msgs);
			if (newValueId != null)
				msgs = ((InternalEObject)newValueId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_ID, null, msgs);
			msgs = basicSetValueId(newValueId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_ID, newValueId, newValueId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getValueInstant() {
		return valueInstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueInstant(Instant newValueInstant, NotificationChain msgs) {
		Instant oldValueInstant = valueInstant;
		valueInstant = newValueInstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_INSTANT, oldValueInstant, newValueInstant);
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
	public void setValueInstant(Instant newValueInstant) {
		if (newValueInstant != valueInstant) {
			NotificationChain msgs = null;
			if (valueInstant != null)
				msgs = ((InternalEObject)valueInstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_INSTANT, null, msgs);
			if (newValueInstant != null)
				msgs = ((InternalEObject)newValueInstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_INSTANT, null, msgs);
			msgs = basicSetValueInstant(newValueInstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_INSTANT, newValueInstant, newValueInstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getValueInteger() {
		return valueInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueInteger(org.hl7.fhir.Integer newValueInteger, NotificationChain msgs) {
		org.hl7.fhir.Integer oldValueInteger = valueInteger;
		valueInteger = newValueInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_INTEGER, oldValueInteger, newValueInteger);
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
	public void setValueInteger(org.hl7.fhir.Integer newValueInteger) {
		if (newValueInteger != valueInteger) {
			NotificationChain msgs = null;
			if (valueInteger != null)
				msgs = ((InternalEObject)valueInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_INTEGER, null, msgs);
			if (newValueInteger != null)
				msgs = ((InternalEObject)newValueInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_INTEGER, null, msgs);
			msgs = basicSetValueInteger(newValueInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_INTEGER, newValueInteger, newValueInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getValueMarkdown() {
		return valueMarkdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueMarkdown(Markdown newValueMarkdown, NotificationChain msgs) {
		Markdown oldValueMarkdown = valueMarkdown;
		valueMarkdown = newValueMarkdown;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_MARKDOWN, oldValueMarkdown, newValueMarkdown);
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
	public void setValueMarkdown(Markdown newValueMarkdown) {
		if (newValueMarkdown != valueMarkdown) {
			NotificationChain msgs = null;
			if (valueMarkdown != null)
				msgs = ((InternalEObject)valueMarkdown).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_MARKDOWN, null, msgs);
			if (newValueMarkdown != null)
				msgs = ((InternalEObject)newValueMarkdown).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_MARKDOWN, null, msgs);
			msgs = basicSetValueMarkdown(newValueMarkdown, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_MARKDOWN, newValueMarkdown, newValueMarkdown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oid getValueOid() {
		return valueOid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueOid(Oid newValueOid, NotificationChain msgs) {
		Oid oldValueOid = valueOid;
		valueOid = newValueOid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_OID, oldValueOid, newValueOid);
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
	public void setValueOid(Oid newValueOid) {
		if (newValueOid != valueOid) {
			NotificationChain msgs = null;
			if (valueOid != null)
				msgs = ((InternalEObject)valueOid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_OID, null, msgs);
			if (newValueOid != null)
				msgs = ((InternalEObject)newValueOid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_OID, null, msgs);
			msgs = basicSetValueOid(newValueOid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_OID, newValueOid, newValueOid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getValuePositiveInt() {
		return valuePositiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuePositiveInt(PositiveInt newValuePositiveInt, NotificationChain msgs) {
		PositiveInt oldValuePositiveInt = valuePositiveInt;
		valuePositiveInt = newValuePositiveInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_POSITIVE_INT, oldValuePositiveInt, newValuePositiveInt);
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
	public void setValuePositiveInt(PositiveInt newValuePositiveInt) {
		if (newValuePositiveInt != valuePositiveInt) {
			NotificationChain msgs = null;
			if (valuePositiveInt != null)
				msgs = ((InternalEObject)valuePositiveInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_POSITIVE_INT, null, msgs);
			if (newValuePositiveInt != null)
				msgs = ((InternalEObject)newValuePositiveInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_POSITIVE_INT, null, msgs);
			msgs = basicSetValuePositiveInt(newValuePositiveInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_POSITIVE_INT, newValuePositiveInt, newValuePositiveInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getValueString() {
		return valueString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueString(org.hl7.fhir.String newValueString, NotificationChain msgs) {
		org.hl7.fhir.String oldValueString = valueString;
		valueString = newValueString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_STRING, oldValueString, newValueString);
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
	public void setValueString(org.hl7.fhir.String newValueString) {
		if (newValueString != valueString) {
			NotificationChain msgs = null;
			if (valueString != null)
				msgs = ((InternalEObject)valueString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_STRING, null, msgs);
			if (newValueString != null)
				msgs = ((InternalEObject)newValueString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_STRING, null, msgs);
			msgs = basicSetValueString(newValueString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_STRING, newValueString, newValueString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getValueTime() {
		return valueTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueTime(Time newValueTime, NotificationChain msgs) {
		Time oldValueTime = valueTime;
		valueTime = newValueTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_TIME, oldValueTime, newValueTime);
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
	public void setValueTime(Time newValueTime) {
		if (newValueTime != valueTime) {
			NotificationChain msgs = null;
			if (valueTime != null)
				msgs = ((InternalEObject)valueTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_TIME, null, msgs);
			if (newValueTime != null)
				msgs = ((InternalEObject)newValueTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_TIME, null, msgs);
			msgs = basicSetValueTime(newValueTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_TIME, newValueTime, newValueTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getValueUnsignedInt() {
		return valueUnsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueUnsignedInt(UnsignedInt newValueUnsignedInt, NotificationChain msgs) {
		UnsignedInt oldValueUnsignedInt = valueUnsignedInt;
		valueUnsignedInt = newValueUnsignedInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_UNSIGNED_INT, oldValueUnsignedInt, newValueUnsignedInt);
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
	public void setValueUnsignedInt(UnsignedInt newValueUnsignedInt) {
		if (newValueUnsignedInt != valueUnsignedInt) {
			NotificationChain msgs = null;
			if (valueUnsignedInt != null)
				msgs = ((InternalEObject)valueUnsignedInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_UNSIGNED_INT, null, msgs);
			if (newValueUnsignedInt != null)
				msgs = ((InternalEObject)newValueUnsignedInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_UNSIGNED_INT, null, msgs);
			msgs = basicSetValueUnsignedInt(newValueUnsignedInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_UNSIGNED_INT, newValueUnsignedInt, newValueUnsignedInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getValueUri() {
		return valueUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueUri(Uri newValueUri, NotificationChain msgs) {
		Uri oldValueUri = valueUri;
		valueUri = newValueUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_URI, oldValueUri, newValueUri);
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
	public void setValueUri(Uri newValueUri) {
		if (newValueUri != valueUri) {
			NotificationChain msgs = null;
			if (valueUri != null)
				msgs = ((InternalEObject)valueUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_URI, null, msgs);
			if (newValueUri != null)
				msgs = ((InternalEObject)newValueUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_URI, null, msgs);
			msgs = basicSetValueUri(newValueUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_URI, newValueUri, newValueUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Url getValueUrl() {
		return valueUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueUrl(Url newValueUrl, NotificationChain msgs) {
		Url oldValueUrl = valueUrl;
		valueUrl = newValueUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_URL, oldValueUrl, newValueUrl);
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
	public void setValueUrl(Url newValueUrl) {
		if (newValueUrl != valueUrl) {
			NotificationChain msgs = null;
			if (valueUrl != null)
				msgs = ((InternalEObject)valueUrl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_URL, null, msgs);
			if (newValueUrl != null)
				msgs = ((InternalEObject)newValueUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_URL, null, msgs);
			msgs = basicSetValueUrl(newValueUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_URL, newValueUrl, newValueUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uuid getValueUuid() {
		return valueUuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueUuid(Uuid newValueUuid, NotificationChain msgs) {
		Uuid oldValueUuid = valueUuid;
		valueUuid = newValueUuid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_UUID, oldValueUuid, newValueUuid);
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
	public void setValueUuid(Uuid newValueUuid) {
		if (newValueUuid != valueUuid) {
			NotificationChain msgs = null;
			if (valueUuid != null)
				msgs = ((InternalEObject)valueUuid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_UUID, null, msgs);
			if (newValueUuid != null)
				msgs = ((InternalEObject)newValueUuid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_UUID, null, msgs);
			msgs = basicSetValueUuid(newValueUuid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_UUID, newValueUuid, newValueUuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Address getValueAddress() {
		return valueAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueAddress(Address newValueAddress, NotificationChain msgs) {
		Address oldValueAddress = valueAddress;
		valueAddress = newValueAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_ADDRESS, oldValueAddress, newValueAddress);
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
	public void setValueAddress(Address newValueAddress) {
		if (newValueAddress != valueAddress) {
			NotificationChain msgs = null;
			if (valueAddress != null)
				msgs = ((InternalEObject)valueAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_ADDRESS, null, msgs);
			if (newValueAddress != null)
				msgs = ((InternalEObject)newValueAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_ADDRESS, null, msgs);
			msgs = basicSetValueAddress(newValueAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_ADDRESS, newValueAddress, newValueAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Age getValueAge() {
		return valueAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueAge(Age newValueAge, NotificationChain msgs) {
		Age oldValueAge = valueAge;
		valueAge = newValueAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_AGE, oldValueAge, newValueAge);
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
	public void setValueAge(Age newValueAge) {
		if (newValueAge != valueAge) {
			NotificationChain msgs = null;
			if (valueAge != null)
				msgs = ((InternalEObject)valueAge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_AGE, null, msgs);
			if (newValueAge != null)
				msgs = ((InternalEObject)newValueAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_AGE, null, msgs);
			msgs = basicSetValueAge(newValueAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_AGE, newValueAge, newValueAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation getValueAnnotation() {
		return valueAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueAnnotation(Annotation newValueAnnotation, NotificationChain msgs) {
		Annotation oldValueAnnotation = valueAnnotation;
		valueAnnotation = newValueAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_ANNOTATION, oldValueAnnotation, newValueAnnotation);
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
	public void setValueAnnotation(Annotation newValueAnnotation) {
		if (newValueAnnotation != valueAnnotation) {
			NotificationChain msgs = null;
			if (valueAnnotation != null)
				msgs = ((InternalEObject)valueAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_ANNOTATION, null, msgs);
			if (newValueAnnotation != null)
				msgs = ((InternalEObject)newValueAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_ANNOTATION, null, msgs);
			msgs = basicSetValueAnnotation(newValueAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_ANNOTATION, newValueAnnotation, newValueAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attachment getValueAttachment() {
		return valueAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueAttachment(Attachment newValueAttachment, NotificationChain msgs) {
		Attachment oldValueAttachment = valueAttachment;
		valueAttachment = newValueAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_ATTACHMENT, oldValueAttachment, newValueAttachment);
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
	public void setValueAttachment(Attachment newValueAttachment) {
		if (newValueAttachment != valueAttachment) {
			NotificationChain msgs = null;
			if (valueAttachment != null)
				msgs = ((InternalEObject)valueAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_ATTACHMENT, null, msgs);
			if (newValueAttachment != null)
				msgs = ((InternalEObject)newValueAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_ATTACHMENT, null, msgs);
			msgs = basicSetValueAttachment(newValueAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_ATTACHMENT, newValueAttachment, newValueAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getValueCodeableConcept() {
		return valueCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueCodeableConcept(CodeableConcept newValueCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldValueCodeableConcept = valueCodeableConcept;
		valueCodeableConcept = newValueCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_CODEABLE_CONCEPT, oldValueCodeableConcept, newValueCodeableConcept);
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
	public void setValueCodeableConcept(CodeableConcept newValueCodeableConcept) {
		if (newValueCodeableConcept != valueCodeableConcept) {
			NotificationChain msgs = null;
			if (valueCodeableConcept != null)
				msgs = ((InternalEObject)valueCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_CODEABLE_CONCEPT, null, msgs);
			if (newValueCodeableConcept != null)
				msgs = ((InternalEObject)newValueCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetValueCodeableConcept(newValueCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_CODEABLE_CONCEPT, newValueCodeableConcept, newValueCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getValueCoding() {
		return valueCoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueCoding(Coding newValueCoding, NotificationChain msgs) {
		Coding oldValueCoding = valueCoding;
		valueCoding = newValueCoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_CODING, oldValueCoding, newValueCoding);
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
	public void setValueCoding(Coding newValueCoding) {
		if (newValueCoding != valueCoding) {
			NotificationChain msgs = null;
			if (valueCoding != null)
				msgs = ((InternalEObject)valueCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_CODING, null, msgs);
			if (newValueCoding != null)
				msgs = ((InternalEObject)newValueCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_CODING, null, msgs);
			msgs = basicSetValueCoding(newValueCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_CODING, newValueCoding, newValueCoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactPoint getValueContactPoint() {
		return valueContactPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueContactPoint(ContactPoint newValueContactPoint, NotificationChain msgs) {
		ContactPoint oldValueContactPoint = valueContactPoint;
		valueContactPoint = newValueContactPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTACT_POINT, oldValueContactPoint, newValueContactPoint);
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
	public void setValueContactPoint(ContactPoint newValueContactPoint) {
		if (newValueContactPoint != valueContactPoint) {
			NotificationChain msgs = null;
			if (valueContactPoint != null)
				msgs = ((InternalEObject)valueContactPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTACT_POINT, null, msgs);
			if (newValueContactPoint != null)
				msgs = ((InternalEObject)newValueContactPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTACT_POINT, null, msgs);
			msgs = basicSetValueContactPoint(newValueContactPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTACT_POINT, newValueContactPoint, newValueContactPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Count getValueCount() {
		return valueCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueCount(Count newValueCount, NotificationChain msgs) {
		Count oldValueCount = valueCount;
		valueCount = newValueCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_COUNT, oldValueCount, newValueCount);
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
	public void setValueCount(Count newValueCount) {
		if (newValueCount != valueCount) {
			NotificationChain msgs = null;
			if (valueCount != null)
				msgs = ((InternalEObject)valueCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_COUNT, null, msgs);
			if (newValueCount != null)
				msgs = ((InternalEObject)newValueCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_COUNT, null, msgs);
			msgs = basicSetValueCount(newValueCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_COUNT, newValueCount, newValueCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Distance getValueDistance() {
		return valueDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueDistance(Distance newValueDistance, NotificationChain msgs) {
		Distance oldValueDistance = valueDistance;
		valueDistance = newValueDistance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_DISTANCE, oldValueDistance, newValueDistance);
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
	public void setValueDistance(Distance newValueDistance) {
		if (newValueDistance != valueDistance) {
			NotificationChain msgs = null;
			if (valueDistance != null)
				msgs = ((InternalEObject)valueDistance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_DISTANCE, null, msgs);
			if (newValueDistance != null)
				msgs = ((InternalEObject)newValueDistance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_DISTANCE, null, msgs);
			msgs = basicSetValueDistance(newValueDistance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_DISTANCE, newValueDistance, newValueDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getValueDuration() {
		return valueDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueDuration(Duration newValueDuration, NotificationChain msgs) {
		Duration oldValueDuration = valueDuration;
		valueDuration = newValueDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_DURATION, oldValueDuration, newValueDuration);
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
	public void setValueDuration(Duration newValueDuration) {
		if (newValueDuration != valueDuration) {
			NotificationChain msgs = null;
			if (valueDuration != null)
				msgs = ((InternalEObject)valueDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_DURATION, null, msgs);
			if (newValueDuration != null)
				msgs = ((InternalEObject)newValueDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_DURATION, null, msgs);
			msgs = basicSetValueDuration(newValueDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_DURATION, newValueDuration, newValueDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HumanName getValueHumanName() {
		return valueHumanName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueHumanName(HumanName newValueHumanName, NotificationChain msgs) {
		HumanName oldValueHumanName = valueHumanName;
		valueHumanName = newValueHumanName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_HUMAN_NAME, oldValueHumanName, newValueHumanName);
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
	public void setValueHumanName(HumanName newValueHumanName) {
		if (newValueHumanName != valueHumanName) {
			NotificationChain msgs = null;
			if (valueHumanName != null)
				msgs = ((InternalEObject)valueHumanName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_HUMAN_NAME, null, msgs);
			if (newValueHumanName != null)
				msgs = ((InternalEObject)newValueHumanName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_HUMAN_NAME, null, msgs);
			msgs = basicSetValueHumanName(newValueHumanName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_HUMAN_NAME, newValueHumanName, newValueHumanName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getValueIdentifier() {
		return valueIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueIdentifier(Identifier newValueIdentifier, NotificationChain msgs) {
		Identifier oldValueIdentifier = valueIdentifier;
		valueIdentifier = newValueIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_IDENTIFIER, oldValueIdentifier, newValueIdentifier);
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
	public void setValueIdentifier(Identifier newValueIdentifier) {
		if (newValueIdentifier != valueIdentifier) {
			NotificationChain msgs = null;
			if (valueIdentifier != null)
				msgs = ((InternalEObject)valueIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_IDENTIFIER, null, msgs);
			if (newValueIdentifier != null)
				msgs = ((InternalEObject)newValueIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_IDENTIFIER, null, msgs);
			msgs = basicSetValueIdentifier(newValueIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_IDENTIFIER, newValueIdentifier, newValueIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getValueMoney() {
		return valueMoney;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueMoney(Money newValueMoney, NotificationChain msgs) {
		Money oldValueMoney = valueMoney;
		valueMoney = newValueMoney;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_MONEY, oldValueMoney, newValueMoney);
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
	public void setValueMoney(Money newValueMoney) {
		if (newValueMoney != valueMoney) {
			NotificationChain msgs = null;
			if (valueMoney != null)
				msgs = ((InternalEObject)valueMoney).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_MONEY, null, msgs);
			if (newValueMoney != null)
				msgs = ((InternalEObject)newValueMoney).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_MONEY, null, msgs);
			msgs = basicSetValueMoney(newValueMoney, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_MONEY, newValueMoney, newValueMoney));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getValuePeriod() {
		return valuePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuePeriod(Period newValuePeriod, NotificationChain msgs) {
		Period oldValuePeriod = valuePeriod;
		valuePeriod = newValuePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_PERIOD, oldValuePeriod, newValuePeriod);
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
	public void setValuePeriod(Period newValuePeriod) {
		if (newValuePeriod != valuePeriod) {
			NotificationChain msgs = null;
			if (valuePeriod != null)
				msgs = ((InternalEObject)valuePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_PERIOD, null, msgs);
			if (newValuePeriod != null)
				msgs = ((InternalEObject)newValuePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_PERIOD, null, msgs);
			msgs = basicSetValuePeriod(newValuePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_PERIOD, newValuePeriod, newValuePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getValueQuantity() {
		return valueQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueQuantity(Quantity newValueQuantity, NotificationChain msgs) {
		Quantity oldValueQuantity = valueQuantity;
		valueQuantity = newValueQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_QUANTITY, oldValueQuantity, newValueQuantity);
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
	public void setValueQuantity(Quantity newValueQuantity) {
		if (newValueQuantity != valueQuantity) {
			NotificationChain msgs = null;
			if (valueQuantity != null)
				msgs = ((InternalEObject)valueQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_QUANTITY, null, msgs);
			if (newValueQuantity != null)
				msgs = ((InternalEObject)newValueQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_QUANTITY, null, msgs);
			msgs = basicSetValueQuantity(newValueQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_QUANTITY, newValueQuantity, newValueQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getValueRange() {
		return valueRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueRange(Range newValueRange, NotificationChain msgs) {
		Range oldValueRange = valueRange;
		valueRange = newValueRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_RANGE, oldValueRange, newValueRange);
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
	public void setValueRange(Range newValueRange) {
		if (newValueRange != valueRange) {
			NotificationChain msgs = null;
			if (valueRange != null)
				msgs = ((InternalEObject)valueRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_RANGE, null, msgs);
			if (newValueRange != null)
				msgs = ((InternalEObject)newValueRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_RANGE, null, msgs);
			msgs = basicSetValueRange(newValueRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_RANGE, newValueRange, newValueRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getValueRatio() {
		return valueRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueRatio(Ratio newValueRatio, NotificationChain msgs) {
		Ratio oldValueRatio = valueRatio;
		valueRatio = newValueRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_RATIO, oldValueRatio, newValueRatio);
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
	public void setValueRatio(Ratio newValueRatio) {
		if (newValueRatio != valueRatio) {
			NotificationChain msgs = null;
			if (valueRatio != null)
				msgs = ((InternalEObject)valueRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_RATIO, null, msgs);
			if (newValueRatio != null)
				msgs = ((InternalEObject)newValueRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_RATIO, null, msgs);
			msgs = basicSetValueRatio(newValueRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_RATIO, newValueRatio, newValueRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getValueReference() {
		return valueReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueReference(Reference newValueReference, NotificationChain msgs) {
		Reference oldValueReference = valueReference;
		valueReference = newValueReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_REFERENCE, oldValueReference, newValueReference);
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
	public void setValueReference(Reference newValueReference) {
		if (newValueReference != valueReference) {
			NotificationChain msgs = null;
			if (valueReference != null)
				msgs = ((InternalEObject)valueReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_REFERENCE, null, msgs);
			if (newValueReference != null)
				msgs = ((InternalEObject)newValueReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_REFERENCE, null, msgs);
			msgs = basicSetValueReference(newValueReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_REFERENCE, newValueReference, newValueReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SampledData getValueSampledData() {
		return valueSampledData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSampledData(SampledData newValueSampledData, NotificationChain msgs) {
		SampledData oldValueSampledData = valueSampledData;
		valueSampledData = newValueSampledData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_SAMPLED_DATA, oldValueSampledData, newValueSampledData);
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
	public void setValueSampledData(SampledData newValueSampledData) {
		if (newValueSampledData != valueSampledData) {
			NotificationChain msgs = null;
			if (valueSampledData != null)
				msgs = ((InternalEObject)valueSampledData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_SAMPLED_DATA, null, msgs);
			if (newValueSampledData != null)
				msgs = ((InternalEObject)newValueSampledData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_SAMPLED_DATA, null, msgs);
			msgs = basicSetValueSampledData(newValueSampledData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_SAMPLED_DATA, newValueSampledData, newValueSampledData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signature getValueSignature() {
		return valueSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSignature(Signature newValueSignature, NotificationChain msgs) {
		Signature oldValueSignature = valueSignature;
		valueSignature = newValueSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_SIGNATURE, oldValueSignature, newValueSignature);
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
	public void setValueSignature(Signature newValueSignature) {
		if (newValueSignature != valueSignature) {
			NotificationChain msgs = null;
			if (valueSignature != null)
				msgs = ((InternalEObject)valueSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_SIGNATURE, null, msgs);
			if (newValueSignature != null)
				msgs = ((InternalEObject)newValueSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_SIGNATURE, null, msgs);
			msgs = basicSetValueSignature(newValueSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_SIGNATURE, newValueSignature, newValueSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timing getValueTiming() {
		return valueTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueTiming(Timing newValueTiming, NotificationChain msgs) {
		Timing oldValueTiming = valueTiming;
		valueTiming = newValueTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_TIMING, oldValueTiming, newValueTiming);
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
	public void setValueTiming(Timing newValueTiming) {
		if (newValueTiming != valueTiming) {
			NotificationChain msgs = null;
			if (valueTiming != null)
				msgs = ((InternalEObject)valueTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_TIMING, null, msgs);
			if (newValueTiming != null)
				msgs = ((InternalEObject)newValueTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_TIMING, null, msgs);
			msgs = basicSetValueTiming(newValueTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_TIMING, newValueTiming, newValueTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactDetail getValueContactDetail() {
		return valueContactDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueContactDetail(ContactDetail newValueContactDetail, NotificationChain msgs) {
		ContactDetail oldValueContactDetail = valueContactDetail;
		valueContactDetail = newValueContactDetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTACT_DETAIL, oldValueContactDetail, newValueContactDetail);
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
	public void setValueContactDetail(ContactDetail newValueContactDetail) {
		if (newValueContactDetail != valueContactDetail) {
			NotificationChain msgs = null;
			if (valueContactDetail != null)
				msgs = ((InternalEObject)valueContactDetail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTACT_DETAIL, null, msgs);
			if (newValueContactDetail != null)
				msgs = ((InternalEObject)newValueContactDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTACT_DETAIL, null, msgs);
			msgs = basicSetValueContactDetail(newValueContactDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTACT_DETAIL, newValueContactDetail, newValueContactDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contributor getValueContributor() {
		return valueContributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueContributor(Contributor newValueContributor, NotificationChain msgs) {
		Contributor oldValueContributor = valueContributor;
		valueContributor = newValueContributor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTRIBUTOR, oldValueContributor, newValueContributor);
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
	public void setValueContributor(Contributor newValueContributor) {
		if (newValueContributor != valueContributor) {
			NotificationChain msgs = null;
			if (valueContributor != null)
				msgs = ((InternalEObject)valueContributor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTRIBUTOR, null, msgs);
			if (newValueContributor != null)
				msgs = ((InternalEObject)newValueContributor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTRIBUTOR, null, msgs);
			msgs = basicSetValueContributor(newValueContributor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTRIBUTOR, newValueContributor, newValueContributor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataRequirement getValueDataRequirement() {
		return valueDataRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueDataRequirement(DataRequirement newValueDataRequirement, NotificationChain msgs) {
		DataRequirement oldValueDataRequirement = valueDataRequirement;
		valueDataRequirement = newValueDataRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_DATA_REQUIREMENT, oldValueDataRequirement, newValueDataRequirement);
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
	public void setValueDataRequirement(DataRequirement newValueDataRequirement) {
		if (newValueDataRequirement != valueDataRequirement) {
			NotificationChain msgs = null;
			if (valueDataRequirement != null)
				msgs = ((InternalEObject)valueDataRequirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_DATA_REQUIREMENT, null, msgs);
			if (newValueDataRequirement != null)
				msgs = ((InternalEObject)newValueDataRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_DATA_REQUIREMENT, null, msgs);
			msgs = basicSetValueDataRequirement(newValueDataRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_DATA_REQUIREMENT, newValueDataRequirement, newValueDataRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getValueExpression() {
		return valueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueExpression(Expression newValueExpression, NotificationChain msgs) {
		Expression oldValueExpression = valueExpression;
		valueExpression = newValueExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_EXPRESSION, oldValueExpression, newValueExpression);
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
	public void setValueExpression(Expression newValueExpression) {
		if (newValueExpression != valueExpression) {
			NotificationChain msgs = null;
			if (valueExpression != null)
				msgs = ((InternalEObject)valueExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_EXPRESSION, null, msgs);
			if (newValueExpression != null)
				msgs = ((InternalEObject)newValueExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_EXPRESSION, null, msgs);
			msgs = basicSetValueExpression(newValueExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_EXPRESSION, newValueExpression, newValueExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterDefinition getValueParameterDefinition() {
		return valueParameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueParameterDefinition(ParameterDefinition newValueParameterDefinition, NotificationChain msgs) {
		ParameterDefinition oldValueParameterDefinition = valueParameterDefinition;
		valueParameterDefinition = newValueParameterDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_PARAMETER_DEFINITION, oldValueParameterDefinition, newValueParameterDefinition);
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
	public void setValueParameterDefinition(ParameterDefinition newValueParameterDefinition) {
		if (newValueParameterDefinition != valueParameterDefinition) {
			NotificationChain msgs = null;
			if (valueParameterDefinition != null)
				msgs = ((InternalEObject)valueParameterDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_PARAMETER_DEFINITION, null, msgs);
			if (newValueParameterDefinition != null)
				msgs = ((InternalEObject)newValueParameterDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_PARAMETER_DEFINITION, null, msgs);
			msgs = basicSetValueParameterDefinition(newValueParameterDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_PARAMETER_DEFINITION, newValueParameterDefinition, newValueParameterDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedArtifact getValueRelatedArtifact() {
		return valueRelatedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueRelatedArtifact(RelatedArtifact newValueRelatedArtifact, NotificationChain msgs) {
		RelatedArtifact oldValueRelatedArtifact = valueRelatedArtifact;
		valueRelatedArtifact = newValueRelatedArtifact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_RELATED_ARTIFACT, oldValueRelatedArtifact, newValueRelatedArtifact);
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
	public void setValueRelatedArtifact(RelatedArtifact newValueRelatedArtifact) {
		if (newValueRelatedArtifact != valueRelatedArtifact) {
			NotificationChain msgs = null;
			if (valueRelatedArtifact != null)
				msgs = ((InternalEObject)valueRelatedArtifact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_RELATED_ARTIFACT, null, msgs);
			if (newValueRelatedArtifact != null)
				msgs = ((InternalEObject)newValueRelatedArtifact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_RELATED_ARTIFACT, null, msgs);
			msgs = basicSetValueRelatedArtifact(newValueRelatedArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_RELATED_ARTIFACT, newValueRelatedArtifact, newValueRelatedArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerDefinition getValueTriggerDefinition() {
		return valueTriggerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueTriggerDefinition(TriggerDefinition newValueTriggerDefinition, NotificationChain msgs) {
		TriggerDefinition oldValueTriggerDefinition = valueTriggerDefinition;
		valueTriggerDefinition = newValueTriggerDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_TRIGGER_DEFINITION, oldValueTriggerDefinition, newValueTriggerDefinition);
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
	public void setValueTriggerDefinition(TriggerDefinition newValueTriggerDefinition) {
		if (newValueTriggerDefinition != valueTriggerDefinition) {
			NotificationChain msgs = null;
			if (valueTriggerDefinition != null)
				msgs = ((InternalEObject)valueTriggerDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_TRIGGER_DEFINITION, null, msgs);
			if (newValueTriggerDefinition != null)
				msgs = ((InternalEObject)newValueTriggerDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_TRIGGER_DEFINITION, null, msgs);
			msgs = basicSetValueTriggerDefinition(newValueTriggerDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_TRIGGER_DEFINITION, newValueTriggerDefinition, newValueTriggerDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsageContext getValueUsageContext() {
		return valueUsageContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueUsageContext(UsageContext newValueUsageContext, NotificationChain msgs) {
		UsageContext oldValueUsageContext = valueUsageContext;
		valueUsageContext = newValueUsageContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_USAGE_CONTEXT, oldValueUsageContext, newValueUsageContext);
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
	public void setValueUsageContext(UsageContext newValueUsageContext) {
		if (newValueUsageContext != valueUsageContext) {
			NotificationChain msgs = null;
			if (valueUsageContext != null)
				msgs = ((InternalEObject)valueUsageContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_USAGE_CONTEXT, null, msgs);
			if (newValueUsageContext != null)
				msgs = ((InternalEObject)newValueUsageContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_USAGE_CONTEXT, null, msgs);
			msgs = basicSetValueUsageContext(newValueUsageContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_USAGE_CONTEXT, newValueUsageContext, newValueUsageContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dosage getValueDosage() {
		return valueDosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueDosage(Dosage newValueDosage, NotificationChain msgs) {
		Dosage oldValueDosage = valueDosage;
		valueDosage = newValueDosage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_DOSAGE, oldValueDosage, newValueDosage);
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
	public void setValueDosage(Dosage newValueDosage) {
		if (newValueDosage != valueDosage) {
			NotificationChain msgs = null;
			if (valueDosage != null)
				msgs = ((InternalEObject)valueDosage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_DOSAGE, null, msgs);
			if (newValueDosage != null)
				msgs = ((InternalEObject)newValueDosage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_DOSAGE, null, msgs);
			msgs = basicSetValueDosage(newValueDosage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_DOSAGE, newValueDosage, newValueDosage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Meta getValueMeta() {
		return valueMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueMeta(Meta newValueMeta, NotificationChain msgs) {
		Meta oldValueMeta = valueMeta;
		valueMeta = newValueMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_META, oldValueMeta, newValueMeta);
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
	public void setValueMeta(Meta newValueMeta) {
		if (newValueMeta != valueMeta) {
			NotificationChain msgs = null;
			if (valueMeta != null)
				msgs = ((InternalEObject)valueMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_META, null, msgs);
			if (newValueMeta != null)
				msgs = ((InternalEObject)newValueMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__VALUE_META, null, msgs);
			msgs = basicSetValueMeta(newValueMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__VALUE_META, newValueMeta, newValueMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceContainer getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(ResourceContainer newResource, NotificationChain msgs) {
		ResourceContainer oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__RESOURCE, oldResource, newResource);
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
	public void setResource(ResourceContainer newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PARAMETERS_PARAMETER__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PARAMETERS_PARAMETER__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParametersParameter> getPart() {
		if (part == null) {
			part = new EObjectContainmentEList<ParametersParameter>(ParametersParameter.class, this, FhirPackage.PARAMETERS_PARAMETER__PART);
		}
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PARAMETERS_PARAMETER__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_BASE64_BINARY:
				return basicSetValueBase64Binary(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_BOOLEAN:
				return basicSetValueBoolean(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CANONICAL:
				return basicSetValueCanonical(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CODE:
				return basicSetValueCode(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DATE:
				return basicSetValueDate(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DATE_TIME:
				return basicSetValueDateTime(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DECIMAL:
				return basicSetValueDecimal(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_ID:
				return basicSetValueId(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_INSTANT:
				return basicSetValueInstant(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_INTEGER:
				return basicSetValueInteger(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_MARKDOWN:
				return basicSetValueMarkdown(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_OID:
				return basicSetValueOid(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_POSITIVE_INT:
				return basicSetValuePositiveInt(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_STRING:
				return basicSetValueString(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_TIME:
				return basicSetValueTime(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_UNSIGNED_INT:
				return basicSetValueUnsignedInt(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_URI:
				return basicSetValueUri(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_URL:
				return basicSetValueUrl(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_UUID:
				return basicSetValueUuid(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_ADDRESS:
				return basicSetValueAddress(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_AGE:
				return basicSetValueAge(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_ANNOTATION:
				return basicSetValueAnnotation(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_ATTACHMENT:
				return basicSetValueAttachment(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CODEABLE_CONCEPT:
				return basicSetValueCodeableConcept(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CODING:
				return basicSetValueCoding(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTACT_POINT:
				return basicSetValueContactPoint(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_COUNT:
				return basicSetValueCount(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DISTANCE:
				return basicSetValueDistance(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DURATION:
				return basicSetValueDuration(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_HUMAN_NAME:
				return basicSetValueHumanName(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_IDENTIFIER:
				return basicSetValueIdentifier(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_MONEY:
				return basicSetValueMoney(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_PERIOD:
				return basicSetValuePeriod(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_QUANTITY:
				return basicSetValueQuantity(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_RANGE:
				return basicSetValueRange(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_RATIO:
				return basicSetValueRatio(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_REFERENCE:
				return basicSetValueReference(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_SAMPLED_DATA:
				return basicSetValueSampledData(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_SIGNATURE:
				return basicSetValueSignature(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_TIMING:
				return basicSetValueTiming(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTACT_DETAIL:
				return basicSetValueContactDetail(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTRIBUTOR:
				return basicSetValueContributor(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DATA_REQUIREMENT:
				return basicSetValueDataRequirement(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_EXPRESSION:
				return basicSetValueExpression(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_PARAMETER_DEFINITION:
				return basicSetValueParameterDefinition(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_RELATED_ARTIFACT:
				return basicSetValueRelatedArtifact(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_TRIGGER_DEFINITION:
				return basicSetValueTriggerDefinition(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_USAGE_CONTEXT:
				return basicSetValueUsageContext(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DOSAGE:
				return basicSetValueDosage(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_META:
				return basicSetValueMeta(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__RESOURCE:
				return basicSetResource(null, msgs);
			case FhirPackage.PARAMETERS_PARAMETER__PART:
				return ((InternalEList<?>)getPart()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.PARAMETERS_PARAMETER__NAME:
				return getName();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_BASE64_BINARY:
				return getValueBase64Binary();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_BOOLEAN:
				return getValueBoolean();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CANONICAL:
				return getValueCanonical();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CODE:
				return getValueCode();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DATE:
				return getValueDate();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DATE_TIME:
				return getValueDateTime();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DECIMAL:
				return getValueDecimal();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_ID:
				return getValueId();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_INSTANT:
				return getValueInstant();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_INTEGER:
				return getValueInteger();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_MARKDOWN:
				return getValueMarkdown();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_OID:
				return getValueOid();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_POSITIVE_INT:
				return getValuePositiveInt();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_STRING:
				return getValueString();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_TIME:
				return getValueTime();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_UNSIGNED_INT:
				return getValueUnsignedInt();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_URI:
				return getValueUri();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_URL:
				return getValueUrl();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_UUID:
				return getValueUuid();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_ADDRESS:
				return getValueAddress();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_AGE:
				return getValueAge();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_ANNOTATION:
				return getValueAnnotation();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_ATTACHMENT:
				return getValueAttachment();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CODEABLE_CONCEPT:
				return getValueCodeableConcept();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CODING:
				return getValueCoding();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTACT_POINT:
				return getValueContactPoint();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_COUNT:
				return getValueCount();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DISTANCE:
				return getValueDistance();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DURATION:
				return getValueDuration();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_HUMAN_NAME:
				return getValueHumanName();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_IDENTIFIER:
				return getValueIdentifier();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_MONEY:
				return getValueMoney();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_PERIOD:
				return getValuePeriod();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_QUANTITY:
				return getValueQuantity();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_RANGE:
				return getValueRange();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_RATIO:
				return getValueRatio();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_REFERENCE:
				return getValueReference();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_SAMPLED_DATA:
				return getValueSampledData();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_SIGNATURE:
				return getValueSignature();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_TIMING:
				return getValueTiming();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTACT_DETAIL:
				return getValueContactDetail();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTRIBUTOR:
				return getValueContributor();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DATA_REQUIREMENT:
				return getValueDataRequirement();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_EXPRESSION:
				return getValueExpression();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_PARAMETER_DEFINITION:
				return getValueParameterDefinition();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_RELATED_ARTIFACT:
				return getValueRelatedArtifact();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_TRIGGER_DEFINITION:
				return getValueTriggerDefinition();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_USAGE_CONTEXT:
				return getValueUsageContext();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DOSAGE:
				return getValueDosage();
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_META:
				return getValueMeta();
			case FhirPackage.PARAMETERS_PARAMETER__RESOURCE:
				return getResource();
			case FhirPackage.PARAMETERS_PARAMETER__PART:
				return getPart();
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
			case FhirPackage.PARAMETERS_PARAMETER__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_BASE64_BINARY:
				setValueBase64Binary((Base64Binary)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_BOOLEAN:
				setValueBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CANONICAL:
				setValueCanonical((Canonical)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CODE:
				setValueCode((Code)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DATE:
				setValueDate((Date)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DATE_TIME:
				setValueDateTime((DateTime)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DECIMAL:
				setValueDecimal((Decimal)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_ID:
				setValueId((Id)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_INSTANT:
				setValueInstant((Instant)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_INTEGER:
				setValueInteger((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_MARKDOWN:
				setValueMarkdown((Markdown)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_OID:
				setValueOid((Oid)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_POSITIVE_INT:
				setValuePositiveInt((PositiveInt)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_STRING:
				setValueString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_TIME:
				setValueTime((Time)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_UNSIGNED_INT:
				setValueUnsignedInt((UnsignedInt)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_URI:
				setValueUri((Uri)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_URL:
				setValueUrl((Url)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_UUID:
				setValueUuid((Uuid)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_ADDRESS:
				setValueAddress((Address)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_AGE:
				setValueAge((Age)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_ANNOTATION:
				setValueAnnotation((Annotation)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_ATTACHMENT:
				setValueAttachment((Attachment)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CODEABLE_CONCEPT:
				setValueCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CODING:
				setValueCoding((Coding)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTACT_POINT:
				setValueContactPoint((ContactPoint)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_COUNT:
				setValueCount((Count)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DISTANCE:
				setValueDistance((Distance)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DURATION:
				setValueDuration((Duration)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_HUMAN_NAME:
				setValueHumanName((HumanName)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_IDENTIFIER:
				setValueIdentifier((Identifier)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_MONEY:
				setValueMoney((Money)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_PERIOD:
				setValuePeriod((Period)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_QUANTITY:
				setValueQuantity((Quantity)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_RANGE:
				setValueRange((Range)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_RATIO:
				setValueRatio((Ratio)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_REFERENCE:
				setValueReference((Reference)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_SAMPLED_DATA:
				setValueSampledData((SampledData)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_SIGNATURE:
				setValueSignature((Signature)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_TIMING:
				setValueTiming((Timing)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTACT_DETAIL:
				setValueContactDetail((ContactDetail)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTRIBUTOR:
				setValueContributor((Contributor)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DATA_REQUIREMENT:
				setValueDataRequirement((DataRequirement)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_EXPRESSION:
				setValueExpression((Expression)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_PARAMETER_DEFINITION:
				setValueParameterDefinition((ParameterDefinition)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_RELATED_ARTIFACT:
				setValueRelatedArtifact((RelatedArtifact)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_TRIGGER_DEFINITION:
				setValueTriggerDefinition((TriggerDefinition)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_USAGE_CONTEXT:
				setValueUsageContext((UsageContext)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DOSAGE:
				setValueDosage((Dosage)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_META:
				setValueMeta((Meta)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__RESOURCE:
				setResource((ResourceContainer)newValue);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__PART:
				getPart().clear();
				getPart().addAll((Collection<? extends ParametersParameter>)newValue);
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
			case FhirPackage.PARAMETERS_PARAMETER__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_BASE64_BINARY:
				setValueBase64Binary((Base64Binary)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_BOOLEAN:
				setValueBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CANONICAL:
				setValueCanonical((Canonical)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CODE:
				setValueCode((Code)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DATE:
				setValueDate((Date)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DATE_TIME:
				setValueDateTime((DateTime)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DECIMAL:
				setValueDecimal((Decimal)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_ID:
				setValueId((Id)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_INSTANT:
				setValueInstant((Instant)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_INTEGER:
				setValueInteger((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_MARKDOWN:
				setValueMarkdown((Markdown)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_OID:
				setValueOid((Oid)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_POSITIVE_INT:
				setValuePositiveInt((PositiveInt)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_STRING:
				setValueString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_TIME:
				setValueTime((Time)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_UNSIGNED_INT:
				setValueUnsignedInt((UnsignedInt)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_URI:
				setValueUri((Uri)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_URL:
				setValueUrl((Url)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_UUID:
				setValueUuid((Uuid)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_ADDRESS:
				setValueAddress((Address)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_AGE:
				setValueAge((Age)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_ANNOTATION:
				setValueAnnotation((Annotation)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_ATTACHMENT:
				setValueAttachment((Attachment)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CODEABLE_CONCEPT:
				setValueCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CODING:
				setValueCoding((Coding)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTACT_POINT:
				setValueContactPoint((ContactPoint)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_COUNT:
				setValueCount((Count)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DISTANCE:
				setValueDistance((Distance)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DURATION:
				setValueDuration((Duration)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_HUMAN_NAME:
				setValueHumanName((HumanName)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_IDENTIFIER:
				setValueIdentifier((Identifier)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_MONEY:
				setValueMoney((Money)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_PERIOD:
				setValuePeriod((Period)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_QUANTITY:
				setValueQuantity((Quantity)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_RANGE:
				setValueRange((Range)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_RATIO:
				setValueRatio((Ratio)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_REFERENCE:
				setValueReference((Reference)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_SAMPLED_DATA:
				setValueSampledData((SampledData)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_SIGNATURE:
				setValueSignature((Signature)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_TIMING:
				setValueTiming((Timing)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTACT_DETAIL:
				setValueContactDetail((ContactDetail)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTRIBUTOR:
				setValueContributor((Contributor)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DATA_REQUIREMENT:
				setValueDataRequirement((DataRequirement)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_EXPRESSION:
				setValueExpression((Expression)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_PARAMETER_DEFINITION:
				setValueParameterDefinition((ParameterDefinition)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_RELATED_ARTIFACT:
				setValueRelatedArtifact((RelatedArtifact)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_TRIGGER_DEFINITION:
				setValueTriggerDefinition((TriggerDefinition)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_USAGE_CONTEXT:
				setValueUsageContext((UsageContext)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DOSAGE:
				setValueDosage((Dosage)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_META:
				setValueMeta((Meta)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__RESOURCE:
				setResource((ResourceContainer)null);
				return;
			case FhirPackage.PARAMETERS_PARAMETER__PART:
				getPart().clear();
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
			case FhirPackage.PARAMETERS_PARAMETER__NAME:
				return name != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_BASE64_BINARY:
				return valueBase64Binary != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_BOOLEAN:
				return valueBoolean != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CANONICAL:
				return valueCanonical != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CODE:
				return valueCode != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DATE:
				return valueDate != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DATE_TIME:
				return valueDateTime != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DECIMAL:
				return valueDecimal != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_ID:
				return valueId != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_INSTANT:
				return valueInstant != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_INTEGER:
				return valueInteger != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_MARKDOWN:
				return valueMarkdown != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_OID:
				return valueOid != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_POSITIVE_INT:
				return valuePositiveInt != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_STRING:
				return valueString != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_TIME:
				return valueTime != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_UNSIGNED_INT:
				return valueUnsignedInt != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_URI:
				return valueUri != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_URL:
				return valueUrl != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_UUID:
				return valueUuid != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_ADDRESS:
				return valueAddress != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_AGE:
				return valueAge != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_ANNOTATION:
				return valueAnnotation != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_ATTACHMENT:
				return valueAttachment != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CODEABLE_CONCEPT:
				return valueCodeableConcept != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CODING:
				return valueCoding != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTACT_POINT:
				return valueContactPoint != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_COUNT:
				return valueCount != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DISTANCE:
				return valueDistance != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DURATION:
				return valueDuration != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_HUMAN_NAME:
				return valueHumanName != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_IDENTIFIER:
				return valueIdentifier != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_MONEY:
				return valueMoney != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_PERIOD:
				return valuePeriod != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_QUANTITY:
				return valueQuantity != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_RANGE:
				return valueRange != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_RATIO:
				return valueRatio != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_REFERENCE:
				return valueReference != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_SAMPLED_DATA:
				return valueSampledData != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_SIGNATURE:
				return valueSignature != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_TIMING:
				return valueTiming != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTACT_DETAIL:
				return valueContactDetail != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_CONTRIBUTOR:
				return valueContributor != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DATA_REQUIREMENT:
				return valueDataRequirement != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_EXPRESSION:
				return valueExpression != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_PARAMETER_DEFINITION:
				return valueParameterDefinition != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_RELATED_ARTIFACT:
				return valueRelatedArtifact != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_TRIGGER_DEFINITION:
				return valueTriggerDefinition != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_USAGE_CONTEXT:
				return valueUsageContext != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_DOSAGE:
				return valueDosage != null;
			case FhirPackage.PARAMETERS_PARAMETER__VALUE_META:
				return valueMeta != null;
			case FhirPackage.PARAMETERS_PARAMETER__RESOURCE:
				return resource != null;
			case FhirPackage.PARAMETERS_PARAMETER__PART:
				return part != null && !part.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParametersParameterImpl
