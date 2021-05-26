/**
 */
package lowcoders;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Preprocessing Technique</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lowcoders.LowcodersPackage#getPreprocessingTechnique()
 * @model
 * @generated
 */
public enum PreprocessingTechnique implements Enumerator {
	/**
	 * The '<em><b>DUPLICATES REMOVAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUPLICATES_REMOVAL_VALUE
	 * @generated
	 * @ordered
	 */
	DUPLICATES_REMOVAL(0, "DUPLICATES_REMOVAL", "DUPLICATES_REMOVAL"),

	/**
	 * The '<em><b>NLP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NLP_VALUE
	 * @generated
	 * @ordered
	 */
	NLP(1, "NLP", "NLP"),

	/**
	 * The '<em><b>NORMALIZATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMALIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	NORMALIZATION(2, "NORMALIZATION", "NORMALIZATION"),

	/**
	 * The '<em><b>MISSING DATA MANIPULATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MISSING_DATA_MANIPULATION_VALUE
	 * @generated
	 * @ordered
	 */
	MISSING_DATA_MANIPULATION(3, "MISSING_DATA_MANIPULATION", "MISSING_DATA_MANIPULATION"),

	/**
	 * The '<em><b>VECTORIZATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VECTORIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	VECTORIZATION(4, "VECTORIZATION", "VECTORIZATION"),

	/**
	 * The '<em><b>FEATURE SCALING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEATURE_SCALING_VALUE
	 * @generated
	 * @ordered
	 */
	FEATURE_SCALING(5, "FEATURE_SCALING", "FEATURE_SCALING"),

	/**
	 * The '<em><b>TFIDF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TFIDF_VALUE
	 * @generated
	 * @ordered
	 */
	TFIDF(6, "TFIDF", "TFIDF");

	/**
	 * The '<em><b>DUPLICATES REMOVAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUPLICATES_REMOVAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DUPLICATES_REMOVAL_VALUE = 0;

	/**
	 * The '<em><b>NLP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NLP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NLP_VALUE = 1;

	/**
	 * The '<em><b>NORMALIZATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMALIZATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORMALIZATION_VALUE = 2;

	/**
	 * The '<em><b>MISSING DATA MANIPULATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MISSING_DATA_MANIPULATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MISSING_DATA_MANIPULATION_VALUE = 3;

	/**
	 * The '<em><b>VECTORIZATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VECTORIZATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VECTORIZATION_VALUE = 4;

	/**
	 * The '<em><b>FEATURE SCALING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEATURE_SCALING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE_SCALING_VALUE = 5;

	/**
	 * The '<em><b>TFIDF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TFIDF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TFIDF_VALUE = 6;

	/**
	 * An array of all the '<em><b>Preprocessing Technique</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PreprocessingTechnique[] VALUES_ARRAY =
		new PreprocessingTechnique[] {
			DUPLICATES_REMOVAL,
			NLP,
			NORMALIZATION,
			MISSING_DATA_MANIPULATION,
			VECTORIZATION,
			FEATURE_SCALING,
			TFIDF,
		};

	/**
	 * A public read-only list of all the '<em><b>Preprocessing Technique</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PreprocessingTechnique> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Preprocessing Technique</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PreprocessingTechnique get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PreprocessingTechnique result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Preprocessing Technique</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PreprocessingTechnique getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PreprocessingTechnique result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Preprocessing Technique</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PreprocessingTechnique get(int value) {
		switch (value) {
			case DUPLICATES_REMOVAL_VALUE: return DUPLICATES_REMOVAL;
			case NLP_VALUE: return NLP;
			case NORMALIZATION_VALUE: return NORMALIZATION;
			case MISSING_DATA_MANIPULATION_VALUE: return MISSING_DATA_MANIPULATION;
			case VECTORIZATION_VALUE: return VECTORIZATION;
			case FEATURE_SCALING_VALUE: return FEATURE_SCALING;
			case TFIDF_VALUE: return TFIDF;
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
	private PreprocessingTechnique(int value, String name, String literal) {
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
	
} //PreprocessingTechnique
