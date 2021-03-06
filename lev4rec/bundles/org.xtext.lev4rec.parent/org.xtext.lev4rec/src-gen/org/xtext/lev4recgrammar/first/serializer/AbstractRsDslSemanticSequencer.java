/*
 * generated by Xtext 2.23.0
 */
package org.xtext.lev4recgrammar.first.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.lev4recgrammar.first.rsDsl.ARFF;
import org.xtext.lev4recgrammar.first.rsDsl.AdditiveFeedback;
import org.xtext.lev4recgrammar.first.rsDsl.AutomatedValidation;
import org.xtext.lev4recgrammar.first.rsDsl.Bayesian;
import org.xtext.lev4recgrammar.first.rsDsl.BugTrackingSystem;
import org.xtext.lev4recgrammar.first.rsDsl.CodeRepository;
import org.xtext.lev4recgrammar.first.rsDsl.CommunicationChannel;
import org.xtext.lev4recgrammar.first.rsDsl.ContextValidation;
import org.xtext.lev4recgrammar.first.rsDsl.ConvolutionalNN;
import org.xtext.lev4recgrammar.first.rsDsl.CrossValidation;
import org.xtext.lev4recgrammar.first.rsDsl.CustomRecommender;
import org.xtext.lev4recgrammar.first.rsDsl.DataMiningRS;
import org.xtext.lev4recgrammar.first.rsDsl.DecisionTree;
import org.xtext.lev4recgrammar.first.rsDsl.DeepNN;
import org.xtext.lev4recgrammar.first.rsDsl.DependencyManager;
import org.xtext.lev4recgrammar.first.rsDsl.Evaluation;
import org.xtext.lev4recgrammar.first.rsDsl.FeedForwardNN;
import org.xtext.lev4recgrammar.first.rsDsl.FeedbackComponent;
import org.xtext.lev4recgrammar.first.rsDsl.File;
import org.xtext.lev4recgrammar.first.rsDsl.FilteringRS;
import org.xtext.lev4recgrammar.first.rsDsl.GUIElement;
import org.xtext.lev4recgrammar.first.rsDsl.GeneticAlgorithm;
import org.xtext.lev4recgrammar.first.rsDsl.Graph;
import org.xtext.lev4recgrammar.first.rsDsl.GroundTruthExtraction;
import org.xtext.lev4recgrammar.first.rsDsl.HybridFeedback;
import org.xtext.lev4recgrammar.first.rsDsl.IDEIntegration;
import org.xtext.lev4recgrammar.first.rsDsl.ImplicitFeedback;
import org.xtext.lev4recgrammar.first.rsDsl.MachineLearningBasedRS;
import org.xtext.lev4recgrammar.first.rsDsl.Matrix;
import org.xtext.lev4recgrammar.first.rsDsl.Preprocessing;
import org.xtext.lev4recgrammar.first.rsDsl.ProactiveHandler;
import org.xtext.lev4recgrammar.first.rsDsl.RSModel;
import org.xtext.lev4recgrammar.first.rsDsl.RandomSplitting;
import org.xtext.lev4recgrammar.first.rsDsl.Rating;
import org.xtext.lev4recgrammar.first.rsDsl.RawOutcomes;
import org.xtext.lev4recgrammar.first.rsDsl.ReactiveHandler;
import org.xtext.lev4recgrammar.first.rsDsl.RecommendationContext;
import org.xtext.lev4recgrammar.first.rsDsl.RecommendationHandler;
import org.xtext.lev4recgrammar.first.rsDsl.RecommendationSetting;
import org.xtext.lev4recgrammar.first.rsDsl.RecommendationUsage;
import org.xtext.lev4recgrammar.first.rsDsl.RecommendedItem;
import org.xtext.lev4recgrammar.first.rsDsl.RecurrentNN;
import org.xtext.lev4recgrammar.first.rsDsl.RsDslPackage;
import org.xtext.lev4recgrammar.first.rsDsl.SVM;
import org.xtext.lev4recgrammar.first.rsDsl.SupervisedDataset;
import org.xtext.lev4recgrammar.first.rsDsl.TextualContent;
import org.xtext.lev4recgrammar.first.rsDsl.TraversableGraph;
import org.xtext.lev4recgrammar.first.rsDsl.Tree;
import org.xtext.lev4recgrammar.first.rsDsl.UnsupervisedDataset;
import org.xtext.lev4recgrammar.first.rsDsl.UserEvent;
import org.xtext.lev4recgrammar.first.rsDsl.UserStudy;
import org.xtext.lev4recgrammar.first.rsDsl.VSCodePlugin;
import org.xtext.lev4recgrammar.first.rsDsl.Variable;
import org.xtext.lev4recgrammar.first.rsDsl.VariableRelation;
import org.xtext.lev4recgrammar.first.rsDsl.WebApplication;
import org.xtext.lev4recgrammar.first.rsDsl.WebIService;
import org.xtext.lev4recgrammar.first.services.RsDslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractRsDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RsDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RsDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RsDslPackage.ARFF:
				sequence_ARFF(context, (ARFF) semanticObject); 
				return; 
			case RsDslPackage.ADDITIVE_FEEDBACK:
				sequence_AdditiveFeedback(context, (AdditiveFeedback) semanticObject); 
				return; 
			case RsDslPackage.AUTOMATED_VALIDATION:
				sequence_AutomatedValidation_Impl(context, (AutomatedValidation) semanticObject); 
				return; 
			case RsDslPackage.BAYESIAN:
				sequence_Bayesian(context, (Bayesian) semanticObject); 
				return; 
			case RsDslPackage.BUG_TRACKING_SYSTEM:
				sequence_BugTrackingSystem(context, (BugTrackingSystem) semanticObject); 
				return; 
			case RsDslPackage.CODE_REPOSITORY:
				sequence_CodeRepository(context, (CodeRepository) semanticObject); 
				return; 
			case RsDslPackage.COMMUNICATION_CHANNEL:
				sequence_CommunicationChannel(context, (CommunicationChannel) semanticObject); 
				return; 
			case RsDslPackage.CONTEXT_VALIDATION:
				sequence_ContextValidation(context, (ContextValidation) semanticObject); 
				return; 
			case RsDslPackage.CONVOLUTIONAL_NN:
				sequence_ConvolutionalNN(context, (ConvolutionalNN) semanticObject); 
				return; 
			case RsDslPackage.CROSS_VALIDATION:
				sequence_CrossValidation(context, (CrossValidation) semanticObject); 
				return; 
			case RsDslPackage.CUSTOM_RECOMMENDER:
				sequence_CustomRecommender(context, (CustomRecommender) semanticObject); 
				return; 
			case RsDslPackage.DATA_MINING_RS:
				sequence_DataMiningRS(context, (DataMiningRS) semanticObject); 
				return; 
			case RsDslPackage.DECISION_TREE:
				sequence_DecisionTree(context, (DecisionTree) semanticObject); 
				return; 
			case RsDslPackage.DEEP_NN:
				sequence_DeepNN(context, (DeepNN) semanticObject); 
				return; 
			case RsDslPackage.DEPENDENCY_MANAGER:
				sequence_DependencyManager(context, (DependencyManager) semanticObject); 
				return; 
			case RsDslPackage.EVALUATION:
				sequence_Evaluation(context, (Evaluation) semanticObject); 
				return; 
			case RsDslPackage.FEED_FORWARD_NN:
				sequence_FeedForwardNN(context, (FeedForwardNN) semanticObject); 
				return; 
			case RsDslPackage.FEEDBACK_COMPONENT:
				sequence_FeedbackComponent(context, (FeedbackComponent) semanticObject); 
				return; 
			case RsDslPackage.FILE:
				sequence_File(context, (File) semanticObject); 
				return; 
			case RsDslPackage.FILTERING_RS:
				sequence_FilteringRS(context, (FilteringRS) semanticObject); 
				return; 
			case RsDslPackage.GUI_ELEMENT:
				sequence_GUIElement(context, (GUIElement) semanticObject); 
				return; 
			case RsDslPackage.GENETIC_ALGORITHM:
				sequence_GeneticAlgorithm(context, (GeneticAlgorithm) semanticObject); 
				return; 
			case RsDslPackage.GRAPH:
				sequence_Graph_Impl(context, (Graph) semanticObject); 
				return; 
			case RsDslPackage.GROUND_TRUTH_EXTRACTION:
				sequence_GroundTruthExtraction(context, (GroundTruthExtraction) semanticObject); 
				return; 
			case RsDslPackage.HYBRID_FEEDBACK:
				sequence_HybridFeedback(context, (HybridFeedback) semanticObject); 
				return; 
			case RsDslPackage.IDE_INTEGRATION:
				sequence_IDEIntegration_Impl(context, (IDEIntegration) semanticObject); 
				return; 
			case RsDslPackage.IMPLICIT_FEEDBACK:
				sequence_ImplicitFeedback(context, (ImplicitFeedback) semanticObject); 
				return; 
			case RsDslPackage.MACHINE_LEARNING_BASED_RS:
				sequence_MachineLearningBasedRS_Impl(context, (MachineLearningBasedRS) semanticObject); 
				return; 
			case RsDslPackage.MATRIX:
				sequence_Matrix(context, (Matrix) semanticObject); 
				return; 
			case RsDslPackage.PREPROCESSING:
				sequence_Preprocessing(context, (Preprocessing) semanticObject); 
				return; 
			case RsDslPackage.PROACTIVE_HANDLER:
				sequence_ProactiveHandler(context, (ProactiveHandler) semanticObject); 
				return; 
			case RsDslPackage.RS_MODEL:
				sequence_RSModel(context, (RSModel) semanticObject); 
				return; 
			case RsDslPackage.RANDOM_SPLITTING:
				sequence_RandomSplitting(context, (RandomSplitting) semanticObject); 
				return; 
			case RsDslPackage.RATING:
				sequence_Rating(context, (Rating) semanticObject); 
				return; 
			case RsDslPackage.RAW_OUTCOMES:
				sequence_RawOutcomes(context, (RawOutcomes) semanticObject); 
				return; 
			case RsDslPackage.REACTIVE_HANDLER:
				sequence_ReactiveHandler(context, (ReactiveHandler) semanticObject); 
				return; 
			case RsDslPackage.RECOMMENDATION_CONTEXT:
				sequence_RecommendationContext(context, (RecommendationContext) semanticObject); 
				return; 
			case RsDslPackage.RECOMMENDATION_HANDLER:
				sequence_RecommendationHandler_Impl(context, (RecommendationHandler) semanticObject); 
				return; 
			case RsDslPackage.RECOMMENDATION_SETTING:
				sequence_RecommendationSetting(context, (RecommendationSetting) semanticObject); 
				return; 
			case RsDslPackage.RECOMMENDATION_USAGE:
				sequence_RecommendationUsage(context, (RecommendationUsage) semanticObject); 
				return; 
			case RsDslPackage.RECOMMENDED_ITEM:
				sequence_RecommendedItem(context, (RecommendedItem) semanticObject); 
				return; 
			case RsDslPackage.RECURRENT_NN:
				sequence_RecurrentNN(context, (RecurrentNN) semanticObject); 
				return; 
			case RsDslPackage.SVM:
				sequence_SVM(context, (SVM) semanticObject); 
				return; 
			case RsDslPackage.SUPERVISED_DATASET:
				sequence_SupervisedDataset(context, (SupervisedDataset) semanticObject); 
				return; 
			case RsDslPackage.TEXTUAL_CONTENT:
				sequence_TextualContent(context, (TextualContent) semanticObject); 
				return; 
			case RsDslPackage.TRAVERSABLE_GRAPH:
				sequence_TraversableGraph(context, (TraversableGraph) semanticObject); 
				return; 
			case RsDslPackage.TREE:
				sequence_Tree(context, (Tree) semanticObject); 
				return; 
			case RsDslPackage.UNSUPERVISED_DATASET:
				sequence_UnsupervisedDataset(context, (UnsupervisedDataset) semanticObject); 
				return; 
			case RsDslPackage.USER_EVENT:
				sequence_UserEvent(context, (UserEvent) semanticObject); 
				return; 
			case RsDslPackage.USER_STUDY:
				sequence_UserStudy(context, (UserStudy) semanticObject); 
				return; 
			case RsDslPackage.VS_CODE_PLUGIN:
				sequence_VSCodePlugin(context, (VSCodePlugin) semanticObject); 
				return; 
			case RsDslPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			case RsDslPackage.VARIABLE_RELATION:
				sequence_VariableRelation(context, (VariableRelation) semanticObject); 
				return; 
			case RsDslPackage.WEB_APPLICATION:
				sequence_WebApplication(context, (WebApplication) semanticObject); 
				return; 
			case RsDslPackage.WEB_ISERVICE:
				sequence_WebIService(context, (WebIService) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DataStructure returns ARFF
	 *     ARFF returns ARFF
	 *
	 * Constraint:
	 *     (name=EString (variables+=[Variable|EString] variables+=[Variable|EString]*)?)
	 */
	protected void sequence_ARFF(ISerializationContext context, ARFF semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feedback returns AdditiveFeedback
	 *     AdditiveFeedback returns AdditiveFeedback
	 *
	 * Constraint:
	 *     (numOfInsertion=EInt? recommender=[RecommendationSystem|EString]? item=RecommendedItem?)
	 */
	protected void sequence_AdditiveFeedback(ISerializationContext context, AdditiveFeedback semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ValidationTechnique returns AutomatedValidation
	 *     AutomatedValidation_Impl returns AutomatedValidation
	 *
	 * Constraint:
	 *     (name=EString nOfRecommendations=EInt library=ValidationLibrary?)
	 */
	protected void sequence_AutomatedValidation_Impl(ISerializationContext context, AutomatedValidation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RecommendationSystem returns Bayesian
	 *     Bayesian returns Bayesian
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         generator=PyLibType? 
	 *         numEpochs=EInt? 
	 *         learningRate=EInt? 
	 *         miniBatchSize=EInt? 
	 *         (settings+=RecommendationSetting settings+=RecommendationSetting*)? 
	 *         scope=RecommendedItem? 
	 *         context=RecommendationContext?
	 *     )
	 */
	protected void sequence_Bayesian(ISerializationContext context, Bayesian semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataSource returns BugTrackingSystem
	 *     BugTrackingSystem returns BugTrackingSystem
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_BugTrackingSystem(ISerializationContext context, BugTrackingSystem semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RsDslPackage.Literals.DATA_SOURCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RsDslPackage.Literals.DATA_SOURCE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBugTrackingSystemAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DataSource returns CodeRepository
	 *     CodeRepository returns CodeRepository
	 *
	 * Constraint:
	 *     (metadata?='metadata'? name=EString)
	 */
	protected void sequence_CodeRepository(ISerializationContext context, CodeRepository semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataSource returns CommunicationChannel
	 *     CommunicationChannel returns CommunicationChannel
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_CommunicationChannel(ISerializationContext context, CommunicationChannel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RsDslPackage.Literals.DATA_SOURCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RsDslPackage.Literals.DATA_SOURCE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCommunicationChannelAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ValidationTechnique returns ContextValidation
	 *     ContextValidation returns ContextValidation
	 *
	 * Constraint:
	 *     (name=EString nOfRecommendations=EInt testContext=[RecommendationContext|EString]?)
	 */
	protected void sequence_ContextValidation(ISerializationContext context, ContextValidation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RecommendationSystem returns ConvolutionalNN
	 *     ConvolutionalNN returns ConvolutionalNN
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         generator=PyLibType? 
	 *         numEpochs=EInt? 
	 *         learningRate=EInt? 
	 *         miniBatchSize=EInt? 
	 *         (settings+=RecommendationSetting settings+=RecommendationSetting*)? 
	 *         scope=RecommendedItem? 
	 *         context=RecommendationContext?
	 *     )
	 */
	protected void sequence_ConvolutionalNN(ISerializationContext context, ConvolutionalNN semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ValidationTechnique returns CrossValidation
	 *     CrossValidation returns CrossValidation
	 *
	 * Constraint:
	 *     (name=EString nOfRecommendations=EInt library=ValidationLibrary? numberOfFold=EInt? groundTruthExtractor=GroundTruthExtraction?)
	 */
	protected void sequence_CrossValidation(ISerializationContext context, CrossValidation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RecommendationSystem returns CustomRecommender
	 *     CustomRecommender returns CustomRecommender
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         generator=PyLibType? 
	 *         description=EString? 
	 *         (requiredTools+=EString requiredTools+=EString*)? 
	 *         (settings+=RecommendationSetting settings+=RecommendationSetting*)? 
	 *         scope=RecommendedItem? 
	 *         context=RecommendationContext?
	 *     )
	 */
	protected void sequence_CustomRecommender(ISerializationContext context, CustomRecommender semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RecommendationSystem returns DataMiningRS
	 *     DataMiningRS returns DataMiningRS
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         generator=PyLibType? 
	 *         dataMiningRSAlgorithm=DataMiningRSAlgorithm? 
	 *         (settings+=RecommendationSetting settings+=RecommendationSetting*)? 
	 *         scope=RecommendedItem? 
	 *         context=RecommendationContext?
	 *     )
	 */
	protected void sequence_DataMiningRS(ISerializationContext context, DataMiningRS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RecommendationSystem returns DecisionTree
	 *     DecisionTree returns DecisionTree
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         generator=PyLibType? 
	 *         numEpochs=EInt? 
	 *         learningRate=EInt? 
	 *         miniBatchSize=EInt? 
	 *         (settings+=RecommendationSetting settings+=RecommendationSetting*)? 
	 *         scope=RecommendedItem? 
	 *         context=RecommendationContext?
	 *     )
	 */
	protected void sequence_DecisionTree(ISerializationContext context, DecisionTree semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RecommendationSystem returns DeepNN
	 *     DeepNN returns DeepNN
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         generator=PyLibType? 
	 *         numEpochs=EInt? 
	 *         learningRate=EInt? 
	 *         miniBatchSize=EInt? 
	 *         numHiddenLayer=EInt? 
	 *         (settings+=RecommendationSetting settings+=RecommendationSetting*)? 
	 *         scope=RecommendedItem? 
	 *         context=RecommendationContext?
	 *     )
	 */
	protected void sequence_DeepNN(ISerializationContext context, DeepNN semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataSource returns DependencyManager
	 *     DependencyManager returns DependencyManager
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_DependencyManager(ISerializationContext context, DependencyManager semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RsDslPackage.Literals.DATA_SOURCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RsDslPackage.Literals.DATA_SOURCE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDependencyManagerAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Evaluation returns Evaluation
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (baselines+=EString baselines+=EString*)? 
	 *         (metrics+=Metric metrics+=Metric*)? 
	 *         (validationTechnique+=ValidationTechnique validationTechnique+=ValidationTechnique*)?
	 *     )
	 */
	protected void sequence_Evaluation(ISerializationContext context, Evaluation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RecommendationSystem returns FeedForwardNN
	 *     FeedForwardNN returns FeedForwardNN
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         generator=PyLibType? 
	 *         numEpochs=EInt? 
	 *         learningRate=EInt? 
	 *         miniBatchSize=EInt? 
	 *         solver=SolverType? 
	 *         alpha=EFloat? 
	 *         activationFunction=ActivationType? 
	 *         randomState=EInt? 
	 *         (settings+=RecommendationSetting settings+=RecommendationSetting*)? 
	 *         scope=RecommendedItem? 
	 *         context=RecommendationContext?
	 *     )
	 */
	protected void sequence_FeedForwardNN(ISerializationContext context, FeedForwardNN semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeedbackComponent returns FeedbackComponent
	 *
	 * Constraint:
	 *     (library=FeedbackLibType? query=RecommendationContext? expressedFeedback=Feedback?)
	 */
	protected void sequence_FeedbackComponent(ISerializationContext context, FeedbackComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataSource returns File
	 *     File returns File
	 *
	 * Constraint:
	 *     (name=EString sourcePath=EString? encoding=EString?)
	 */
	protected void sequence_File(ISerializationContext context, File semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RecommendationSystem returns FilteringRS
	 *     FilteringRS returns FilteringRS
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         generator=PyLibType? 
	 *         filteringRSAlgorithm=FilteringRSAlgorithm? 
	 *         similarityCalculator=SimilarityFunction? 
	 *         cutoff=EInt? 
	 *         neighborhood=EInt? 
	 *         (settings+=RecommendationSetting settings+=RecommendationSetting*)? 
	 *         scope=RecommendedItem? 
	 *         context=RecommendationContext?
	 *     )
	 */
	protected void sequence_FilteringRS(ISerializationContext context, FilteringRS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GUIElement returns GUIElement
	 *
	 * Constraint:
	 *     {GUIElement}
	 */
	protected void sequence_GUIElement(ISerializationContext context, GUIElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RecommendationSystem returns GeneticAlgorithm
	 *     GeneticAlgorithm returns GeneticAlgorithm
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         generator=PyLibType? 
	 *         fitnessFunction=EString? 
	 *         searchStrategy=SearchStrategy? 
	 *         mutationOperator=MutationOperation? 
	 *         (settings+=RecommendationSetting settings+=RecommendationSetting*)? 
	 *         scope=RecommendedItem? 
	 *         context=RecommendationContext?
	 *     )
	 */
	protected void sequence_GeneticAlgorithm(ISerializationContext context, GeneticAlgorithm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataStructure returns Graph
	 *     Graph_Impl returns Graph
	 *
	 * Constraint:
	 *     (name=EString (nodes+=[Variable|EString] nodes+=[Variable|EString]*)? relations=VariableRelation?)
	 */
	protected void sequence_Graph_Impl(ISerializationContext context, Graph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GroundTruthExtraction returns GroundTruthExtraction
	 *
	 * Constraint:
	 *     (sizeGT=EString? (splittingRules+=EString splittingRules+=EString*)? targetVariable=[Variable|EString]?)
	 */
	protected void sequence_GroundTruthExtraction(ISerializationContext context, GroundTruthExtraction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feedback returns HybridFeedback
	 *     HybridFeedback returns HybridFeedback
	 *
	 * Constraint:
	 *     item=RecommendedItem?
	 */
	protected void sequence_HybridFeedback(ISerializationContext context, HybridFeedback semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PresentationLayer returns IDEIntegration
	 *     IDEIntegration_Impl returns IDEIntegration
	 *
	 * Constraint:
	 *     (name=EString recommendations=[RecommendedItem|EString]?)
	 */
	protected void sequence_IDEIntegration_Impl(ISerializationContext context, IDEIntegration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feedback returns ImplicitFeedback
	 *     ImplicitFeedback returns ImplicitFeedback
	 *
	 * Constraint:
	 *     item=RecommendedItem?
	 */
	protected void sequence_ImplicitFeedback(ISerializationContext context, ImplicitFeedback semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RecommendationSystem returns MachineLearningBasedRS
	 *     MachineLearningBasedRS_Impl returns MachineLearningBasedRS
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         generator=PyLibType? 
	 *         numEpochs=EInt? 
	 *         learningRate=EInt? 
	 *         miniBatchSize=EInt? 
	 *         (settings+=RecommendationSetting settings+=RecommendationSetting*)? 
	 *         scope=RecommendedItem? 
	 *         context=RecommendationContext?
	 *     )
	 */
	protected void sequence_MachineLearningBasedRS_Impl(ISerializationContext context, MachineLearningBasedRS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataStructure returns Matrix
	 *     Matrix returns Matrix
	 *
	 * Constraint:
	 *     (name=EString (columns+=[Variable|EString] columns+=[Variable|EString]*)?)
	 */
	protected void sequence_Matrix(ISerializationContext context, Matrix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Preprocessing returns Preprocessing
	 *
	 * Constraint:
	 *     (preprocessigTechnique+=PreprocessingTechnique preprocessigTechnique+=PreprocessingTechnique*)?
	 */
	protected void sequence_Preprocessing(ISerializationContext context, Preprocessing semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RecommendationHandler returns ProactiveHandler
	 *     ProactiveHandler returns ProactiveHandler
	 *
	 * Constraint:
	 *     (
	 *         condition?='condition'? 
	 *         name=EString 
	 *         webService=[WebIService|EString]? 
	 *         context=[RecommendationContext|EString]? 
	 *         (usage+=RecommendationUsage usage+=RecommendationUsage*)?
	 *     )
	 */
	protected void sequence_ProactiveHandler(ISerializationContext context, ProactiveHandler semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RSModel returns RSModel
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         dataset=Dataset? 
	 *         presentationLayer=PresentationLayer? 
	 *         evaluation=Evaluation? 
	 *         recommendationSystem=RecommendationSystem 
	 *         feedback=FeedbackComponent?
	 *     )
	 */
	protected void sequence_RSModel(ISerializationContext context, RSModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ValidationTechnique returns RandomSplitting
	 *     RandomSplitting returns RandomSplitting
	 *
	 * Constraint:
	 *     (name=EString nOfRecommendations=EInt library=ValidationLibrary?)
	 */
	protected void sequence_RandomSplitting(ISerializationContext context, RandomSplitting semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feedback returns Rating
	 *     Rating returns Rating
	 *
	 * Constraint:
	 *     (type=RatingType? item=RecommendedItem?)
	 */
	protected void sequence_Rating(ISerializationContext context, Rating semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PresentationLayer returns RawOutcomes
	 *     RawOutcomes returns RawOutcomes
	 *
	 * Constraint:
	 *     (name=EString format=RawFormat? recommendations=[RecommendedItem|EString]?)
	 */
	protected void sequence_RawOutcomes(ISerializationContext context, RawOutcomes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RecommendationHandler returns ReactiveHandler
	 *     ReactiveHandler returns ReactiveHandler
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         webService=[WebIService|EString]? 
	 *         context=[RecommendationContext|EString]? 
	 *         event=[UserEvent|EString]? 
	 *         (usage+=RecommendationUsage usage+=RecommendationUsage*)?
	 *     )
	 */
	protected void sequence_ReactiveHandler(ISerializationContext context, ReactiveHandler semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RecommendationContext returns RecommendationContext
	 *
	 * Constraint:
	 *     (isProactiveSystem?='isProactiveSystem'? name=EString userContext=[DataStructure|EString]?)
	 */
	protected void sequence_RecommendationContext(ISerializationContext context, RecommendationContext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RecommendationHandler returns RecommendationHandler
	 *     RecommendationHandler_Impl returns RecommendationHandler
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         webService=[WebIService|EString]? 
	 *         context=[RecommendationContext|EString]? 
	 *         (usage+=RecommendationUsage usage+=RecommendationUsage*)?
	 *     )
	 */
	protected void sequence_RecommendationHandler_Impl(ISerializationContext context, RecommendationHandler semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RecommendationSetting returns RecommendationSetting
	 *
	 * Constraint:
	 *     (key=EString value=EString)
	 */
	protected void sequence_RecommendationSetting(ISerializationContext context, RecommendationSetting semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RsDslPackage.Literals.RECOMMENDATION_SETTING__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RsDslPackage.Literals.RECOMMENDATION_SETTING__KEY));
			if (transientValues.isValueTransient(semanticObject, RsDslPackage.Literals.RECOMMENDATION_SETTING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RsDslPackage.Literals.RECOMMENDATION_SETTING__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRecommendationSettingAccess().getKeyEStringParserRuleCall_3_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getRecommendationSettingAccess().getValueEStringParserRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RecommendationUsage returns RecommendationUsage
	 *
	 * Constraint:
	 *     (
	 *         usageType=RecommendationUsageType? 
	 *         (recommendedItems+=[RecommendedItem|EString] recommendedItems+=[RecommendedItem|EString]*)? 
	 *         (guielements+=GUIElement guielements+=GUIElement*)?
	 *     )
	 */
	protected void sequence_RecommendationUsage(ISerializationContext context, RecommendationUsage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RecommendedItem returns RecommendedItem
	 *
	 * Constraint:
	 *     (ordered?='ordered'? name=EString (outcame+=[Variable|EString] outcame+=[Variable|EString]*)?)
	 */
	protected void sequence_RecommendedItem(ISerializationContext context, RecommendedItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RecommendationSystem returns RecurrentNN
	 *     RecurrentNN returns RecurrentNN
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         generator=PyLibType? 
	 *         numEpochs=EInt? 
	 *         learningRate=EInt? 
	 *         miniBatchSize=EInt? 
	 *         (settings+=RecommendationSetting settings+=RecommendationSetting*)? 
	 *         scope=RecommendedItem? 
	 *         context=RecommendationContext?
	 *     )
	 */
	protected void sequence_RecurrentNN(ISerializationContext context, RecurrentNN semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RecommendationSystem returns SVM
	 *     SVM returns SVM
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         generator=PyLibType? 
	 *         numEpochs=EInt? 
	 *         learningRate=EInt? 
	 *         miniBatchSize=EInt? 
	 *         kernel=KernelType? 
	 *         (settings+=RecommendationSetting settings+=RecommendationSetting*)? 
	 *         scope=RecommendedItem? 
	 *         context=RecommendationContext?
	 *     )
	 */
	protected void sequence_SVM(ISerializationContext context, SVM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Dataset returns SupervisedDataset
	 *     SupervisedDataset returns SupervisedDataset
	 *
	 * Constraint:
	 *     (
	 *         isBuiltIn?='isBuiltIn'? 
	 *         name=EString 
	 *         (preprocessing+=PreprocessingTechnique preprocessing+=PreprocessingTechnique*)? 
	 *         (datasetManipulationLibrary+=DatasetManipulationLibrary datasetManipulationLibrary+=DatasetManipulationLibrary*)? 
	 *         path=EString 
	 *         (indipendentVariables+=Variable indipendentVariables+=Variable*)? 
	 *         dataStructure=DataStructure? 
	 *         dependatVariable=Variable
	 *     )
	 */
	protected void sequence_SupervisedDataset(ISerializationContext context, SupervisedDataset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataStructure returns TextualContent
	 *     TextualContent returns TextualContent
	 *
	 * Constraint:
	 *     (name=EString rootPath=EString? contents=[Variable|EString]?)
	 */
	protected void sequence_TextualContent(ISerializationContext context, TextualContent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PresentationLayer returns TraversableGraph
	 *     TraversableGraph returns TraversableGraph
	 *
	 * Constraint:
	 *     (name=EString recommendations=[RecommendedItem|EString]?)
	 */
	protected void sequence_TraversableGraph(ISerializationContext context, TraversableGraph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataStructure returns Tree
	 *     Tree returns Tree
	 *
	 * Constraint:
	 *     (name=EString (nodes+=[Variable|EString] nodes+=[Variable|EString]*)? relations=VariableRelation?)
	 */
	protected void sequence_Tree(ISerializationContext context, Tree semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Dataset returns UnsupervisedDataset
	 *     UnsupervisedDataset returns UnsupervisedDataset
	 *
	 * Constraint:
	 *     (
	 *         isBuiltIn?='isBuiltIn'? 
	 *         name=EString 
	 *         (preprocessing+=PreprocessingTechnique preprocessing+=PreprocessingTechnique*)? 
	 *         (datasetManipulationLibrary+=DatasetManipulationLibrary datasetManipulationLibrary+=DatasetManipulationLibrary*)? 
	 *         path=EString 
	 *         (indipendentVariables+=Variable indipendentVariables+=Variable*)? 
	 *         dataStructure=DataStructure?
	 *     )
	 */
	protected void sequence_UnsupervisedDataset(ISerializationContext context, UnsupervisedDataset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UserEvent returns UserEvent
	 *
	 * Constraint:
	 *     eventType=UserEventType?
	 */
	protected void sequence_UserEvent(ISerializationContext context, UserEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ValidationTechnique returns UserStudy
	 *     UserStudy returns UserStudy
	 *
	 * Constraint:
	 *     (name=EString nOfRecommendations=EInt type=UserStudyType? analysis=UserStudyAnalysis?)
	 */
	protected void sequence_UserStudy(ISerializationContext context, UserStudy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PresentationLayer returns VSCodePlugin
	 *     VSCodePlugin returns VSCodePlugin
	 *
	 * Constraint:
	 *     (name=EString recommendations=[RecommendedItem|EString]? handler+=[RecommendationHandler|EString] handler+=[RecommendationHandler|EString]*)
	 */
	protected void sequence_VSCodePlugin(ISerializationContext context, VSCodePlugin semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VariableRelation returns VariableRelation
	 *
	 * Constraint:
	 *     (source=[Variable|EString]? target=[Variable|EString]?)
	 */
	protected void sequence_VariableRelation(ISerializationContext context, VariableRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     (
	 *         isMissingValueAllowed?='isMissingValueAllowed'? 
	 *         isMultiple?='isMultiple'? 
	 *         name=EString 
	 *         type=VariableType 
	 *         dataSource=DataSource 
	 *         preprocessing=Preprocessing?
	 *     )
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PresentationLayer returns WebApplication
	 *     WebApplication returns WebApplication
	 *
	 * Constraint:
	 *     (name=EString library=WebInterfaceLibrary? port=EString? host=EString? recommendations=[RecommendedItem|EString]?)
	 */
	protected void sequence_WebApplication(ISerializationContext context, WebApplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PresentationLayer returns WebIService
	 *     WebIService returns WebIService
	 *
	 * Constraint:
	 *     (name=EString library=WebInterfaceLibrary? recommendations=[RecommendedItem|EString]?)
	 */
	protected void sequence_WebIService(ISerializationContext context, WebIService semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
