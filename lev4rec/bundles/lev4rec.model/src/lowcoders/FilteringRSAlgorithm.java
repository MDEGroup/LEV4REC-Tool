/**
 */
package lowcoders;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Filtering RS Algorithm</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lowcoders.LowcodersPackage#getFilteringRSAlgorithm()
 * @model
 * @generated
 */
public enum FilteringRSAlgorithm implements Enumerator {
	/**
	 * The '<em><b>CONTENT BASED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTENT_BASED_VALUE
	 * @generated
	 * @ordered
	 */
	CONTENT_BASED(0, "CONTENT_BASED", "CONTENT_BASED"),

	/**
	 * The '<em><b>DEMOGRAPHIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEMOGRAPHIC_VALUE
	 * @generated
	 * @ordered
	 */
	DEMOGRAPHIC(1, "DEMOGRAPHIC", "DEMOGRAPHIC"),

	/**
	 * The '<em><b>USER BASED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_BASED_VALUE
	 * @generated
	 * @ordered
	 */
	USER_BASED(2, "USER_BASED", "USER_BASED"),

	/**
	 * The '<em><b>ITEM BASED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITEM_BASED_VALUE
	 * @generated
	 * @ordered
	 */
	ITEM_BASED(3, "ITEM_BASED", "ITEM_BASED"),

	/**
	 * The '<em><b>CONTEXT AWARE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTEXT_AWARE_VALUE
	 * @generated
	 * @ordered
	 */
	CONTEXT_AWARE(4, "CONTEXT_AWARE", "CONTEXT_AWARE"),

	/**
	 * The '<em><b>HYBRID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYBRID_VALUE
	 * @generated
	 * @ordered
	 */
	HYBRID(5, "HYBRID", "HYBRID");

	/**
	 * The '<em><b>CONTENT BASED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTENT_BASED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTENT_BASED_VALUE = 0;

	/**
	 * The '<em><b>DEMOGRAPHIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEMOGRAPHIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEMOGRAPHIC_VALUE = 1;

	/**
	 * The '<em><b>USER BASED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_BASED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USER_BASED_VALUE = 2;

	/**
	 * The '<em><b>ITEM BASED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITEM_BASED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ITEM_BASED_VALUE = 3;

	/**
	 * The '<em><b>CONTEXT AWARE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTEXT_AWARE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTEXT_AWARE_VALUE = 4;

	/**
	 * The '<em><b>HYBRID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYBRID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HYBRID_VALUE = 5;

	/**
	 * An array of all the '<em><b>Filtering RS Algorithm</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FilteringRSAlgorithm[] VALUES_ARRAY =
		new FilteringRSAlgorithm[] {
			CONTENT_BASED,
			DEMOGRAPHIC,
			USER_BASED,
			ITEM_BASED,
			CONTEXT_AWARE,
			HYBRID,
		};

	/**
	 * A public read-only list of all the '<em><b>Filtering RS Algorithm</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FilteringRSAlgorithm> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Filtering RS Algorithm</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FilteringRSAlgorithm get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FilteringRSAlgorithm result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Filtering RS Algorithm</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FilteringRSAlgorithm getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FilteringRSAlgorithm result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Filtering RS Algorithm</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FilteringRSAlgorithm get(int value) {
		switch (value) {
			case CONTENT_BASED_VALUE: return CONTENT_BASED;
			case DEMOGRAPHIC_VALUE: return DEMOGRAPHIC;
			case USER_BASED_VALUE: return USER_BASED;
			case ITEM_BASED_VALUE: return ITEM_BASED;
			case CONTEXT_AWARE_VALUE: return CONTEXT_AWARE;
			case HYBRID_VALUE: return HYBRID;
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
	private FilteringRSAlgorithm(int value, String name, String literal) {
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
	
} //FilteringRSAlgorithm
