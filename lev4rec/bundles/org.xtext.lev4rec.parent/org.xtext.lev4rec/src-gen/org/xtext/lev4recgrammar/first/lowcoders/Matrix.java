/**
 * generated by Xtext 2.23.0
 */
package org.xtext.lev4recgrammar.first.lowcoders;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.Matrix#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getMatrix()
 * @model
 * @generated
 */
public interface Matrix extends DataStructure
{
  /**
   * Returns the value of the '<em><b>Columns</b></em>' reference list.
   * The list contents are of type {@link org.xtext.lev4recgrammar.first.lowcoders.Variable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' reference list.
   * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getMatrix_Columns()
   * @model
   * @generated
   */
  EList<Variable> getColumns();

} // Matrix