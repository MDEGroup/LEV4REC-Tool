/**
 */
package lowcoders;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>RSettings Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lowcoders.LowcodePackage#getRSettingsType()
 * @model
 * @generated
 */
public enum RSettingsType implements Enumerator {
	/**
	 * The '<em><b>SOLVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLVER_VALUE
	 * @generated
	 * @ordered
	 */
	SOLVER(0, "SOLVER", "SOLVER"),

	/**
	 * The '<em><b>ALPHA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALPHA_VALUE
	 * @generated
	 * @ordered
	 */
	ALPHA(1, "ALPHA", "ALPHA"),

	/**
	 * The '<em><b>HIDDEN LAYER SIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIDDEN_LAYER_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	HIDDEN_LAYER_SIZE(2, "HIDDEN_LAYER_SIZE", "HIDDEN_LAYER_SIZE"),

	/**
	 * The '<em><b>RANDOM STATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDOM_STATE_VALUE
	 * @generated
	 * @ordered
	 */
	RANDOM_STATE(3, "RANDOM_STATE", "RANDOM_STATE"),

	/**
	 * The '<em><b>NEIGHBORHOOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEIGHBORHOOD_VALUE
	 * @generated
	 * @ordered
	 */
	NEIGHBORHOOD(4, "NEIGHBORHOOD", "NEIGHBORHOOD"),

	/**
	 * The '<em><b>CUTOFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUTOFF_VALUE
	 * @generated
	 * @ordered
	 */
	CUTOFF(5, "CUTOFF", "CUTOFF");

	/**
	 * The '<em><b>SOLVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOLVER_VALUE = 0;

	/**
	 * The '<em><b>ALPHA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALPHA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALPHA_VALUE = 1;

	/**
	 * The '<em><b>HIDDEN LAYER SIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIDDEN_LAYER_SIZE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIDDEN_LAYER_SIZE_VALUE = 2;

	/**
	 * The '<em><b>RANDOM STATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDOM_STATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RANDOM_STATE_VALUE = 3;

	/**
	 * The '<em><b>NEIGHBORHOOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEIGHBORHOOD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEIGHBORHOOD_VALUE = 4;

	/**
	 * The '<em><b>CUTOFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUTOFF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CUTOFF_VALUE = 5;

	/**
	 * An array of all the '<em><b>RSettings Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RSettingsType[] VALUES_ARRAY =
		new RSettingsType[] {
			SOLVER,
			ALPHA,
			HIDDEN_LAYER_SIZE,
			RANDOM_STATE,
			NEIGHBORHOOD,
			CUTOFF,
		};

	/**
	 * A public read-only list of all the '<em><b>RSettings Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RSettingsType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>RSettings Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RSettingsType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RSettingsType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>RSettings Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RSettingsType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RSettingsType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>RSettings Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RSettingsType get(int value) {
		switch (value) {
			case SOLVER_VALUE: return SOLVER;
			case ALPHA_VALUE: return ALPHA;
			case HIDDEN_LAYER_SIZE_VALUE: return HIDDEN_LAYER_SIZE;
			case RANDOM_STATE_VALUE: return RANDOM_STATE;
			case NEIGHBORHOOD_VALUE: return NEIGHBORHOOD;
			case CUTOFF_VALUE: return CUTOFF;
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
	private RSettingsType(int value, String name, String literal) {
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
	
} //RSettingsType
