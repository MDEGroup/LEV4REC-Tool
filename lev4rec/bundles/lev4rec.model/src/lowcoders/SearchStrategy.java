/**
 */
package lowcoders;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Search Strategy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lowcoders.LowcodersPackage#getSearchStrategy()
 * @model
 * @generated
 */
public enum SearchStrategy implements Enumerator {
	/**
	 * The '<em><b>SIMULATED ANNELING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMULATED_ANNELING_VALUE
	 * @generated
	 * @ordered
	 */
	SIMULATED_ANNELING(0, "SIMULATED_ANNELING", "SIMULATED_ANNELING"),

	/**
	 * The '<em><b>HILL CLIMBING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HILL_CLIMBING_VALUE
	 * @generated
	 * @ordered
	 */
	HILL_CLIMBING(1, "HILL_CLIMBING", "HILL_CLIMBING"),

	/**
	 * The '<em><b>GRADIENT DESCENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRADIENT_DESCENT_VALUE
	 * @generated
	 * @ordered
	 */
	GRADIENT_DESCENT(2, "GRADIENT_DESCENT", "GRADIENT_DESCENT"),

	/**
	 * The '<em><b>EGGHOLDER FUNCTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EGGHOLDER_FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	EGGHOLDER_FUNCTION(3, "EGGHOLDER_FUNCTION", "EGGHOLDER_FUNCTION");

	/**
	 * The '<em><b>SIMULATED ANNELING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMULATED_ANNELING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIMULATED_ANNELING_VALUE = 0;

	/**
	 * The '<em><b>HILL CLIMBING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HILL_CLIMBING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HILL_CLIMBING_VALUE = 1;

	/**
	 * The '<em><b>GRADIENT DESCENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRADIENT_DESCENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRADIENT_DESCENT_VALUE = 2;

	/**
	 * The '<em><b>EGGHOLDER FUNCTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EGGHOLDER_FUNCTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EGGHOLDER_FUNCTION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Search Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SearchStrategy[] VALUES_ARRAY =
		new SearchStrategy[] {
			SIMULATED_ANNELING,
			HILL_CLIMBING,
			GRADIENT_DESCENT,
			EGGHOLDER_FUNCTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Search Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SearchStrategy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Search Strategy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SearchStrategy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SearchStrategy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Search Strategy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SearchStrategy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SearchStrategy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Search Strategy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SearchStrategy get(int value) {
		switch (value) {
			case SIMULATED_ANNELING_VALUE: return SIMULATED_ANNELING;
			case HILL_CLIMBING_VALUE: return HILL_CLIMBING;
			case GRADIENT_DESCENT_VALUE: return GRADIENT_DESCENT;
			case EGGHOLDER_FUNCTION_VALUE: return EGGHOLDER_FUNCTION;
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
	private SearchStrategy(int value, String name, String literal) {
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
	
} //SearchStrategy
