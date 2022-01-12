/**
 */
package lowcoders;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VS Code Plugin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.VSCodePlugin#getHandler <em>Handler</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getVSCodePlugin()
 * @model
 * @generated
 */
public interface VSCodePlugin extends IDEIntegration {
	/**
	 * Returns the value of the '<em><b>Handler</b></em>' reference list.
	 * The list contents are of type {@link lowcoders.RecommendationHandler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler</em>' reference list.
	 * @see lowcoders.LowcodersPackage#getVSCodePlugin_Handler()
	 * @model required="true"
	 * @generated
	 */
	EList<RecommendationHandler> getHandler();

} // VSCodePlugin
