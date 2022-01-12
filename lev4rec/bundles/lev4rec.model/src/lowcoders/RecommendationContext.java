/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recommendation Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.RecommendationContext#getUserContext <em>User Context</em>}</li>
 *   <li>{@link lowcoders.RecommendationContext#isIsProactiveSystem <em>Is Proactive System</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getRecommendationContext()
 * @model
 * @generated
 */
public interface RecommendationContext extends NamedElement {
	/**
	 * Returns the value of the '<em><b>User Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Context</em>' reference.
	 * @see #setUserContext(DataStructure)
	 * @see lowcoders.LowcodersPackage#getRecommendationContext_UserContext()
	 * @model
	 * @generated
	 */
	DataStructure getUserContext();

	/**
	 * Sets the value of the '{@link lowcoders.RecommendationContext#getUserContext <em>User Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Context</em>' reference.
	 * @see #getUserContext()
	 * @generated
	 */
	void setUserContext(DataStructure value);

	/**
	 * Returns the value of the '<em><b>Is Proactive System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Proactive System</em>' attribute.
	 * @see #setIsProactiveSystem(boolean)
	 * @see lowcoders.LowcodersPackage#getRecommendationContext_IsProactiveSystem()
	 * @model
	 * @generated
	 */
	boolean isIsProactiveSystem();

	/**
	 * Sets the value of the '{@link lowcoders.RecommendationContext#isIsProactiveSystem <em>Is Proactive System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Proactive System</em>' attribute.
	 * @see #isIsProactiveSystem()
	 * @generated
	 */
	void setIsProactiveSystem(boolean value);

} // RecommendationContext
