/**
 */
package lowcoders;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.Dataset#getIndipendentVariables <em>Indipendent Variables</em>}</li>
 *   <li>{@link lowcoders.Dataset#getDataStructure <em>Data Structure</em>}</li>
 *   <li>{@link lowcoders.Dataset#getPreprocessing <em>Preprocessing</em>}</li>
 *   <li>{@link lowcoders.Dataset#getDatasetManipulationLibrary <em>Dataset Manipulation Library</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getDataset()
 * @model abstract="true"
 * @generated
 */
public interface Dataset extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Indipendent Variables</b></em>' containment reference list.
	 * The list contents are of type {@link lowcoders.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indipendent Variables</em>' containment reference list.
	 * @see lowcoders.LowcodersPackage#getDataset_IndipendentVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getIndipendentVariables();

	/**
	 * Returns the value of the '<em><b>Data Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Structure</em>' containment reference.
	 * @see #setDataStructure(DataStructure)
	 * @see lowcoders.LowcodersPackage#getDataset_DataStructure()
	 * @model containment="true"
	 * @generated
	 */
	DataStructure getDataStructure();

	/**
	 * Sets the value of the '{@link lowcoders.Dataset#getDataStructure <em>Data Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Structure</em>' containment reference.
	 * @see #getDataStructure()
	 * @generated
	 */
	void setDataStructure(DataStructure value);

	/**
	 * Returns the value of the '<em><b>Preprocessing</b></em>' attribute list.
	 * The list contents are of type {@link lowcoders.PreprocessingTechnique}.
	 * The literals are from the enumeration {@link lowcoders.PreprocessingTechnique}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preprocessing</em>' attribute list.
	 * @see lowcoders.PreprocessingTechnique
	 * @see lowcoders.LowcodersPackage#getDataset_Preprocessing()
	 * @model
	 * @generated
	 */
	EList<PreprocessingTechnique> getPreprocessing();

	/**
	 * Returns the value of the '<em><b>Dataset Manipulation Library</b></em>' attribute list.
	 * The list contents are of type {@link lowcoders.DatasetManipulationLibrary}.
	 * The literals are from the enumeration {@link lowcoders.DatasetManipulationLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset Manipulation Library</em>' attribute list.
	 * @see lowcoders.DatasetManipulationLibrary
	 * @see lowcoders.LowcodersPackage#getDataset_DatasetManipulationLibrary()
	 * @model
	 * @generated
	 */
	EList<DatasetManipulationLibrary> getDatasetManipulationLibrary();

} // Dataset
