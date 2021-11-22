/**
 */
package lowcoders;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mutation Operation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lowcoders.LowcodersPackage#getMutationOperation()
 * @model
 * @generated
 */
public enum MutationOperation implements Enumerator {
	/**
	 * The '<em><b>FIT BIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIT_BIT_VALUE
	 * @generated
	 * @ordered
	 */
	FIT_BIT(0, "FIT_BIT", "FIT_BIT"),

	/**
	 * The '<em><b>CROSSOVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CROSSOVER_VALUE
	 * @generated
	 * @ordered
	 */
	CROSSOVER(1, "CROSSOVER", "CROSSOVER"),

	/**
	 * The '<em><b>SHRINK MUTATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHRINK_MUTATION_VALUE
	 * @generated
	 * @ordered
	 */
	SHRINK_MUTATION(2, "SHRINK_MUTATION", "SHRINK_MUTATION"),

	/**
	 * The '<em><b>REPACE MUTATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPACE_MUTATION_VALUE
	 * @generated
	 * @ordered
	 */
	REPACE_MUTATION(3, "REPACE_MUTATION", "REPACE_MUTATION"),

	/**
	 * The '<em><b>PARTIAL HYPER MUTATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIAL_HYPER_MUTATION_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIAL_HYPER_MUTATION(4, "PARTIAL_HYPER_MUTATION", "PARTIAL_HYPER_MUTATION"),

	/**
	 * The '<em><b>DUPLICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUPLICATION_VALUE
	 * @generated
	 * @ordered
	 */
	DUPLICATION(5, "DUPLICATION", "DUPLICATION");

	/**
	 * The '<em><b>FIT BIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIT_BIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIT_BIT_VALUE = 0;

	/**
	 * The '<em><b>CROSSOVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CROSSOVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CROSSOVER_VALUE = 1;

	/**
	 * The '<em><b>SHRINK MUTATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHRINK_MUTATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHRINK_MUTATION_VALUE = 2;

	/**
	 * The '<em><b>REPACE MUTATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPACE_MUTATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REPACE_MUTATION_VALUE = 3;

	/**
	 * The '<em><b>PARTIAL HYPER MUTATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIAL_HYPER_MUTATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARTIAL_HYPER_MUTATION_VALUE = 4;

	/**
	 * The '<em><b>DUPLICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUPLICATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DUPLICATION_VALUE = 5;

	/**
	 * An array of all the '<em><b>Mutation Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MutationOperation[] VALUES_ARRAY =
		new MutationOperation[] {
			FIT_BIT,
			CROSSOVER,
			SHRINK_MUTATION,
			REPACE_MUTATION,
			PARTIAL_HYPER_MUTATION,
			DUPLICATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Mutation Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MutationOperation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mutation Operation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MutationOperation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MutationOperation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mutation Operation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MutationOperation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MutationOperation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mutation Operation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MutationOperation get(int value) {
		switch (value) {
			case FIT_BIT_VALUE: return FIT_BIT;
			case CROSSOVER_VALUE: return CROSSOVER;
			case SHRINK_MUTATION_VALUE: return SHRINK_MUTATION;
			case REPACE_MUTATION_VALUE: return REPACE_MUTATION;
			case PARTIAL_HYPER_MUTATION_VALUE: return PARTIAL_HYPER_MUTATION;
			case DUPLICATION_VALUE: return DUPLICATION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MutationOperation(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //MutationOperation
