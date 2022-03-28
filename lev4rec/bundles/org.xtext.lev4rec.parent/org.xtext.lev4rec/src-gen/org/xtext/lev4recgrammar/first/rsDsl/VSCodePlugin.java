/**
 * generated by Xtext 2.23.0
 */
package org.xtext.lev4recgrammar.first.rsDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VS Code Plugin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.VSCodePlugin#getHandler <em>Handler</em>}</li>
 * </ul>
 *
 * @see org.xtext.lev4recgrammar.first.rsDsl.RsDslPackage#getVSCodePlugin()
 * @model
 * @generated
 */
public interface VSCodePlugin extends PresentationLayer
{
  /**
   * Returns the value of the '<em><b>Handler</b></em>' reference list.
   * The list contents are of type {@link org.xtext.lev4recgrammar.first.rsDsl.RecommendationHandler}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Handler</em>' reference list.
   * @see org.xtext.lev4recgrammar.first.rsDsl.RsDslPackage#getVSCodePlugin_Handler()
   * @model
   * @generated
   */
  EList<RecommendationHandler> getHandler();

} // VSCodePlugin
