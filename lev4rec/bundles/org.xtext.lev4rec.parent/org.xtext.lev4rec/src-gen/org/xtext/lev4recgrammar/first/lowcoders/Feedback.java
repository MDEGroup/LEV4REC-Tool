/**
 * generated by Xtext 2.29.0
 */
package org.xtext.lev4recgrammar.first.lowcoders;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.Feedback#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getFeedback()
 * @model
 * @generated
 */
public interface Feedback extends EObject
{
  /**
   * Returns the value of the '<em><b>Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item</em>' containment reference.
   * @see #setItem(RecommendedItem)
   * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getFeedback_Item()
   * @model containment="true"
   * @generated
   */
  RecommendedItem getItem();

  /**
   * Sets the value of the '{@link org.xtext.lev4recgrammar.first.lowcoders.Feedback#getItem <em>Item</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item</em>' containment reference.
   * @see #getItem()
   * @generated
   */
  void setItem(RecommendedItem value);

} // Feedback
