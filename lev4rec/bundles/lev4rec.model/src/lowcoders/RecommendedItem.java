/**
 */
package lowcoders;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recommended Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.RecommendedItem#getOutcame <em>Outcame</em>}</li>
 *   <li>{@link lowcoders.RecommendedItem#isOrdered <em>Ordered</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getRecommendedItem()
 * @model
 * @generated
 */
public interface RecommendedItem extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Outcame</b></em>' reference list.
	 * The list contents are of type {@link lowcoders.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcame</em>' reference list.
	 * @see lowcoders.LowcodersPackage#getRecommendedItem_Outcame()
	 * @model
	 * @generated
	 */
	EList<Variable> getOutcame();

	/**
	 * Returns the value of the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered</em>' attribute.
	 * @see #setOrdered(boolean)
	 * @see lowcoders.LowcodersPackage#getRecommendedItem_Ordered()
	 * @model
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * Sets the value of the '{@link lowcoders.RecommendedItem#isOrdered <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered</em>' attribute.
	 * @see #isOrdered()
	 * @generated
	 */
	void setOrdered(boolean value);

} // RecommendedItem
