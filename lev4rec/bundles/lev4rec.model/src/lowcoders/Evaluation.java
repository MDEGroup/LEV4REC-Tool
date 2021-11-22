/**
 */
package lowcoders;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.Evaluation#getBaselines <em>Baselines</em>}</li>
 *   <li>{@link lowcoders.Evaluation#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link lowcoders.Evaluation#getValidationtechnique <em>Validationtechnique</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getEvaluation()
 * @model
 * @generated
 */
public interface Evaluation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Baselines</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baselines</em>' attribute list.
	 * @see lowcoders.LowcodersPackage#getEvaluation_Baselines()
	 * @model
	 * @generated
	 */
	EList<String> getBaselines();

	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' attribute list.
	 * The list contents are of type {@link lowcoders.Metric}.
	 * The literals are from the enumeration {@link lowcoders.Metric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' attribute list.
	 * @see lowcoders.Metric
	 * @see lowcoders.LowcodersPackage#getEvaluation_Metrics()
	 * @model
	 * @generated
	 */
	EList<Metric> getMetrics();

	/**
	 * Returns the value of the '<em><b>Validationtechnique</b></em>' containment reference list.
	 * The list contents are of type {@link lowcoders.ValidationTechnique}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validationtechnique</em>' containment reference list.
	 * @see lowcoders.LowcodersPackage#getEvaluation_Validationtechnique()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValidationTechnique> getValidationtechnique();

} // Evaluation
