/**
 * generated by Xtext 2.23.0
 */
package org.xtext.lev4recgrammar.first.rsDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additive Feedback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.AdditiveFeedback#getNumOfInsertion <em>Num Of Insertion</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.AdditiveFeedback#getRecommender <em>Recommender</em>}</li>
 * </ul>
 *
 * @see org.xtext.lev4recgrammar.first.rsDsl.RsDslPackage#getAdditiveFeedback()
 * @model
 * @generated
 */
public interface AdditiveFeedback extends Feedback
{
  /**
   * Returns the value of the '<em><b>Num Of Insertion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num Of Insertion</em>' attribute.
   * @see #setNumOfInsertion(int)
   * @see org.xtext.lev4recgrammar.first.rsDsl.RsDslPackage#getAdditiveFeedback_NumOfInsertion()
   * @model
   * @generated
   */
  int getNumOfInsertion();

  /**
   * Sets the value of the '{@link org.xtext.lev4recgrammar.first.rsDsl.AdditiveFeedback#getNumOfInsertion <em>Num Of Insertion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num Of Insertion</em>' attribute.
   * @see #getNumOfInsertion()
   * @generated
   */
  void setNumOfInsertion(int value);

  /**
   * Returns the value of the '<em><b>Recommender</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recommender</em>' reference.
   * @see #setRecommender(RecommendationSystem)
   * @see org.xtext.lev4recgrammar.first.rsDsl.RsDslPackage#getAdditiveFeedback_Recommender()
   * @model
   * @generated
   */
  RecommendationSystem getRecommender();

  /**
   * Sets the value of the '{@link org.xtext.lev4recgrammar.first.rsDsl.AdditiveFeedback#getRecommender <em>Recommender</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recommender</em>' reference.
   * @see #getRecommender()
   * @generated
   */
  void setRecommender(RecommendationSystem value);

} // AdditiveFeedback
