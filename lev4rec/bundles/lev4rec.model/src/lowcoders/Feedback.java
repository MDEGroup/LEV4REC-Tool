/**
 */
package lowcoders;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.Feedback#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getFeedback()
 * @model abstract="true"
 * @generated
 */
public interface Feedback extends EObject {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(RecommendedItem)
	 * @see lowcoders.LowcodersPackage#getFeedback_Item()
	 * @model containment="true"
	 * @generated
	 */
	RecommendedItem getItem();

	/**
	 * Sets the value of the '{@link lowcoders.Feedback#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(RecommendedItem value);

} // Feedback
