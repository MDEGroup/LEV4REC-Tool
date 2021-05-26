/**
 */
package lowcoders;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RS Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.RSModel#getDataset <em>Dataset</em>}</li>
 *   <li>{@link lowcoders.RSModel#getPresentationLayer <em>Presentation Layer</em>}</li>
 *   <li>{@link lowcoders.RSModel#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link lowcoders.RSModel#getRecommendationSystem <em>Recommendation System</em>}</li>
 * </ul>
 *
 * @see lowcoders.LowcodersPackage#getRSModel()
 * @model
 * @generated
 */
public interface RSModel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset</em>' containment reference.
	 * @see #setDataset(Dataset)
	 * @see lowcoders.LowcodersPackage#getRSModel_Dataset()
	 * @model containment="true"
	 * @generated
	 */
	Dataset getDataset();

	/**
	 * Sets the value of the '{@link lowcoders.RSModel#getDataset <em>Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset</em>' containment reference.
	 * @see #getDataset()
	 * @generated
	 */
	void setDataset(Dataset value);

	/**
	 * Returns the value of the '<em><b>Presentation Layer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Layer</em>' containment reference.
	 * @see #setPresentationLayer(PresentationLayer)
	 * @see lowcoders.LowcodersPackage#getRSModel_PresentationLayer()
	 * @model containment="true"
	 * @generated
	 */
	PresentationLayer getPresentationLayer();

	/**
	 * Sets the value of the '{@link lowcoders.RSModel#getPresentationLayer <em>Presentation Layer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Layer</em>' containment reference.
	 * @see #getPresentationLayer()
	 * @generated
	 */
	void setPresentationLayer(PresentationLayer value);

	/**
	 * Returns the value of the '<em><b>Evaluation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation</em>' containment reference.
	 * @see #setEvaluation(Evaluation)
	 * @see lowcoders.LowcodersPackage#getRSModel_Evaluation()
	 * @model containment="true"
	 * @generated
	 */
	Evaluation getEvaluation();

	/**
	 * Sets the value of the '{@link lowcoders.RSModel#getEvaluation <em>Evaluation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation</em>' containment reference.
	 * @see #getEvaluation()
	 * @generated
	 */
	void setEvaluation(Evaluation value);

	/**
	 * Returns the value of the '<em><b>Recommendation System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommendation System</em>' containment reference.
	 * @see #setRecommendationSystem(RecommendationSystem)
	 * @see lowcoders.LowcodersPackage#getRSModel_RecommendationSystem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RecommendationSystem getRecommendationSystem();

	/**
	 * Sets the value of the '{@link lowcoders.RSModel#getRecommendationSystem <em>Recommendation System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recommendation System</em>' containment reference.
	 * @see #getRecommendationSystem()
	 * @generated
	 */
	void setRecommendationSystem(RecommendationSystem value);

} // RSModel
