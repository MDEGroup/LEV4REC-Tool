/**
 * generated by Xtext 2.29.0
 */
package org.xtext.lev4recgrammar.first.lowcoders.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage;
import org.xtext.lev4recgrammar.first.lowcoders.PyLibType;
import org.xtext.lev4recgrammar.first.lowcoders.RecommendationContext;
import org.xtext.lev4recgrammar.first.lowcoders.RecommendationSetting;
import org.xtext.lev4recgrammar.first.lowcoders.RecommendationSystem;
import org.xtext.lev4recgrammar.first.lowcoders.RecommendedItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recommendation System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.RecommendationSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.RecommendationSystemImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.RecommendationSystemImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.RecommendationSystemImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.RecommendationSystemImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecommendationSystemImpl extends MinimalEObjectImpl.Container implements RecommendationSystem
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getGenerator() <em>Generator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenerator()
   * @generated
   * @ordered
   */
  protected static final PyLibType GENERATOR_EDEFAULT = PyLibType.SKLEARN;

  /**
   * The cached value of the '{@link #getGenerator() <em>Generator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenerator()
   * @generated
   * @ordered
   */
  protected PyLibType generator = GENERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSettings()
   * @generated
   * @ordered
   */
  protected EList<RecommendationSetting> settings;

  /**
   * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScope()
   * @generated
   * @ordered
   */
  protected RecommendedItem scope;

  /**
   * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected RecommendationContext context;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecommendationSystemImpl()
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
    return LowcodersPackage.Literals.RECOMMENDATION_SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.RECOMMENDATION_SYSTEM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PyLibType getGenerator()
  {
    return generator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGenerator(PyLibType newGenerator)
  {
    PyLibType oldGenerator = generator;
    generator = newGenerator == null ? GENERATOR_EDEFAULT : newGenerator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.RECOMMENDATION_SYSTEM__GENERATOR, oldGenerator, generator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<RecommendationSetting> getSettings()
  {
    if (settings == null)
    {
      settings = new EObjectContainmentEList<RecommendationSetting>(RecommendationSetting.class, this, LowcodersPackage.RECOMMENDATION_SYSTEM__SETTINGS);
    }
    return settings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RecommendedItem getScope()
  {
    return scope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScope(RecommendedItem newScope, NotificationChain msgs)
  {
    RecommendedItem oldScope = scope;
    scope = newScope;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LowcodersPackage.RECOMMENDATION_SYSTEM__SCOPE, oldScope, newScope);
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
  public void setScope(RecommendedItem newScope)
  {
    if (newScope != scope)
    {
      NotificationChain msgs = null;
      if (scope != null)
        msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.RECOMMENDATION_SYSTEM__SCOPE, null, msgs);
      if (newScope != null)
        msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.RECOMMENDATION_SYSTEM__SCOPE, null, msgs);
      msgs = basicSetScope(newScope, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.RECOMMENDATION_SYSTEM__SCOPE, newScope, newScope));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RecommendationContext getContext()
  {
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContext(RecommendationContext newContext, NotificationChain msgs)
  {
    RecommendationContext oldContext = context;
    context = newContext;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LowcodersPackage.RECOMMENDATION_SYSTEM__CONTEXT, oldContext, newContext);
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
  public void setContext(RecommendationContext newContext)
  {
    if (newContext != context)
    {
      NotificationChain msgs = null;
      if (context != null)
        msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.RECOMMENDATION_SYSTEM__CONTEXT, null, msgs);
      if (newContext != null)
        msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.RECOMMENDATION_SYSTEM__CONTEXT, null, msgs);
      msgs = basicSetContext(newContext, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.RECOMMENDATION_SYSTEM__CONTEXT, newContext, newContext));
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
      case LowcodersPackage.RECOMMENDATION_SYSTEM__SETTINGS:
        return ((InternalEList<?>)getSettings()).basicRemove(otherEnd, msgs);
      case LowcodersPackage.RECOMMENDATION_SYSTEM__SCOPE:
        return basicSetScope(null, msgs);
      case LowcodersPackage.RECOMMENDATION_SYSTEM__CONTEXT:
        return basicSetContext(null, msgs);
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
      case LowcodersPackage.RECOMMENDATION_SYSTEM__NAME:
        return getName();
      case LowcodersPackage.RECOMMENDATION_SYSTEM__GENERATOR:
        return getGenerator();
      case LowcodersPackage.RECOMMENDATION_SYSTEM__SETTINGS:
        return getSettings();
      case LowcodersPackage.RECOMMENDATION_SYSTEM__SCOPE:
        return getScope();
      case LowcodersPackage.RECOMMENDATION_SYSTEM__CONTEXT:
        return getContext();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LowcodersPackage.RECOMMENDATION_SYSTEM__NAME:
        setName((String)newValue);
        return;
      case LowcodersPackage.RECOMMENDATION_SYSTEM__GENERATOR:
        setGenerator((PyLibType)newValue);
        return;
      case LowcodersPackage.RECOMMENDATION_SYSTEM__SETTINGS:
        getSettings().clear();
        getSettings().addAll((Collection<? extends RecommendationSetting>)newValue);
        return;
      case LowcodersPackage.RECOMMENDATION_SYSTEM__SCOPE:
        setScope((RecommendedItem)newValue);
        return;
      case LowcodersPackage.RECOMMENDATION_SYSTEM__CONTEXT:
        setContext((RecommendationContext)newValue);
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
      case LowcodersPackage.RECOMMENDATION_SYSTEM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LowcodersPackage.RECOMMENDATION_SYSTEM__GENERATOR:
        setGenerator(GENERATOR_EDEFAULT);
        return;
      case LowcodersPackage.RECOMMENDATION_SYSTEM__SETTINGS:
        getSettings().clear();
        return;
      case LowcodersPackage.RECOMMENDATION_SYSTEM__SCOPE:
        setScope((RecommendedItem)null);
        return;
      case LowcodersPackage.RECOMMENDATION_SYSTEM__CONTEXT:
        setContext((RecommendationContext)null);
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
      case LowcodersPackage.RECOMMENDATION_SYSTEM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LowcodersPackage.RECOMMENDATION_SYSTEM__GENERATOR:
        return generator != GENERATOR_EDEFAULT;
      case LowcodersPackage.RECOMMENDATION_SYSTEM__SETTINGS:
        return settings != null && !settings.isEmpty();
      case LowcodersPackage.RECOMMENDATION_SYSTEM__SCOPE:
        return scope != null;
      case LowcodersPackage.RECOMMENDATION_SYSTEM__CONTEXT:
        return context != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", generator: ");
    result.append(generator);
    result.append(')');
    return result.toString();
  }

} //RecommendationSystemImpl
