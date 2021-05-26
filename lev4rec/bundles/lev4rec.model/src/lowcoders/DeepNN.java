/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deep NN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.DeepNN#getNumHiddenLayer <em>Num Hidden Layer</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getDeepNN()
 * @model
 * @generated
 */
public interface DeepNN extends MachineLearningBasedRS {
	/**
	 * Returns the value of the '<em><b>Num Hidden Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Hidden Layer</em>' attribute.
	 * @see #setNumHiddenLayer(int)
	 * @see lowcoders.LowcodersPackage#getDeepNN_NumHiddenLayer()
	 * @model
	 * @generated
	 */
	int getNumHiddenLayer();

	/**
	 * Sets the value of the '{@link lowcoders.DeepNN#getNumHiddenLayer <em>Num Hidden Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Hidden Layer</em>' attribute.
	 * @see #getNumHiddenLayer()
	 * @generated
	 */
	void setNumHiddenLayer(int value);

} // DeepNN
