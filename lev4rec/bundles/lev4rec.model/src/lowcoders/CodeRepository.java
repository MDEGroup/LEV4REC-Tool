/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.CodeRepository#isMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getCodeRepository()
 * @model
 * @generated
 */
public interface CodeRepository extends DataSource {
	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' attribute.
	 * @see #setMetadata(boolean)
	 * @see lowcoders.LowcodersPackage#getCodeRepository_Metadata()
	 * @model
	 * @generated
	 */
	boolean isMetadata();

	/**
	 * Sets the value of the '{@link lowcoders.CodeRepository#isMetadata <em>Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' attribute.
	 * @see #isMetadata()
	 * @generated
	 */
	void setMetadata(boolean value);

} // CodeRepository
