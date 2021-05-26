/**
 */
package lowcoders;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recommendation System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.RecommendationSystem#getRecommenderSettings <em>Recommender Settings</em>}</li>
 *   <li>{@link lowcoders.RecommendationSystem#getRecommendationScope <em>Recommendation Scope</em>}</li>
 *   <li>{@link lowcoders.RecommendationSystem#getRecommendationContext <em>Recommendation Context</em>}</li>
 *   <li>{@link lowcoders.RecommendationSystem#getGenerator <em>Generator</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getRecommendationSystem()
 * @model abstract="true"
 * @generated
 */
public interface RecommendationSystem extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Recommender Settings</b></em>' containment reference list.
	 * The list contents are of type {@link lowcoders.RecommendationSetting}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommender Settings</em>' containment reference list.
	 * @see lowcoders.LowcodersPackage#getRecommendationSystem_RecommenderSettings()
	 * @model containment="true"
	 * @generated
	 */
	EList<RecommendationSetting> getRecommenderSettings();

	/**
	 * Returns the value of the '<em><b>Recommendation Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommendation Scope</em>' containment reference.
	 * @see #setRecommendationScope(RecommendedItem)
	 * @see lowcoders.LowcodersPackage#getRecommendationSystem_RecommendationScope()
	 * @model containment="true"
	 * @generated
	 */
	RecommendedItem getRecommendationScope();

	/**
	 * Sets the value of the '{@link lowcoders.RecommendationSystem#getRecommendationScope <em>Recommendation Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recommendation Scope</em>' containment reference.
	 * @see #getRecommendationScope()
	 * @generated
	 */
	void setRecommendationScope(RecommendedItem value);

	/**
	 * Returns the value of the '<em><b>Recommendation Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommendation Context</em>' containment reference.
	 * @see #setRecommendationContext(RecommendationContext)
	 * @see lowcoders.LowcodersPackage#getRecommendationSystem_RecommendationContext()
	 * @model containment="true"
	 * @generated
	 */
	RecommendationContext getRecommendationContext();

	/**
	 * Sets the value of the '{@link lowcoders.RecommendationSystem#getRecommendationContext <em>Recommendation Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recommendation Context</em>' containment reference.
	 * @see #getRecommendationContext()
	 * @generated
	 */
	void setRecommendationContext(RecommendationContext value);

	/**
	 * Returns the value of the '<em><b>Generator</b></em>' attribute.
	 * The literals are from the enumeration {@link lowcoders.PyLibType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' attribute.
	 * @see lowcoders.PyLibType
	 * @see #setGenerator(PyLibType)
	 * @see lowcoders.LowcodersPackage#getRecommendationSystem_Generator()
	 * @model
	 * @generated
	 */
	PyLibType getGenerator();

	/**
	 * Sets the value of the '{@link lowcoders.RecommendationSystem#getGenerator <em>Generator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' attribute.
	 * @see lowcoders.PyLibType
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(PyLibType value);

} // RecommendationSystem
