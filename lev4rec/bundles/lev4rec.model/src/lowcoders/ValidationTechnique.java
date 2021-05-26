/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation Technique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.ValidationTechnique#getNOfRecommendations <em>NOf Recommendations</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getValidationTechnique()
 * @model abstract="true"
 * @generated
 */
public interface ValidationTechnique extends NamedElement {
	/**
	 * Returns the value of the '<em><b>NOf Recommendations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NOf Recommendations</em>' attribute.
	 * @see #setNOfRecommendations(int)
	 * @see lowcoders.LowcodersPackage#getValidationTechnique_NOfRecommendations()
	 * @model required="true"
	 * @generated
	 */
	int getNOfRecommendations();

	/**
	 * Sets the value of the '{@link lowcoders.ValidationTechnique#getNOfRecommendations <em>NOf Recommendations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NOf Recommendations</em>' attribute.
	 * @see #getNOfRecommendations()
	 * @generated
	 */
	void setNOfRecommendations(int value);

} // ValidationTechnique
