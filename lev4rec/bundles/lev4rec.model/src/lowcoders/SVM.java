/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SVM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.SVM#getKernel <em>Kernel</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getSVM()
 * @model
 * @generated
 */
public interface SVM extends MachineLearningBasedRS {
	/**
	 * Returns the value of the '<em><b>Kernel</b></em>' attribute.
	 * The literals are from the enumeration {@link lowcoders.KernelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kernel</em>' attribute.
	 * @see lowcoders.KernelType
	 * @see #setKernel(KernelType)
	 * @see lowcoders.LowcodersPackage#getSVM_Kernel()
	 * @model
	 * @generated
	 */
	KernelType getKernel();

	/**
	 * Sets the value of the '{@link lowcoders.SVM#getKernel <em>Kernel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kernel</em>' attribute.
	 * @see lowcoders.KernelType
	 * @see #getKernel()
	 * @generated
	 */
	void setKernel(KernelType value);

} // SVM
