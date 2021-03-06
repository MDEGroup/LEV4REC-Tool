/**
 * generated by Xtext 2.23.0
 */
package org.xtext.lev4recgrammar.first.rsDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.VariableRelation#getSource <em>Source</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.VariableRelation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.xtext.lev4recgrammar.first.rsDsl.RsDslPackage#getVariableRelation()
 * @model
 * @generated
 */
public interface VariableRelation extends EObject
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(Variable)
   * @see org.xtext.lev4recgrammar.first.rsDsl.RsDslPackage#getVariableRelation_Source()
   * @model
   * @generated
   */
  Variable getSource();

  /**
   * Sets the value of the '{@link org.xtext.lev4recgrammar.first.rsDsl.VariableRelation#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Variable value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Variable)
   * @see org.xtext.lev4recgrammar.first.rsDsl.RsDslPackage#getVariableRelation_Target()
   * @model
   * @generated
   */
  Variable getTarget();

  /**
   * Sets the value of the '{@link org.xtext.lev4recgrammar.first.rsDsl.VariableRelation#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Variable value);

} // VariableRelation
