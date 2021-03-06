/**
 * generated by Xtext 2.23.0
 */
package org.xtext.lev4recgrammar.first.rsDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.Tree#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.Tree#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see org.xtext.lev4recgrammar.first.rsDsl.RsDslPackage#getTree()
 * @model
 * @generated
 */
public interface Tree extends DataStructure
{
  /**
   * Returns the value of the '<em><b>Nodes</b></em>' reference list.
   * The list contents are of type {@link org.xtext.lev4recgrammar.first.rsDsl.Variable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' reference list.
   * @see org.xtext.lev4recgrammar.first.rsDsl.RsDslPackage#getTree_Nodes()
   * @model
   * @generated
   */
  EList<Variable> getNodes();

  /**
   * Returns the value of the '<em><b>Relations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relations</em>' containment reference.
   * @see #setRelations(VariableRelation)
   * @see org.xtext.lev4recgrammar.first.rsDsl.RsDslPackage#getTree_Relations()
   * @model containment="true"
   * @generated
   */
  VariableRelation getRelations();

  /**
   * Sets the value of the '{@link org.xtext.lev4recgrammar.first.rsDsl.Tree#getRelations <em>Relations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relations</em>' containment reference.
   * @see #getRelations()
   * @generated
   */
  void setRelations(VariableRelation value);

} // Tree
