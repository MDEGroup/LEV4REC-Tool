/**
 */
package lowcoders;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Web Interface Library</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lowcoders.LowcodePackage#getWebInterfaceLibrary()
 * @model
 * @generated
 */
public enum WebInterfaceLibrary implements Enumerator {
	/**
	 * The '<em><b>FLASK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLASK_VALUE
	 * @generated
	 * @ordered
	 */
	FLASK(0, "FLASK", "FLASK"),

	/**
	 * The '<em><b>SPRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPRING_VALUE
	 * @generated
	 * @ordered
	 */
	SPRING(1, "SPRING", "SPRING");

	/**
	 * The '<em><b>FLASK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLASK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLASK_VALUE = 0;

	/**
	 * The '<em><b>SPRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPRING_VALUE = 1;

	/**
	 * An array of all the '<em><b>Web Interface Library</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WebInterfaceLibrary[] VALUES_ARRAY =
		new WebInterfaceLibrary[] {
			FLASK,
			SPRING,
		};

	/**
	 * A public read-only list of all the '<em><b>Web Interface Library</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WebInterfaceLibrary> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Web Interface Library</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WebInterfaceLibrary get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WebInterfaceLibrary result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Web Interface Library</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WebInterfaceLibrary getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WebInterfaceLibrary result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Web Interface Library</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WebInterfaceLibrary get(int value) {
		switch (value) {
			case FLASK_VALUE: return FLASK;
			case SPRING_VALUE: return SPRING;
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
	private WebInterfaceLibrary(int value, String name, String literal) {
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
	
} //WebInterfaceLibrary
