/**
 * generated by Xtext 2.23.0
 */
package org.xtext.lev4recgrammar.first.rsDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recommendation Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.RecommendationUsage#getUsageType <em>Usage Type</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.RecommendationUsage#getRecommendedItems <em>Recommended Items</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.RecommendationUsage#getGuielements <em>Guielements</em>}</li>
 * </ul>
 *
 * @see org.xtext.lev4recgrammar.first.rsDsl.RsDslPackage#getRecommendationUsage()
 * @model
 * @generated
 */
public interface RecommendationUsage extends EObject
{
  /**
   * Returns the value of the '<em><b>Usage Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.lev4recgrammar.first.rsDsl.RecommendationUsageType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usage Type</em>' attribute.
   * @see org.xtext.lev4recgrammar.first.rsDsl.RecommendationUsageType
   * @see #setUsageType(RecommendationUsageType)
   * @see org.xtext.lev4recgrammar.first.rsDsl.RsDslPackage#getRecommendationUsage_UsageType()
   * @model
   * @generated
   */
  RecommendationUsageType getUsageType();

  /**
   * Sets the value of the '{@link org.xtext.lev4recgrammar.first.rsDsl.RecommendationUsage#getUsageType <em>Usage Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Usage Type</em>' attribute.
   * @see org.xtext.lev4recgrammar.first.rsDsl.RecommendationUsageType
   * @see #getUsageType()
   * @generated
   */
  void setUsageType(RecommendationUsageType value);

  /**
   * Returns the value of the '<em><b>Recommended Items</b></em>' reference list.
   * The list contents are of type {@link org.xtext.lev4recgrammar.first.rsDsl.RecommendedItem}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recommended Items</em>' reference list.
   * @see org.xtext.lev4recgrammar.first.rsDsl.RsDslPackage#getRecommendationUsage_RecommendedItems()
   * @model
   * @generated
   */
  EList<RecommendedItem> getRecommendedItems();

  /**
   * Returns the value of the '<em><b>Guielements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.lev4recgrammar.first.rsDsl.GUIElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guielements</em>' containment reference list.
   * @see org.xtext.lev4recgrammar.first.rsDsl.RsDslPackage#getRecommendationUsage_Guielements()
   * @model containment="true"
   * @generated
   */
  EList<GUIElement> getGuielements();

} // RecommendationUsage
