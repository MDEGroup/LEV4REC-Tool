/**
 */
package lowcoders.util;

import lowcoders.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see lowcoders.LowcodersPackage
 * @generated
 */
public class LowcodersAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LowcodersPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowcodersAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LowcodersPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LowcodersSwitch<Adapter> modelSwitch =
		new LowcodersSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseUserEvent(UserEvent object) {
				return createUserEventAdapter();
			}
			@Override
			public Adapter caseDataset(Dataset object) {
				return createDatasetAdapter();
			}
			@Override
			public Adapter caseRSModel(RSModel object) {
				return createRSModelAdapter();
			}
			@Override
			public Adapter caseRecommendationHandler(RecommendationHandler object) {
				return createRecommendationHandlerAdapter();
			}
			@Override
			public Adapter caseProactiveHandler(ProactiveHandler object) {
				return createProactiveHandlerAdapter();
			}
			@Override
			public Adapter caseReactiveHandler(ReactiveHandler object) {
				return createReactiveHandlerAdapter();
			}
			@Override
			public Adapter caseRecommendationUsage(RecommendationUsage object) {
				return createRecommendationUsageAdapter();
			}
			@Override
			public Adapter caseDataSource(DataSource object) {
				return createDataSourceAdapter();
			}
			@Override
			public Adapter casePresentationLayer(PresentationLayer object) {
				return createPresentationLayerAdapter();
			}
			@Override
			public Adapter caseWebIService(WebIService object) {
				return createWebIServiceAdapter();
			}
			@Override
			public Adapter caseWebApplication(WebApplication object) {
				return createWebApplicationAdapter();
			}
			@Override
			public Adapter caseIDEIntegration(IDEIntegration object) {
				return createIDEIntegrationAdapter();
			}
			@Override
			public Adapter caseVSCodePlugin(VSCodePlugin object) {
				return createVSCodePluginAdapter();
			}
			@Override
			public Adapter caseTraversableGraph(TraversableGraph object) {
				return createTraversableGraphAdapter();
			}
			@Override
			public Adapter caseEvaluation(Evaluation object) {
				return createEvaluationAdapter();
			}
			@Override
			public Adapter caseValidationTechnique(ValidationTechnique object) {
				return createValidationTechniqueAdapter();
			}
			@Override
			public Adapter caseUnsupervisedDataset(UnsupervisedDataset object) {
				return createUnsupervisedDatasetAdapter();
			}
			@Override
			public Adapter caseSupervisedDataset(SupervisedDataset object) {
				return createSupervisedDatasetAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter casePreprocessing(Preprocessing object) {
				return createPreprocessingAdapter();
			}
			@Override
			public Adapter caseCodeRepository(CodeRepository object) {
				return createCodeRepositoryAdapter();
			}
			@Override
			public Adapter caseCommunicationChannel(CommunicationChannel object) {
				return createCommunicationChannelAdapter();
			}
			@Override
			public Adapter caseBugTrackingSystem(BugTrackingSystem object) {
				return createBugTrackingSystemAdapter();
			}
			@Override
			public Adapter caseDataStructure(DataStructure object) {
				return createDataStructureAdapter();
			}
			@Override
			public Adapter caseGraph(Graph object) {
				return createGraphAdapter();
			}
			@Override
			public Adapter caseMatrix(Matrix object) {
				return createMatrixAdapter();
			}
			@Override
			public Adapter caseTree(Tree object) {
				return createTreeAdapter();
			}
			@Override
			public Adapter caseTextualContent(TextualContent object) {
				return createTextualContentAdapter();
			}
			@Override
			public Adapter caseARFF(ARFF object) {
				return createARFFAdapter();
			}
			@Override
			public Adapter caseRecommendationSystem(RecommendationSystem object) {
				return createRecommendationSystemAdapter();
			}
			@Override
			public Adapter caseMachineLearningBasedRS(MachineLearningBasedRS object) {
				return createMachineLearningBasedRSAdapter();
			}
			@Override
			public Adapter caseFilteringRS(FilteringRS object) {
				return createFilteringRSAdapter();
			}
			@Override
			public Adapter caseDataMiningRS(DataMiningRS object) {
				return createDataMiningRSAdapter();
			}
			@Override
			public Adapter caseCustomRecommender(CustomRecommender object) {
				return createCustomRecommenderAdapter();
			}
			@Override
			public Adapter caseRecommendationSetting(RecommendationSetting object) {
				return createRecommendationSettingAdapter();
			}
			@Override
			public Adapter caseGeneticAlgorithm(GeneticAlgorithm object) {
				return createGeneticAlgorithmAdapter();
			}
			@Override
			public Adapter caseUserStudy(UserStudy object) {
				return createUserStudyAdapter();
			}
			@Override
			public Adapter caseCrossValidation(CrossValidation object) {
				return createCrossValidationAdapter();
			}
			@Override
			public Adapter caseRecommendationContext(RecommendationContext object) {
				return createRecommendationContextAdapter();
			}
			@Override
			public Adapter caseDependencyManager(DependencyManager object) {
				return createDependencyManagerAdapter();
			}
			@Override
			public Adapter caseVariableRelation(VariableRelation object) {
				return createVariableRelationAdapter();
			}
			@Override
			public Adapter caseGroundTruthExtraction(GroundTruthExtraction object) {
				return createGroundTruthExtractionAdapter();
			}
			@Override
			public Adapter caseFile(File object) {
				return createFileAdapter();
			}
			@Override
			public Adapter caseRecommendedItem(RecommendedItem object) {
				return createRecommendedItemAdapter();
			}
			@Override
			public Adapter caseContextValidation(ContextValidation object) {
				return createContextValidationAdapter();
			}
			@Override
			public Adapter caseRawOutcomes(RawOutcomes object) {
				return createRawOutcomesAdapter();
			}
			@Override
			public Adapter caseRandomSplitting(RandomSplitting object) {
				return createRandomSplittingAdapter();
			}
			@Override
			public Adapter caseAutomatedValidation(AutomatedValidation object) {
				return createAutomatedValidationAdapter();
			}
			@Override
			public Adapter caseDeepNN(DeepNN object) {
				return createDeepNNAdapter();
			}
			@Override
			public Adapter caseConvolutionalNN(ConvolutionalNN object) {
				return createConvolutionalNNAdapter();
			}
			@Override
			public Adapter caseBayesian(Bayesian object) {
				return createBayesianAdapter();
			}
			@Override
			public Adapter caseRecurrentNN(RecurrentNN object) {
				return createRecurrentNNAdapter();
			}
			@Override
			public Adapter caseSVM(SVM object) {
				return createSVMAdapter();
			}
			@Override
			public Adapter caseDecisionTree(DecisionTree object) {
				return createDecisionTreeAdapter();
			}
			@Override
			public Adapter caseFeedForwardNN(FeedForwardNN object) {
				return createFeedForwardNNAdapter();
			}
			@Override
			public Adapter caseGUIElement(GUIElement object) {
				return createGUIElementAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseFeedbackComponent(FeedbackComponent object) {
				return createFeedbackComponentAdapter();
			}
			@Override
			public Adapter caseFeedback(Feedback object) {
				return createFeedbackAdapter();
			}
			@Override
			public Adapter caseImplicitFeedback(ImplicitFeedback object) {
				return createImplicitFeedbackAdapter();
			}
			@Override
			public Adapter caseHybridFeedback(HybridFeedback object) {
				return createHybridFeedbackAdapter();
			}
			@Override
			public Adapter caseAdditiveFeedback(AdditiveFeedback object) {
				return createAdditiveFeedbackAdapter();
			}
			@Override
			public Adapter caseExplicitFeedback(ExplicitFeedback object) {
				return createExplicitFeedbackAdapter();
			}
			@Override
			public Adapter caseRating(Rating object) {
				return createRatingAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.UserEvent <em>User Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.UserEvent
	 * @generated
	 */
	public Adapter createUserEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.Dataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.Dataset
	 * @generated
	 */
	public Adapter createDatasetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.RSModel <em>RS Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.RSModel
	 * @generated
	 */
	public Adapter createRSModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.RecommendationHandler <em>Recommendation Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.RecommendationHandler
	 * @generated
	 */
	public Adapter createRecommendationHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.ProactiveHandler <em>Proactive Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.ProactiveHandler
	 * @generated
	 */
	public Adapter createProactiveHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.ReactiveHandler <em>Reactive Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.ReactiveHandler
	 * @generated
	 */
	public Adapter createReactiveHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.RecommendationUsage <em>Recommendation Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.RecommendationUsage
	 * @generated
	 */
	public Adapter createRecommendationUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.DataSource
	 * @generated
	 */
	public Adapter createDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.PresentationLayer <em>Presentation Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.PresentationLayer
	 * @generated
	 */
	public Adapter createPresentationLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.WebIService <em>Web IService</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.WebIService
	 * @generated
	 */
	public Adapter createWebIServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.WebApplication <em>Web Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.WebApplication
	 * @generated
	 */
	public Adapter createWebApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.IDEIntegration <em>IDE Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.IDEIntegration
	 * @generated
	 */
	public Adapter createIDEIntegrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.VSCodePlugin <em>VS Code Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.VSCodePlugin
	 * @generated
	 */
	public Adapter createVSCodePluginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.TraversableGraph <em>Traversable Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.TraversableGraph
	 * @generated
	 */
	public Adapter createTraversableGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.Evaluation
	 * @generated
	 */
	public Adapter createEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.ValidationTechnique <em>Validation Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.ValidationTechnique
	 * @generated
	 */
	public Adapter createValidationTechniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.UnsupervisedDataset <em>Unsupervised Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.UnsupervisedDataset
	 * @generated
	 */
	public Adapter createUnsupervisedDatasetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.SupervisedDataset <em>Supervised Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.SupervisedDataset
	 * @generated
	 */
	public Adapter createSupervisedDatasetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.Preprocessing <em>Preprocessing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.Preprocessing
	 * @generated
	 */
	public Adapter createPreprocessingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.CodeRepository <em>Code Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.CodeRepository
	 * @generated
	 */
	public Adapter createCodeRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.CommunicationChannel <em>Communication Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.CommunicationChannel
	 * @generated
	 */
	public Adapter createCommunicationChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.BugTrackingSystem <em>Bug Tracking System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.BugTrackingSystem
	 * @generated
	 */
	public Adapter createBugTrackingSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.DataStructure <em>Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.DataStructure
	 * @generated
	 */
	public Adapter createDataStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.Graph
	 * @generated
	 */
	public Adapter createGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.Matrix
	 * @generated
	 */
	public Adapter createMatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.Tree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.Tree
	 * @generated
	 */
	public Adapter createTreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.TextualContent <em>Textual Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.TextualContent
	 * @generated
	 */
	public Adapter createTextualContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.ARFF <em>ARFF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.ARFF
	 * @generated
	 */
	public Adapter createARFFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.RecommendationSystem <em>Recommendation System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.RecommendationSystem
	 * @generated
	 */
	public Adapter createRecommendationSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.MachineLearningBasedRS <em>Machine Learning Based RS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.MachineLearningBasedRS
	 * @generated
	 */
	public Adapter createMachineLearningBasedRSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.FilteringRS <em>Filtering RS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.FilteringRS
	 * @generated
	 */
	public Adapter createFilteringRSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.DataMiningRS <em>Data Mining RS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.DataMiningRS
	 * @generated
	 */
	public Adapter createDataMiningRSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.CustomRecommender <em>Custom Recommender</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.CustomRecommender
	 * @generated
	 */
	public Adapter createCustomRecommenderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.RecommendationSetting <em>Recommendation Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.RecommendationSetting
	 * @generated
	 */
	public Adapter createRecommendationSettingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.GeneticAlgorithm <em>Genetic Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.GeneticAlgorithm
	 * @generated
	 */
	public Adapter createGeneticAlgorithmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.UserStudy <em>User Study</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.UserStudy
	 * @generated
	 */
	public Adapter createUserStudyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.CrossValidation <em>Cross Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.CrossValidation
	 * @generated
	 */
	public Adapter createCrossValidationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.RecommendationContext <em>Recommendation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.RecommendationContext
	 * @generated
	 */
	public Adapter createRecommendationContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.DependencyManager <em>Dependency Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.DependencyManager
	 * @generated
	 */
	public Adapter createDependencyManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.VariableRelation <em>Variable Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.VariableRelation
	 * @generated
	 */
	public Adapter createVariableRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.GroundTruthExtraction <em>Ground Truth Extraction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.GroundTruthExtraction
	 * @generated
	 */
	public Adapter createGroundTruthExtractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.RecommendedItem <em>Recommended Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.RecommendedItem
	 * @generated
	 */
	public Adapter createRecommendedItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.ContextValidation <em>Context Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.ContextValidation
	 * @generated
	 */
	public Adapter createContextValidationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.RawOutcomes <em>Raw Outcomes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.RawOutcomes
	 * @generated
	 */
	public Adapter createRawOutcomesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.RandomSplitting <em>Random Splitting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.RandomSplitting
	 * @generated
	 */
	public Adapter createRandomSplittingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.AutomatedValidation <em>Automated Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.AutomatedValidation
	 * @generated
	 */
	public Adapter createAutomatedValidationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.DeepNN <em>Deep NN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.DeepNN
	 * @generated
	 */
	public Adapter createDeepNNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.ConvolutionalNN <em>Convolutional NN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.ConvolutionalNN
	 * @generated
	 */
	public Adapter createConvolutionalNNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.Bayesian <em>Bayesian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.Bayesian
	 * @generated
	 */
	public Adapter createBayesianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.RecurrentNN <em>Recurrent NN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.RecurrentNN
	 * @generated
	 */
	public Adapter createRecurrentNNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.SVM <em>SVM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.SVM
	 * @generated
	 */
	public Adapter createSVMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.DecisionTree <em>Decision Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.DecisionTree
	 * @generated
	 */
	public Adapter createDecisionTreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.FeedForwardNN <em>Feed Forward NN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.FeedForwardNN
	 * @generated
	 */
	public Adapter createFeedForwardNNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.GUIElement <em>GUI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.GUIElement
	 * @generated
	 */
	public Adapter createGUIElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.FeedbackComponent <em>Feedback Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.FeedbackComponent
	 * @generated
	 */
	public Adapter createFeedbackComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.Feedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.Feedback
	 * @generated
	 */
	public Adapter createFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.ImplicitFeedback <em>Implicit Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.ImplicitFeedback
	 * @generated
	 */
	public Adapter createImplicitFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.HybridFeedback <em>Hybrid Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.HybridFeedback
	 * @generated
	 */
	public Adapter createHybridFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.AdditiveFeedback <em>Additive Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.AdditiveFeedback
	 * @generated
	 */
	public Adapter createAdditiveFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.ExplicitFeedback <em>Explicit Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.ExplicitFeedback
	 * @generated
	 */
	public Adapter createExplicitFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lowcoders.Rating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lowcoders.Rating
	 * @generated
	 */
	public Adapter createRatingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LowcodersAdapterFactory
