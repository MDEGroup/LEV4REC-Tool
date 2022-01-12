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
 *   <li>{@link lowcoders.RecommendationSystem#getSettings <em>Settings</em>}</li>
 *   <li>{@link lowcoders.RecommendationSystem#getScope <em>Scope</em>}</li>
 *   <li>{@link lowcoders.RecommendationSystem#getContext <em>Context</em>}</li>
 *   <li>{@link lowcoders.RecommendationSystem#getGenerator <em>Generator</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getRecommendationSystem()
 * @model abstract="true"
 * @generated
 */
public interface RecommendationSystem extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Settings</b></em>' containment reference list.
	 * The list contents are of type {@link lowcoders.RecommendationSetting}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' containment reference list.
	 * @see lowcoders.LowcodersPackage#getRecommendationSystem_Settings()
	 * @model containment="true"
	 * @generated
	 */
	EList<RecommendationSetting> getSettings();

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(RecommendedItem)
	 * @see lowcoders.LowcodersPackage#getRecommendationSystem_Scope()
	 * @model containment="true"
	 * @generated
	 */
	RecommendedItem getScope();

	/**
	 * Sets the value of the '{@link lowcoders.RecommendationSystem#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(RecommendedItem value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(RecommendationContext)
	 * @see lowcoders.LowcodersPackage#getRecommendationSystem_Context()
	 * @model containment="true"
	 * @generated
	 */
	RecommendationContext getContext();

	/**
	 * Sets the value of the '{@link lowcoders.RecommendationSystem#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(RecommendationContext value);

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
