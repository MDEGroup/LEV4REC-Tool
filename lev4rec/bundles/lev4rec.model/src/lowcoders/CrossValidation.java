/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cross Validation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.CrossValidation#getNumberOfFold <em>Number Of Fold</em>}</li>
 *   <li>{@link lowcoders.CrossValidation#getGroundTruthExtractor <em>Ground Truth Extractor</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getCrossValidation()
 * @model
 * @generated
 */
public interface CrossValidation extends AutomatedValidation {
	/**
	 * Returns the value of the '<em><b>Number Of Fold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Fold</em>' attribute.
	 * @see #setNumberOfFold(int)
	 * @see lowcoders.LowcodersPackage#getCrossValidation_NumberOfFold()
	 * @model
	 * @generated
	 */
	int getNumberOfFold();

	/**
	 * Sets the value of the '{@link lowcoders.CrossValidation#getNumberOfFold <em>Number Of Fold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Fold</em>' attribute.
	 * @see #getNumberOfFold()
	 * @generated
	 */
	void setNumberOfFold(int value);

	/**
	 * Returns the value of the '<em><b>Ground Truth Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Truth Extractor</em>' containment reference.
	 * @see #setGroundTruthExtractor(GroundTruthExtraction)
	 * @see lowcoders.LowcodersPackage#getCrossValidation_GroundTruthExtractor()
	 * @model containment="true"
	 * @generated
	 */
	GroundTruthExtraction getGroundTruthExtractor();

	/**
	 * Sets the value of the '{@link lowcoders.CrossValidation#getGroundTruthExtractor <em>Ground Truth Extractor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground Truth Extractor</em>' containment reference.
	 * @see #getGroundTruthExtractor()
	 * @generated
	 */
	void setGroundTruthExtractor(GroundTruthExtraction value);

} // CrossValidation
