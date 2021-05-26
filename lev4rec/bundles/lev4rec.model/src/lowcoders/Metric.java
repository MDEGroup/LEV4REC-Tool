/**
 */
package lowcoders;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Metric</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lowcoders.LowcodersPackage#getMetric()
 * @model
 * @generated
 */
public enum Metric implements Enumerator {
	/**
	 * The '<em><b>PRECISION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECISION_VALUE
	 * @generated
	 * @ordered
	 */
	PRECISION(0, "PRECISION", "PRECISION"),

	/**
	 * The '<em><b>RECALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECALL_VALUE
	 * @generated
	 * @ordered
	 */
	RECALL(1, "RECALL", "RECALL"),

	/**
	 * The '<em><b>F1 MEASURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F1_MEASURE_VALUE
	 * @generated
	 * @ordered
	 */
	F1_MEASURE(2, "F1_MEASURE", "F1_MEASURE"),

	/**
	 * The '<em><b>CATALOG COVERAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CATALOG_COVERAGE_VALUE
	 * @generated
	 * @ordered
	 */
	CATALOG_COVERAGE(3, "CATALOG_COVERAGE", "CATALOG_COVERAGE"),

	/**
	 * The '<em><b>NOVELTY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOVELTY_VALUE
	 * @generated
	 * @ordered
	 */
	NOVELTY(4, "NOVELTY", "NOVELTY"),

	/**
	 * The '<em><b>SALE DIVERSITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALE_DIVERSITY_VALUE
	 * @generated
	 * @ordered
	 */
	SALE_DIVERSITY(0, "SALE_DIVERSITY", "SALE_DIVERSITY");

	/**
	 * The '<em><b>PRECISION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECISION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRECISION_VALUE = 0;

	/**
	 * The '<em><b>RECALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RECALL_VALUE = 1;

	/**
	 * The '<em><b>F1 MEASURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F1_MEASURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F1_MEASURE_VALUE = 2;

	/**
	 * The '<em><b>CATALOG COVERAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CATALOG_COVERAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CATALOG_COVERAGE_VALUE = 3;

	/**
	 * The '<em><b>NOVELTY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOVELTY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOVELTY_VALUE = 4;

	/**
	 * The '<em><b>SALE DIVERSITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALE_DIVERSITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SALE_DIVERSITY_VALUE = 0;

	/**
	 * An array of all the '<em><b>Metric</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Metric[] VALUES_ARRAY =
		new Metric[] {
			PRECISION,
			RECALL,
			F1_MEASURE,
			CATALOG_COVERAGE,
			NOVELTY,
			SALE_DIVERSITY,
		};

	/**
	 * A public read-only list of all the '<em><b>Metric</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Metric> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Metric</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Metric get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Metric result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Metric</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Metric getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Metric result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Metric</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Metric get(int value) {
		switch (value) {
			case PRECISION_VALUE: return PRECISION;
			case RECALL_VALUE: return RECALL;
			case F1_MEASURE_VALUE: return F1_MEASURE;
			case CATALOG_COVERAGE_VALUE: return CATALOG_COVERAGE;
			case NOVELTY_VALUE: return NOVELTY;
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
	private Metric(int value, String name, String literal) {
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
	
} //Metric
