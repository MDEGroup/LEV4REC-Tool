/**
 * generated by Xtext 2.29.0
 */
package org.xtext.lev4recgrammar.first.lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reactive Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.ReactiveHandler#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getReactiveHandler()
 * @model
 * @generated
 */
public interface ReactiveHandler extends RecommendationHandler
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' reference.
   * @see #setEvent(UserEvent)
   * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getReactiveHandler_Event()
   * @model
   * @generated
   */
  UserEvent getEvent();

  /**
   * Sets the value of the '{@link org.xtext.lev4recgrammar.first.lowcoders.ReactiveHandler#getEvent <em>Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(UserEvent value);

} // ReactiveHandler
