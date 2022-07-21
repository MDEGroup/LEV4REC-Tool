/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rating</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.Rating#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getRating()
 * @model
 * @generated
 */
public interface Rating extends ExplicitFeedback {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link lowcoders.RatingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see lowcoders.RatingType
	 * @see #setType(RatingType)
	 * @see lowcoders.LowcodersPackage#getRating_Type()
	 * @model
	 * @generated
	 */
	RatingType getType();

	/**
	 * Sets the value of the '{@link lowcoders.Rating#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see lowcoders.RatingType
	 * @see #getType()
	 * @generated
	 */
	void setType(RatingType value);

} // Rating
