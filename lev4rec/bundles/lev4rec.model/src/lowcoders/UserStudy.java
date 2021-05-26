/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Study</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.UserStudy#getType <em>Type</em>}</li>
 *   <li>{@link lowcoders.UserStudy#getAnalysis <em>Analysis</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getUserStudy()
 * @model
 * @generated
 */
public interface UserStudy extends ValidationTechnique {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link lowcoders.UserStudyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see lowcoders.UserStudyType
	 * @see #setType(UserStudyType)
	 * @see lowcoders.LowcodersPackage#getUserStudy_Type()
	 * @model
	 * @generated
	 */
	UserStudyType getType();

	/**
	 * Sets the value of the '{@link lowcoders.UserStudy#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see lowcoders.UserStudyType
	 * @see #getType()
	 * @generated
	 */
	void setType(UserStudyType value);

	/**
	 * Returns the value of the '<em><b>Analysis</b></em>' attribute.
	 * The literals are from the enumeration {@link lowcoders.UserStudyAnalysis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis</em>' attribute.
	 * @see lowcoders.UserStudyAnalysis
	 * @see #setAnalysis(UserStudyAnalysis)
	 * @see lowcoders.LowcodersPackage#getUserStudy_Analysis()
	 * @model
	 * @generated
	 */
	UserStudyAnalysis getAnalysis();

	/**
	 * Sets the value of the '{@link lowcoders.UserStudy#getAnalysis <em>Analysis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis</em>' attribute.
	 * @see lowcoders.UserStudyAnalysis
	 * @see #getAnalysis()
	 * @generated
	 */
	void setAnalysis(UserStudyAnalysis value);

} // UserStudy
