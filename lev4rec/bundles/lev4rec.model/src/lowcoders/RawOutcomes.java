/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raw Outcomes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.RawOutcomes#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getRawOutcomes()
 * @model
 * @generated
 */
public interface RawOutcomes extends PresentationLayer {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The literals are from the enumeration {@link lowcoders.RawFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see lowcoders.RawFormat
	 * @see #setFormat(RawFormat)
	 * @see lowcoders.LowcodersPackage#getRawOutcomes_Format()
	 * @model
	 * @generated
	 */
	RawFormat getFormat();

	/**
	 * Sets the value of the '{@link lowcoders.RawOutcomes#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see lowcoders.RawFormat
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(RawFormat value);

} // RawOutcomes
