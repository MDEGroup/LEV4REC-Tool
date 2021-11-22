/**
 */
package lowcoders;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ARFF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.ARFF#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getARFF()
 * @model
 * @generated
 */
public interface ARFF extends DataStructure {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' reference list.
	 * The list contents are of type {@link lowcoders.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' reference list.
	 * @see lowcoders.LowcodersPackage#getARFF_Variables()
	 * @model
	 * @generated
	 */
	EList<Variable> getVariables();

} // ARFF
