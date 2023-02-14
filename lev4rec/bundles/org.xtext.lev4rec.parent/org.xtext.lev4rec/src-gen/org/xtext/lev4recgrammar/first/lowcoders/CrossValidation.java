/**
 * generated by Xtext 2.23.0
 */
package org.xtext.lev4recgrammar.first.lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cross Validation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.CrossValidation#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.CrossValidation#getNumberOfFold <em>Number Of Fold</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.CrossValidation#getGroundTruthExtractor <em>Ground Truth Extractor</em>}</li>
 * </ul>
 *
 * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getCrossValidation()
 * @model
 * @generated
 */
public interface CrossValidation extends ValidationTechnique
{
  /**
   * Returns the value of the '<em><b>Library</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.lev4recgrammar.first.lowcoders.ValidationLibrary}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Library</em>' attribute.
   * @see org.xtext.lev4recgrammar.first.lowcoders.ValidationLibrary
   * @see #setLibrary(ValidationLibrary)
   * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getCrossValidation_Library()
   * @model
   * @generated
   */
  ValidationLibrary getLibrary();

  /**
   * Sets the value of the '{@link org.xtext.lev4recgrammar.first.lowcoders.CrossValidation#getLibrary <em>Library</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Library</em>' attribute.
   * @see org.xtext.lev4recgrammar.first.lowcoders.ValidationLibrary
   * @see #getLibrary()
   * @generated
   */
  void setLibrary(ValidationLibrary value);

  /**
   * Returns the value of the '<em><b>Number Of Fold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number Of Fold</em>' attribute.
   * @see #setNumberOfFold(int)
   * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getCrossValidation_NumberOfFold()
   * @model
   * @generated
   */
  int getNumberOfFold();

  /**
   * Sets the value of the '{@link org.xtext.lev4recgrammar.first.lowcoders.CrossValidation#getNumberOfFold <em>Number Of Fold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number Of Fold</em>' attribute.
   * @see #getNumberOfFold()
   * @generated
   */
  void setNumberOfFold(int value);

  /**
   * Returns the value of the '<em><b>Ground Truth Extractor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ground Truth Extractor</em>' containment reference.
   * @see #setGroundTruthExtractor(GroundTruthExtraction)
   * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getCrossValidation_GroundTruthExtractor()
   * @model containment="true"
   * @generated
   */
  GroundTruthExtraction getGroundTruthExtractor();

  /**
   * Sets the value of the '{@link org.xtext.lev4recgrammar.first.lowcoders.CrossValidation#getGroundTruthExtractor <em>Ground Truth Extractor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ground Truth Extractor</em>' containment reference.
   * @see #getGroundTruthExtractor()
   * @generated
   */
  void setGroundTruthExtractor(GroundTruthExtraction value);

} // CrossValidation