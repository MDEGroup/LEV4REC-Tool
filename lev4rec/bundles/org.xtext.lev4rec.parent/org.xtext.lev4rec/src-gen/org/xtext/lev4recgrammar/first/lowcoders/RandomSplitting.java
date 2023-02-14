/**
 * generated by Xtext 2.23.0
 */
package org.xtext.lev4recgrammar.first.lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Random Splitting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.RandomSplitting#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getRandomSplitting()
 * @model
 * @generated
 */
public interface RandomSplitting extends ValidationTechnique
{
  /**
   * Returns the value of the '<em><b>Library</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.lev4recgrammar.first.lowcoders.ValidationLibrary}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Library</em>' attribute.
   * @see org.xtext.lev4recgrammar.first.lowcoders.ValidationLibrary
   * @see #setLibrary(ValidationLibrary)
   * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getRandomSplitting_Library()
   * @model
   * @generated
   */
  ValidationLibrary getLibrary();

  /**
   * Sets the value of the '{@link org.xtext.lev4recgrammar.first.lowcoders.RandomSplitting#getLibrary <em>Library</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Library</em>' attribute.
   * @see org.xtext.lev4recgrammar.first.lowcoders.ValidationLibrary
   * @see #getLibrary()
   * @generated
   */
  void setLibrary(ValidationLibrary value);

} // RandomSplitting
