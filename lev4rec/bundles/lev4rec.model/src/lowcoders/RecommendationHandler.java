/**
 */
package lowcoders;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recommendation Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.RecommendationHandler#getUsage <em>Usage</em>}</li>
 *   <li>{@link lowcoders.RecommendationHandler#getWebService <em>Web Service</em>}</li>
 *   <li>{@link lowcoders.RecommendationHandler#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getRecommendationHandler()
 * @model
 * @generated
 */
public interface RecommendationHandler extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Usage</b></em>' containment reference list.
	 * The list contents are of type {@link lowcoders.RecommendationUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' containment reference list.
	 * @see lowcoders.LowcodersPackage#getRecommendationHandler_Usage()
	 * @model containment="true"
	 * @generated
	 */
	EList<RecommendationUsage> getUsage();

	/**
	 * Returns the value of the '<em><b>Web Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Service</em>' reference.
	 * @see #setWebService(WebIService)
	 * @see lowcoders.LowcodersPackage#getRecommendationHandler_WebService()
	 * @model
	 * @generated
	 */
	WebIService getWebService();

	/**
	 * Sets the value of the '{@link lowcoders.RecommendationHandler#getWebService <em>Web Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Service</em>' reference.
	 * @see #getWebService()
	 * @generated
	 */
	void setWebService(WebIService value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(RecommendationContext)
	 * @see lowcoders.LowcodersPackage#getRecommendationHandler_Context()
	 * @model
	 * @generated
	 */
	RecommendationContext getContext();

	/**
	 * Sets the value of the '{@link lowcoders.RecommendationHandler#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(RecommendationContext value);

} // RecommendationHandler
