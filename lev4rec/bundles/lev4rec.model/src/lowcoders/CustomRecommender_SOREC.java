/**
 */
package lowcoders;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Recommender SOREC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.CustomRecommender_SOREC#getDescription <em>Description</em>}</li>
 *   <li>{@link lowcoders.CustomRecommender_SOREC#getRequiredTools <em>Required Tools</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getCustomRecommender_SOREC()
 * @model
 * @generated
 */
public interface CustomRecommender_SOREC extends RecommendationSystem {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see lowcoders.LowcodersPackage#getCustomRecommender_SOREC_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link lowcoders.CustomRecommender_SOREC#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Required Tools</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Tools</em>' attribute list.
	 * @see lowcoders.LowcodersPackage#getCustomRecommender_SOREC_RequiredTools()
	 * @model
	 * @generated
	 */
	EList<String> getRequiredTools();

} // CustomRecommender_SOREC
