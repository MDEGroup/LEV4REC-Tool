/**
 * generated by Xtext 2.23.0
 */
package org.xtext.lev4recgrammar.first.rsDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.lev4recgrammar.first.rsDsl.GUIElement;
import org.xtext.lev4recgrammar.first.rsDsl.RecommendationUsage;
import org.xtext.lev4recgrammar.first.rsDsl.RecommendationUsageType;
import org.xtext.lev4recgrammar.first.rsDsl.RecommendedItem;
import org.xtext.lev4recgrammar.first.rsDsl.RsDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recommendation Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.impl.RecommendationUsageImpl#getUsageType <em>Usage Type</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.impl.RecommendationUsageImpl#getRecommendedItems <em>Recommended Items</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.impl.RecommendationUsageImpl#getGuielements <em>Guielements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecommendationUsageImpl extends MinimalEObjectImpl.Container implements RecommendationUsage
{
  /**
   * The default value of the '{@link #getUsageType() <em>Usage Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsageType()
   * @generated
   * @ordered
   */
  protected static final RecommendationUsageType USAGE_TYPE_EDEFAULT = RecommendationUsageType.TRANSFORMATIVE;

  /**
   * The cached value of the '{@link #getUsageType() <em>Usage Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsageType()
   * @generated
   * @ordered
   */
  protected RecommendationUsageType usageType = USAGE_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRecommendedItems() <em>Recommended Items</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecommendedItems()
   * @generated
   * @ordered
   */
  protected EList<RecommendedItem> recommendedItems;

  /**
   * The cached value of the '{@link #getGuielements() <em>Guielements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuielements()
   * @generated
   * @ordered
   */
  protected EList<GUIElement> guielements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecommendationUsageImpl()
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
    return RsDslPackage.Literals.RECOMMENDATION_USAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RecommendationUsageType getUsageType()
  {
    return usageType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUsageType(RecommendationUsageType newUsageType)
  {
    RecommendationUsageType oldUsageType = usageType;
    usageType = newUsageType == null ? USAGE_TYPE_EDEFAULT : newUsageType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RsDslPackage.RECOMMENDATION_USAGE__USAGE_TYPE, oldUsageType, usageType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<RecommendedItem> getRecommendedItems()
  {
    if (recommendedItems == null)
    {
      recommendedItems = new EObjectResolvingEList<RecommendedItem>(RecommendedItem.class, this, RsDslPackage.RECOMMENDATION_USAGE__RECOMMENDED_ITEMS);
    }
    return recommendedItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<GUIElement> getGuielements()
  {
    if (guielements == null)
    {
      guielements = new EObjectContainmentEList<GUIElement>(GUIElement.class, this, RsDslPackage.RECOMMENDATION_USAGE__GUIELEMENTS);
    }
    return guielements;
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
      case RsDslPackage.RECOMMENDATION_USAGE__GUIELEMENTS:
        return ((InternalEList<?>)getGuielements()).basicRemove(otherEnd, msgs);
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
      case RsDslPackage.RECOMMENDATION_USAGE__USAGE_TYPE:
        return getUsageType();
      case RsDslPackage.RECOMMENDATION_USAGE__RECOMMENDED_ITEMS:
        return getRecommendedItems();
      case RsDslPackage.RECOMMENDATION_USAGE__GUIELEMENTS:
        return getGuielements();
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
      case RsDslPackage.RECOMMENDATION_USAGE__USAGE_TYPE:
        setUsageType((RecommendationUsageType)newValue);
        return;
      case RsDslPackage.RECOMMENDATION_USAGE__RECOMMENDED_ITEMS:
        getRecommendedItems().clear();
        getRecommendedItems().addAll((Collection<? extends RecommendedItem>)newValue);
        return;
      case RsDslPackage.RECOMMENDATION_USAGE__GUIELEMENTS:
        getGuielements().clear();
        getGuielements().addAll((Collection<? extends GUIElement>)newValue);
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
      case RsDslPackage.RECOMMENDATION_USAGE__USAGE_TYPE:
        setUsageType(USAGE_TYPE_EDEFAULT);
        return;
      case RsDslPackage.RECOMMENDATION_USAGE__RECOMMENDED_ITEMS:
        getRecommendedItems().clear();
        return;
      case RsDslPackage.RECOMMENDATION_USAGE__GUIELEMENTS:
        getGuielements().clear();
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
      case RsDslPackage.RECOMMENDATION_USAGE__USAGE_TYPE:
        return usageType != USAGE_TYPE_EDEFAULT;
      case RsDslPackage.RECOMMENDATION_USAGE__RECOMMENDED_ITEMS:
        return recommendedItems != null && !recommendedItems.isEmpty();
      case RsDslPackage.RECOMMENDATION_USAGE__GUIELEMENTS:
        return guielements != null && !guielements.isEmpty();
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
    result.append(" (usageType: ");
    result.append(usageType);
    result.append(')');
    return result.toString();
  }

} //RecommendationUsageImpl
