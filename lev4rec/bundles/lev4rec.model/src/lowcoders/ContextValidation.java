/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Validation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.ContextValidation#getTestContext <em>Test Context</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getContextValidation()
 * @model
 * @generated
 */
public interface ContextValidation extends ValidationTechnique {
	/**
	 * Returns the value of the '<em><b>Test Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Context</em>' reference.
	 * @see #setTestContext(RecommendationContext)
	 * @see lowcoders.LowcodersPackage#getContextValidation_TestContext()
	 * @model
	 * @generated
	 */
	RecommendationContext getTestContext();

	/**
	 * Sets the value of the '{@link lowcoders.ContextValidation#getTestContext <em>Test Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Context</em>' reference.
	 * @see #getTestContext()
	 * @generated
	 */
	void setTestContext(RecommendationContext value);

} // ContextValidation
