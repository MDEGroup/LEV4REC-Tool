/**
 */
package lowcoders;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ground Truth Extraction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.GroundTruthExtraction#getSizeGT <em>Size GT</em>}</li>
 *   <li>{@link lowcoders.GroundTruthExtraction#getSplittingRules <em>Splitting Rules</em>}</li>
 *   <li>{@link lowcoders.GroundTruthExtraction#getTargetVariable <em>Target Variable</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getGroundTruthExtraction()
 * @model
 * @generated
 */
public interface GroundTruthExtraction extends EObject {
	/**
	 * Returns the value of the '<em><b>Size GT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size GT</em>' attribute.
	 * @see #setSizeGT(String)
	 * @see lowcoders.LowcodersPackage#getGroundTruthExtraction_SizeGT()
	 * @model
	 * @generated
	 */
	String getSizeGT();

	/**
	 * Sets the value of the '{@link lowcoders.GroundTruthExtraction#getSizeGT <em>Size GT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size GT</em>' attribute.
	 * @see #getSizeGT()
	 * @generated
	 */
	void setSizeGT(String value);

	/**
	 * Returns the value of the '<em><b>Splitting Rules</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Splitting Rules</em>' attribute list.
	 * @see lowcoders.LowcodersPackage#getGroundTruthExtraction_SplittingRules()
	 * @model
	 * @generated
	 */
	EList<String> getSplittingRules();

	/**
	 * Returns the value of the '<em><b>Target Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Variable</em>' reference.
	 * @see #setTargetVariable(Variable)
	 * @see lowcoders.LowcodersPackage#getGroundTruthExtraction_TargetVariable()
	 * @model
	 * @generated
	 */
	Variable getTargetVariable();

	/**
	 * Sets the value of the '{@link lowcoders.GroundTruthExtraction#getTargetVariable <em>Target Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Variable</em>' reference.
	 * @see #getTargetVariable()
	 * @generated
	 */
	void setTargetVariable(Variable value);

} // GroundTruthExtraction
