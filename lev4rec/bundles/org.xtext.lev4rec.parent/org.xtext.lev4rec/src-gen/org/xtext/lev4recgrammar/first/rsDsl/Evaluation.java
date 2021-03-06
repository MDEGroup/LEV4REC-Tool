/**
 * generated by Xtext 2.23.0
 */
package org.xtext.lev4recgrammar.first.rsDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.Evaluation#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.Evaluation#getBaselines <em>Baselines</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.Evaluation#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.Evaluation#getValidationTechnique <em>Validation Technique</em>}</li>
 * </ul>
 *
 * @see org.xtext.lev4recgrammar.first.rsDsl.RsDslPackage#getEvaluation()
 * @model
 * @generated
 */
public interface Evaluation extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.lev4recgrammar.first.rsDsl.RsDslPackage#getEvaluation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.lev4recgrammar.first.rsDsl.Evaluation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Baselines</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Baselines</em>' attribute list.
   * @see org.xtext.lev4recgrammar.first.rsDsl.RsDslPackage#getEvaluation_Baselines()
   * @model unique="false"
   * @generated
   */
  EList<String> getBaselines();

  /**
   * Returns the value of the '<em><b>Metrics</b></em>' attribute list.
   * The list contents are of type {@link org.xtext.lev4recgrammar.first.rsDsl.Metric}.
   * The literals are from the enumeration {@link org.xtext.lev4recgrammar.first.rsDsl.Metric}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metrics</em>' attribute list.
   * @see org.xtext.lev4recgrammar.first.rsDsl.Metric
   * @see org.xtext.lev4recgrammar.first.rsDsl.RsDslPackage#getEvaluation_Metrics()
   * @model unique="false"
   * @generated
   */
  EList<Metric> getMetrics();

  /**
   * Returns the value of the '<em><b>Validation Technique</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.lev4recgrammar.first.rsDsl.ValidationTechnique}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validation Technique</em>' containment reference list.
   * @see org.xtext.lev4recgrammar.first.rsDsl.RsDslPackage#getEvaluation_ValidationTechnique()
   * @model containment="true"
   * @generated
   */
  EList<ValidationTechnique> getValidationTechnique();

} // Evaluation
