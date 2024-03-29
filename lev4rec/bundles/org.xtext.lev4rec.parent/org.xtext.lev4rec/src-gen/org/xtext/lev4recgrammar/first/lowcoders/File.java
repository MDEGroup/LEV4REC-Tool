/**
 * generated by Xtext 2.29.0
 */
package org.xtext.lev4recgrammar.first.lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.File#getSourcePath <em>Source Path</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.File#getEncoding <em>Encoding</em>}</li>
 * </ul>
 *
 * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getFile()
 * @model
 * @generated
 */
public interface File extends DataSource
{
  /**
   * Returns the value of the '<em><b>Source Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Path</em>' attribute.
   * @see #setSourcePath(String)
   * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getFile_SourcePath()
   * @model
   * @generated
   */
  String getSourcePath();

  /**
   * Sets the value of the '{@link org.xtext.lev4recgrammar.first.lowcoders.File#getSourcePath <em>Source Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Path</em>' attribute.
   * @see #getSourcePath()
   * @generated
   */
  void setSourcePath(String value);

  /**
   * Returns the value of the '<em><b>Encoding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Encoding</em>' attribute.
   * @see #setEncoding(String)
   * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getFile_Encoding()
   * @model
   * @generated
   */
  String getEncoding();

  /**
   * Sets the value of the '{@link org.xtext.lev4recgrammar.first.lowcoders.File#getEncoding <em>Encoding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Encoding</em>' attribute.
   * @see #getEncoding()
   * @generated
   */
  void setEncoding(String value);

} // File
