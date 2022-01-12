/**
 */
package lowcoders;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recommendation Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.RecommendationUsage#getUsageType <em>Usage Type</em>}</li>
 *   <li>{@link lowcoders.RecommendationUsage#getRecommendedItems <em>Recommended Items</em>}</li>
 *   <li>{@link lowcoders.RecommendationUsage#getGuielements <em>Guielements</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getRecommendationUsage()
 * @model
 * @generated
 */
public interface RecommendationUsage extends EObject {
	/**
	 * Returns the value of the '<em><b>Usage Type</b></em>' attribute.
	 * The literals are from the enumeration {@link lowcoders.RecommendationUsageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Type</em>' attribute.
	 * @see lowcoders.RecommendationUsageType
	 * @see #setUsageType(RecommendationUsageType)
	 * @see lowcoders.LowcodersPackage#getRecommendationUsage_UsageType()
	 * @model
	 * @generated
	 */
	RecommendationUsageType getUsageType();

	/**
	 * Sets the value of the '{@link lowcoders.RecommendationUsage#getUsageType <em>Usage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Type</em>' attribute.
	 * @see lowcoders.RecommendationUsageType
	 * @see #getUsageType()
	 * @generated
	 */
	void setUsageType(RecommendationUsageType value);

	/**
	 * Returns the value of the '<em><b>Recommended Items</b></em>' reference list.
	 * The list contents are of type {@link lowcoders.RecommendedItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommended Items</em>' reference list.
	 * @see lowcoders.LowcodersPackage#getRecommendationUsage_RecommendedItems()
	 * @model
	 * @generated
	 */
	EList<RecommendedItem> getRecommendedItems();

	/**
	 * Returns the value of the '<em><b>Guielements</b></em>' containment reference list.
	 * The list contents are of type {@link lowcoders.GUIElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guielements</em>' containment reference list.
	 * @see lowcoders.LowcodersPackage#getRecommendationUsage_Guielements()
	 * @model containment="true"
	 * @generated
	 */
	EList<GUIElement> getGuielements();

} // RecommendationUsage
