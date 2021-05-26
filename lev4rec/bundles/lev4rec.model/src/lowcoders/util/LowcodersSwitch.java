/**
 */
package lowcoders.util;

import lowcoders.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see lowcoders.LowcodersPackage
 * @generated
 */
public class LowcodersSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LowcodersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowcodersSwitch() {
		if (modelPackage == null) {
			modelPackage = LowcodersPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LowcodersPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.DATASET: {
				Dataset dataset = (Dataset)theEObject;
				T result = caseDataset(dataset);
				if (result == null) result = caseNamedElement(dataset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.RS_MODEL: {
				RSModel rsModel = (RSModel)theEObject;
				T result = caseRSModel(rsModel);
				if (result == null) result = caseNamedElement(rsModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.DATA_SOURCE: {
				DataSource dataSource = (DataSource)theEObject;
				T result = caseDataSource(dataSource);
				if (result == null) result = caseNamedElement(dataSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.PRESENTATION_LAYER: {
				PresentationLayer presentationLayer = (PresentationLayer)theEObject;
				T result = casePresentationLayer(presentationLayer);
				if (result == null) result = caseNamedElement(presentationLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.WEB_INTERFACE: {
				WebInterface webInterface = (WebInterface)theEObject;
				T result = caseWebInterface(webInterface);
				if (result == null) result = casePresentationLayer(webInterface);
				if (result == null) result = caseNamedElement(webInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.WEB_APPLICATION: {
				WebApplication webApplication = (WebApplication)theEObject;
				T result = caseWebApplication(webApplication);
				if (result == null) result = casePresentationLayer(webApplication);
				if (result == null) result = caseNamedElement(webApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.IDE_INTEGRATION: {
				IDEIntegration ideIntegration = (IDEIntegration)theEObject;
				T result = caseIDEIntegration(ideIntegration);
				if (result == null) result = casePresentationLayer(ideIntegration);
				if (result == null) result = caseNamedElement(ideIntegration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.TRAVERSABLE_GRAPH: {
				TraversableGraph traversableGraph = (TraversableGraph)theEObject;
				T result = caseTraversableGraph(traversableGraph);
				if (result == null) result = casePresentationLayer(traversableGraph);
				if (result == null) result = caseNamedElement(traversableGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.EVALUATION: {
				Evaluation evaluation = (Evaluation)theEObject;
				T result = caseEvaluation(evaluation);
				if (result == null) result = caseNamedElement(evaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.VALIDATION_TECHNIQUE: {
				ValidationTechnique validationTechnique = (ValidationTechnique)theEObject;
				T result = caseValidationTechnique(validationTechnique);
				if (result == null) result = caseNamedElement(validationTechnique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.UNSUPERVISED_DATASET: {
				UnsupervisedDataset unsupervisedDataset = (UnsupervisedDataset)theEObject;
				T result = caseUnsupervisedDataset(unsupervisedDataset);
				if (result == null) result = caseDataset(unsupervisedDataset);
				if (result == null) result = caseNamedElement(unsupervisedDataset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.SUPERVISED_DATASET: {
				SupervisedDataset supervisedDataset = (SupervisedDataset)theEObject;
				T result = caseSupervisedDataset(supervisedDataset);
				if (result == null) result = caseDataset(supervisedDataset);
				if (result == null) result = caseNamedElement(supervisedDataset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseNamedElement(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.PREPROCESSING: {
				Preprocessing preprocessing = (Preprocessing)theEObject;
				T result = casePreprocessing(preprocessing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.CODE_REPOSITORY: {
				CodeRepository codeRepository = (CodeRepository)theEObject;
				T result = caseCodeRepository(codeRepository);
				if (result == null) result = caseDataSource(codeRepository);
				if (result == null) result = caseNamedElement(codeRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.COMMUNICATION_CHANNEL: {
				CommunicationChannel communicationChannel = (CommunicationChannel)theEObject;
				T result = caseCommunicationChannel(communicationChannel);
				if (result == null) result = caseDataSource(communicationChannel);
				if (result == null) result = caseNamedElement(communicationChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.BUG_TRACKING_SYSTEM: {
				BugTrackingSystem bugTrackingSystem = (BugTrackingSystem)theEObject;
				T result = caseBugTrackingSystem(bugTrackingSystem);
				if (result == null) result = caseDataSource(bugTrackingSystem);
				if (result == null) result = caseNamedElement(bugTrackingSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.DATA_STRUCTURE: {
				DataStructure dataStructure = (DataStructure)theEObject;
				T result = caseDataStructure(dataStructure);
				if (result == null) result = caseNamedElement(dataStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.GRAPH: {
				Graph graph = (Graph)theEObject;
				T result = caseGraph(graph);
				if (result == null) result = caseDataStructure(graph);
				if (result == null) result = caseNamedElement(graph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.MATRIX: {
				Matrix matrix = (Matrix)theEObject;
				T result = caseMatrix(matrix);
				if (result == null) result = caseDataStructure(matrix);
				if (result == null) result = caseNamedElement(matrix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.TREE: {
				Tree tree = (Tree)theEObject;
				T result = caseTree(tree);
				if (result == null) result = caseGraph(tree);
				if (result == null) result = caseDataStructure(tree);
				if (result == null) result = caseNamedElement(tree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.TEXTUAL_CONTENT: {
				TextualContent textualContent = (TextualContent)theEObject;
				T result = caseTextualContent(textualContent);
				if (result == null) result = caseDataStructure(textualContent);
				if (result == null) result = caseNamedElement(textualContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.ARFF: {
				ARFF arff = (ARFF)theEObject;
				T result = caseARFF(arff);
				if (result == null) result = caseDataStructure(arff);
				if (result == null) result = caseNamedElement(arff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.RECOMMENDATION_SYSTEM: {
				RecommendationSystem recommendationSystem = (RecommendationSystem)theEObject;
				T result = caseRecommendationSystem(recommendationSystem);
				if (result == null) result = caseNamedElement(recommendationSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.MACHINE_LEARNING_BASED_RS: {
				MachineLearningBasedRS machineLearningBasedRS = (MachineLearningBasedRS)theEObject;
				T result = caseMachineLearningBasedRS(machineLearningBasedRS);
				if (result == null) result = caseRecommendationSystem(machineLearningBasedRS);
				if (result == null) result = caseNamedElement(machineLearningBasedRS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.MEMORY_BASED_RS_NOTSURE: {
				MemoryBasedRS_NOTSURE memoryBasedRS_NOTSURE = (MemoryBasedRS_NOTSURE)theEObject;
				T result = caseMemoryBasedRS_NOTSURE(memoryBasedRS_NOTSURE);
				if (result == null) result = caseRecommendationSystem(memoryBasedRS_NOTSURE);
				if (result == null) result = caseNamedElement(memoryBasedRS_NOTSURE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.FILTERING_RS: {
				FilteringRS filteringRS = (FilteringRS)theEObject;
				T result = caseFilteringRS(filteringRS);
				if (result == null) result = caseRecommendationSystem(filteringRS);
				if (result == null) result = caseNamedElement(filteringRS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.DATA_MINING_RS: {
				DataMiningRS dataMiningRS = (DataMiningRS)theEObject;
				T result = caseDataMiningRS(dataMiningRS);
				if (result == null) result = caseRecommendationSystem(dataMiningRS);
				if (result == null) result = caseNamedElement(dataMiningRS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.CUSTOM_RECOMMENDER_SOREC: {
				CustomRecommender_SOREC customRecommender_SOREC = (CustomRecommender_SOREC)theEObject;
				T result = caseCustomRecommender_SOREC(customRecommender_SOREC);
				if (result == null) result = caseRecommendationSystem(customRecommender_SOREC);
				if (result == null) result = caseNamedElement(customRecommender_SOREC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.RECOMMENDATION_SETTING: {
				RecommendationSetting recommendationSetting = (RecommendationSetting)theEObject;
				T result = caseRecommendationSetting(recommendationSetting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.GENETIC_ALGORITHM: {
				GeneticAlgorithm geneticAlgorithm = (GeneticAlgorithm)theEObject;
				T result = caseGeneticAlgorithm(geneticAlgorithm);
				if (result == null) result = caseRecommendationSystem(geneticAlgorithm);
				if (result == null) result = caseNamedElement(geneticAlgorithm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.USER_STUDY: {
				UserStudy userStudy = (UserStudy)theEObject;
				T result = caseUserStudy(userStudy);
				if (result == null) result = caseValidationTechnique(userStudy);
				if (result == null) result = caseNamedElement(userStudy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.CROSS_VALIDATION: {
				CrossValidation crossValidation = (CrossValidation)theEObject;
				T result = caseCrossValidation(crossValidation);
				if (result == null) result = caseAutomatedValidation(crossValidation);
				if (result == null) result = caseValidationTechnique(crossValidation);
				if (result == null) result = caseNamedElement(crossValidation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.RECOMMENDATION_CONTEXT: {
				RecommendationContext recommendationContext = (RecommendationContext)theEObject;
				T result = caseRecommendationContext(recommendationContext);
				if (result == null) result = caseNamedElement(recommendationContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.DEPENDENCY_MANAGER: {
				DependencyManager dependencyManager = (DependencyManager)theEObject;
				T result = caseDependencyManager(dependencyManager);
				if (result == null) result = caseDataSource(dependencyManager);
				if (result == null) result = caseNamedElement(dependencyManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.VARIABLE_RELATION: {
				VariableRelation variableRelation = (VariableRelation)theEObject;
				T result = caseVariableRelation(variableRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.GROUND_TRUTH_EXTRACTION: {
				GroundTruthExtraction groundTruthExtraction = (GroundTruthExtraction)theEObject;
				T result = caseGroundTruthExtraction(groundTruthExtraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.FILE: {
				File file = (File)theEObject;
				T result = caseFile(file);
				if (result == null) result = caseDataSource(file);
				if (result == null) result = caseNamedElement(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.RECOMMENDED_ITEM: {
				RecommendedItem recommendedItem = (RecommendedItem)theEObject;
				T result = caseRecommendedItem(recommendedItem);
				if (result == null) result = caseNamedElement(recommendedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.CONTEXT_VALIDATION: {
				ContextValidation contextValidation = (ContextValidation)theEObject;
				T result = caseContextValidation(contextValidation);
				if (result == null) result = caseValidationTechnique(contextValidation);
				if (result == null) result = caseNamedElement(contextValidation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.RAW_OUTCOMES: {
				RawOutcomes rawOutcomes = (RawOutcomes)theEObject;
				T result = caseRawOutcomes(rawOutcomes);
				if (result == null) result = casePresentationLayer(rawOutcomes);
				if (result == null) result = caseNamedElement(rawOutcomes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.RANDOM_SPLITTING: {
				RandomSplitting randomSplitting = (RandomSplitting)theEObject;
				T result = caseRandomSplitting(randomSplitting);
				if (result == null) result = caseAutomatedValidation(randomSplitting);
				if (result == null) result = caseValidationTechnique(randomSplitting);
				if (result == null) result = caseNamedElement(randomSplitting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.AUTOMATED_VALIDATION: {
				AutomatedValidation automatedValidation = (AutomatedValidation)theEObject;
				T result = caseAutomatedValidation(automatedValidation);
				if (result == null) result = caseValidationTechnique(automatedValidation);
				if (result == null) result = caseNamedElement(automatedValidation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.DEEP_NN: {
				DeepNN deepNN = (DeepNN)theEObject;
				T result = caseDeepNN(deepNN);
				if (result == null) result = caseMachineLearningBasedRS(deepNN);
				if (result == null) result = caseRecommendationSystem(deepNN);
				if (result == null) result = caseNamedElement(deepNN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.CONVOLUTIONAL_NN: {
				ConvolutionalNN convolutionalNN = (ConvolutionalNN)theEObject;
				T result = caseConvolutionalNN(convolutionalNN);
				if (result == null) result = caseMachineLearningBasedRS(convolutionalNN);
				if (result == null) result = caseRecommendationSystem(convolutionalNN);
				if (result == null) result = caseNamedElement(convolutionalNN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.BAYESIAN: {
				Bayesian bayesian = (Bayesian)theEObject;
				T result = caseBayesian(bayesian);
				if (result == null) result = caseMachineLearningBasedRS(bayesian);
				if (result == null) result = caseRecommendationSystem(bayesian);
				if (result == null) result = caseNamedElement(bayesian);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.RECURRENT_NN: {
				RecurrentNN recurrentNN = (RecurrentNN)theEObject;
				T result = caseRecurrentNN(recurrentNN);
				if (result == null) result = caseMachineLearningBasedRS(recurrentNN);
				if (result == null) result = caseRecommendationSystem(recurrentNN);
				if (result == null) result = caseNamedElement(recurrentNN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.SVM: {
				SVM svm = (SVM)theEObject;
				T result = caseSVM(svm);
				if (result == null) result = caseMachineLearningBasedRS(svm);
				if (result == null) result = caseRecommendationSystem(svm);
				if (result == null) result = caseNamedElement(svm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.DECISION_TREE: {
				DecisionTree decisionTree = (DecisionTree)theEObject;
				T result = caseDecisionTree(decisionTree);
				if (result == null) result = caseMachineLearningBasedRS(decisionTree);
				if (result == null) result = caseRecommendationSystem(decisionTree);
				if (result == null) result = caseNamedElement(decisionTree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LowcodersPackage.FEED_FORWARD_NN: {
				FeedForwardNN feedForwardNN = (FeedForwardNN)theEObject;
				T result = caseFeedForwardNN(feedForwardNN);
				if (result == null) result = caseMachineLearningBasedRS(feedForwardNN);
				if (result == null) result = caseRecommendationSystem(feedForwardNN);
				if (result == null) result = caseNamedElement(feedForwardNN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataset(Dataset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RS Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RS Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRSModel(RSModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSource(DataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Presentation Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Presentation Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePresentationLayer(PresentationLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebInterface(WebInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebApplication(WebApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDE Integration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDE Integration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDEIntegration(IDEIntegration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traversable Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traversable Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraversableGraph(TraversableGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluation(Evaluation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validation Technique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validation Technique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidationTechnique(ValidationTechnique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsupervised Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsupervised Dataset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsupervisedDataset(UnsupervisedDataset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supervised Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supervised Dataset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupervisedDataset(SupervisedDataset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preprocessing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preprocessing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreprocessing(Preprocessing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeRepository(CodeRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationChannel(CommunicationChannel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bug Tracking System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bug Tracking System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBugTrackingSystem(BugTrackingSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataStructure(DataStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraph(Graph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matrix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatrix(Matrix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTree(Tree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textual Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textual Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextualContent(TextualContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ARFF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ARFF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseARFF(ARFF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recommendation System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recommendation System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecommendationSystem(RecommendationSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine Learning Based RS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine Learning Based RS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachineLearningBasedRS(MachineLearningBasedRS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Based RS NOTSURE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Based RS NOTSURE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryBasedRS_NOTSURE(MemoryBasedRS_NOTSURE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filtering RS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filtering RS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilteringRS(FilteringRS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Mining RS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Mining RS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataMiningRS(DataMiningRS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Recommender SOREC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Recommender SOREC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomRecommender_SOREC(CustomRecommender_SOREC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recommendation Setting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recommendation Setting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecommendationSetting(RecommendationSetting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Genetic Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Genetic Algorithm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneticAlgorithm(GeneticAlgorithm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Study</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Study</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserStudy(UserStudy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cross Validation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cross Validation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrossValidation(CrossValidation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recommendation Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recommendation Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecommendationContext(RecommendationContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependencyManager(DependencyManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableRelation(VariableRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ground Truth Extraction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ground Truth Extraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroundTruthExtraction(GroundTruthExtraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recommended Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recommended Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecommendedItem(RecommendedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Validation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Validation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextValidation(ContextValidation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raw Outcomes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raw Outcomes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRawOutcomes(RawOutcomes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Random Splitting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Random Splitting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRandomSplitting(RandomSplitting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Automated Validation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Automated Validation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutomatedValidation(AutomatedValidation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deep NN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deep NN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeepNN(DeepNN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Convolutional NN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Convolutional NN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConvolutionalNN(ConvolutionalNN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bayesian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bayesian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBayesian(Bayesian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recurrent NN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recurrent NN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecurrentNN(RecurrentNN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SVM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SVM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSVM(SVM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionTree(DecisionTree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feed Forward NN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feed Forward NN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeedForwardNN(FeedForwardNN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LowcodersSwitch
