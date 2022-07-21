/**
 */
package lowcoders.impl;

import lowcoders.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LowcodersFactoryImpl extends EFactoryImpl implements LowcodersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LowcodersFactory init() {
		try {
			LowcodersFactory theLowcodersFactory = (LowcodersFactory)EPackage.Registry.INSTANCE.getEFactory(LowcodersPackage.eNS_URI);
			if (theLowcodersFactory != null) {
				return theLowcodersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LowcodersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowcodersFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LowcodersPackage.NAMED_ELEMENT: return createNamedElement();
			case LowcodersPackage.USER_EVENT: return createUserEvent();
			case LowcodersPackage.RS_MODEL: return createRSModel();
			case LowcodersPackage.RECOMMENDATION_HANDLER: return createRecommendationHandler();
			case LowcodersPackage.PROACTIVE_HANDLER: return createProactiveHandler();
			case LowcodersPackage.REACTIVE_HANDLER: return createReactiveHandler();
			case LowcodersPackage.RECOMMENDATION_USAGE: return createRecommendationUsage();
			case LowcodersPackage.WEB_ISERVICE: return createWebIService();
			case LowcodersPackage.WEB_APPLICATION: return createWebApplication();
			case LowcodersPackage.IDE_INTEGRATION: return createIDEIntegration();
			case LowcodersPackage.VS_CODE_PLUGIN: return createVSCodePlugin();
			case LowcodersPackage.TRAVERSABLE_GRAPH: return createTraversableGraph();
			case LowcodersPackage.EVALUATION: return createEvaluation();
			case LowcodersPackage.UNSUPERVISED_DATASET: return createUnsupervisedDataset();
			case LowcodersPackage.SUPERVISED_DATASET: return createSupervisedDataset();
			case LowcodersPackage.VARIABLE: return createVariable();
			case LowcodersPackage.PREPROCESSING: return createPreprocessing();
			case LowcodersPackage.CODE_REPOSITORY: return createCodeRepository();
			case LowcodersPackage.COMMUNICATION_CHANNEL: return createCommunicationChannel();
			case LowcodersPackage.BUG_TRACKING_SYSTEM: return createBugTrackingSystem();
			case LowcodersPackage.GRAPH: return createGraph();
			case LowcodersPackage.MATRIX: return createMatrix();
			case LowcodersPackage.TREE: return createTree();
			case LowcodersPackage.TEXTUAL_CONTENT: return createTextualContent();
			case LowcodersPackage.ARFF: return createARFF();
			case LowcodersPackage.MACHINE_LEARNING_BASED_RS: return createMachineLearningBasedRS();
			case LowcodersPackage.FILTERING_RS: return createFilteringRS();
			case LowcodersPackage.DATA_MINING_RS: return createDataMiningRS();
			case LowcodersPackage.CUSTOM_RECOMMENDER: return createCustomRecommender();
			case LowcodersPackage.RECOMMENDATION_SETTING: return createRecommendationSetting();
			case LowcodersPackage.GENETIC_ALGORITHM: return createGeneticAlgorithm();
			case LowcodersPackage.USER_STUDY: return createUserStudy();
			case LowcodersPackage.CROSS_VALIDATION: return createCrossValidation();
			case LowcodersPackage.RECOMMENDATION_CONTEXT: return createRecommendationContext();
			case LowcodersPackage.DEPENDENCY_MANAGER: return createDependencyManager();
			case LowcodersPackage.VARIABLE_RELATION: return createVariableRelation();
			case LowcodersPackage.GROUND_TRUTH_EXTRACTION: return createGroundTruthExtraction();
			case LowcodersPackage.FILE: return createFile();
			case LowcodersPackage.RECOMMENDED_ITEM: return createRecommendedItem();
			case LowcodersPackage.CONTEXT_VALIDATION: return createContextValidation();
			case LowcodersPackage.RAW_OUTCOMES: return createRawOutcomes();
			case LowcodersPackage.RANDOM_SPLITTING: return createRandomSplitting();
			case LowcodersPackage.AUTOMATED_VALIDATION: return createAutomatedValidation();
			case LowcodersPackage.DEEP_NN: return createDeepNN();
			case LowcodersPackage.CONVOLUTIONAL_NN: return createConvolutionalNN();
			case LowcodersPackage.BAYESIAN: return createBayesian();
			case LowcodersPackage.RECURRENT_NN: return createRecurrentNN();
			case LowcodersPackage.SVM: return createSVM();
			case LowcodersPackage.DECISION_TREE: return createDecisionTree();
			case LowcodersPackage.FEED_FORWARD_NN: return createFeedForwardNN();
			case LowcodersPackage.GUI_ELEMENT: return createGUIElement();
			case LowcodersPackage.USER: return createUser();
			case LowcodersPackage.FEEDBACK_COMPONENT: return createFeedbackComponent();
			case LowcodersPackage.IMPLICIT_FEEDBACK: return createImplicitFeedback();
			case LowcodersPackage.HYBRID_FEEDBACK: return createHybridFeedback();
			case LowcodersPackage.ADDITIVE_FEEDBACK: return createAdditiveFeedback();
			case LowcodersPackage.RATING: return createRating();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LowcodersPackage.USER_EVENT_TYPE:
				return createUserEventTypeFromString(eDataType, initialValue);
			case LowcodersPackage.COLLABORATIVE_FILTERING_ALGORITHM:
				return createCollaborativeFilteringAlgorithmFromString(eDataType, initialValue);
			case LowcodersPackage.WEB_CONTAINER:
				return createWebContainerFromString(eDataType, initialValue);
			case LowcodersPackage.METRIC:
				return createMetricFromString(eDataType, initialValue);
			case LowcodersPackage.PREPROCESSING_TECHNIQUE:
				return createPreprocessingTechniqueFromString(eDataType, initialValue);
			case LowcodersPackage.RECOMMENDATION_USAGE_TYPE:
				return createRecommendationUsageTypeFromString(eDataType, initialValue);
			case LowcodersPackage.VARIABLE_TYPE:
				return createVariableTypeFromString(eDataType, initialValue);
			case LowcodersPackage.DATA_MINING_RS_ALGORITHM:
				return createDataMiningRSAlgorithmFromString(eDataType, initialValue);
			case LowcodersPackage.FILTERING_RS_ALGORITHM:
				return createFilteringRSAlgorithmFromString(eDataType, initialValue);
			case LowcodersPackage.SEARCH_STRATEGY:
				return createSearchStrategyFromString(eDataType, initialValue);
			case LowcodersPackage.MUTATION_OPERATION:
				return createMutationOperationFromString(eDataType, initialValue);
			case LowcodersPackage.USER_STUDY_TYPE:
				return createUserStudyTypeFromString(eDataType, initialValue);
			case LowcodersPackage.USER_STUDY_ANALYSIS:
				return createUserStudyAnalysisFromString(eDataType, initialValue);
			case LowcodersPackage.SIMILARITY_FUNCTION:
				return createSimilarityFunctionFromString(eDataType, initialValue);
			case LowcodersPackage.PY_LIB_TYPE:
				return createPyLibTypeFromString(eDataType, initialValue);
			case LowcodersPackage.FEEDBACK_LIB_TYPE:
				return createFeedbackLibTypeFromString(eDataType, initialValue);
			case LowcodersPackage.SOLVER_TYPE:
				return createSolverTypeFromString(eDataType, initialValue);
			case LowcodersPackage.KERNEL_TYPE:
				return createKernelTypeFromString(eDataType, initialValue);
			case LowcodersPackage.ACTIVATION_TYPE:
				return createActivationTypeFromString(eDataType, initialValue);
			case LowcodersPackage.DATASET_MANIPULATION_LIBRARY:
				return createDatasetManipulationLibraryFromString(eDataType, initialValue);
			case LowcodersPackage.WEB_INTERFACE_LIBRARY:
				return createWebInterfaceLibraryFromString(eDataType, initialValue);
			case LowcodersPackage.RAW_FORMAT:
				return createRawFormatFromString(eDataType, initialValue);
			case LowcodersPackage.VALIDATION_LIBRARY:
				return createValidationLibraryFromString(eDataType, initialValue);
			case LowcodersPackage.RATING_TYPE:
				return createRatingTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LowcodersPackage.USER_EVENT_TYPE:
				return convertUserEventTypeToString(eDataType, instanceValue);
			case LowcodersPackage.COLLABORATIVE_FILTERING_ALGORITHM:
				return convertCollaborativeFilteringAlgorithmToString(eDataType, instanceValue);
			case LowcodersPackage.WEB_CONTAINER:
				return convertWebContainerToString(eDataType, instanceValue);
			case LowcodersPackage.METRIC:
				return convertMetricToString(eDataType, instanceValue);
			case LowcodersPackage.PREPROCESSING_TECHNIQUE:
				return convertPreprocessingTechniqueToString(eDataType, instanceValue);
			case LowcodersPackage.RECOMMENDATION_USAGE_TYPE:
				return convertRecommendationUsageTypeToString(eDataType, instanceValue);
			case LowcodersPackage.VARIABLE_TYPE:
				return convertVariableTypeToString(eDataType, instanceValue);
			case LowcodersPackage.DATA_MINING_RS_ALGORITHM:
				return convertDataMiningRSAlgorithmToString(eDataType, instanceValue);
			case LowcodersPackage.FILTERING_RS_ALGORITHM:
				return convertFilteringRSAlgorithmToString(eDataType, instanceValue);
			case LowcodersPackage.SEARCH_STRATEGY:
				return convertSearchStrategyToString(eDataType, instanceValue);
			case LowcodersPackage.MUTATION_OPERATION:
				return convertMutationOperationToString(eDataType, instanceValue);
			case LowcodersPackage.USER_STUDY_TYPE:
				return convertUserStudyTypeToString(eDataType, instanceValue);
			case LowcodersPackage.USER_STUDY_ANALYSIS:
				return convertUserStudyAnalysisToString(eDataType, instanceValue);
			case LowcodersPackage.SIMILARITY_FUNCTION:
				return convertSimilarityFunctionToString(eDataType, instanceValue);
			case LowcodersPackage.PY_LIB_TYPE:
				return convertPyLibTypeToString(eDataType, instanceValue);
			case LowcodersPackage.FEEDBACK_LIB_TYPE:
				return convertFeedbackLibTypeToString(eDataType, instanceValue);
			case LowcodersPackage.SOLVER_TYPE:
				return convertSolverTypeToString(eDataType, instanceValue);
			case LowcodersPackage.KERNEL_TYPE:
				return convertKernelTypeToString(eDataType, instanceValue);
			case LowcodersPackage.ACTIVATION_TYPE:
				return convertActivationTypeToString(eDataType, instanceValue);
			case LowcodersPackage.DATASET_MANIPULATION_LIBRARY:
				return convertDatasetManipulationLibraryToString(eDataType, instanceValue);
			case LowcodersPackage.WEB_INTERFACE_LIBRARY:
				return convertWebInterfaceLibraryToString(eDataType, instanceValue);
			case LowcodersPackage.RAW_FORMAT:
				return convertRawFormatToString(eDataType, instanceValue);
			case LowcodersPackage.VALIDATION_LIBRARY:
				return convertValidationLibraryToString(eDataType, instanceValue);
			case LowcodersPackage.RATING_TYPE:
				return convertRatingTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserEvent createUserEvent() {
		UserEventImpl userEvent = new UserEventImpl();
		return userEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RSModel createRSModel() {
		RSModelImpl rsModel = new RSModelImpl();
		return rsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecommendationHandler createRecommendationHandler() {
		RecommendationHandlerImpl recommendationHandler = new RecommendationHandlerImpl();
		return recommendationHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProactiveHandler createProactiveHandler() {
		ProactiveHandlerImpl proactiveHandler = new ProactiveHandlerImpl();
		return proactiveHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReactiveHandler createReactiveHandler() {
		ReactiveHandlerImpl reactiveHandler = new ReactiveHandlerImpl();
		return reactiveHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecommendationUsage createRecommendationUsage() {
		RecommendationUsageImpl recommendationUsage = new RecommendationUsageImpl();
		return recommendationUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebIService createWebIService() {
		WebIServiceImpl webIService = new WebIServiceImpl();
		return webIService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebApplication createWebApplication() {
		WebApplicationImpl webApplication = new WebApplicationImpl();
		return webApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IDEIntegration createIDEIntegration() {
		IDEIntegrationImpl ideIntegration = new IDEIntegrationImpl();
		return ideIntegration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VSCodePlugin createVSCodePlugin() {
		VSCodePluginImpl vsCodePlugin = new VSCodePluginImpl();
		return vsCodePlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TraversableGraph createTraversableGraph() {
		TraversableGraphImpl traversableGraph = new TraversableGraphImpl();
		return traversableGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Evaluation createEvaluation() {
		EvaluationImpl evaluation = new EvaluationImpl();
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsupervisedDataset createUnsupervisedDataset() {
		UnsupervisedDatasetImpl unsupervisedDataset = new UnsupervisedDatasetImpl();
		return unsupervisedDataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupervisedDataset createSupervisedDataset() {
		SupervisedDatasetImpl supervisedDataset = new SupervisedDatasetImpl();
		return supervisedDataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Preprocessing createPreprocessing() {
		PreprocessingImpl preprocessing = new PreprocessingImpl();
		return preprocessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeRepository createCodeRepository() {
		CodeRepositoryImpl codeRepository = new CodeRepositoryImpl();
		return codeRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationChannel createCommunicationChannel() {
		CommunicationChannelImpl communicationChannel = new CommunicationChannelImpl();
		return communicationChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BugTrackingSystem createBugTrackingSystem() {
		BugTrackingSystemImpl bugTrackingSystem = new BugTrackingSystemImpl();
		return bugTrackingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph createGraph() {
		GraphImpl graph = new GraphImpl();
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Matrix createMatrix() {
		MatrixImpl matrix = new MatrixImpl();
		return matrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tree createTree() {
		TreeImpl tree = new TreeImpl();
		return tree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextualContent createTextualContent() {
		TextualContentImpl textualContent = new TextualContentImpl();
		return textualContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ARFF createARFF() {
		ARFFImpl arff = new ARFFImpl();
		return arff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MachineLearningBasedRS createMachineLearningBasedRS() {
		MachineLearningBasedRSImpl machineLearningBasedRS = new MachineLearningBasedRSImpl();
		return machineLearningBasedRS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilteringRS createFilteringRS() {
		FilteringRSImpl filteringRS = new FilteringRSImpl();
		return filteringRS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataMiningRS createDataMiningRS() {
		DataMiningRSImpl dataMiningRS = new DataMiningRSImpl();
		return dataMiningRS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomRecommender createCustomRecommender() {
		CustomRecommenderImpl customRecommender = new CustomRecommenderImpl();
		return customRecommender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecommendationSetting createRecommendationSetting() {
		RecommendationSettingImpl recommendationSetting = new RecommendationSettingImpl();
		return recommendationSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneticAlgorithm createGeneticAlgorithm() {
		GeneticAlgorithmImpl geneticAlgorithm = new GeneticAlgorithmImpl();
		return geneticAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserStudy createUserStudy() {
		UserStudyImpl userStudy = new UserStudyImpl();
		return userStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrossValidation createCrossValidation() {
		CrossValidationImpl crossValidation = new CrossValidationImpl();
		return crossValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecommendationContext createRecommendationContext() {
		RecommendationContextImpl recommendationContext = new RecommendationContextImpl();
		return recommendationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DependencyManager createDependencyManager() {
		DependencyManagerImpl dependencyManager = new DependencyManagerImpl();
		return dependencyManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableRelation createVariableRelation() {
		VariableRelationImpl variableRelation = new VariableRelationImpl();
		return variableRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroundTruthExtraction createGroundTruthExtraction() {
		GroundTruthExtractionImpl groundTruthExtraction = new GroundTruthExtractionImpl();
		return groundTruthExtraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecommendedItem createRecommendedItem() {
		RecommendedItemImpl recommendedItem = new RecommendedItemImpl();
		return recommendedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextValidation createContextValidation() {
		ContextValidationImpl contextValidation = new ContextValidationImpl();
		return contextValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RawOutcomes createRawOutcomes() {
		RawOutcomesImpl rawOutcomes = new RawOutcomesImpl();
		return rawOutcomes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RandomSplitting createRandomSplitting() {
		RandomSplittingImpl randomSplitting = new RandomSplittingImpl();
		return randomSplitting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AutomatedValidation createAutomatedValidation() {
		AutomatedValidationImpl automatedValidation = new AutomatedValidationImpl();
		return automatedValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeepNN createDeepNN() {
		DeepNNImpl deepNN = new DeepNNImpl();
		return deepNN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConvolutionalNN createConvolutionalNN() {
		ConvolutionalNNImpl convolutionalNN = new ConvolutionalNNImpl();
		return convolutionalNN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bayesian createBayesian() {
		BayesianImpl bayesian = new BayesianImpl();
		return bayesian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecurrentNN createRecurrentNN() {
		RecurrentNNImpl recurrentNN = new RecurrentNNImpl();
		return recurrentNN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SVM createSVM() {
		SVMImpl svm = new SVMImpl();
		return svm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecisionTree createDecisionTree() {
		DecisionTreeImpl decisionTree = new DecisionTreeImpl();
		return decisionTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeedForwardNN createFeedForwardNN() {
		FeedForwardNNImpl feedForwardNN = new FeedForwardNNImpl();
		return feedForwardNN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GUIElement createGUIElement() {
		GUIElementImpl guiElement = new GUIElementImpl();
		return guiElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeedbackComponent createFeedbackComponent() {
		FeedbackComponentImpl feedbackComponent = new FeedbackComponentImpl();
		return feedbackComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplicitFeedback createImplicitFeedback() {
		ImplicitFeedbackImpl implicitFeedback = new ImplicitFeedbackImpl();
		return implicitFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HybridFeedback createHybridFeedback() {
		HybridFeedbackImpl hybridFeedback = new HybridFeedbackImpl();
		return hybridFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditiveFeedback createAdditiveFeedback() {
		AdditiveFeedbackImpl additiveFeedback = new AdditiveFeedbackImpl();
		return additiveFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rating createRating() {
		RatingImpl rating = new RatingImpl();
		return rating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserEventType createUserEventTypeFromString(EDataType eDataType, String initialValue) {
		UserEventType result = UserEventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUserEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborativeFilteringAlgorithm createCollaborativeFilteringAlgorithmFromString(EDataType eDataType, String initialValue) {
		CollaborativeFilteringAlgorithm result = CollaborativeFilteringAlgorithm.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollaborativeFilteringAlgorithmToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebContainer createWebContainerFromString(EDataType eDataType, String initialValue) {
		WebContainer result = WebContainer.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWebContainerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric createMetricFromString(EDataType eDataType, String initialValue) {
		Metric result = Metric.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetricToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreprocessingTechnique createPreprocessingTechniqueFromString(EDataType eDataType, String initialValue) {
		PreprocessingTechnique result = PreprocessingTechnique.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPreprocessingTechniqueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecommendationUsageType createRecommendationUsageTypeFromString(EDataType eDataType, String initialValue) {
		RecommendationUsageType result = RecommendationUsageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRecommendationUsageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType createVariableTypeFromString(EDataType eDataType, String initialValue) {
		VariableType result = VariableType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariableTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMiningRSAlgorithm createDataMiningRSAlgorithmFromString(EDataType eDataType, String initialValue) {
		DataMiningRSAlgorithm result = DataMiningRSAlgorithm.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataMiningRSAlgorithmToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilteringRSAlgorithm createFilteringRSAlgorithmFromString(EDataType eDataType, String initialValue) {
		FilteringRSAlgorithm result = FilteringRSAlgorithm.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilteringRSAlgorithmToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchStrategy createSearchStrategyFromString(EDataType eDataType, String initialValue) {
		SearchStrategy result = SearchStrategy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchStrategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutationOperation createMutationOperationFromString(EDataType eDataType, String initialValue) {
		MutationOperation result = MutationOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMutationOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserStudyType createUserStudyTypeFromString(EDataType eDataType, String initialValue) {
		UserStudyType result = UserStudyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUserStudyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserStudyAnalysis createUserStudyAnalysisFromString(EDataType eDataType, String initialValue) {
		UserStudyAnalysis result = UserStudyAnalysis.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUserStudyAnalysisToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimilarityFunction createSimilarityFunctionFromString(EDataType eDataType, String initialValue) {
		SimilarityFunction result = SimilarityFunction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimilarityFunctionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PyLibType createPyLibTypeFromString(EDataType eDataType, String initialValue) {
		PyLibType result = PyLibType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPyLibTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackLibType createFeedbackLibTypeFromString(EDataType eDataType, String initialValue) {
		FeedbackLibType result = FeedbackLibType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeedbackLibTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverType createSolverTypeFromString(EDataType eDataType, String initialValue) {
		SolverType result = SolverType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSolverTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KernelType createKernelTypeFromString(EDataType eDataType, String initialValue) {
		KernelType result = KernelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKernelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationType createActivationTypeFromString(EDataType eDataType, String initialValue) {
		ActivationType result = ActivationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetManipulationLibrary createDatasetManipulationLibraryFromString(EDataType eDataType, String initialValue) {
		DatasetManipulationLibrary result = DatasetManipulationLibrary.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatasetManipulationLibraryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebInterfaceLibrary createWebInterfaceLibraryFromString(EDataType eDataType, String initialValue) {
		WebInterfaceLibrary result = WebInterfaceLibrary.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWebInterfaceLibraryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RawFormat createRawFormatFromString(EDataType eDataType, String initialValue) {
		RawFormat result = RawFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRawFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationLibrary createValidationLibraryFromString(EDataType eDataType, String initialValue) {
		ValidationLibrary result = ValidationLibrary.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValidationLibraryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RatingType createRatingTypeFromString(EDataType eDataType, String initialValue) {
		RatingType result = RatingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRatingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LowcodersPackage getLowcodersPackage() {
		return (LowcodersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LowcodersPackage getPackage() {
		return LowcodersPackage.eINSTANCE;
	}

} //LowcodersFactoryImpl
