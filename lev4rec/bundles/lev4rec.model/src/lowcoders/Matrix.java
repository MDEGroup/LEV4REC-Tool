/**
 */
package lowcoders;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.Matrix#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getMatrix()
 * @model
 * @generated
 */
public interface Matrix extends DataStructure {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link lowcoders.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see lowcoders.LowcodersPackage#getMatrix_Columns()
	 * @model
	 * @generated
	 */
	EList<Variable> getColumns();

} // Matrix
