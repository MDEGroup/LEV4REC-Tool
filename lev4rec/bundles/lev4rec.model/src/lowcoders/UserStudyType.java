/**
 */
package lowcoders;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>User Study Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lowcoders.LowcodersPackage#getUserStudyType()
 * @model
 * @generated
 */
public enum UserStudyType implements Enumerator {
	/**
	 * The '<em><b>FIELD STUDIES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIELD_STUDIES_VALUE
	 * @generated
	 * @ordered
	 */
	FIELD_STUDIES(0, "FIELD_STUDIES", "FIELD_STUDIES"),

	/**
	 * The '<em><b>CONTROLLED EXPERIMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLLED_EXPERIMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROLLED_EXPERIMENT(1, "CONTROLLED_EXPERIMENT", "CONTROLLED_EXPERIMENT");

	/**
	 * The '<em><b>FIELD STUDIES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIELD_STUDIES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIELD_STUDIES_VALUE = 0;

	/**
	 * The '<em><b>CONTROLLED EXPERIMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLLED_EXPERIMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTROLLED_EXPERIMENT_VALUE = 1;

	/**
	 * An array of all the '<em><b>User Study Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UserStudyType[] VALUES_ARRAY =
		new UserStudyType[] {
			FIELD_STUDIES,
			CONTROLLED_EXPERIMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>User Study Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UserStudyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>User Study Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UserStudyType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UserStudyType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>User Study Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UserStudyType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UserStudyType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>User Study Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UserStudyType get(int value) {
		switch (value) {
			case FIELD_STUDIES_VALUE: return FIELD_STUDIES;
			case CONTROLLED_EXPERIMENT_VALUE: return CONTROLLED_EXPERIMENT;
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
	private UserStudyType(int value, String name, String literal) {
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
	
} //UserStudyType
