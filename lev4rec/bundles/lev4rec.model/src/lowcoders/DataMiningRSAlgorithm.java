/**
 */
package lowcoders;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Mining RS Algorithm</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lowcoders.LowcodersPackage#getDataMiningRSAlgorithm()
 * @model
 * @generated
 */
public enum DataMiningRSAlgorithm implements Enumerator {
	/**
	 * The '<em><b>CLUSTERING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTERING_VALUE
	 * @generated
	 * @ordered
	 */
	CLUSTERING(0, "CLUSTERING", "CLUSTERING"),

	/**
	 * The '<em><b>FREQUENT ITEM SET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREQUENT_ITEM_SET_VALUE
	 * @generated
	 * @ordered
	 */
	FREQUENT_ITEM_SET(1, "FREQUENT_ITEM_SET", "FREQUENT_ITEM_SET"),

	/**
	 * The '<em><b>ASSOCIATION RULE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATION_RULE_VALUE
	 * @generated
	 * @ordered
	 */
	ASSOCIATION_RULE(2, "ASSOCIATION_RULE", "ASSOCIATION_RULE"),

	/**
	 * The '<em><b>EVENT STREAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_STREAM_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT_STREAM(3, "EVENT_STREAM", "EVENT_STREAM"),

	/**
	 * The '<em><b>TEXT MINING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_MINING_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_MINING(4, "TEXT_MINING", "TEXT_MINING");

	/**
	 * The '<em><b>CLUSTERING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTERING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLUSTERING_VALUE = 0;

	/**
	 * The '<em><b>FREQUENT ITEM SET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREQUENT_ITEM_SET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENT_ITEM_SET_VALUE = 1;

	/**
	 * The '<em><b>ASSOCIATION RULE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATION_RULE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASSOCIATION_RULE_VALUE = 2;

	/**
	 * The '<em><b>EVENT STREAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_STREAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_STREAM_VALUE = 3;

	/**
	 * The '<em><b>TEXT MINING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_MINING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_MINING_VALUE = 4;

	/**
	 * An array of all the '<em><b>Data Mining RS Algorithm</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataMiningRSAlgorithm[] VALUES_ARRAY =
		new DataMiningRSAlgorithm[] {
			CLUSTERING,
			FREQUENT_ITEM_SET,
			ASSOCIATION_RULE,
			EVENT_STREAM,
			TEXT_MINING,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Mining RS Algorithm</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataMiningRSAlgorithm> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Mining RS Algorithm</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataMiningRSAlgorithm get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataMiningRSAlgorithm result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Mining RS Algorithm</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataMiningRSAlgorithm getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataMiningRSAlgorithm result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Mining RS Algorithm</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataMiningRSAlgorithm get(int value) {
		switch (value) {
			case CLUSTERING_VALUE: return CLUSTERING;
			case FREQUENT_ITEM_SET_VALUE: return FREQUENT_ITEM_SET;
			case ASSOCIATION_RULE_VALUE: return ASSOCIATION_RULE;
			case EVENT_STREAM_VALUE: return EVENT_STREAM;
			case TEXT_MINING_VALUE: return TEXT_MINING;
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
	private DataMiningRSAlgorithm(int value, String name, String literal) {
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
	
} //DataMiningRSAlgorithm
