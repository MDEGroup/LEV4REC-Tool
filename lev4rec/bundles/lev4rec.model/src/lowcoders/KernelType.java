/**
 */
package lowcoders;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Kernel Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lowcoders.LowcodersPackage#getKernelType()
 * @model
 * @generated
 */
public enum KernelType implements Enumerator {
	/**
	 * The '<em><b>PRECOMPUTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECOMPUTED_VALUE
	 * @generated
	 * @ordered
	 */
	PRECOMPUTED(0, "PRECOMPUTED", "PRECOMPUTED"),

	/**
	 * The '<em><b>LINEAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINEAR_VALUE
	 * @generated
	 * @ordered
	 */
	LINEAR(1, "LINEAR", "LINEAR"),

	/**
	 * The '<em><b>POLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLY_VALUE
	 * @generated
	 * @ordered
	 */
	POLY(2, "POLY", "POLY"),

	/**
	 * The '<em><b>RBF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RBF_VALUE
	 * @generated
	 * @ordered
	 */
	RBF(3, "RBF", "RBF"),

	/**
	 * The '<em><b>SIGMOID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGMOID_VALUE
	 * @generated
	 * @ordered
	 */
	SIGMOID(4, "SIGMOID", "SIGMOID");

	/**
	 * The '<em><b>PRECOMPUTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECOMPUTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRECOMPUTED_VALUE = 0;

	/**
	 * The '<em><b>LINEAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINEAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINEAR_VALUE = 1;

	/**
	 * The '<em><b>POLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POLY_VALUE = 2;

	/**
	 * The '<em><b>RBF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RBF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RBF_VALUE = 3;

	/**
	 * The '<em><b>SIGMOID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGMOID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGMOID_VALUE = 4;

	/**
	 * An array of all the '<em><b>Kernel Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final KernelType[] VALUES_ARRAY =
		new KernelType[] {
			PRECOMPUTED,
			LINEAR,
			POLY,
			RBF,
			SIGMOID,
		};

	/**
	 * A public read-only list of all the '<em><b>Kernel Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<KernelType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Kernel Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static KernelType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KernelType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kernel Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static KernelType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KernelType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kernel Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static KernelType get(int value) {
		switch (value) {
			case PRECOMPUTED_VALUE: return PRECOMPUTED;
			case LINEAR_VALUE: return LINEAR;
			case POLY_VALUE: return POLY;
			case RBF_VALUE: return RBF;
			case SIGMOID_VALUE: return SIGMOID;
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
	private KernelType(int value, String name, String literal) {
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
	
} //KernelType
