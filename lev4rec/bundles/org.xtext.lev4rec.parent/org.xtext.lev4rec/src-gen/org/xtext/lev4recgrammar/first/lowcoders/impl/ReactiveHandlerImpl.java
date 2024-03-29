/**
 * generated by Xtext 2.29.0
 */
package org.xtext.lev4recgrammar.first.lowcoders.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage;
import org.xtext.lev4recgrammar.first.lowcoders.ReactiveHandler;
import org.xtext.lev4recgrammar.first.lowcoders.UserEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reactive Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.ReactiveHandlerImpl#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReactiveHandlerImpl extends RecommendationHandlerImpl implements ReactiveHandler
{
  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected UserEvent event;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReactiveHandlerImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LowcodersPackage.Literals.REACTIVE_HANDLER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UserEvent getEvent()
  {
    if (event != null && event.eIsProxy())
    {
      InternalEObject oldEvent = (InternalEObject)event;
      event = (UserEvent)eResolveProxy(oldEvent);
      if (event != oldEvent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LowcodersPackage.REACTIVE_HANDLER__EVENT, oldEvent, event));
      }
    }
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserEvent basicGetEvent()
  {
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEvent(UserEvent newEvent)
  {
    UserEvent oldEvent = event;
    event = newEvent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.REACTIVE_HANDLER__EVENT, oldEvent, event));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LowcodersPackage.REACTIVE_HANDLER__EVENT:
        if (resolve) return getEvent();
        return basicGetEvent();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LowcodersPackage.REACTIVE_HANDLER__EVENT:
        setEvent((UserEvent)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LowcodersPackage.REACTIVE_HANDLER__EVENT:
        setEvent((UserEvent)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LowcodersPackage.REACTIVE_HANDLER__EVENT:
        return event != null;
    }
    return super.eIsSet(featureID);
  }

} //ReactiveHandlerImpl
