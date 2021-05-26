/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.PresentationLayer#getRecommendations <em>Recommendations</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getPresentationLayer()
 * @model abstract="true"
 * @generated
 */
public interface PresentationLayer extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Recommendations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommendations</em>' reference.
	 * @see #setRecommendations(RecommendedItem)
	 * @see lowcoders.LowcodersPackage#getPresentationLayer_Recommendations()
	 * @model
	 * @generated
	 */
	RecommendedItem getRecommendations();

	/**
	 * Sets the value of the '{@link lowcoders.PresentationLayer#getRecommendations <em>Recommendations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recommendations</em>' reference.
	 * @see #getRecommendations()
	 * @generated
	 */
	void setRecommendations(RecommendedItem value);

} // PresentationLayer
