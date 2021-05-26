/**
 */
package lowcoders.impl;

import lowcoders.GeneticAlgorithm;
import lowcoders.LowcodersPackage;
import lowcoders.MutationOperation;
import lowcoders.SearchStrategy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Genetic Algorithm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.impl.GeneticAlgorithmImpl#getFitnessFunction <em>Fitness Function</em>}</li>
 *   <li>{@link lowcoders.impl.GeneticAlgorithmImpl#getSearchStrategy <em>Search Strategy</em>}</li>
 *   <li>{@link lowcoders.impl.GeneticAlgorithmImpl#getMutationOperator <em>Mutation Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneticAlgorithmImpl extends RecommendationSystemImpl implements GeneticAlgorithm {
	/**
	 * The default value of the '{@link #getFitnessFunction() <em>Fitness Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFitnessFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String FITNESS_FUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFitnessFunction() <em>Fitness Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFitnessFunction()
	 * @generated
	 * @ordered
	 */
	protected String fitnessFunction = FITNESS_FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSearchStrategy() <em>Search Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final SearchStrategy SEARCH_STRATEGY_EDEFAULT = SearchStrategy.SIMULATED_ANNELING;

	/**
	 * The cached value of the '{@link #getSearchStrategy() <em>Search Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchStrategy()
	 * @generated
	 * @ordered
	 */
	protected SearchStrategy searchStrategy = SEARCH_STRATEGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMutationOperator() <em>Mutation Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutationOperator()
	 * @generated
	 * @ordered
	 */
	protected static final MutationOperation MUTATION_OPERATOR_EDEFAULT = MutationOperation.FIT_BIT;

	/**
	 * The cached value of the '{@link #getMutationOperator() <em>Mutation Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutationOperator()
	 * @generated
	 * @ordered
	 */
	protected MutationOperation mutationOperator = MUTATION_OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneticAlgorithmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LowcodersPackage.Literals.GENETIC_ALGORITHM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFitnessFunction() {
		return fitnessFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFitnessFunction(String newFitnessFunction) {
		String oldFitnessFunction = fitnessFunction;
		fitnessFunction = newFitnessFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.GENETIC_ALGORITHM__FITNESS_FUNCTION, oldFitnessFunction, fitnessFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SearchStrategy getSearchStrategy() {
		return searchStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSearchStrategy(SearchStrategy newSearchStrategy) {
		SearchStrategy oldSearchStrategy = searchStrategy;
		searchStrategy = newSearchStrategy == null ? SEARCH_STRATEGY_EDEFAULT : newSearchStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.GENETIC_ALGORITHM__SEARCH_STRATEGY, oldSearchStrategy, searchStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MutationOperation getMutationOperator() {
		return mutationOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMutationOperator(MutationOperation newMutationOperator) {
		MutationOperation oldMutationOperator = mutationOperator;
		mutationOperator = newMutationOperator == null ? MUTATION_OPERATOR_EDEFAULT : newMutationOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.GENETIC_ALGORITHM__MUTATION_OPERATOR, oldMutationOperator, mutationOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LowcodersPackage.GENETIC_ALGORITHM__FITNESS_FUNCTION:
				return getFitnessFunction();
			case LowcodersPackage.GENETIC_ALGORITHM__SEARCH_STRATEGY:
				return getSearchStrategy();
			case LowcodersPackage.GENETIC_ALGORITHM__MUTATION_OPERATOR:
				return getMutationOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LowcodersPackage.GENETIC_ALGORITHM__FITNESS_FUNCTION:
				setFitnessFunction((String)newValue);
				return;
			case LowcodersPackage.GENETIC_ALGORITHM__SEARCH_STRATEGY:
				setSearchStrategy((SearchStrategy)newValue);
				return;
			case LowcodersPackage.GENETIC_ALGORITHM__MUTATION_OPERATOR:
				setMutationOperator((MutationOperation)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LowcodersPackage.GENETIC_ALGORITHM__FITNESS_FUNCTION:
				setFitnessFunction(FITNESS_FUNCTION_EDEFAULT);
				return;
			case LowcodersPackage.GENETIC_ALGORITHM__SEARCH_STRATEGY:
				setSearchStrategy(SEARCH_STRATEGY_EDEFAULT);
				return;
			case LowcodersPackage.GENETIC_ALGORITHM__MUTATION_OPERATOR:
				setMutationOperator(MUTATION_OPERATOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LowcodersPackage.GENETIC_ALGORITHM__FITNESS_FUNCTION:
				return FITNESS_FUNCTION_EDEFAULT == null ? fitnessFunction != null : !FITNESS_FUNCTION_EDEFAULT.equals(fitnessFunction);
			case LowcodersPackage.GENETIC_ALGORITHM__SEARCH_STRATEGY:
				return searchStrategy != SEARCH_STRATEGY_EDEFAULT;
			case LowcodersPackage.GENETIC_ALGORITHM__MUTATION_OPERATOR:
				return mutationOperator != MUTATION_OPERATOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (fitnessFunction: ");
		result.append(fitnessFunction);
		result.append(", searchStrategy: ");
		result.append(searchStrategy);
		result.append(", mutationOperator: ");
		result.append(mutationOperator);
		result.append(')');
		return result.toString();
	}

} //GeneticAlgorithmImpl
