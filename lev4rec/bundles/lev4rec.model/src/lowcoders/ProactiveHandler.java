/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proactive Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.ProactiveHandler#isCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getProactiveHandler()
 * @model
 * @generated
 */
public interface ProactiveHandler extends RecommendationHandler {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(boolean)
	 * @see lowcoders.LowcodersPackage#getProactiveHandler_Condition()
	 * @model
	 * @generated
	 */
	boolean isCondition();

	/**
	 * Sets the value of the '{@link lowcoders.ProactiveHandler#isCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #isCondition()
	 * @generated
	 */
	void setCondition(boolean value);

} // ProactiveHandler
