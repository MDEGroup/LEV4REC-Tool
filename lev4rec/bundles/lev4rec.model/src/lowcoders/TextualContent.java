/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textual Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.TextualContent#getContents <em>Contents</em>}</li>
 *   <li>{@link lowcoders.TextualContent#getRootPath <em>Root Path</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getTextualContent()
 * @model
 * @generated
 */
public interface TextualContent extends DataStructure {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' reference.
	 * @see #setContents(Variable)
	 * @see lowcoders.LowcodersPackage#getTextualContent_Contents()
	 * @model
	 * @generated
	 */
	Variable getContents();

	/**
	 * Sets the value of the '{@link lowcoders.TextualContent#getContents <em>Contents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contents</em>' reference.
	 * @see #getContents()
	 * @generated
	 */
	void setContents(Variable value);

	/**
	 * Returns the value of the '<em><b>Root Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Path</em>' attribute.
	 * @see #setRootPath(String)
	 * @see lowcoders.LowcodersPackage#getTextualContent_RootPath()
	 * @model
	 * @generated
	 */
	String getRootPath();

	/**
	 * Sets the value of the '{@link lowcoders.TextualContent#getRootPath <em>Root Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Path</em>' attribute.
	 * @see #getRootPath()
	 * @generated
	 */
	void setRootPath(String value);

} // TextualContent
