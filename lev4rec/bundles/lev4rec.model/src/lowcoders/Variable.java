/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.Variable#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link lowcoders.Variable#getPreprocessing <em>Preprocessing</em>}</li>
 *   <li>{@link lowcoders.Variable#getType <em>Type</em>}</li>
 *   <li>{@link lowcoders.Variable#isIsMissingValueAllowed <em>Is Missing Value Allowed</em>}</li>
 *   <li>{@link lowcoders.Variable#isIsMultiple <em>Is Multiple</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' containment reference.
	 * @see #setDataSource(DataSource)
	 * @see lowcoders.LowcodersPackage#getVariable_DataSource()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link lowcoders.Variable#getDataSource <em>Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' containment reference.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

	/**
	 * Returns the value of the '<em><b>Preprocessing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preprocessing</em>' containment reference.
	 * @see #setPreprocessing(Preprocessing)
	 * @see lowcoders.LowcodersPackage#getVariable_Preprocessing()
	 * @model containment="true"
	 * @generated
	 */
	Preprocessing getPreprocessing();

	/**
	 * Sets the value of the '{@link lowcoders.Variable#getPreprocessing <em>Preprocessing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preprocessing</em>' containment reference.
	 * @see #getPreprocessing()
	 * @generated
	 */
	void setPreprocessing(Preprocessing value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link lowcoders.VariableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see lowcoders.VariableType
	 * @see #setType(VariableType)
	 * @see lowcoders.LowcodersPackage#getVariable_Type()
	 * @model required="true"
	 * @generated
	 */
	VariableType getType();

	/**
	 * Sets the value of the '{@link lowcoders.Variable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see lowcoders.VariableType
	 * @see #getType()
	 * @generated
	 */
	void setType(VariableType value);

	/**
	 * Returns the value of the '<em><b>Is Missing Value Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Missing Value Allowed</em>' attribute.
	 * @see #setIsMissingValueAllowed(boolean)
	 * @see lowcoders.LowcodersPackage#getVariable_IsMissingValueAllowed()
	 * @model
	 * @generated
	 */
	boolean isIsMissingValueAllowed();

	/**
	 * Sets the value of the '{@link lowcoders.Variable#isIsMissingValueAllowed <em>Is Missing Value Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Missing Value Allowed</em>' attribute.
	 * @see #isIsMissingValueAllowed()
	 * @generated
	 */
	void setIsMissingValueAllowed(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Multiple</em>' attribute.
	 * @see #setIsMultiple(boolean)
	 * @see lowcoders.LowcodersPackage#getVariable_IsMultiple()
	 * @model
	 * @generated
	 */
	boolean isIsMultiple();

	/**
	 * Sets the value of the '{@link lowcoders.Variable#isIsMultiple <em>Is Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multiple</em>' attribute.
	 * @see #isIsMultiple()
	 * @generated
	 */
	void setIsMultiple(boolean value);

} // Variable
