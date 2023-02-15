/**
 * generated by Xtext 2.29.0
 */
package org.xtext.lev4recgrammar.first.lowcoders;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recommendation Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.RecommendationHandler#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.RecommendationHandler#getWebService <em>Web Service</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.RecommendationHandler#getContext <em>Context</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.RecommendationHandler#getUsage <em>Usage</em>}</li>
 * </ul>
 *
 * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getRecommendationHandler()
 * @model
 * @generated
 */
public interface RecommendationHandler extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getRecommendationHandler_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.lev4recgrammar.first.lowcoders.RecommendationHandler#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Web Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Web Service</em>' reference.
   * @see #setWebService(WebIService)
   * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getRecommendationHandler_WebService()
   * @model
   * @generated
   */
  WebIService getWebService();

  /**
   * Sets the value of the '{@link org.xtext.lev4recgrammar.first.lowcoders.RecommendationHandler#getWebService <em>Web Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Web Service</em>' reference.
   * @see #getWebService()
   * @generated
   */
  void setWebService(WebIService value);

  /**
   * Returns the value of the '<em><b>Context</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context</em>' reference.
   * @see #setContext(RecommendationContext)
   * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getRecommendationHandler_Context()
   * @model
   * @generated
   */
  RecommendationContext getContext();

  /**
   * Sets the value of the '{@link org.xtext.lev4recgrammar.first.lowcoders.RecommendationHandler#getContext <em>Context</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context</em>' reference.
   * @see #getContext()
   * @generated
   */
  void setContext(RecommendationContext value);

  /**
   * Returns the value of the '<em><b>Usage</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.lev4recgrammar.first.lowcoders.RecommendationUsage}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usage</em>' containment reference list.
   * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getRecommendationHandler_Usage()
   * @model containment="true"
   * @generated
   */
  EList<RecommendationUsage> getUsage();

} // RecommendationHandler
