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
public class LowcodeFactoryImpl extends EFactoryImpl implements LowcodeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LowcodeFactory init() {
		try {
			LowcodeFactory theLowcodeFactory = (LowcodeFactory)EPackage.Registry.INSTANCE.getEFactory(LowcodePackage.eNS_URI);
			if (theLowcodeFactory != null) {
				return theLowcodeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LowcodeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowcodeFactoryImpl() {
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
			case LowcodePackage.NAMED_ELEMENT: return createNamedElement();
			case LowcodePackage.RS_MODEL: return createRSModel();
			case LowcodePackage.WEB_INTERFACE: return createWebInterface();
			case LowcodePackage.WEB_APPLICATION: return createWebApplication();
			case LowcodePackage.IDE_INTEGRATION: return createIDEIntegration();
			case LowcodePackage.TRAVERSABLE_GRAPH: return createTraversableGraph();
			case LowcodePackage.EVALUATION: return createEvaluation();
			case LowcodePackage.UNSUPERVISED_DATASET: return createUnsupervisedDataset();
			case LowcodePackage.SUPERVISED_DATASET: return createSupervisedDataset();
			case LowcodePackage.VARIABLE: return createVariable();
			case LowcodePackage.PREPROCESSING: return createPreprocessing();
			case LowcodePackage.CODE_REPOSITORY: return createCodeRepository();
			case LowcodePackage.COMMUNICATION_CHANNEL: return createCommunicationChannel();
			case LowcodePackage.BUG_TRACKING_SYSTEM: return createBugTrackingSystem();
			case LowcodePackage.DATA_STRUCTURE: return createDataStructure();
			case LowcodePackage.GRAPH: return createGraph();
			case LowcodePackage.MATRIX: return createMatrix();
			case LowcodePackage.TREE: return createTree();
			case LowcodePackage.TEXTUAL_CONTENT: return createTextualContent();
			case LowcodePackage.ARFF: return createARFF();
			case LowcodePackage.MACHINE_LEARNING_BASED_RS: return createMachineLearningBasedRS();
			case LowcodePackage.MEMORY_BASED_RS_NOTSURE: return createMemoryBasedRS_NOTSURE();
			case LowcodePackage.FILTERING_RS: return createFilteringRS();
			case LowcodePackage.DATA_MINING_RS: return createDataMiningRS();
			case LowcodePackage.CUSTOM_RECOMMENDER_SOREC: return createCustomRecommender_SOREC();
			case LowcodePackage.RECOMMENDATION_SETTING: return createRecommendationSetting();
			case LowcodePackage.GENETIC_ALGORITHM: return createGeneticAlgorithm();
			case LowcodePackage.USER_STUDY: return createUserStudy();
			case LowcodePackage.CROSS_VALIDATION: return createCrossValidation();
			case LowcodePackage.RECOMMENDATION_CONTEXT: return createRecommendationContext();
			case LowcodePackage.DEPENDENCY_MANAGER: return createDependencyManager();
			case LowcodePackage.VARIABLE_RELATION: return createVariableRelation();
			case LowcodePackage.GROUND_TRUTH_EXTRACTION: return createGroundTruthExtraction();
			case LowcodePackage.FILE: return createFile();
			case LowcodePackage.RECOMMENDED_ITEM: return createRecommendedItem();
			case LowcodePackage.CONTEXT_VALIDATION: return createContextValidation();
			case LowcodePackage.RAW_OUTCOMES: return createRawOutcomes();
			case LowcodePackage.RANDOM_SPLITTING: return createRandomSplitting();
			case LowcodePackage.AUTOMATED_VALIDATION: return createAutomatedValidation();
			case LowcodePackage.DEEP_NN: return createDeepNN();
			case LowcodePackage.CONVOLUTIONAL_NN: return createConvolutionalNN();
			case LowcodePackage.BAYESIAN: return createBayesian();
			case LowcodePackage.RECURRENT_NN: return createRecurrentNN();
			case LowcodePackage.SVM: return createSVM();
			case LowcodePackage.DECISION_TREE: return createDecisionTree();
			case LowcodePackage.FEED_FORWARD_NN: return createFeedForwardNN();
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
			case LowcodePackage.COLLABORATIVE_FILTERING_ALGORITHM:
				return createCollaborativeFilteringAlgorithmFromString(eDataType, initialValue);
			case LowcodePackage.WEB_CONTAINER:
				return createWebContainerFromString(eDataType, initialValue);
			case LowcodePackage.METRIC:
				return createMetricFromString(eDataType, initialValue);
			case LowcodePackage.PREPROCESSING_TECHNIQUE:
				return createPreprocessingTechniqueFromString(eDataType, initialValue);
			case LowcodePackage.VARIABLE_TYPE:
				return createVariableTypeFromString(eDataType, initialValue);
			case LowcodePackage.DATA_MINING_RS_ALGORITHM:
				return createDataMiningRSAlgorithmFromString(eDataType, initialValue);
			case LowcodePackage.FILTERING_RS_ALGORITHM:
				return createFilteringRSAlgorithmFromString(eDataType, initialValue);
			case LowcodePackage.SEARCH_STRATEGY:
				return createSearchStrategyFromString(eDataType, initialValue);
			case LowcodePackage.MUTATION_OPERATION:
				return createMutationOperationFromString(eDataType, initialValue);
			case LowcodePackage.USER_STUDY_TYPE:
				return createUserStudyTypeFromString(eDataType, initialValue);
			case LowcodePackage.USER_STUDY_ANALYSIS:
				return createUserStudyAnalysisFromString(eDataType, initialValue);
			case LowcodePackage.SIMILARITY_FUNCTION:
				return createSimilarityFunctionFromString(eDataType, initialValue);
			case LowcodePackage.PY_LIB_TYPE:
				return createPyLibTypeFromString(eDataType, initialValue);
			case LowcodePackage.SOLVER_TYPE:
				return createSolverTypeFromString(eDataType, initialValue);
			case LowcodePackage.KERNEL_TYPE:
				return createKernelTypeFromString(eDataType, initialValue);
			case LowcodePackage.ACTIVATION_TYPE:
				return createActivationTypeFromString(eDataType, initialValue);
			case LowcodePackage.DATASET_MANIPULATION_LIBRARY:
				return createDatasetManipulationLibraryFromString(eDataType, initialValue);
			case LowcodePackage.WEB_INTERFACE_LIBRARY:
				return createWebInterfaceLibraryFromString(eDataType, initialValue);
			case LowcodePackage.RAW_FORMAT:
				return createRawFormatFromString(eDataType, initialValue);
			case LowcodePackage.VALIDATION_LIBRARY:
				return createValidationLibraryFromString(eDataType, initialValue);
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
			case LowcodePackage.COLLABORATIVE_FILTERING_ALGORITHM:
				return convertCollaborativeFilteringAlgorithmToString(eDataType, instanceValue);
			case LowcodePackage.WEB_CONTAINER:
				return convertWebContainerToString(eDataType, instanceValue);
			case LowcodePackage.METRIC:
				return convertMetricToString(eDataType, instanceValue);
			case LowcodePackage.PREPROCESSING_TECHNIQUE:
				return convertPreprocessingTechniqueToString(eDataType, instanceValue);
			case LowcodePackage.VARIABLE_TYPE:
				return convertVariableTypeToString(eDataType, instanceValue);
			case LowcodePackage.DATA_MINING_RS_ALGORITHM:
				return convertDataMiningRSAlgorithmToString(eDataType, instanceValue);
			case LowcodePackage.FILTERING_RS_ALGORITHM:
				return convertFilteringRSAlgorithmToString(eDataType, instanceValue);
			case LowcodePackage.SEARCH_STRATEGY:
				return convertSearchStrategyToString(eDataType, instanceValue);
			case LowcodePackage.MUTATION_OPERATION:
				return convertMutationOperationToString(eDataType, instanceValue);
			case LowcodePackage.USER_STUDY_TYPE:
				return convertUserStudyTypeToString(eDataType, instanceValue);
			case LowcodePackage.USER_STUDY_ANALYSIS:
				return convertUserStudyAnalysisToString(eDataType, instanceValue);
			case LowcodePackage.SIMILARITY_FUNCTION:
				return convertSimilarityFunctionToString(eDataType, instanceValue);
			case LowcodePackage.PY_LIB_TYPE:
				return convertPyLibTypeToString(eDataType, instanceValue);
			case LowcodePackage.SOLVER_TYPE:
				return convertSolverTypeToString(eDataType, instanceValue);
			case LowcodePackage.KERNEL_TYPE:
				return convertKernelTypeToString(eDataType, instanceValue);
			case LowcodePackage.ACTIVATION_TYPE:
				return convertActivationTypeToString(eDataType, instanceValue);
			case LowcodePackage.DATASET_MANIPULATION_LIBRARY:
				return convertDatasetManipulationLibraryToString(eDataType, instanceValue);
			case LowcodePackage.WEB_INTERFACE_LIBRARY:
				return convertWebInterfaceLibraryToString(eDataType, instanceValue);
			case LowcodePackage.RAW_FORMAT:
				return convertRawFormatToString(eDataType, instanceValue);
			case LowcodePackage.VALIDATION_LIBRARY:
				return convertValidationLibraryToString(eDataType, instanceValue);
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
	public WebInterface createWebInterface() {
		WebInterfaceImpl webInterface = new WebInterfaceImpl();
		return webInterface;
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
	public DataStructure createDataStructure() {
		DataStructureImpl dataStructure = new DataStructureImpl();
		return dataStructure;
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
	public MemoryBasedRS_NOTSURE createMemoryBasedRS_NOTSURE() {
		MemoryBasedRS_NOTSUREImpl memoryBasedRS_NOTSURE = new MemoryBasedRS_NOTSUREImpl();
		return memoryBasedRS_NOTSURE;
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
	public CustomRecommender_SOREC createCustomRecommender_SOREC() {
		CustomRecommender_SORECImpl customRecommender_SOREC = new CustomRecommender_SORECImpl();
		return customRecommender_SOREC;
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
	@Override
	public LowcodePackage getLowcodePackage() {
		return (LowcodePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LowcodePackage getPackage() {
		return LowcodePackage.eINSTANCE;
	}

} //LowcodeFactoryImpl
