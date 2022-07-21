/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.User#getExpressedFeedback <em>Expressed Feedback</em>}</li>
 *   <li>{@link lowcoders.User#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getUser()
 * @model
 * @generated
 */
public interface User extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Expressed Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressed Feedback</em>' reference.
	 * @see #setExpressedFeedback(Feedback)
	 * @see lowcoders.LowcodersPackage#getUser_ExpressedFeedback()
	 * @model
	 * @generated
	 */
	Feedback getExpressedFeedback();

	/**
	 * Sets the value of the '{@link lowcoders.User#getExpressedFeedback <em>Expressed Feedback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expressed Feedback</em>' reference.
	 * @see #getExpressedFeedback()
	 * @generated
	 */
	void setExpressedFeedback(Feedback value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' reference.
	 * @see #setQuery(RecommendationContext)
	 * @see lowcoders.LowcodersPackage#getUser_Query()
	 * @model
	 * @generated
	 */
	RecommendationContext getQuery();

	/**
	 * Sets the value of the '{@link lowcoders.User#getQuery <em>Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(RecommendationContext value);

} // User
