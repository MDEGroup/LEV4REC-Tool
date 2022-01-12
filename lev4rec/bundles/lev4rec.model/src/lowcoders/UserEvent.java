/**
 */
package lowcoders;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.UserEvent#getEventType <em>Event Type</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getUserEvent()
 * @model
 * @generated
 */
public interface UserEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * The literals are from the enumeration {@link lowcoders.UserEventType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see lowcoders.UserEventType
	 * @see #setEventType(UserEventType)
	 * @see lowcoders.LowcodersPackage#getUserEvent_EventType()
	 * @model
	 * @generated
	 */
	UserEventType getEventType();

	/**
	 * Sets the value of the '{@link lowcoders.UserEvent#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see lowcoders.UserEventType
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(UserEventType value);

} // UserEvent
