/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Genetic Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.GeneticAlgorithm#getFitnessFunction <em>Fitness Function</em>}</li>
 *   <li>{@link lowcoders.GeneticAlgorithm#getSearchStrategy <em>Search Strategy</em>}</li>
 *   <li>{@link lowcoders.GeneticAlgorithm#getMutationOperator <em>Mutation Operator</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getGeneticAlgorithm()
 * @model
 * @generated
 */
public interface GeneticAlgorithm extends RecommendationSystem {
	/**
	 * Returns the value of the '<em><b>Fitness Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fitness Function</em>' attribute.
	 * @see #setFitnessFunction(String)
	 * @see lowcoders.LowcodersPackage#getGeneticAlgorithm_FitnessFunction()
	 * @model
	 * @generated
	 */
	String getFitnessFunction();

	/**
	 * Sets the value of the '{@link lowcoders.GeneticAlgorithm#getFitnessFunction <em>Fitness Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fitness Function</em>' attribute.
	 * @see #getFitnessFunction()
	 * @generated
	 */
	void setFitnessFunction(String value);

	/**
	 * Returns the value of the '<em><b>Search Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link lowcoders.SearchStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Strategy</em>' attribute.
	 * @see lowcoders.SearchStrategy
	 * @see #setSearchStrategy(SearchStrategy)
	 * @see lowcoders.LowcodersPackage#getGeneticAlgorithm_SearchStrategy()
	 * @model
	 * @generated
	 */
	SearchStrategy getSearchStrategy();

	/**
	 * Sets the value of the '{@link lowcoders.GeneticAlgorithm#getSearchStrategy <em>Search Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Strategy</em>' attribute.
	 * @see lowcoders.SearchStrategy
	 * @see #getSearchStrategy()
	 * @generated
	 */
	void setSearchStrategy(SearchStrategy value);

	/**
	 * Returns the value of the '<em><b>Mutation Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link lowcoders.MutationOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutation Operator</em>' attribute.
	 * @see lowcoders.MutationOperation
	 * @see #setMutationOperator(MutationOperation)
	 * @see lowcoders.LowcodersPackage#getGeneticAlgorithm_MutationOperator()
	 * @model
	 * @generated
	 */
	MutationOperation getMutationOperator();

	/**
	 * Sets the value of the '{@link lowcoders.GeneticAlgorithm#getMutationOperator <em>Mutation Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutation Operator</em>' attribute.
	 * @see lowcoders.MutationOperation
	 * @see #getMutationOperator()
	 * @generated
	 */
	void setMutationOperator(MutationOperation value);

} // GeneticAlgorithm
