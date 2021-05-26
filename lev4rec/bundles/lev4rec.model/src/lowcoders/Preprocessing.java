/**
 */
package lowcoders;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preprocessing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.Preprocessing#getPreprocessigTechnique <em>Preprocessig Technique</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getPreprocessing()
 * @model
 * @generated
 */
public interface Preprocessing extends EObject {
	/**
	 * Returns the value of the '<em><b>Preprocessig Technique</b></em>' attribute list.
	 * The list contents are of type {@link lowcoders.PreprocessingTechnique}.
	 * The literals are from the enumeration {@link lowcoders.PreprocessingTechnique}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preprocessig Technique</em>' attribute list.
	 * @see lowcoders.PreprocessingTechnique
	 * @see lowcoders.LowcodersPackage#getPreprocessing_PreprocessigTechnique()
	 * @model
	 * @generated
	 */
	EList<PreprocessingTechnique> getPreprocessigTechnique();

} // Preprocessing
