/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supervised Dataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.SupervisedDataset#getDependatVariable <em>Dependat Variable</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getSupervisedDataset()
 * @model
 * @generated
 */
public interface SupervisedDataset extends Dataset {
	/**
	 * Returns the value of the '<em><b>Dependat Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependat Variable</em>' containment reference.
	 * @see #setDependatVariable(Variable)
	 * @see lowcoders.LowcodersPackage#getSupervisedDataset_DependatVariable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variable getDependatVariable();

	/**
	 * Sets the value of the '{@link lowcoders.SupervisedDataset#getDependatVariable <em>Dependat Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependat Variable</em>' containment reference.
	 * @see #getDependatVariable()
	 * @generated
	 */
	void setDependatVariable(Variable value);

} // SupervisedDataset
