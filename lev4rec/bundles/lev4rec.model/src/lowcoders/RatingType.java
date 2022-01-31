/**
 */
package lowcoders;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Rating Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lowcoders.LowcodersPackage#getRatingType()
 * @model
 * @generated
 */
public enum RatingType implements Enumerator {
	/**
	 * The '<em><b>POSITIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	POSITIVE(0, "POSITIVE", "POSITIVE"),

	/**
	 * The '<em><b>NEGATIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	NEGATIVE(1, "NEGATIVE", "NEGATIVE"),

	/**
	 * The '<em><b>NUMERICAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERICAL_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERICAL(2, "NUMERICAL", "NUMERICAL"),

	/**
	 * The '<em><b>ORDINAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDINAL_VALUE
	 * @generated
	 * @ordered
	 */
	ORDINAL(3, "ORDINAL", "ORDINAL"),

	/**
	 * The '<em><b>UNARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNARY_VALUE
	 * @generated
	 * @ordered
	 */
	UNARY(4, "UNARY", "UNARY");

	/**
	 * The '<em><b>POSITIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POSITIVE_VALUE = 0;

	/**
	 * The '<em><b>NEGATIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGATIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEGATIVE_VALUE = 1;

	/**
	 * The '<em><b>NUMERICAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERICAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUMERICAL_VALUE = 2;

	/**
	 * The '<em><b>ORDINAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDINAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORDINAL_VALUE = 3;

	/**
	 * The '<em><b>UNARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNARY_VALUE = 4;

	/**
	 * An array of all the '<em><b>Rating Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RatingType[] VALUES_ARRAY =
		new RatingType[] {
			POSITIVE,
			NEGATIVE,
			NUMERICAL,
			ORDINAL,
			UNARY,
		};

	/**
	 * A public read-only list of all the '<em><b>Rating Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RatingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Rating Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RatingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RatingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rating Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RatingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RatingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rating Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RatingType get(int value) {
		switch (value) {
			case POSITIVE_VALUE: return POSITIVE;
			case NEGATIVE_VALUE: return NEGATIVE;
			case NUMERICAL_VALUE: return NUMERICAL;
			case ORDINAL_VALUE: return ORDINAL;
			case UNARY_VALUE: return UNARY;
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
	private RatingType(int value, String name, String literal) {
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
	
} //RatingType
