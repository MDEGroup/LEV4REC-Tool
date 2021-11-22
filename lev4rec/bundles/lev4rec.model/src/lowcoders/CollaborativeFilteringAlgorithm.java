/**
 */
package lowcoders;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Collaborative Filtering Algorithm</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lowcoders.LowcodersPackage#getCollaborativeFilteringAlgorithm()
 * @model
 * @generated
 */
public enum CollaborativeFilteringAlgorithm implements Enumerator {
	/**
	 * The '<em><b>Item Based</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITEM_BASED_VALUE
	 * @generated
	 * @ordered
	 */
	ITEM_BASED(0, "itemBased", "itemBased"),

	/**
	 * The '<em><b>User Based</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_BASED_VALUE
	 * @generated
	 * @ordered
	 */
	USER_BASED(1, "userBased", "userBased"),

	/**
	 * The '<em><b>Content Based</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTENT_BASED_VALUE
	 * @generated
	 * @ordered
	 */
	CONTENT_BASED(2, "contentBased", "contentBased");

	/**
	 * The '<em><b>Item Based</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITEM_BASED
	 * @model name="itemBased"
	 * @generated
	 * @ordered
	 */
	public static final int ITEM_BASED_VALUE = 0;

	/**
	 * The '<em><b>User Based</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_BASED
	 * @model name="userBased"
	 * @generated
	 * @ordered
	 */
	public static final int USER_BASED_VALUE = 1;

	/**
	 * The '<em><b>Content Based</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTENT_BASED
	 * @model name="contentBased"
	 * @generated
	 * @ordered
	 */
	public static final int CONTENT_BASED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Collaborative Filtering Algorithm</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CollaborativeFilteringAlgorithm[] VALUES_ARRAY =
		new CollaborativeFilteringAlgorithm[] {
			ITEM_BASED,
			USER_BASED,
			CONTENT_BASED,
		};

	/**
	 * A public read-only list of all the '<em><b>Collaborative Filtering Algorithm</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CollaborativeFilteringAlgorithm> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Collaborative Filtering Algorithm</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CollaborativeFilteringAlgorithm get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CollaborativeFilteringAlgorithm result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Collaborative Filtering Algorithm</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CollaborativeFilteringAlgorithm getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CollaborativeFilteringAlgorithm result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Collaborative Filtering Algorithm</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CollaborativeFilteringAlgorithm get(int value) {
		switch (value) {
			case ITEM_BASED_VALUE: return ITEM_BASED;
			case USER_BASED_VALUE: return USER_BASED;
			case CONTENT_BASED_VALUE: return CONTENT_BASED;
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
	private CollaborativeFilteringAlgorithm(int value, String name, String literal) {
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
	
} //CollaborativeFilteringAlgorithm
