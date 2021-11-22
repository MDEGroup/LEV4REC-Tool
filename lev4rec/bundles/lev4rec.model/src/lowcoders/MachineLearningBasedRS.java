/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Learning Based RS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.MachineLearningBasedRS#getNumEpochs <em>Num Epochs</em>}</li>
 *   <li>{@link lowcoders.MachineLearningBasedRS#getLearningRate <em>Learning Rate</em>}</li>
 *   <li>{@link lowcoders.MachineLearningBasedRS#getMiniBatchSize <em>Mini Batch Size</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getMachineLearningBasedRS()
 * @model
 * @generated
 */
public interface MachineLearningBasedRS extends RecommendationSystem {
	/**
	 * Returns the value of the '<em><b>Num Epochs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Epochs</em>' attribute.
	 * @see #setNumEpochs(int)
	 * @see lowcoders.LowcodersPackage#getMachineLearningBasedRS_NumEpochs()
	 * @model
	 * @generated
	 */
	int getNumEpochs();

	/**
	 * Sets the value of the '{@link lowcoders.MachineLearningBasedRS#getNumEpochs <em>Num Epochs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Epochs</em>' attribute.
	 * @see #getNumEpochs()
	 * @generated
	 */
	void setNumEpochs(int value);

	/**
	 * Returns the value of the '<em><b>Learning Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learning Rate</em>' attribute.
	 * @see #setLearningRate(int)
	 * @see lowcoders.LowcodersPackage#getMachineLearningBasedRS_LearningRate()
	 * @model
	 * @generated
	 */
	int getLearningRate();

	/**
	 * Sets the value of the '{@link lowcoders.MachineLearningBasedRS#getLearningRate <em>Learning Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Learning Rate</em>' attribute.
	 * @see #getLearningRate()
	 * @generated
	 */
	void setLearningRate(int value);

	/**
	 * Returns the value of the '<em><b>Mini Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mini Batch Size</em>' attribute.
	 * @see #setMiniBatchSize(int)
	 * @see lowcoders.LowcodersPackage#getMachineLearningBasedRS_MiniBatchSize()
	 * @model
	 * @generated
	 */
	int getMiniBatchSize();

	/**
	 * Sets the value of the '{@link lowcoders.MachineLearningBasedRS#getMiniBatchSize <em>Mini Batch Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mini Batch Size</em>' attribute.
	 * @see #getMiniBatchSize()
	 * @generated
	 */
	void setMiniBatchSize(int value);

} // MachineLearningBasedRS
