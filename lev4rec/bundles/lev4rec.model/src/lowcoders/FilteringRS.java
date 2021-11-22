/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filtering RS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.FilteringRS#getFilteringRSAlgorithm <em>Filtering RS Algorithm</em>}</li>
 *   <li>{@link lowcoders.FilteringRS#getSimilarityCalculator <em>Similarity Calculator</em>}</li>
 *   <li>{@link lowcoders.FilteringRS#getCutoff <em>Cutoff</em>}</li>
 *   <li>{@link lowcoders.FilteringRS#getNeighborhood <em>Neighborhood</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getFilteringRS()
 * @model
 * @generated
 */
public interface FilteringRS extends RecommendationSystem {
	/**
	 * Returns the value of the '<em><b>Filtering RS Algorithm</b></em>' attribute.
	 * The literals are from the enumeration {@link lowcoders.FilteringRSAlgorithm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filtering RS Algorithm</em>' attribute.
	 * @see lowcoders.FilteringRSAlgorithm
	 * @see #setFilteringRSAlgorithm(FilteringRSAlgorithm)
	 * @see lowcoders.LowcodersPackage#getFilteringRS_FilteringRSAlgorithm()
	 * @model
	 * @generated
	 */
	FilteringRSAlgorithm getFilteringRSAlgorithm();

	/**
	 * Sets the value of the '{@link lowcoders.FilteringRS#getFilteringRSAlgorithm <em>Filtering RS Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filtering RS Algorithm</em>' attribute.
	 * @see lowcoders.FilteringRSAlgorithm
	 * @see #getFilteringRSAlgorithm()
	 * @generated
	 */
	void setFilteringRSAlgorithm(FilteringRSAlgorithm value);

	/**
	 * Returns the value of the '<em><b>Similarity Calculator</b></em>' attribute.
	 * The literals are from the enumeration {@link lowcoders.SimilarityFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Similarity Calculator</em>' attribute.
	 * @see lowcoders.SimilarityFunction
	 * @see #setSimilarityCalculator(SimilarityFunction)
	 * @see lowcoders.LowcodersPackage#getFilteringRS_SimilarityCalculator()
	 * @model
	 * @generated
	 */
	SimilarityFunction getSimilarityCalculator();

	/**
	 * Sets the value of the '{@link lowcoders.FilteringRS#getSimilarityCalculator <em>Similarity Calculator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Similarity Calculator</em>' attribute.
	 * @see lowcoders.SimilarityFunction
	 * @see #getSimilarityCalculator()
	 * @generated
	 */
	void setSimilarityCalculator(SimilarityFunction value);

	/**
	 * Returns the value of the '<em><b>Cutoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cutoff</em>' attribute.
	 * @see #setCutoff(int)
	 * @see lowcoders.LowcodersPackage#getFilteringRS_Cutoff()
	 * @model
	 * @generated
	 */
	int getCutoff();

	/**
	 * Sets the value of the '{@link lowcoders.FilteringRS#getCutoff <em>Cutoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cutoff</em>' attribute.
	 * @see #getCutoff()
	 * @generated
	 */
	void setCutoff(int value);

	/**
	 * Returns the value of the '<em><b>Neighborhood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neighborhood</em>' attribute.
	 * @see #setNeighborhood(int)
	 * @see lowcoders.LowcodersPackage#getFilteringRS_Neighborhood()
	 * @model
	 * @generated
	 */
	int getNeighborhood();

	/**
	 * Sets the value of the '{@link lowcoders.FilteringRS#getNeighborhood <em>Neighborhood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neighborhood</em>' attribute.
	 * @see #getNeighborhood()
	 * @generated
	 */
	void setNeighborhood(int value);

} // FilteringRS
