/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automated Validation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.AutomatedValidation#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getAutomatedValidation()
 * @model
 * @generated
 */
public interface AutomatedValidation extends ValidationTechnique {
	/**
	 * Returns the value of the '<em><b>Library</b></em>' attribute.
	 * The literals are from the enumeration {@link lowcoders.ValidationLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' attribute.
	 * @see lowcoders.ValidationLibrary
	 * @see #setLibrary(ValidationLibrary)
	 * @see lowcoders.LowcodersPackage#getAutomatedValidation_Library()
	 * @model
	 * @generated
	 */
	ValidationLibrary getLibrary();

	/**
	 * Sets the value of the '{@link lowcoders.AutomatedValidation#getLibrary <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' attribute.
	 * @see lowcoders.ValidationLibrary
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(ValidationLibrary value);

} // AutomatedValidation
