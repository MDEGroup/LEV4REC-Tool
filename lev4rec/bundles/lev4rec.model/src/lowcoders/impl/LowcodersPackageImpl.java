/**
 */
package lowcoders.impl;

import lowcoders.ActivationType;
import lowcoders.AutomatedValidation;
import lowcoders.Bayesian;
import lowcoders.BugTrackingSystem;
import lowcoders.CodeRepository;
import lowcoders.CollaborativeFilteringAlgorithm;
import lowcoders.CommunicationChannel;
import lowcoders.ContextValidation;
import lowcoders.ConvolutionalNN;
import lowcoders.CrossValidation;
import lowcoders.CustomRecommender_SOREC;
import lowcoders.DataMiningRS;
import lowcoders.DataMiningRSAlgorithm;
import lowcoders.DataSource;
import lowcoders.DataStructure;
import lowcoders.Dataset;
import lowcoders.DatasetManipulationLibrary;
import lowcoders.DecisionTree;
import lowcoders.DeepNN;
import lowcoders.DependencyManager;
import lowcoders.Evaluation;
import lowcoders.FeedForwardNN;
import lowcoders.File;
import lowcoders.FilteringRS;
import lowcoders.FilteringRSAlgorithm;
import lowcoders.GeneticAlgorithm;
import lowcoders.Graph;
import lowcoders.GroundTruthExtraction;
import lowcoders.IDEIntegration;
import lowcoders.KernelType;
import lowcoders.LowcodersFactory;
import lowcoders.LowcodersPackage;
import lowcoders.MachineLearningBasedRS;
import lowcoders.Matrix;
import lowcoders.MemoryBasedRS_NOTSURE;
import lowcoders.Metric;
import lowcoders.MutationOperation;
import lowcoders.NamedElement;
import lowcoders.Preprocessing;
import lowcoders.PreprocessingTechnique;
import lowcoders.PresentationLayer;
import lowcoders.PyLibType;
import lowcoders.RSModel;
import lowcoders.RandomSplitting;
import lowcoders.RawFormat;
import lowcoders.RawOutcomes;
import lowcoders.RecommendationContext;
import lowcoders.RecommendationSetting;
import lowcoders.RecommendationSystem;
import lowcoders.RecommendedItem;
import lowcoders.RecurrentNN;
import lowcoders.SearchStrategy;
import lowcoders.SimilarityFunction;
import lowcoders.SolverType;
import lowcoders.SupervisedDataset;
import lowcoders.TextualContent;
import lowcoders.TraversableGraph;
import lowcoders.Tree;
import lowcoders.UnsupervisedDataset;
import lowcoders.UserStudy;
import lowcoders.UserStudyAnalysis;
import lowcoders.UserStudyType;
import lowcoders.ValidationLibrary;
import lowcoders.ValidationTechnique;
import lowcoders.Variable;
import lowcoders.VariableRelation;
import lowcoders.VariableType;
import lowcoders.WebApplication;
import lowcoders.WebContainer;
import lowcoders.WebInterface;
import lowcoders.WebInterfaceLibrary;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LowcodersPackageImpl extends EPackageImpl implements LowcodersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rsModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presentationLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ideIntegrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traversableGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationTechniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsupervisedDatasetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supervisedDatasetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preprocessingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bugTrackingSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textualContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recommendationSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineLearningBasedRSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryBasedRS_NOTSUREEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filteringRSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataMiningRSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customRecommender_SORECEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recommendationSettingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geneticAlgorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userStudyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crossValidationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recommendationContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groundTruthExtractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recommendedItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextValidationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rawOutcomesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass randomSplittingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass automatedValidationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deepNNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass convolutionalNNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bayesianEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recurrentNNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionTreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedForwardNNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum collaborativeFilteringAlgorithmEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum webContainerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum metricEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum preprocessingTechniqueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variableTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataMiningRSAlgorithmEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum filteringRSAlgorithmEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum searchStrategyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mutationOperationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum userStudyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum userStudyAnalysisEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum similarityFunctionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pyLibTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum solverTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum kernelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum activationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum datasetManipulationLibraryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum webInterfaceLibraryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rawFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum validationLibraryEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see lowcoders.LowcodersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LowcodersPackageImpl() {
		super(eNS_URI, LowcodersFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link LowcodersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LowcodersPackage init() {
		if (isInited) return (LowcodersPackage)EPackage.Registry.INSTANCE.getEPackage(LowcodersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLowcodersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LowcodersPackageImpl theLowcodersPackage = registeredLowcodersPackage instanceof LowcodersPackageImpl ? (LowcodersPackageImpl)registeredLowcodersPackage : new LowcodersPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theLowcodersPackage.createPackageContents();

		// Initialize created meta-data
		theLowcodersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLowcodersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LowcodersPackage.eNS_URI, theLowcodersPackage);
		return theLowcodersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataset() {
		return datasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataset_IndipendentVariables() {
		return (EReference)datasetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataset_DataStructure() {
		return (EReference)datasetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataset_Preprocessing() {
		return (EAttribute)datasetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataset_DatasetManipulationLibrary() {
		return (EAttribute)datasetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRSModel() {
		return rsModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRSModel_Dataset() {
		return (EReference)rsModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRSModel_PresentationLayer() {
		return (EReference)rsModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRSModel_Evaluation() {
		return (EReference)rsModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRSModel_RecommendationSystem() {
		return (EReference)rsModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataSource() {
		return dataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPresentationLayer() {
		return presentationLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPresentationLayer_Recommendations() {
		return (EReference)presentationLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWebInterface() {
		return webInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebInterface_Library() {
		return (EAttribute)webInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWebApplication() {
		return webApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIDEIntegration() {
		return ideIntegrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTraversableGraph() {
		return traversableGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvaluation() {
		return evaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluation_Baselines() {
		return (EAttribute)evaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluation_Metrics() {
		return (EAttribute)evaluationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvaluation_Validationtechnique() {
		return (EReference)evaluationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidationTechnique() {
		return validationTechniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationTechnique_NOfRecommendations() {
		return (EAttribute)validationTechniqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnsupervisedDataset() {
		return unsupervisedDatasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSupervisedDataset() {
		return supervisedDatasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSupervisedDataset_DependatVariable() {
		return (EReference)supervisedDatasetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariable_DataSource() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariable_Preprocessing() {
		return (EReference)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Type() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_IsMissingValueAllowed() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_IsMultiple() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreprocessing() {
		return preprocessingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreprocessing_PreprocessigTechnique() {
		return (EAttribute)preprocessingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeRepository() {
		return codeRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodeRepository_Metadata() {
		return (EAttribute)codeRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommunicationChannel() {
		return communicationChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBugTrackingSystem() {
		return bugTrackingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataStructure() {
		return dataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraph() {
		return graphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_Nodes() {
		return (EReference)graphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_Relations() {
		return (EReference)graphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMatrix() {
		return matrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatrix_Columns() {
		return (EReference)matrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTree() {
		return treeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextualContent() {
		return textualContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextualContent_Contents() {
		return (EReference)textualContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextualContent_RootPath() {
		return (EAttribute)textualContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getARFF() {
		return arffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getARFF_Variables() {
		return (EReference)arffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecommendationSystem() {
		return recommendationSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRecommendationSystem_RecommenderSettings() {
		return (EReference)recommendationSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRecommendationSystem_RecommendationScope() {
		return (EReference)recommendationSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRecommendationSystem_RecommendationContext() {
		return (EReference)recommendationSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecommendationSystem_Generator() {
		return (EAttribute)recommendationSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachineLearningBasedRS() {
		return machineLearningBasedRSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineLearningBasedRS_NumEpochs() {
		return (EAttribute)machineLearningBasedRSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineLearningBasedRS_LearningRate() {
		return (EAttribute)machineLearningBasedRSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachineLearningBasedRS_MiniBatchSize() {
		return (EAttribute)machineLearningBasedRSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemoryBasedRS_NOTSURE() {
		return memoryBasedRS_NOTSUREEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilteringRS() {
		return filteringRSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilteringRS_FilteringRSAlgorithm() {
		return (EAttribute)filteringRSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilteringRS_SimilarityCalculator() {
		return (EAttribute)filteringRSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilteringRS_Cutoff() {
		return (EAttribute)filteringRSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilteringRS_Neighborhood() {
		return (EAttribute)filteringRSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataMiningRS() {
		return dataMiningRSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataMiningRS_DataMiningRSAlgorithm() {
		return (EAttribute)dataMiningRSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomRecommender_SOREC() {
		return customRecommender_SORECEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomRecommender_SOREC_Description() {
		return (EAttribute)customRecommender_SORECEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomRecommender_SOREC_RequiredTools() {
		return (EAttribute)customRecommender_SORECEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecommendationSetting() {
		return recommendationSettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecommendationSetting_Key() {
		return (EAttribute)recommendationSettingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecommendationSetting_Value() {
		return (EAttribute)recommendationSettingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeneticAlgorithm() {
		return geneticAlgorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneticAlgorithm_FitnessFunction() {
		return (EAttribute)geneticAlgorithmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneticAlgorithm_SearchStrategy() {
		return (EAttribute)geneticAlgorithmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneticAlgorithm_MutationOperator() {
		return (EAttribute)geneticAlgorithmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserStudy() {
		return userStudyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserStudy_Type() {
		return (EAttribute)userStudyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserStudy_Analysis() {
		return (EAttribute)userStudyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCrossValidation() {
		return crossValidationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrossValidation_NumberOfFold() {
		return (EAttribute)crossValidationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossValidation_GroundTruthExtractor() {
		return (EReference)crossValidationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecommendationContext() {
		return recommendationContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRecommendationContext_Usercontext() {
		return (EReference)recommendationContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecommendationContext_IsProactiveSystem() {
		return (EAttribute)recommendationContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDependencyManager() {
		return dependencyManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableRelation() {
		return variableRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableRelation_Source() {
		return (EReference)variableRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableRelation_Target() {
		return (EReference)variableRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroundTruthExtraction() {
		return groundTruthExtractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroundTruthExtraction_SizeGT() {
		return (EAttribute)groundTruthExtractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroundTruthExtraction_SplittingRules() {
		return (EAttribute)groundTruthExtractionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroundTruthExtraction_TargetVariable() {
		return (EReference)groundTruthExtractionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFile_SourcePath() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFile_Encoding() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecommendedItem() {
		return recommendedItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRecommendedItem_Outcame() {
		return (EReference)recommendedItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecommendedItem_Ordered() {
		return (EAttribute)recommendedItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextValidation() {
		return contextValidationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContextValidation_TestContext() {
		return (EReference)contextValidationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRawOutcomes() {
		return rawOutcomesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRawOutcomes_Format() {
		return (EAttribute)rawOutcomesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRandomSplitting() {
		return randomSplittingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAutomatedValidation() {
		return automatedValidationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAutomatedValidation_Library() {
		return (EAttribute)automatedValidationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeepNN() {
		return deepNNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeepNN_NumHiddenLayer() {
		return (EAttribute)deepNNEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConvolutionalNN() {
		return convolutionalNNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBayesian() {
		return bayesianEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecurrentNN() {
		return recurrentNNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSVM() {
		return svmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSVM_Kernel() {
		return (EAttribute)svmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecisionTree() {
		return decisionTreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeedForwardNN() {
		return feedForwardNNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeedForwardNN_Solver() {
		return (EAttribute)feedForwardNNEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeedForwardNN_Alpha() {
		return (EAttribute)feedForwardNNEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeedForwardNN_ActivationFunction() {
		return (EAttribute)feedForwardNNEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeedForwardNN_RandomState() {
		return (EAttribute)feedForwardNNEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCollaborativeFilteringAlgorithm() {
		return collaborativeFilteringAlgorithmEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWebContainer() {
		return webContainerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMetric() {
		return metricEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPreprocessingTechnique() {
		return preprocessingTechniqueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVariableType() {
		return variableTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataMiningRSAlgorithm() {
		return dataMiningRSAlgorithmEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFilteringRSAlgorithm() {
		return filteringRSAlgorithmEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSearchStrategy() {
		return searchStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMutationOperation() {
		return mutationOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUserStudyType() {
		return userStudyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUserStudyAnalysis() {
		return userStudyAnalysisEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSimilarityFunction() {
		return similarityFunctionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPyLibType() {
		return pyLibTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSolverType() {
		return solverTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getKernelType() {
		return kernelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getActivationType() {
		return activationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDatasetManipulationLibrary() {
		return datasetManipulationLibraryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWebInterfaceLibrary() {
		return webInterfaceLibraryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRawFormat() {
		return rawFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getValidationLibrary() {
		return validationLibraryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LowcodersFactory getLowcodersFactory() {
		return (LowcodersFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		datasetEClass = createEClass(DATASET);
		createEReference(datasetEClass, DATASET__INDIPENDENT_VARIABLES);
		createEReference(datasetEClass, DATASET__DATA_STRUCTURE);
		createEAttribute(datasetEClass, DATASET__PREPROCESSING);
		createEAttribute(datasetEClass, DATASET__DATASET_MANIPULATION_LIBRARY);

		rsModelEClass = createEClass(RS_MODEL);
		createEReference(rsModelEClass, RS_MODEL__DATASET);
		createEReference(rsModelEClass, RS_MODEL__PRESENTATION_LAYER);
		createEReference(rsModelEClass, RS_MODEL__EVALUATION);
		createEReference(rsModelEClass, RS_MODEL__RECOMMENDATION_SYSTEM);

		dataSourceEClass = createEClass(DATA_SOURCE);

		presentationLayerEClass = createEClass(PRESENTATION_LAYER);
		createEReference(presentationLayerEClass, PRESENTATION_LAYER__RECOMMENDATIONS);

		webInterfaceEClass = createEClass(WEB_INTERFACE);
		createEAttribute(webInterfaceEClass, WEB_INTERFACE__LIBRARY);

		webApplicationEClass = createEClass(WEB_APPLICATION);

		ideIntegrationEClass = createEClass(IDE_INTEGRATION);

		traversableGraphEClass = createEClass(TRAVERSABLE_GRAPH);

		evaluationEClass = createEClass(EVALUATION);
		createEAttribute(evaluationEClass, EVALUATION__BASELINES);
		createEAttribute(evaluationEClass, EVALUATION__METRICS);
		createEReference(evaluationEClass, EVALUATION__VALIDATIONTECHNIQUE);

		validationTechniqueEClass = createEClass(VALIDATION_TECHNIQUE);
		createEAttribute(validationTechniqueEClass, VALIDATION_TECHNIQUE__NOF_RECOMMENDATIONS);

		unsupervisedDatasetEClass = createEClass(UNSUPERVISED_DATASET);

		supervisedDatasetEClass = createEClass(SUPERVISED_DATASET);
		createEReference(supervisedDatasetEClass, SUPERVISED_DATASET__DEPENDAT_VARIABLE);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__DATA_SOURCE);
		createEReference(variableEClass, VARIABLE__PREPROCESSING);
		createEAttribute(variableEClass, VARIABLE__TYPE);
		createEAttribute(variableEClass, VARIABLE__IS_MISSING_VALUE_ALLOWED);
		createEAttribute(variableEClass, VARIABLE__IS_MULTIPLE);

		preprocessingEClass = createEClass(PREPROCESSING);
		createEAttribute(preprocessingEClass, PREPROCESSING__PREPROCESSIG_TECHNIQUE);

		codeRepositoryEClass = createEClass(CODE_REPOSITORY);
		createEAttribute(codeRepositoryEClass, CODE_REPOSITORY__METADATA);

		communicationChannelEClass = createEClass(COMMUNICATION_CHANNEL);

		bugTrackingSystemEClass = createEClass(BUG_TRACKING_SYSTEM);

		dataStructureEClass = createEClass(DATA_STRUCTURE);

		graphEClass = createEClass(GRAPH);
		createEReference(graphEClass, GRAPH__NODES);
		createEReference(graphEClass, GRAPH__RELATIONS);

		matrixEClass = createEClass(MATRIX);
		createEReference(matrixEClass, MATRIX__COLUMNS);

		treeEClass = createEClass(TREE);

		textualContentEClass = createEClass(TEXTUAL_CONTENT);
		createEReference(textualContentEClass, TEXTUAL_CONTENT__CONTENTS);
		createEAttribute(textualContentEClass, TEXTUAL_CONTENT__ROOT_PATH);

		arffEClass = createEClass(ARFF);
		createEReference(arffEClass, ARFF__VARIABLES);

		recommendationSystemEClass = createEClass(RECOMMENDATION_SYSTEM);
		createEReference(recommendationSystemEClass, RECOMMENDATION_SYSTEM__RECOMMENDER_SETTINGS);
		createEReference(recommendationSystemEClass, RECOMMENDATION_SYSTEM__RECOMMENDATION_SCOPE);
		createEReference(recommendationSystemEClass, RECOMMENDATION_SYSTEM__RECOMMENDATION_CONTEXT);
		createEAttribute(recommendationSystemEClass, RECOMMENDATION_SYSTEM__GENERATOR);

		machineLearningBasedRSEClass = createEClass(MACHINE_LEARNING_BASED_RS);
		createEAttribute(machineLearningBasedRSEClass, MACHINE_LEARNING_BASED_RS__NUM_EPOCHS);
		createEAttribute(machineLearningBasedRSEClass, MACHINE_LEARNING_BASED_RS__LEARNING_RATE);
		createEAttribute(machineLearningBasedRSEClass, MACHINE_LEARNING_BASED_RS__MINI_BATCH_SIZE);

		memoryBasedRS_NOTSUREEClass = createEClass(MEMORY_BASED_RS_NOTSURE);

		filteringRSEClass = createEClass(FILTERING_RS);
		createEAttribute(filteringRSEClass, FILTERING_RS__FILTERING_RS_ALGORITHM);
		createEAttribute(filteringRSEClass, FILTERING_RS__SIMILARITY_CALCULATOR);
		createEAttribute(filteringRSEClass, FILTERING_RS__CUTOFF);
		createEAttribute(filteringRSEClass, FILTERING_RS__NEIGHBORHOOD);

		dataMiningRSEClass = createEClass(DATA_MINING_RS);
		createEAttribute(dataMiningRSEClass, DATA_MINING_RS__DATA_MINING_RS_ALGORITHM);

		customRecommender_SORECEClass = createEClass(CUSTOM_RECOMMENDER_SOREC);
		createEAttribute(customRecommender_SORECEClass, CUSTOM_RECOMMENDER_SOREC__DESCRIPTION);
		createEAttribute(customRecommender_SORECEClass, CUSTOM_RECOMMENDER_SOREC__REQUIRED_TOOLS);

		recommendationSettingEClass = createEClass(RECOMMENDATION_SETTING);
		createEAttribute(recommendationSettingEClass, RECOMMENDATION_SETTING__KEY);
		createEAttribute(recommendationSettingEClass, RECOMMENDATION_SETTING__VALUE);

		geneticAlgorithmEClass = createEClass(GENETIC_ALGORITHM);
		createEAttribute(geneticAlgorithmEClass, GENETIC_ALGORITHM__FITNESS_FUNCTION);
		createEAttribute(geneticAlgorithmEClass, GENETIC_ALGORITHM__SEARCH_STRATEGY);
		createEAttribute(geneticAlgorithmEClass, GENETIC_ALGORITHM__MUTATION_OPERATOR);

		userStudyEClass = createEClass(USER_STUDY);
		createEAttribute(userStudyEClass, USER_STUDY__TYPE);
		createEAttribute(userStudyEClass, USER_STUDY__ANALYSIS);

		crossValidationEClass = createEClass(CROSS_VALIDATION);
		createEAttribute(crossValidationEClass, CROSS_VALIDATION__NUMBER_OF_FOLD);
		createEReference(crossValidationEClass, CROSS_VALIDATION__GROUND_TRUTH_EXTRACTOR);

		recommendationContextEClass = createEClass(RECOMMENDATION_CONTEXT);
		createEReference(recommendationContextEClass, RECOMMENDATION_CONTEXT__USERCONTEXT);
		createEAttribute(recommendationContextEClass, RECOMMENDATION_CONTEXT__IS_PROACTIVE_SYSTEM);

		dependencyManagerEClass = createEClass(DEPENDENCY_MANAGER);

		variableRelationEClass = createEClass(VARIABLE_RELATION);
		createEReference(variableRelationEClass, VARIABLE_RELATION__SOURCE);
		createEReference(variableRelationEClass, VARIABLE_RELATION__TARGET);

		groundTruthExtractionEClass = createEClass(GROUND_TRUTH_EXTRACTION);
		createEAttribute(groundTruthExtractionEClass, GROUND_TRUTH_EXTRACTION__SIZE_GT);
		createEAttribute(groundTruthExtractionEClass, GROUND_TRUTH_EXTRACTION__SPLITTING_RULES);
		createEReference(groundTruthExtractionEClass, GROUND_TRUTH_EXTRACTION__TARGET_VARIABLE);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__SOURCE_PATH);
		createEAttribute(fileEClass, FILE__ENCODING);

		recommendedItemEClass = createEClass(RECOMMENDED_ITEM);
		createEReference(recommendedItemEClass, RECOMMENDED_ITEM__OUTCAME);
		createEAttribute(recommendedItemEClass, RECOMMENDED_ITEM__ORDERED);

		contextValidationEClass = createEClass(CONTEXT_VALIDATION);
		createEReference(contextValidationEClass, CONTEXT_VALIDATION__TEST_CONTEXT);

		rawOutcomesEClass = createEClass(RAW_OUTCOMES);
		createEAttribute(rawOutcomesEClass, RAW_OUTCOMES__FORMAT);

		randomSplittingEClass = createEClass(RANDOM_SPLITTING);

		automatedValidationEClass = createEClass(AUTOMATED_VALIDATION);
		createEAttribute(automatedValidationEClass, AUTOMATED_VALIDATION__LIBRARY);

		deepNNEClass = createEClass(DEEP_NN);
		createEAttribute(deepNNEClass, DEEP_NN__NUM_HIDDEN_LAYER);

		convolutionalNNEClass = createEClass(CONVOLUTIONAL_NN);

		bayesianEClass = createEClass(BAYESIAN);

		recurrentNNEClass = createEClass(RECURRENT_NN);

		svmEClass = createEClass(SVM);
		createEAttribute(svmEClass, SVM__KERNEL);

		decisionTreeEClass = createEClass(DECISION_TREE);

		feedForwardNNEClass = createEClass(FEED_FORWARD_NN);
		createEAttribute(feedForwardNNEClass, FEED_FORWARD_NN__SOLVER);
		createEAttribute(feedForwardNNEClass, FEED_FORWARD_NN__ALPHA);
		createEAttribute(feedForwardNNEClass, FEED_FORWARD_NN__ACTIVATION_FUNCTION);
		createEAttribute(feedForwardNNEClass, FEED_FORWARD_NN__RANDOM_STATE);

		// Create enums
		collaborativeFilteringAlgorithmEEnum = createEEnum(COLLABORATIVE_FILTERING_ALGORITHM);
		webContainerEEnum = createEEnum(WEB_CONTAINER);
		metricEEnum = createEEnum(METRIC);
		preprocessingTechniqueEEnum = createEEnum(PREPROCESSING_TECHNIQUE);
		variableTypeEEnum = createEEnum(VARIABLE_TYPE);
		dataMiningRSAlgorithmEEnum = createEEnum(DATA_MINING_RS_ALGORITHM);
		filteringRSAlgorithmEEnum = createEEnum(FILTERING_RS_ALGORITHM);
		searchStrategyEEnum = createEEnum(SEARCH_STRATEGY);
		mutationOperationEEnum = createEEnum(MUTATION_OPERATION);
		userStudyTypeEEnum = createEEnum(USER_STUDY_TYPE);
		userStudyAnalysisEEnum = createEEnum(USER_STUDY_ANALYSIS);
		similarityFunctionEEnum = createEEnum(SIMILARITY_FUNCTION);
		pyLibTypeEEnum = createEEnum(PY_LIB_TYPE);
		solverTypeEEnum = createEEnum(SOLVER_TYPE);
		kernelTypeEEnum = createEEnum(KERNEL_TYPE);
		activationTypeEEnum = createEEnum(ACTIVATION_TYPE);
		datasetManipulationLibraryEEnum = createEEnum(DATASET_MANIPULATION_LIBRARY);
		webInterfaceLibraryEEnum = createEEnum(WEB_INTERFACE_LIBRARY);
		rawFormatEEnum = createEEnum(RAW_FORMAT);
		validationLibraryEEnum = createEEnum(VALIDATION_LIBRARY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		datasetEClass.getESuperTypes().add(this.getNamedElement());
		rsModelEClass.getESuperTypes().add(this.getNamedElement());
		dataSourceEClass.getESuperTypes().add(this.getNamedElement());
		presentationLayerEClass.getESuperTypes().add(this.getNamedElement());
		webInterfaceEClass.getESuperTypes().add(this.getPresentationLayer());
		webApplicationEClass.getESuperTypes().add(this.getNamedElement());
		webApplicationEClass.getESuperTypes().add(this.getPresentationLayer());
		ideIntegrationEClass.getESuperTypes().add(this.getPresentationLayer());
		traversableGraphEClass.getESuperTypes().add(this.getPresentationLayer());
		evaluationEClass.getESuperTypes().add(this.getNamedElement());
		validationTechniqueEClass.getESuperTypes().add(this.getNamedElement());
		unsupervisedDatasetEClass.getESuperTypes().add(this.getDataset());
		supervisedDatasetEClass.getESuperTypes().add(this.getDataset());
		variableEClass.getESuperTypes().add(this.getNamedElement());
		codeRepositoryEClass.getESuperTypes().add(this.getDataSource());
		communicationChannelEClass.getESuperTypes().add(this.getDataSource());
		bugTrackingSystemEClass.getESuperTypes().add(this.getDataSource());
		dataStructureEClass.getESuperTypes().add(this.getNamedElement());
		graphEClass.getESuperTypes().add(this.getDataStructure());
		matrixEClass.getESuperTypes().add(this.getDataStructure());
		treeEClass.getESuperTypes().add(this.getGraph());
		textualContentEClass.getESuperTypes().add(this.getDataStructure());
		arffEClass.getESuperTypes().add(this.getDataStructure());
		recommendationSystemEClass.getESuperTypes().add(this.getNamedElement());
		machineLearningBasedRSEClass.getESuperTypes().add(this.getRecommendationSystem());
		memoryBasedRS_NOTSUREEClass.getESuperTypes().add(this.getRecommendationSystem());
		filteringRSEClass.getESuperTypes().add(this.getRecommendationSystem());
		dataMiningRSEClass.getESuperTypes().add(this.getRecommendationSystem());
		customRecommender_SORECEClass.getESuperTypes().add(this.getRecommendationSystem());
		geneticAlgorithmEClass.getESuperTypes().add(this.getRecommendationSystem());
		userStudyEClass.getESuperTypes().add(this.getValidationTechnique());
		crossValidationEClass.getESuperTypes().add(this.getAutomatedValidation());
		recommendationContextEClass.getESuperTypes().add(this.getNamedElement());
		dependencyManagerEClass.getESuperTypes().add(this.getDataSource());
		fileEClass.getESuperTypes().add(this.getDataSource());
		recommendedItemEClass.getESuperTypes().add(this.getNamedElement());
		contextValidationEClass.getESuperTypes().add(this.getValidationTechnique());
		rawOutcomesEClass.getESuperTypes().add(this.getPresentationLayer());
		randomSplittingEClass.getESuperTypes().add(this.getAutomatedValidation());
		automatedValidationEClass.getESuperTypes().add(this.getValidationTechnique());
		deepNNEClass.getESuperTypes().add(this.getMachineLearningBasedRS());
		convolutionalNNEClass.getESuperTypes().add(this.getMachineLearningBasedRS());
		bayesianEClass.getESuperTypes().add(this.getMachineLearningBasedRS());
		recurrentNNEClass.getESuperTypes().add(this.getMachineLearningBasedRS());
		svmEClass.getESuperTypes().add(this.getMachineLearningBasedRS());
		decisionTreeEClass.getESuperTypes().add(this.getMachineLearningBasedRS());
		feedForwardNNEClass.getESuperTypes().add(this.getMachineLearningBasedRS());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datasetEClass, Dataset.class, "Dataset", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataset_IndipendentVariables(), this.getVariable(), null, "indipendentVariables", null, 0, -1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataset_DataStructure(), this.getDataStructure(), null, "dataStructure", null, 0, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataset_Preprocessing(), this.getPreprocessingTechnique(), "preprocessing", null, 0, -1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataset_DatasetManipulationLibrary(), this.getDatasetManipulationLibrary(), "datasetManipulationLibrary", null, 0, -1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rsModelEClass, RSModel.class, "RSModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRSModel_Dataset(), this.getDataset(), null, "dataset", null, 0, 1, RSModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSModel_PresentationLayer(), this.getPresentationLayer(), null, "presentationLayer", null, 0, 1, RSModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSModel_Evaluation(), this.getEvaluation(), null, "evaluation", null, 0, 1, RSModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSModel_RecommendationSystem(), this.getRecommendationSystem(), null, "recommendationSystem", null, 1, 1, RSModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceEClass, DataSource.class, "DataSource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(presentationLayerEClass, PresentationLayer.class, "PresentationLayer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPresentationLayer_Recommendations(), this.getRecommendedItem(), null, "recommendations", null, 0, 1, PresentationLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webInterfaceEClass, WebInterface.class, "WebInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebInterface_Library(), this.getWebInterfaceLibrary(), "library", null, 0, 1, WebInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webApplicationEClass, WebApplication.class, "WebApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ideIntegrationEClass, IDEIntegration.class, "IDEIntegration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(traversableGraphEClass, TraversableGraph.class, "TraversableGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evaluationEClass, Evaluation.class, "Evaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvaluation_Baselines(), ecorePackage.getEString(), "baselines", null, 0, -1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluation_Metrics(), this.getMetric(), "metrics", null, 0, -1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluation_Validationtechnique(), this.getValidationTechnique(), null, "validationtechnique", null, 0, -1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validationTechniqueEClass, ValidationTechnique.class, "ValidationTechnique", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidationTechnique_NOfRecommendations(), ecorePackage.getEInt(), "nOfRecommendations", null, 1, 1, ValidationTechnique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unsupervisedDatasetEClass, UnsupervisedDataset.class, "UnsupervisedDataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(supervisedDatasetEClass, SupervisedDataset.class, "SupervisedDataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSupervisedDataset_DependatVariable(), this.getVariable(), null, "dependatVariable", null, 1, 1, SupervisedDataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_DataSource(), this.getDataSource(), null, "dataSource", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_Preprocessing(), this.getPreprocessing(), null, "Preprocessing", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Type(), this.getVariableType(), "type", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_IsMissingValueAllowed(), ecorePackage.getEBoolean(), "isMissingValueAllowed", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_IsMultiple(), ecorePackage.getEBoolean(), "isMultiple", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preprocessingEClass, Preprocessing.class, "Preprocessing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreprocessing_PreprocessigTechnique(), this.getPreprocessingTechnique(), "preprocessigTechnique", null, 0, -1, Preprocessing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeRepositoryEClass, CodeRepository.class, "CodeRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodeRepository_Metadata(), ecorePackage.getEBoolean(), "metadata", null, 0, 1, CodeRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationChannelEClass, CommunicationChannel.class, "CommunicationChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bugTrackingSystemEClass, BugTrackingSystem.class, "BugTrackingSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataStructureEClass, DataStructure.class, "DataStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(graphEClass, Graph.class, "Graph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraph_Nodes(), this.getVariable(), null, "nodes", null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_Relations(), this.getVariableRelation(), null, "relations", null, 0, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matrixEClass, Matrix.class, "Matrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatrix_Columns(), this.getVariable(), null, "columns", null, 0, -1, Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treeEClass, Tree.class, "Tree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textualContentEClass, TextualContent.class, "TextualContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextualContent_Contents(), this.getVariable(), null, "contents", null, 0, 1, TextualContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextualContent_RootPath(), ecorePackage.getEString(), "rootPath", null, 0, 1, TextualContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arffEClass, lowcoders.ARFF.class, "ARFF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getARFF_Variables(), this.getVariable(), null, "variables", null, 0, -1, lowcoders.ARFF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recommendationSystemEClass, RecommendationSystem.class, "RecommendationSystem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecommendationSystem_RecommenderSettings(), this.getRecommendationSetting(), null, "RecommenderSettings", null, 0, -1, RecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecommendationSystem_RecommendationScope(), this.getRecommendedItem(), null, "recommendationScope", null, 0, 1, RecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecommendationSystem_RecommendationContext(), this.getRecommendationContext(), null, "recommendationContext", null, 0, 1, RecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecommendationSystem_Generator(), this.getPyLibType(), "generator", null, 0, 1, RecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machineLearningBasedRSEClass, MachineLearningBasedRS.class, "MachineLearningBasedRS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachineLearningBasedRS_NumEpochs(), ecorePackage.getEInt(), "numEpochs", null, 0, 1, MachineLearningBasedRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineLearningBasedRS_LearningRate(), ecorePackage.getEInt(), "learningRate", null, 0, 1, MachineLearningBasedRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineLearningBasedRS_MiniBatchSize(), ecorePackage.getEInt(), "miniBatchSize", null, 0, 1, MachineLearningBasedRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryBasedRS_NOTSUREEClass, MemoryBasedRS_NOTSURE.class, "MemoryBasedRS_NOTSURE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(filteringRSEClass, FilteringRS.class, "FilteringRS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilteringRS_FilteringRSAlgorithm(), this.getFilteringRSAlgorithm(), "filteringRSAlgorithm", null, 0, 1, FilteringRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilteringRS_SimilarityCalculator(), this.getSimilarityFunction(), "similarityCalculator", null, 0, 1, FilteringRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilteringRS_Cutoff(), ecorePackage.getEInt(), "cutoff", null, 0, 1, FilteringRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilteringRS_Neighborhood(), ecorePackage.getEInt(), "neighborhood", null, 0, 1, FilteringRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataMiningRSEClass, DataMiningRS.class, "DataMiningRS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataMiningRS_DataMiningRSAlgorithm(), this.getDataMiningRSAlgorithm(), "dataMiningRSAlgorithm", null, 0, 1, DataMiningRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customRecommender_SORECEClass, CustomRecommender_SOREC.class, "CustomRecommender_SOREC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomRecommender_SOREC_Description(), ecorePackage.getEString(), "description", null, 0, 1, CustomRecommender_SOREC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomRecommender_SOREC_RequiredTools(), ecorePackage.getEString(), "requiredTools", null, 0, -1, CustomRecommender_SOREC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recommendationSettingEClass, RecommendationSetting.class, "RecommendationSetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecommendationSetting_Key(), ecorePackage.getEString(), "key", null, 1, 1, RecommendationSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecommendationSetting_Value(), ecorePackage.getEString(), "value", null, 1, 1, RecommendationSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geneticAlgorithmEClass, GeneticAlgorithm.class, "GeneticAlgorithm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneticAlgorithm_FitnessFunction(), ecorePackage.getEString(), "fitnessFunction", null, 0, 1, GeneticAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneticAlgorithm_SearchStrategy(), this.getSearchStrategy(), "searchStrategy", null, 0, 1, GeneticAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneticAlgorithm_MutationOperator(), this.getMutationOperation(), "mutationOperator", null, 0, 1, GeneticAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userStudyEClass, UserStudy.class, "UserStudy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserStudy_Type(), this.getUserStudyType(), "type", null, 0, 1, UserStudy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserStudy_Analysis(), this.getUserStudyAnalysis(), "analysis", null, 0, 1, UserStudy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crossValidationEClass, CrossValidation.class, "CrossValidation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCrossValidation_NumberOfFold(), ecorePackage.getEInt(), "numberOfFold", null, 0, 1, CrossValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrossValidation_GroundTruthExtractor(), this.getGroundTruthExtraction(), null, "groundTruthExtractor", null, 0, 1, CrossValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recommendationContextEClass, RecommendationContext.class, "RecommendationContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecommendationContext_Usercontext(), this.getDataStructure(), null, "Usercontext", null, 0, 1, RecommendationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecommendationContext_IsProactiveSystem(), ecorePackage.getEBoolean(), "isProactiveSystem", null, 0, 1, RecommendationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyManagerEClass, DependencyManager.class, "DependencyManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableRelationEClass, VariableRelation.class, "VariableRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableRelation_Source(), this.getVariable(), null, "source", null, 0, 1, VariableRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableRelation_Target(), this.getVariable(), null, "target", null, 0, 1, VariableRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groundTruthExtractionEClass, GroundTruthExtraction.class, "GroundTruthExtraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroundTruthExtraction_SizeGT(), ecorePackage.getEString(), "sizeGT", null, 0, 1, GroundTruthExtraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroundTruthExtraction_SplittingRules(), ecorePackage.getEString(), "splittingRules", null, 0, -1, GroundTruthExtraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroundTruthExtraction_TargetVariable(), this.getVariable(), null, "targetVariable", null, 0, 1, GroundTruthExtraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_SourcePath(), ecorePackage.getEString(), "sourcePath", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Encoding(), ecorePackage.getEString(), "encoding", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recommendedItemEClass, RecommendedItem.class, "RecommendedItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecommendedItem_Outcame(), this.getVariable(), null, "outcame", null, 0, -1, RecommendedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecommendedItem_Ordered(), ecorePackage.getEBoolean(), "ordered", null, 0, 1, RecommendedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextValidationEClass, ContextValidation.class, "ContextValidation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextValidation_TestContext(), this.getRecommendationContext(), null, "testContext", null, 0, 1, ContextValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rawOutcomesEClass, RawOutcomes.class, "RawOutcomes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRawOutcomes_Format(), this.getRawFormat(), "format", null, 0, 1, RawOutcomes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(randomSplittingEClass, RandomSplitting.class, "RandomSplitting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(automatedValidationEClass, AutomatedValidation.class, "AutomatedValidation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutomatedValidation_Library(), this.getValidationLibrary(), "library", null, 0, 1, AutomatedValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deepNNEClass, DeepNN.class, "DeepNN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeepNN_NumHiddenLayer(), ecorePackage.getEInt(), "numHiddenLayer", null, 0, 1, DeepNN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(convolutionalNNEClass, ConvolutionalNN.class, "ConvolutionalNN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bayesianEClass, Bayesian.class, "Bayesian", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recurrentNNEClass, RecurrentNN.class, "RecurrentNN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(svmEClass, lowcoders.SVM.class, "SVM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSVM_Kernel(), this.getKernelType(), "kernel", null, 0, 1, lowcoders.SVM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decisionTreeEClass, DecisionTree.class, "DecisionTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(feedForwardNNEClass, FeedForwardNN.class, "FeedForwardNN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeedForwardNN_Solver(), this.getSolverType(), "solver", null, 0, 1, FeedForwardNN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeedForwardNN_Alpha(), ecorePackage.getEFloat(), "alpha", null, 0, 1, FeedForwardNN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeedForwardNN_ActivationFunction(), this.getActivationType(), "activationFunction", null, 0, 1, FeedForwardNN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeedForwardNN_RandomState(), ecorePackage.getEInt(), "randomState", null, 0, 1, FeedForwardNN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(collaborativeFilteringAlgorithmEEnum, CollaborativeFilteringAlgorithm.class, "CollaborativeFilteringAlgorithm");
		addEEnumLiteral(collaborativeFilteringAlgorithmEEnum, CollaborativeFilteringAlgorithm.ITEM_BASED);
		addEEnumLiteral(collaborativeFilteringAlgorithmEEnum, CollaborativeFilteringAlgorithm.USER_BASED);
		addEEnumLiteral(collaborativeFilteringAlgorithmEEnum, CollaborativeFilteringAlgorithm.CONTENT_BASED);

		initEEnum(webContainerEEnum, WebContainer.class, "WebContainer");
		addEEnumLiteral(webContainerEEnum, WebContainer.TOMCAT);
		addEEnumLiteral(webContainerEEnum, WebContainer.JETTY);

		initEEnum(metricEEnum, Metric.class, "Metric");
		addEEnumLiteral(metricEEnum, Metric.PRECISION);
		addEEnumLiteral(metricEEnum, Metric.RECALL);
		addEEnumLiteral(metricEEnum, Metric.F1_MEASURE);
		addEEnumLiteral(metricEEnum, Metric.CATALOG_COVERAGE);
		addEEnumLiteral(metricEEnum, Metric.NOVELTY);
		addEEnumLiteral(metricEEnum, Metric.SALE_DIVERSITY);

		initEEnum(preprocessingTechniqueEEnum, PreprocessingTechnique.class, "PreprocessingTechnique");
		addEEnumLiteral(preprocessingTechniqueEEnum, PreprocessingTechnique.DUPLICATES_REMOVAL);
		addEEnumLiteral(preprocessingTechniqueEEnum, PreprocessingTechnique.NLP);
		addEEnumLiteral(preprocessingTechniqueEEnum, PreprocessingTechnique.NORMALIZATION);
		addEEnumLiteral(preprocessingTechniqueEEnum, PreprocessingTechnique.MISSING_DATA_MANIPULATION);
		addEEnumLiteral(preprocessingTechniqueEEnum, PreprocessingTechnique.VECTORIZATION);
		addEEnumLiteral(preprocessingTechniqueEEnum, PreprocessingTechnique.FEATURE_SCALING);
		addEEnumLiteral(preprocessingTechniqueEEnum, PreprocessingTechnique.TFIDF);

		initEEnum(variableTypeEEnum, VariableType.class, "VariableType");
		addEEnumLiteral(variableTypeEEnum, VariableType.STRING);
		addEEnumLiteral(variableTypeEEnum, VariableType.BOOLEAN);
		addEEnumLiteral(variableTypeEEnum, VariableType.CATEGORICAL_DATA);
		addEEnumLiteral(variableTypeEEnum, VariableType.INTEGER);
		addEEnumLiteral(variableTypeEEnum, VariableType.FLOAT);

		initEEnum(dataMiningRSAlgorithmEEnum, DataMiningRSAlgorithm.class, "DataMiningRSAlgorithm");
		addEEnumLiteral(dataMiningRSAlgorithmEEnum, DataMiningRSAlgorithm.CLUSTERING);
		addEEnumLiteral(dataMiningRSAlgorithmEEnum, DataMiningRSAlgorithm.FREQUENT_ITEM_SET);
		addEEnumLiteral(dataMiningRSAlgorithmEEnum, DataMiningRSAlgorithm.ASSOCIATION_RULE);
		addEEnumLiteral(dataMiningRSAlgorithmEEnum, DataMiningRSAlgorithm.EVENT_STREAM);
		addEEnumLiteral(dataMiningRSAlgorithmEEnum, DataMiningRSAlgorithm.TEXT_MINING);

		initEEnum(filteringRSAlgorithmEEnum, FilteringRSAlgorithm.class, "FilteringRSAlgorithm");
		addEEnumLiteral(filteringRSAlgorithmEEnum, FilteringRSAlgorithm.CONTENT_BASED);
		addEEnumLiteral(filteringRSAlgorithmEEnum, FilteringRSAlgorithm.DEMOGRAPHIC);
		addEEnumLiteral(filteringRSAlgorithmEEnum, FilteringRSAlgorithm.USER_BASED);
		addEEnumLiteral(filteringRSAlgorithmEEnum, FilteringRSAlgorithm.ITEM_BASED);
		addEEnumLiteral(filteringRSAlgorithmEEnum, FilteringRSAlgorithm.CONTEXT_AWARE);
		addEEnumLiteral(filteringRSAlgorithmEEnum, FilteringRSAlgorithm.HYBRID);

		initEEnum(searchStrategyEEnum, SearchStrategy.class, "SearchStrategy");
		addEEnumLiteral(searchStrategyEEnum, SearchStrategy.SIMULATED_ANNELING);
		addEEnumLiteral(searchStrategyEEnum, SearchStrategy.HILL_CLIMBING);
		addEEnumLiteral(searchStrategyEEnum, SearchStrategy.GRADIENT_DESCENT);
		addEEnumLiteral(searchStrategyEEnum, SearchStrategy.EGGHOLDER_FUNCTION);

		initEEnum(mutationOperationEEnum, MutationOperation.class, "MutationOperation");
		addEEnumLiteral(mutationOperationEEnum, MutationOperation.FIT_BIT);
		addEEnumLiteral(mutationOperationEEnum, MutationOperation.CROSSOVER);
		addEEnumLiteral(mutationOperationEEnum, MutationOperation.SHRINK_MUTATION);
		addEEnumLiteral(mutationOperationEEnum, MutationOperation.REPACE_MUTATION);
		addEEnumLiteral(mutationOperationEEnum, MutationOperation.PARTIAL_HYPER_MUTATION);
		addEEnumLiteral(mutationOperationEEnum, MutationOperation.DUPLICATION);

		initEEnum(userStudyTypeEEnum, UserStudyType.class, "UserStudyType");
		addEEnumLiteral(userStudyTypeEEnum, UserStudyType.FIELD_STUDIES);
		addEEnumLiteral(userStudyTypeEEnum, UserStudyType.CONTROLLED_EXPERIMENT);

		initEEnum(userStudyAnalysisEEnum, UserStudyAnalysis.class, "UserStudyAnalysis");
		addEEnumLiteral(userStudyAnalysisEEnum, UserStudyAnalysis.QUALITATIVE);
		addEEnumLiteral(userStudyAnalysisEEnum, UserStudyAnalysis.QUANTITATIVE);

		initEEnum(similarityFunctionEEnum, SimilarityFunction.class, "SimilarityFunction");
		addEEnumLiteral(similarityFunctionEEnum, SimilarityFunction.COSINE_SIMILARITY);
		addEEnumLiteral(similarityFunctionEEnum, SimilarityFunction.JACCARD_DISTANCE);
		addEEnumLiteral(similarityFunctionEEnum, SimilarityFunction.WORD_EMBEDDINGS);
		addEEnumLiteral(similarityFunctionEEnum, SimilarityFunction.LEVENSHTEIN_DISTANCE);
		addEEnumLiteral(similarityFunctionEEnum, SimilarityFunction.SVD);
		addEEnumLiteral(similarityFunctionEEnum, SimilarityFunction.GRAPH_BASED);
		addEEnumLiteral(similarityFunctionEEnum, SimilarityFunction.MSD);

		initEEnum(pyLibTypeEEnum, PyLibType.class, "PyLibType");
		addEEnumLiteral(pyLibTypeEEnum, PyLibType.SKLEARN);
		addEEnumLiteral(pyLibTypeEEnum, PyLibType.SURPRISE);
		addEEnumLiteral(pyLibTypeEEnum, PyLibType.TENSOR_FLOW);
		addEEnumLiteral(pyLibTypeEEnum, PyLibType.PYTORCH);

		initEEnum(solverTypeEEnum, SolverType.class, "SolverType");
		addEEnumLiteral(solverTypeEEnum, SolverType.ADAM);
		addEEnumLiteral(solverTypeEEnum, SolverType.LBFGS);
		addEEnumLiteral(solverTypeEEnum, SolverType.SGD);

		initEEnum(kernelTypeEEnum, KernelType.class, "KernelType");
		addEEnumLiteral(kernelTypeEEnum, KernelType.PRECOMPUTED);
		addEEnumLiteral(kernelTypeEEnum, KernelType.LINEAR);
		addEEnumLiteral(kernelTypeEEnum, KernelType.POLY);
		addEEnumLiteral(kernelTypeEEnum, KernelType.RBF);
		addEEnumLiteral(kernelTypeEEnum, KernelType.SIGMOID);

		initEEnum(activationTypeEEnum, ActivationType.class, "ActivationType");
		addEEnumLiteral(activationTypeEEnum, ActivationType.RELU);
		addEEnumLiteral(activationTypeEEnum, ActivationType.SIGMOID);
		addEEnumLiteral(activationTypeEEnum, ActivationType.TANH);

		initEEnum(datasetManipulationLibraryEEnum, DatasetManipulationLibrary.class, "DatasetManipulationLibrary");
		addEEnumLiteral(datasetManipulationLibraryEEnum, DatasetManipulationLibrary.PANDAS);
		addEEnumLiteral(datasetManipulationLibraryEEnum, DatasetManipulationLibrary.NUMPY);

		initEEnum(webInterfaceLibraryEEnum, WebInterfaceLibrary.class, "WebInterfaceLibrary");
		addEEnumLiteral(webInterfaceLibraryEEnum, WebInterfaceLibrary.FLASK);
		addEEnumLiteral(webInterfaceLibraryEEnum, WebInterfaceLibrary.SPRING);

		initEEnum(rawFormatEEnum, RawFormat.class, "RawFormat");
		addEEnumLiteral(rawFormatEEnum, RawFormat.CSV);

		initEEnum(validationLibraryEEnum, ValidationLibrary.class, "ValidationLibrary");
		addEEnumLiteral(validationLibraryEEnum, ValidationLibrary.SKLEARN);
		addEEnumLiteral(validationLibraryEEnum, ValidationLibrary.SURPRISE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

} //LowcodersPackageImpl
