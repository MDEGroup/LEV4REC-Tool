/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feed Forward NN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.FeedForwardNN#getSolver <em>Solver</em>}</li>
 *   <li>{@link lowcoders.FeedForwardNN#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link lowcoders.FeedForwardNN#getActivationFunction <em>Activation Function</em>}</li>
 *   <li>{@link lowcoders.FeedForwardNN#getRandomState <em>Random State</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getFeedForwardNN()
 * @model
 * @generated
 */
public interface FeedForwardNN extends MachineLearningBasedRS {
	/**
	 * Returns the value of the '<em><b>Solver</b></em>' attribute.
	 * The literals are from the enumeration {@link lowcoders.SolverType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver</em>' attribute.
	 * @see lowcoders.SolverType
	 * @see #setSolver(SolverType)
	 * @see lowcoders.LowcodersPackage#getFeedForwardNN_Solver()
	 * @model
	 * @generated
	 */
	SolverType getSolver();

	/**
	 * Sets the value of the '{@link lowcoders.FeedForwardNN#getSolver <em>Solver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver</em>' attribute.
	 * @see lowcoders.SolverType
	 * @see #getSolver()
	 * @generated
	 */
	void setSolver(SolverType value);

	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' attribute.
	 * @see #setAlpha(float)
	 * @see lowcoders.LowcodersPackage#getFeedForwardNN_Alpha()
	 * @model
	 * @generated
	 */
	float getAlpha();

	/**
	 * Sets the value of the '{@link lowcoders.FeedForwardNN#getAlpha <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' attribute.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(float value);

	/**
	 * Returns the value of the '<em><b>Activation Function</b></em>' attribute.
	 * The literals are from the enumeration {@link lowcoders.ActivationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Function</em>' attribute.
	 * @see lowcoders.ActivationType
	 * @see #setActivationFunction(ActivationType)
	 * @see lowcoders.LowcodersPackage#getFeedForwardNN_ActivationFunction()
	 * @model
	 * @generated
	 */
	ActivationType getActivationFunction();

	/**
	 * Sets the value of the '{@link lowcoders.FeedForwardNN#getActivationFunction <em>Activation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Function</em>' attribute.
	 * @see lowcoders.ActivationType
	 * @see #getActivationFunction()
	 * @generated
	 */
	void setActivationFunction(ActivationType value);

	/**
	 * Returns the value of the '<em><b>Random State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Random State</em>' attribute.
	 * @see #setRandomState(int)
	 * @see lowcoders.LowcodersPackage#getFeedForwardNN_RandomState()
	 * @model
	 * @generated
	 */
	int getRandomState();

	/**
	 * Sets the value of the '{@link lowcoders.FeedForwardNN#getRandomState <em>Random State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Random State</em>' attribute.
	 * @see #getRandomState()
	 * @generated
	 */
	void setRandomState(int value);

} // FeedForwardNN
