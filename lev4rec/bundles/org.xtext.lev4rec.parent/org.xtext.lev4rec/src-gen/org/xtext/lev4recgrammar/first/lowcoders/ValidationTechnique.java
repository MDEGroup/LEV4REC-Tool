/**
 * generated by Xtext 2.23.0
 */
package org.xtext.lev4recgrammar.first.lowcoders;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation Technique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.ValidationTechnique#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.ValidationTechnique#getNOfRecommendations <em>NOf Recommendations</em>}</li>
 * </ul>
 *
 * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getValidationTechnique()
 * @model
 * @generated
 */
public interface ValidationTechnique extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getValidationTechnique_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.lev4recgrammar.first.lowcoders.ValidationTechnique#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>NOf Recommendations</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>NOf Recommendations</em>' attribute.
   * @see #setNOfRecommendations(int)
   * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getValidationTechnique_NOfRecommendations()
   * @model
   * @generated
   */
  int getNOfRecommendations();

  /**
   * Sets the value of the '{@link org.xtext.lev4recgrammar.first.lowcoders.ValidationTechnique#getNOfRecommendations <em>NOf Recommendations</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>NOf Recommendations</em>' attribute.
   * @see #getNOfRecommendations()
   * @generated
   */
  void setNOfRecommendations(int value);

} // ValidationTechnique
