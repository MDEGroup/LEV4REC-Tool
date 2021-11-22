/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.WebInterface#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getWebInterface()
 * @model
 * @generated
 */
public interface WebInterface extends PresentationLayer {
	/**
	 * Returns the value of the '<em><b>Library</b></em>' attribute.
	 * The literals are from the enumeration {@link lowcoders.WebInterfaceLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' attribute.
	 * @see lowcoders.WebInterfaceLibrary
	 * @see #setLibrary(WebInterfaceLibrary)
	 * @see lowcoders.LowcodersPackage#getWebInterface_Library()
	 * @model
	 * @generated
	 */
	WebInterfaceLibrary getLibrary();

	/**
	 * Sets the value of the '{@link lowcoders.WebInterface#getLibrary <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' attribute.
	 * @see lowcoders.WebInterfaceLibrary
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(WebInterfaceLibrary value);

} // WebInterface
