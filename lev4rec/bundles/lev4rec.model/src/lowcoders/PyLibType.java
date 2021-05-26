/**
 */
package lowcoders;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Py Lib Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lowcoders.LowcodersPackage#getPyLibType()
 * @model
 * @generated
 */
public enum PyLibType implements Enumerator {
	/**
	 * The '<em><b>SKLEARN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SKLEARN_VALUE
	 * @generated
	 * @ordered
	 */
	SKLEARN(0, "SKLEARN", "SKLEARN"),

	/**
	 * The '<em><b>SURPRISE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SURPRISE_VALUE
	 * @generated
	 * @ordered
	 */
	SURPRISE(1, "SURPRISE", "SURPRISE"),

	/**
	 * The '<em><b>TENSOR FLOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TENSOR_FLOW_VALUE
	 * @generated
	 * @ordered
	 */
	TENSOR_FLOW(2, "TENSOR_FLOW", "TENSOR_FLOW"),

	/**
	 * The '<em><b>PYTORCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PYTORCH_VALUE
	 * @generated
	 * @ordered
	 */
	PYTORCH(3, "PYTORCH", "PYTORCH");

	/**
	 * The '<em><b>SKLEARN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SKLEARN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SKLEARN_VALUE = 0;

	/**
	 * The '<em><b>SURPRISE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SURPRISE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SURPRISE_VALUE = 1;

	/**
	 * The '<em><b>TENSOR FLOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TENSOR_FLOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TENSOR_FLOW_VALUE = 2;

	/**
	 * The '<em><b>PYTORCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PYTORCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PYTORCH_VALUE = 3;

	/**
	 * An array of all the '<em><b>Py Lib Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PyLibType[] VALUES_ARRAY =
		new PyLibType[] {
			SKLEARN,
			SURPRISE,
			TENSOR_FLOW,
			PYTORCH,
		};

	/**
	 * A public read-only list of all the '<em><b>Py Lib Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PyLibType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Py Lib Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PyLibType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PyLibType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Py Lib Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PyLibType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PyLibType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Py Lib Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PyLibType get(int value) {
		switch (value) {
			case SKLEARN_VALUE: return SKLEARN;
			case SURPRISE_VALUE: return SURPRISE;
			case TENSOR_FLOW_VALUE: return TENSOR_FLOW;
			case PYTORCH_VALUE: return PYTORCH;
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
	private PyLibType(int value, String name, String literal) {
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
	
} //PyLibType
