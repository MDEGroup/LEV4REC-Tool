/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Mining RS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.DataMiningRS#getDataMiningRSAlgorithm <em>Data Mining RS Algorithm</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getDataMiningRS()
 * @model
 * @generated
 */
public interface DataMiningRS extends RecommendationSystem {
	/**
	 * Returns the value of the '<em><b>Data Mining RS Algorithm</b></em>' attribute.
	 * The literals are from the enumeration {@link lowcoders.DataMiningRSAlgorithm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Mining RS Algorithm</em>' attribute.
	 * @see lowcoders.DataMiningRSAlgorithm
	 * @see #setDataMiningRSAlgorithm(DataMiningRSAlgorithm)
	 * @see lowcoders.LowcodersPackage#getDataMiningRS_DataMiningRSAlgorithm()
	 * @model
	 * @generated
	 */
	DataMiningRSAlgorithm getDataMiningRSAlgorithm();

	/**
	 * Sets the value of the '{@link lowcoders.DataMiningRS#getDataMiningRSAlgorithm <em>Data Mining RS Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Mining RS Algorithm</em>' attribute.
	 * @see lowcoders.DataMiningRSAlgorithm
	 * @see #getDataMiningRSAlgorithm()
	 * @generated
	 */
	void setDataMiningRSAlgorithm(DataMiningRSAlgorithm value);

} // DataMiningRS
