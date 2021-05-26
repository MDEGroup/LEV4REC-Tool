/**
 */
package lowcoders;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.VariableRelation#getSource <em>Source</em>}</li>
 *   <li>{@link lowcoders.VariableRelation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getVariableRelation()
 * @model
 * @generated
 */
public interface VariableRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Variable)
	 * @see lowcoders.LowcodersPackage#getVariableRelation_Source()
	 * @model
	 * @generated
	 */
	Variable getSource();

	/**
	 * Sets the value of the '{@link lowcoders.VariableRelation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Variable value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Variable)
	 * @see lowcoders.LowcodersPackage#getVariableRelation_Target()
	 * @model
	 * @generated
	 */
	Variable getTarget();

	/**
	 * Sets the value of the '{@link lowcoders.VariableRelation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Variable value);

} // VariableRelation
