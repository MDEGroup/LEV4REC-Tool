/**
 */
package lowcoders;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.Graph#getNodes <em>Nodes</em>}</li>
 *   <li>{@link lowcoders.Graph#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends DataStructure {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link lowcoders.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see lowcoders.LowcodersPackage#getGraph_Nodes()
	 * @model
	 * @generated
	 */
	EList<Variable> getNodes();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference.
	 * @see #setRelations(VariableRelation)
	 * @see lowcoders.LowcodersPackage#getGraph_Relations()
	 * @model containment="true"
	 * @generated
	 */
	VariableRelation getRelations();

	/**
	 * Sets the value of the '{@link lowcoders.Graph#getRelations <em>Relations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relations</em>' containment reference.
	 * @see #getRelations()
	 * @generated
	 */
	void setRelations(VariableRelation value);

} // Graph
