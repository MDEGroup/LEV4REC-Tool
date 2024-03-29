/**
 * generated by Xtext 2.29.0
 */
package org.xtext.lev4recgrammar.first.lowcoders.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.lev4recgrammar.first.lowcoders.Feedback;
import org.xtext.lev4recgrammar.first.lowcoders.FeedbackComponent;
import org.xtext.lev4recgrammar.first.lowcoders.FeedbackLibType;
import org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage;
import org.xtext.lev4recgrammar.first.lowcoders.RecommendationContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feedback Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.FeedbackComponentImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.FeedbackComponentImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.FeedbackComponentImpl#getExpressedFeedback <em>Expressed Feedback</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeedbackComponentImpl extends MinimalEObjectImpl.Container implements FeedbackComponent
{
  /**
   * The default value of the '{@link #getLibrary() <em>Library</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLibrary()
   * @generated
   * @ordered
   */
  protected static final FeedbackLibType LIBRARY_EDEFAULT = FeedbackLibType.LIGHTFM;

  /**
   * The cached value of the '{@link #getLibrary() <em>Library</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLibrary()
   * @generated
   * @ordered
   */
  protected FeedbackLibType library = LIBRARY_EDEFAULT;

  /**
   * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuery()
   * @generated
   * @ordered
   */
  protected RecommendationContext query;

  /**
   * The cached value of the '{@link #getExpressedFeedback() <em>Expressed Feedback</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressedFeedback()
   * @generated
   * @ordered
   */
  protected Feedback expressedFeedback;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeedbackComponentImpl()
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
    return LowcodersPackage.Literals.FEEDBACK_COMPONENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FeedbackLibType getLibrary()
  {
    return library;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLibrary(FeedbackLibType newLibrary)
  {
    FeedbackLibType oldLibrary = library;
    library = newLibrary == null ? LIBRARY_EDEFAULT : newLibrary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.FEEDBACK_COMPONENT__LIBRARY, oldLibrary, library));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RecommendationContext getQuery()
  {
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuery(RecommendationContext newQuery, NotificationChain msgs)
  {
    RecommendationContext oldQuery = query;
    query = newQuery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LowcodersPackage.FEEDBACK_COMPONENT__QUERY, oldQuery, newQuery);
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
  public void setQuery(RecommendationContext newQuery)
  {
    if (newQuery != query)
    {
      NotificationChain msgs = null;
      if (query != null)
        msgs = ((InternalEObject)query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.FEEDBACK_COMPONENT__QUERY, null, msgs);
      if (newQuery != null)
        msgs = ((InternalEObject)newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.FEEDBACK_COMPONENT__QUERY, null, msgs);
      msgs = basicSetQuery(newQuery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.FEEDBACK_COMPONENT__QUERY, newQuery, newQuery));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Feedback getExpressedFeedback()
  {
    return expressedFeedback;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressedFeedback(Feedback newExpressedFeedback, NotificationChain msgs)
  {
    Feedback oldExpressedFeedback = expressedFeedback;
    expressedFeedback = newExpressedFeedback;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LowcodersPackage.FEEDBACK_COMPONENT__EXPRESSED_FEEDBACK, oldExpressedFeedback, newExpressedFeedback);
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
  public void setExpressedFeedback(Feedback newExpressedFeedback)
  {
    if (newExpressedFeedback != expressedFeedback)
    {
      NotificationChain msgs = null;
      if (expressedFeedback != null)
        msgs = ((InternalEObject)expressedFeedback).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.FEEDBACK_COMPONENT__EXPRESSED_FEEDBACK, null, msgs);
      if (newExpressedFeedback != null)
        msgs = ((InternalEObject)newExpressedFeedback).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.FEEDBACK_COMPONENT__EXPRESSED_FEEDBACK, null, msgs);
      msgs = basicSetExpressedFeedback(newExpressedFeedback, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.FEEDBACK_COMPONENT__EXPRESSED_FEEDBACK, newExpressedFeedback, newExpressedFeedback));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LowcodersPackage.FEEDBACK_COMPONENT__QUERY:
        return basicSetQuery(null, msgs);
      case LowcodersPackage.FEEDBACK_COMPONENT__EXPRESSED_FEEDBACK:
        return basicSetExpressedFeedback(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case LowcodersPackage.FEEDBACK_COMPONENT__LIBRARY:
        return getLibrary();
      case LowcodersPackage.FEEDBACK_COMPONENT__QUERY:
        return getQuery();
      case LowcodersPackage.FEEDBACK_COMPONENT__EXPRESSED_FEEDBACK:
        return getExpressedFeedback();
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
      case LowcodersPackage.FEEDBACK_COMPONENT__LIBRARY:
        setLibrary((FeedbackLibType)newValue);
        return;
      case LowcodersPackage.FEEDBACK_COMPONENT__QUERY:
        setQuery((RecommendationContext)newValue);
        return;
      case LowcodersPackage.FEEDBACK_COMPONENT__EXPRESSED_FEEDBACK:
        setExpressedFeedback((Feedback)newValue);
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
      case LowcodersPackage.FEEDBACK_COMPONENT__LIBRARY:
        setLibrary(LIBRARY_EDEFAULT);
        return;
      case LowcodersPackage.FEEDBACK_COMPONENT__QUERY:
        setQuery((RecommendationContext)null);
        return;
      case LowcodersPackage.FEEDBACK_COMPONENT__EXPRESSED_FEEDBACK:
        setExpressedFeedback((Feedback)null);
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
      case LowcodersPackage.FEEDBACK_COMPONENT__LIBRARY:
        return library != LIBRARY_EDEFAULT;
      case LowcodersPackage.FEEDBACK_COMPONENT__QUERY:
        return query != null;
      case LowcodersPackage.FEEDBACK_COMPONENT__EXPRESSED_FEEDBACK:
        return expressedFeedback != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (library: ");
    result.append(library);
    result.append(')');
    return result.toString();
  }

} //FeedbackComponentImpl
