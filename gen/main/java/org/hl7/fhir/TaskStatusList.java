/**
 */
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Task Status List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getTaskStatusList()
 * @model extendedMetaData="name='TaskStatus-list'"
 * @generated
 */
public enum TaskStatusList implements Enumerator {
	/**
	 * The '<em><b>Draft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Draft
	 * <!-- end-model-doc -->
	 * @see #DRAFT_VALUE
	 * @generated
	 * @ordered
	 */
	DRAFT(0, "draft", "draft"),

	/**
	 * The '<em><b>Requested</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requested
	 * <!-- end-model-doc -->
	 * @see #REQUESTED_VALUE
	 * @generated
	 * @ordered
	 */
	REQUESTED(1, "requested", "requested"),

	/**
	 * The '<em><b>Received</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Received
	 * <!-- end-model-doc -->
	 * @see #RECEIVED_VALUE
	 * @generated
	 * @ordered
	 */
	RECEIVED(2, "received", "received"),

	/**
	 * The '<em><b>Accepted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accepted
	 * <!-- end-model-doc -->
	 * @see #ACCEPTED_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPTED(3, "accepted", "accepted"),

	/**
	 * The '<em><b>Rejected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rejected
	 * <!-- end-model-doc -->
	 * @see #REJECTED_VALUE
	 * @generated
	 * @ordered
	 */
	REJECTED(4, "rejected", "rejected"),

	/**
	 * The '<em><b>Ready</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ready
	 * <!-- end-model-doc -->
	 * @see #READY_VALUE
	 * @generated
	 * @ordered
	 */
	READY(5, "ready", "ready"),

	/**
	 * The '<em><b>Cancelled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cancelled
	 * <!-- end-model-doc -->
	 * @see #CANCELLED_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELLED(6, "cancelled", "cancelled"),

	/**
	 * The '<em><b>In Progress</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In Progress
	 * <!-- end-model-doc -->
	 * @see #IN_PROGRESS_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PROGRESS(7, "inProgress", "in-progress"),

	/**
	 * The '<em><b>On Hold</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * On Hold
	 * <!-- end-model-doc -->
	 * @see #ON_HOLD_VALUE
	 * @generated
	 * @ordered
	 */
	ON_HOLD(8, "onHold", "on-hold"),

	/**
	 * The '<em><b>Failed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Failed
	 * <!-- end-model-doc -->
	 * @see #FAILED_VALUE
	 * @generated
	 * @ordered
	 */
	FAILED(9, "failed", "failed"),

	/**
	 * The '<em><b>Completed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Completed
	 * <!-- end-model-doc -->
	 * @see #COMPLETED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETED(10, "completed", "completed"),

	/**
	 * The '<em><b>Entered In Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entered in Error
	 * <!-- end-model-doc -->
	 * @see #ENTERED_IN_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ENTERED_IN_ERROR(11, "enteredInError", "entered-in-error");

	/**
	 * The '<em><b>Draft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Draft
	 * <!-- end-model-doc -->
	 * @see #DRAFT
	 * @model name="draft"
	 * @generated
	 * @ordered
	 */
	public static final int DRAFT_VALUE = 0;

	/**
	 * The '<em><b>Requested</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requested
	 * <!-- end-model-doc -->
	 * @see #REQUESTED
	 * @model name="requested"
	 * @generated
	 * @ordered
	 */
	public static final int REQUESTED_VALUE = 1;

	/**
	 * The '<em><b>Received</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Received
	 * <!-- end-model-doc -->
	 * @see #RECEIVED
	 * @model name="received"
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVED_VALUE = 2;

	/**
	 * The '<em><b>Accepted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accepted
	 * <!-- end-model-doc -->
	 * @see #ACCEPTED
	 * @model name="accepted"
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPTED_VALUE = 3;

	/**
	 * The '<em><b>Rejected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rejected
	 * <!-- end-model-doc -->
	 * @see #REJECTED
	 * @model name="rejected"
	 * @generated
	 * @ordered
	 */
	public static final int REJECTED_VALUE = 4;

	/**
	 * The '<em><b>Ready</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ready
	 * <!-- end-model-doc -->
	 * @see #READY
	 * @model name="ready"
	 * @generated
	 * @ordered
	 */
	public static final int READY_VALUE = 5;

	/**
	 * The '<em><b>Cancelled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cancelled
	 * <!-- end-model-doc -->
	 * @see #CANCELLED
	 * @model name="cancelled"
	 * @generated
	 * @ordered
	 */
	public static final int CANCELLED_VALUE = 6;

	/**
	 * The '<em><b>In Progress</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In Progress
	 * <!-- end-model-doc -->
	 * @see #IN_PROGRESS
	 * @model name="inProgress" literal="in-progress"
	 * @generated
	 * @ordered
	 */
	public static final int IN_PROGRESS_VALUE = 7;

	/**
	 * The '<em><b>On Hold</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * On Hold
	 * <!-- end-model-doc -->
	 * @see #ON_HOLD
	 * @model name="onHold" literal="on-hold"
	 * @generated
	 * @ordered
	 */
	public static final int ON_HOLD_VALUE = 8;

	/**
	 * The '<em><b>Failed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Failed
	 * <!-- end-model-doc -->
	 * @see #FAILED
	 * @model name="failed"
	 * @generated
	 * @ordered
	 */
	public static final int FAILED_VALUE = 9;

	/**
	 * The '<em><b>Completed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Completed
	 * <!-- end-model-doc -->
	 * @see #COMPLETED
	 * @model name="completed"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETED_VALUE = 10;

	/**
	 * The '<em><b>Entered In Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entered in Error
	 * <!-- end-model-doc -->
	 * @see #ENTERED_IN_ERROR
	 * @model name="enteredInError" literal="entered-in-error"
	 * @generated
	 * @ordered
	 */
	public static final int ENTERED_IN_ERROR_VALUE = 11;

	/**
	 * An array of all the '<em><b>Task Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TaskStatusList[] VALUES_ARRAY =
		new TaskStatusList[] {
			DRAFT,
			REQUESTED,
			RECEIVED,
			ACCEPTED,
			REJECTED,
			READY,
			CANCELLED,
			IN_PROGRESS,
			ON_HOLD,
			FAILED,
			COMPLETED,
			ENTERED_IN_ERROR,
		};

	/**
	 * A public read-only list of all the '<em><b>Task Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TaskStatusList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Task Status List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaskStatusList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaskStatusList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Task Status List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaskStatusList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaskStatusList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Task Status List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaskStatusList get(int value) {
		switch (value) {
			case DRAFT_VALUE: return DRAFT;
			case REQUESTED_VALUE: return REQUESTED;
			case RECEIVED_VALUE: return RECEIVED;
			case ACCEPTED_VALUE: return ACCEPTED;
			case REJECTED_VALUE: return REJECTED;
			case READY_VALUE: return READY;
			case CANCELLED_VALUE: return CANCELLED;
			case IN_PROGRESS_VALUE: return IN_PROGRESS;
			case ON_HOLD_VALUE: return ON_HOLD;
			case FAILED_VALUE: return FAILED;
			case COMPLETED_VALUE: return COMPLETED;
			case ENTERED_IN_ERROR_VALUE: return ENTERED_IN_ERROR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TaskStatusList(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TaskStatusList
