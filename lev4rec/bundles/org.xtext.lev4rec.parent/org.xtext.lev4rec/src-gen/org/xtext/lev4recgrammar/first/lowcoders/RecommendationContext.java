/**
 * generated by Xtext 2.29.0
 */
package org.xtext.lev4recgrammar.first.lowcoders;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recommendation Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.RecommendationContext#isIsProactiveSystem <em>Is Proactive System</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.RecommendationContext#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.RecommendationContext#getUserContext <em>User Context</em>}</li>
 * </ul>
 *
 * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getRecommendationContext()
 * @model
 * @generated
 */
public interface RecommendationContext extends EObject
{
  /**
   * Returns the value of the '<em><b>Is Proactive System</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Proactive System</em>' attribute.
   * @see #setIsProactiveSystem(boolean)
   * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getRecommendationContext_IsProactiveSystem()
   * @model
   * @generated
   */
  boolean isIsProactiveSystem();

  /**
   * Sets the value of the '{@link org.xtext.lev4recgrammar.first.lowcoders.RecommendationContext#isIsProactiveSystem <em>Is Proactive System</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Proactive System</em>' attribute.
   * @see #isIsProactiveSystem()
   * @generated
   */
  void setIsProactiveSystem(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getRecommendationContext_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.lev4recgrammar.first.lowcoders.RecommendationContext#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>User Context</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>User Context</em>' reference.
   * @see #setUserContext(DataStructure)
   * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getRecommendationContext_UserContext()
   * @model
   * @generated
   */
  DataStructure getUserContext();

  /**
   * Sets the value of the '{@link org.xtext.lev4recgrammar.first.lowcoders.RecommendationContext#getUserContext <em>User Context</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>User Context</em>' reference.
   * @see #getUserContext()
   * @generated
   */
  void setUserContext(DataStructure value);

} // RecommendationContext
