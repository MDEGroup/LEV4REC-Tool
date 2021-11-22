/**
 */
package lowcoders;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Similarity Function</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lowcoders.LowcodersPackage#getSimilarityFunction()
 * @model
 * @generated
 */
public enum SimilarityFunction implements Enumerator {
	/**
	 * The '<em><b>COSINE SIMILARITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COSINE_SIMILARITY_VALUE
	 * @generated
	 * @ordered
	 */
	COSINE_SIMILARITY(0, "COSINE_SIMILARITY", "COSINE_SIMILARITY"),

	/**
	 * The '<em><b>JACCARD DISTANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JACCARD_DISTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	JACCARD_DISTANCE(1, "JACCARD_DISTANCE", "JACCARD_DISTANCE"),

	/**
	 * The '<em><b>WORD EMBEDDINGS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORD_EMBEDDINGS_VALUE
	 * @generated
	 * @ordered
	 */
	WORD_EMBEDDINGS(2, "WORD_EMBEDDINGS", "WORD_EMBEDDINGS"),

	/**
	 * The '<em><b>LEVENSHTEIN DISTANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVENSHTEIN_DISTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	LEVENSHTEIN_DISTANCE(3, "LEVENSHTEIN_DISTANCE", "LEVENSHTEIN_DISTANCE"),

	/**
	 * The '<em><b>SVD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SVD_VALUE
	 * @generated
	 * @ordered
	 */
	SVD(4, "SVD", "SVD"),

	/**
	 * The '<em><b>GRAPH BASED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPH_BASED_VALUE
	 * @generated
	 * @ordered
	 */
	GRAPH_BASED(5, "GRAPH_BASED", "GRAPH_BASED"),

	/**
	 * The '<em><b>MSD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSD_VALUE
	 * @generated
	 * @ordered
	 */
	MSD(6, "MSD", "MSD");

	/**
	 * The '<em><b>COSINE SIMILARITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COSINE_SIMILARITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COSINE_SIMILARITY_VALUE = 0;

	/**
	 * The '<em><b>JACCARD DISTANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JACCARD_DISTANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JACCARD_DISTANCE_VALUE = 1;

	/**
	 * The '<em><b>WORD EMBEDDINGS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORD_EMBEDDINGS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WORD_EMBEDDINGS_VALUE = 2;

	/**
	 * The '<em><b>LEVENSHTEIN DISTANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVENSHTEIN_DISTANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEVENSHTEIN_DISTANCE_VALUE = 3;

	/**
	 * The '<em><b>SVD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SVD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SVD_VALUE = 4;

	/**
	 * The '<em><b>GRAPH BASED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPH_BASED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRAPH_BASED_VALUE = 5;

	/**
	 * The '<em><b>MSD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MSD_VALUE = 6;

	/**
	 * An array of all the '<em><b>Similarity Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SimilarityFunction[] VALUES_ARRAY =
		new SimilarityFunction[] {
			COSINE_SIMILARITY,
			JACCARD_DISTANCE,
			WORD_EMBEDDINGS,
			LEVENSHTEIN_DISTANCE,
			SVD,
			GRAPH_BASED,
			MSD,
		};

	/**
	 * A public read-only list of all the '<em><b>Similarity Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SimilarityFunction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Similarity Function</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SimilarityFunction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SimilarityFunction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Similarity Function</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SimilarityFunction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SimilarityFunction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Similarity Function</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SimilarityFunction get(int value) {
		switch (value) {
			case COSINE_SIMILARITY_VALUE: return COSINE_SIMILARITY;
			case JACCARD_DISTANCE_VALUE: return JACCARD_DISTANCE;
			case WORD_EMBEDDINGS_VALUE: return WORD_EMBEDDINGS;
			case LEVENSHTEIN_DISTANCE_VALUE: return LEVENSHTEIN_DISTANCE;
			case SVD_VALUE: return SVD;
			case GRAPH_BASED_VALUE: return GRAPH_BASED;
			case MSD_VALUE: return MSD;
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
	private SimilarityFunction(int value, String name, String literal) {
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
	
} //SimilarityFunction
