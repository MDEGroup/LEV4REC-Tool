/**
 */
package lowcoders;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.FeedbackComponent#getQuery <em>Query</em>}</li>
 *   <li>{@link lowcoders.FeedbackComponent#getExpressedFeedback <em>Expressed Feedback</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getFeedbackComponent()
 * @model
 * @generated
 */
public interface FeedbackComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(RecommendationContext)
	 * @see lowcoders.LowcodersPackage#getFeedbackComponent_Query()
	 * @model containment="true"
	 * @generated
	 */
	RecommendationContext getQuery();

	/**
	 * Sets the value of the '{@link lowcoders.FeedbackComponent#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(RecommendationContext value);

	/**
	 * Returns the value of the '<em><b>Expressed Feedback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressed Feedback</em>' containment reference.
	 * @see #setExpressedFeedback(Feedback)
	 * @see lowcoders.LowcodersPackage#getFeedbackComponent_ExpressedFeedback()
	 * @model containment="true"
	 * @generated
	 */
	Feedback getExpressedFeedback();

	/**
	 * Sets the value of the '{@link lowcoders.FeedbackComponent#getExpressedFeedback <em>Expressed Feedback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expressed Feedback</em>' containment reference.
	 * @see #getExpressedFeedback()
	 * @generated
	 */
	void setExpressedFeedback(Feedback value);

} // FeedbackComponent
