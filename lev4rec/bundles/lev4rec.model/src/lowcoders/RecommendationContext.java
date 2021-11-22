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
 *   <li>{@link lowcoders.RecommendationContext#getUsercontext <em>Usercontext</em>}</li>
 *   <li>{@link lowcoders.RecommendationContext#isIsProactiveSystem <em>Is Proactive System</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getRecommendationContext()
 * @model
 * @generated
 */
public interface RecommendationContext extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Usercontext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usercontext</em>' reference.
	 * @see #setUsercontext(DataStructure)
	 * @see lowcoders.LowcodersPackage#getRecommendationContext_Usercontext()
	 * @model
	 * @generated
	 */
	DataStructure getUsercontext();

	/**
	 * Sets the value of the '{@link lowcoders.RecommendationContext#getUsercontext <em>Usercontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usercontext</em>' reference.
	 * @see #getUsercontext()
	 * @generated
	 */
	void setUsercontext(DataStructure value);

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
