/**
 * generated by Xtext 2.29.0
 */
package org.xtext.lev4recgrammar.first.lowcoders;

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
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.UserEvent#getEventType <em>Event Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getUserEvent()
 * @model
 * @generated
 */
public interface UserEvent extends EObject
{
  /**
   * Returns the value of the '<em><b>Event Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.lev4recgrammar.first.lowcoders.UserEventType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event Type</em>' attribute.
   * @see org.xtext.lev4recgrammar.first.lowcoders.UserEventType
   * @see #setEventType(UserEventType)
   * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getUserEvent_EventType()
   * @model
   * @generated
   */
  UserEventType getEventType();

  /**
   * Sets the value of the '{@link org.xtext.lev4recgrammar.first.lowcoders.UserEvent#getEventType <em>Event Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event Type</em>' attribute.
   * @see org.xtext.lev4recgrammar.first.lowcoders.UserEventType
   * @see #getEventType()
   * @generated
   */
  void setEventType(UserEventType value);

} // UserEvent
