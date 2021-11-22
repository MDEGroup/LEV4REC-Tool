/**
 */
package lowcoders;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see lowcoders.LowcodersPackage
 * @generated
 */
public interface LowcodersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LowcodersFactory eINSTANCE = lowcoders.impl.LowcodersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Element</em>'.
	 * @generated
	 */
	NamedElement createNamedElement();

	/**
	 * Returns a new object of class '<em>RS Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RS Model</em>'.
	 * @generated
	 */
	RSModel createRSModel();

	/**
	 * Returns a new object of class '<em>Web Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Interface</em>'.
	 * @generated
	 */
	WebInterface createWebInterface();

	/**
	 * Returns a new object of class '<em>Web Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Application</em>'.
	 * @generated
	 */
	WebApplication createWebApplication();

	/**
	 * Returns a new object of class '<em>IDE Integration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IDE Integration</em>'.
	 * @generated
	 */
	IDEIntegration createIDEIntegration();

	/**
	 * Returns a new object of class '<em>Traversable Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traversable Graph</em>'.
	 * @generated
	 */
	TraversableGraph createTraversableGraph();

	/**
	 * Returns a new object of class '<em>Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluation</em>'.
	 * @generated
	 */
	Evaluation createEvaluation();

	/**
	 * Returns a new object of class '<em>Unsupervised Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unsupervised Dataset</em>'.
	 * @generated
	 */
	UnsupervisedDataset createUnsupervisedDataset();

	/**
	 * Returns a new object of class '<em>Supervised Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supervised Dataset</em>'.
	 * @generated
	 */
	SupervisedDataset createSupervisedDataset();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Preprocessing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preprocessing</em>'.
	 * @generated
	 */
	Preprocessing createPreprocessing();

	/**
	 * Returns a new object of class '<em>Code Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Repository</em>'.
	 * @generated
	 */
	CodeRepository createCodeRepository();

	/**
	 * Returns a new object of class '<em>Communication Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Channel</em>'.
	 * @generated
	 */
	CommunicationChannel createCommunicationChannel();

	/**
	 * Returns a new object of class '<em>Bug Tracking System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bug Tracking System</em>'.
	 * @generated
	 */
	BugTrackingSystem createBugTrackingSystem();

	/**
	 * Returns a new object of class '<em>Data Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Structure</em>'.
	 * @generated
	 */
	DataStructure createDataStructure();

	/**
	 * Returns a new object of class '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph</em>'.
	 * @generated
	 */
	Graph createGraph();

	/**
	 * Returns a new object of class '<em>Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matrix</em>'.
	 * @generated
	 */
	Matrix createMatrix();

	/**
	 * Returns a new object of class '<em>Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tree</em>'.
	 * @generated
	 */
	Tree createTree();

	/**
	 * Returns a new object of class '<em>Textual Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Textual Content</em>'.
	 * @generated
	 */
	TextualContent createTextualContent();

	/**
	 * Returns a new object of class '<em>ARFF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ARFF</em>'.
	 * @generated
	 */
	ARFF createARFF();

	/**
	 * Returns a new object of class '<em>Machine Learning Based RS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine Learning Based RS</em>'.
	 * @generated
	 */
	MachineLearningBasedRS createMachineLearningBasedRS();

	/**
	 * Returns a new object of class '<em>Memory Based RS NOTSURE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Based RS NOTSURE</em>'.
	 * @generated
	 */
	MemoryBasedRS_NOTSURE createMemoryBasedRS_NOTSURE();

	/**
	 * Returns a new object of class '<em>Filtering RS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filtering RS</em>'.
	 * @generated
	 */
	FilteringRS createFilteringRS();

	/**
	 * Returns a new object of class '<em>Data Mining RS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Mining RS</em>'.
	 * @generated
	 */
	DataMiningRS createDataMiningRS();

	/**
	 * Returns a new object of class '<em>Custom Recommender SOREC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Recommender SOREC</em>'.
	 * @generated
	 */
	CustomRecommender_SOREC createCustomRecommender_SOREC();

	/**
	 * Returns a new object of class '<em>Recommendation Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recommendation Setting</em>'.
	 * @generated
	 */
	RecommendationSetting createRecommendationSetting();

	/**
	 * Returns a new object of class '<em>Genetic Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Genetic Algorithm</em>'.
	 * @generated
	 */
	GeneticAlgorithm createGeneticAlgorithm();

	/**
	 * Returns a new object of class '<em>User Study</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Study</em>'.
	 * @generated
	 */
	UserStudy createUserStudy();

	/**
	 * Returns a new object of class '<em>Cross Validation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cross Validation</em>'.
	 * @generated
	 */
	CrossValidation createCrossValidation();

	/**
	 * Returns a new object of class '<em>Recommendation Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recommendation Context</em>'.
	 * @generated
	 */
	RecommendationContext createRecommendationContext();

	/**
	 * Returns a new object of class '<em>Dependency Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependency Manager</em>'.
	 * @generated
	 */
	DependencyManager createDependencyManager();

	/**
	 * Returns a new object of class '<em>Variable Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Relation</em>'.
	 * @generated
	 */
	VariableRelation createVariableRelation();

	/**
	 * Returns a new object of class '<em>Ground Truth Extraction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ground Truth Extraction</em>'.
	 * @generated
	 */
	GroundTruthExtraction createGroundTruthExtraction();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	File createFile();

	/**
	 * Returns a new object of class '<em>Recommended Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recommended Item</em>'.
	 * @generated
	 */
	RecommendedItem createRecommendedItem();

	/**
	 * Returns a new object of class '<em>Context Validation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Validation</em>'.
	 * @generated
	 */
	ContextValidation createContextValidation();

	/**
	 * Returns a new object of class '<em>Raw Outcomes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raw Outcomes</em>'.
	 * @generated
	 */
	RawOutcomes createRawOutcomes();

	/**
	 * Returns a new object of class '<em>Random Splitting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Random Splitting</em>'.
	 * @generated
	 */
	RandomSplitting createRandomSplitting();

	/**
	 * Returns a new object of class '<em>Automated Validation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Automated Validation</em>'.
	 * @generated
	 */
	AutomatedValidation createAutomatedValidation();

	/**
	 * Returns a new object of class '<em>Deep NN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deep NN</em>'.
	 * @generated
	 */
	DeepNN createDeepNN();

	/**
	 * Returns a new object of class '<em>Convolutional NN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Convolutional NN</em>'.
	 * @generated
	 */
	ConvolutionalNN createConvolutionalNN();

	/**
	 * Returns a new object of class '<em>Bayesian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bayesian</em>'.
	 * @generated
	 */
	Bayesian createBayesian();

	/**
	 * Returns a new object of class '<em>Recurrent NN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recurrent NN</em>'.
	 * @generated
	 */
	RecurrentNN createRecurrentNN();

	/**
	 * Returns a new object of class '<em>SVM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SVM</em>'.
	 * @generated
	 */
	SVM createSVM();

	/**
	 * Returns a new object of class '<em>Decision Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Tree</em>'.
	 * @generated
	 */
	DecisionTree createDecisionTree();

	/**
	 * Returns a new object of class '<em>Feed Forward NN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feed Forward NN</em>'.
	 * @generated
	 */
	FeedForwardNN createFeedForwardNN();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LowcodersPackage getLowcodersPackage();

} //LowcodersFactory
