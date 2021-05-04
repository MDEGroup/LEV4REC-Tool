/**
 */
package lowcoders;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Machine Learning RS Algorithm</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lowcoders.LowcodePackage#getMachineLearningRSAlgorithm()
 * @model
 * @generated
 */
public enum MachineLearningRSAlgorithm implements Enumerator {
	/**
	 * The '<em><b>DEEP NN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEEP_NN_VALUE
	 * @generated
	 * @ordered
	 */
	DEEP_NN(0, "DEEP_NN", "DEEP_NN"),

	/**
	 * The '<em><b>RECURRENT NN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECURRENT_NN_VALUE
	 * @generated
	 * @ordered
	 */
	RECURRENT_NN(1, "RECURRENT_NN", "RECURRENT_NN"),

	/**
	 * The '<em><b>FEED FORWARD NN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEED_FORWARD_NN_VALUE
	 * @generated
	 * @ordered
	 */
	FEED_FORWARD_NN(2, "FEED_FORWARD_NN", "FEED_FORWARD_NN"),

	/**
	 * The '<em><b>CONVOLUTIONAL NN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVOLUTIONAL_NN_VALUE
	 * @generated
	 * @ordered
	 */
	CONVOLUTIONAL_NN(3, "CONVOLUTIONAL_NN", "CONVOLUTIONAL_NN"),

	/**
	 * The '<em><b>DECISION TREE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECISION_TREE_VALUE
	 * @generated
	 * @ordered
	 */
	DECISION_TREE(4, "DECISION_TREE", "DECISION_TREE"), /**
	 * The '<em><b>SVM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SVM_VALUE
	 * @generated
	 * @ordered
	 */
	SVM(5, "SVM", "SVM"),

	/**
	 * The '<em><b>BAYESIAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAYESIAN_VALUE
	 * @generated
	 * @ordered
	 */
	BAYESIAN(6, "BAYESIAN", "BAYESIAN");

	/**
	 * The '<em><b>DEEP NN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEEP_NN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEEP_NN_VALUE = 0;

	/**
	 * The '<em><b>RECURRENT NN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECURRENT_NN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RECURRENT_NN_VALUE = 1;

	/**
	 * The '<em><b>FEED FORWARD NN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEED_FORWARD_NN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FEED_FORWARD_NN_VALUE = 2;

	/**
	 * The '<em><b>CONVOLUTIONAL NN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVOLUTIONAL_NN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONVOLUTIONAL_NN_VALUE = 3;

	/**
	 * The '<em><b>DECISION TREE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECISION_TREE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DECISION_TREE_VALUE = 4;

	/**
	 * The '<em><b>SVM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SVM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SVM_VALUE = 5;

	/**
	 * The '<em><b>BAYESIAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAYESIAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BAYESIAN_VALUE = 6;

	/**
	 * An array of all the '<em><b>Machine Learning RS Algorithm</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MachineLearningRSAlgorithm[] VALUES_ARRAY =
		new MachineLearningRSAlgorithm[] {
			DEEP_NN,
			RECURRENT_NN,
			FEED_FORWARD_NN,
			CONVOLUTIONAL_NN,
			DECISION_TREE,
			SVM,
			BAYESIAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Machine Learning RS Algorithm</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MachineLearningRSAlgorithm> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Machine Learning RS Algorithm</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MachineLearningRSAlgorithm get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MachineLearningRSAlgorithm result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Machine Learning RS Algorithm</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MachineLearningRSAlgorithm getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MachineLearningRSAlgorithm result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Machine Learning RS Algorithm</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MachineLearningRSAlgorithm get(int value) {
		switch (value) {
			case DEEP_NN_VALUE: return DEEP_NN;
			case RECURRENT_NN_VALUE: return RECURRENT_NN;
			case FEED_FORWARD_NN_VALUE: return FEED_FORWARD_NN;
			case CONVOLUTIONAL_NN_VALUE: return CONVOLUTIONAL_NN;
			case DECISION_TREE_VALUE: return DECISION_TREE;
			case SVM_VALUE: return SVM;
			case BAYESIAN_VALUE: return BAYESIAN;
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
	private MachineLearningRSAlgorithm(int value, String name, String literal) {
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
	
} //MachineLearningRSAlgorithm
