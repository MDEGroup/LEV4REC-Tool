/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.WebApplication#getLibrary <em>Library</em>}</li>
 *   <li>{@link lowcoders.WebApplication#getPort <em>Port</em>}</li>
 *   <li>{@link lowcoders.WebApplication#getHost <em>Host</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getWebApplication()
 * @model
 * @generated
 */
public interface WebApplication extends NamedElement, PresentationLayer {

	/**
	 * Returns the value of the '<em><b>Library</b></em>' attribute.
	 * The literals are from the enumeration {@link lowcoders.WebInterfaceLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' attribute.
	 * @see lowcoders.WebInterfaceLibrary
	 * @see #setLibrary(WebInterfaceLibrary)
	 * @see lowcoders.LowcodersPackage#getWebApplication_Library()
	 * @model
	 * @generated
	 */
	WebInterfaceLibrary getLibrary();

	/**
	 * Sets the value of the '{@link lowcoders.WebApplication#getLibrary <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' attribute.
	 * @see lowcoders.WebInterfaceLibrary
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(WebInterfaceLibrary value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(String)
	 * @see lowcoders.LowcodersPackage#getWebApplication_Port()
	 * @model
	 * @generated
	 */
	String getPort();

	/**
	 * Sets the value of the '{@link lowcoders.WebApplication#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(String value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see lowcoders.LowcodersPackage#getWebApplication_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link lowcoders.WebApplication#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);
} // WebApplication
