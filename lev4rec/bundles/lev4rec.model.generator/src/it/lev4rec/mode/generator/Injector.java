package it.lev4rec.mode.generator;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.xml.sax.SAXException;

import com.google.common.collect.Lists;

import de.ovgu.featureide.fm.core.analysis.cnf.formula.FeatureModelFormula;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.configuration.Selection;
import de.ovgu.featureide.fm.core.init.FMCoreLibrary;
import de.ovgu.featureide.fm.core.init.LibraryManager;
import de.ovgu.featureide.fm.core.io.manager.ConfigurationManager;
import de.ovgu.featureide.fm.core.io.manager.FeatureModelManager;
import de.ovgu.featureide.fm.core.io.manager.FileHandler;
import lowcoders.AutomatedValidation;
import lowcoders.Bayesian;
import lowcoders.DataMiningRS;
import lowcoders.DataMiningRSAlgorithm;
import lowcoders.DataStructure;
import lowcoders.Dataset;
import lowcoders.DatasetManipulationLibrary;
import lowcoders.DecisionTree;
import lowcoders.DeepNN;
import lowcoders.Evaluation;
import lowcoders.FeedForwardNN;
import lowcoders.FilteringRS;
import lowcoders.FilteringRSAlgorithm;
import lowcoders.LowcodersFactory;
import lowcoders.MachineLearningBasedRS;

import lowcoders.PreprocessingTechnique;
import lowcoders.PresentationLayer;
import lowcoders.PyLibType;
import lowcoders.RSModel;
import lowcoders.RecommendationSystem;
import lowcoders.RecurrentNN;
import lowcoders.ValidationLibrary;
import lowcoders.WebInterface;
import lowcoders.WebInterfaceLibrary;

public class Injector {

	private final Path featureModelPath;
	private final Path configurationPath;

	public static void main(String[] args) {
		Injector i = new Injector(
				"/Users/juri/development/git/lowcodeDSL/bundles/it.disim.univaq.lowcode.feature.model/model.xml",
				"/Users/juri/development/git/lowcodeDSL/bundles/it.disim.univaq.lowcode.feature.model/configs/aurora.xml");
		try {
			serializeModel(i.generate(), "demo.xmi");
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Injector(String featureModelPath, String configurationPath) {
		this.featureModelPath = Paths.get(featureModelPath);
		this.configurationPath = Paths.get(configurationPath);

	}

	public RSModel generate() throws ParserConfigurationException, SAXException, IOException {
		Configuration configuration = getConfiguration();
		RSModel model = LowcodersFactory.eINSTANCE.createRSModel();
		model.setName("Generated Model");
		Dataset dataset = getDataSet(configuration);
		if (dataset != null)
			model.setDataset(dataset);
		RecommendationSystem recommendationSystem = getRecommendationSystem(configuration);
		if (recommendationSystem != null)
			model.setRecommendationSystem(recommendationSystem);

		Evaluation evaluation = getEvaluation(configuration);
		model.setEvaluation(evaluation);
		PresentationLayer presentationLayer = getPresentationLayer(configuration);
		if (presentationLayer != null)
			model.setPresentationLayer(presentationLayer);

		return model;
	}

	private Evaluation getEvaluation(Configuration configuration) {
		Evaluation evaluation = LowcodersFactory.eINSTANCE.createEvaluation();
		AutomatedValidation automatedValidation = null;
		if (isSelected(configuration, "SplittingKfold")) {
			automatedValidation = LowcodersFactory.eINSTANCE.createCrossValidation();
			if (isSelected(configuration, "SKCrossFold") || isSelected(configuration, "SKRandomSplit"))
				automatedValidation.setLibrary(ValidationLibrary.SKLEARN);
			if (isSelected(configuration, "SurpriseCrossFold") || isSelected(configuration, "SurpriseRandomSplit"))
				automatedValidation.setLibrary(ValidationLibrary.SURPRISE);
			evaluation.getValidationtechnique().add(automatedValidation);
		}
		if (isSelected(configuration, "RandomSpltting")) {
			automatedValidation = LowcodersFactory.eINSTANCE.createRandomSplitting();
			if (isSelected(configuration, "SKCrossFold") || isSelected(configuration, "SKRandomSplit"))
				automatedValidation.setLibrary(ValidationLibrary.SKLEARN);
			if (isSelected(configuration, "SurpriseCrossFold") || isSelected(configuration, "SurpriseRandomSplit"))
				automatedValidation.setLibrary(ValidationLibrary.SURPRISE);
			evaluation.getValidationtechnique().add(automatedValidation);
		}
		if (isSelected(configuration, "UserStudy"))
			evaluation.getValidationtechnique().add(LowcodersFactory.eINSTANCE.createUserStudy());
		return evaluation;
	}

	private PresentationLayer getPresentationLayer(Configuration configuration) {
		PresentationLayer presentationLayer = null;
		if (isSelected(configuration, "WebInterface")) {
			WebInterface webInterface = LowcodersFactory.eINSTANCE.createWebInterface();
			if (isSelected(configuration, "Flask"))
				webInterface.setLibrary(WebInterfaceLibrary.FLASK);
			if (isSelected(configuration, "Spring"))
				webInterface.setLibrary(WebInterfaceLibrary.SPRING);
			presentationLayer = webInterface;
		}
		if (isSelected(configuration, "IDEPlugin")) {
			presentationLayer = LowcodersFactory.eINSTANCE.createIDEIntegration();
		}
		if (isSelected(configuration, "RawOutcomes"))
			presentationLayer = LowcodersFactory.eINSTANCE.createRawOutcomes();
		return presentationLayer;
	}

	private RecommendationSystem getRecommendationSystem(Configuration configuration) {
		RecommendationSystem recommendationSystem = null;

		// COLLABORATIVE FILTERING
		if (isSelected(configuration, "ItemBased")) {
			FilteringRS filtering = LowcodersFactory.eINSTANCE.createFilteringRS();
			filtering.setFilteringRSAlgorithm(FilteringRSAlgorithm.ITEM_BASED);
			recommendationSystem = filtering;
		}
		if (isSelected(configuration, "UserBased")) {
			FilteringRS filtering = LowcodersFactory.eINSTANCE.createFilteringRS();
			filtering.setFilteringRSAlgorithm(FilteringRSAlgorithm.USER_BASED);
			recommendationSystem = filtering;
		}

		if (isSelected(configuration, "ContentBased")) {
			FilteringRS filtering = LowcodersFactory.eINSTANCE.createFilteringRS();
			filtering.setFilteringRSAlgorithm(FilteringRSAlgorithm.CONTENT_BASED);
			recommendationSystem = filtering;
		}
//		// CLASSIFICATION
//		if (isSelected(configuration, "SVM")) {
//			MachineLearningBasedRS machineLearning = LowcodersFactory.eINSTANCE.createMachineLearningBasedRS();
//			machineLearning.setMachineLearningRSAlgoithm(MachineLearningRSAlgorithm.SVM);
//			recommendationSystem = machineLearning;
//		}
//		if (isSelected(configuration, "MNB")) {
//			MachineLearningBasedRS machineLearning = LowcodersFactory.eINSTANCE.createMachineLearningBasedRS();
//			machineLearning.setMachineLearningRSAlgoithm(MachineLearningRSAlgorithm.MNB);
//			recommendationSystem = machineLearning;
//		}

		if (isSelected(configuration, "SupervisedRNN") || isSelected(configuration, "UnsupervisedRNN")) {
			RecurrentNN machineLearningBasedRS = LowcodersFactory.eINSTANCE.createRecurrentNN();
			recommendationSystem = machineLearningBasedRS;
		}
		if (isSelected(configuration, "SupervisedDNN") || isSelected(configuration, "UnsupervisedDNN")) {
			
			DeepNN machineLearningBasedRS = LowcodersFactory.eINSTANCE.createDeepNN();
			
			recommendationSystem = machineLearningBasedRS;
		}
		
		if (isSelected(configuration, "SupervisedFeedForwardNN")
				|| isSelected(configuration, "UnsupervisedFeedForwardNN")) {
			FeedForwardNN machineLearningBasedRS = LowcodersFactory.eINSTANCE.createFeedForwardNN();
			recommendationSystem = machineLearningBasedRS;
		}

	
		if (isSelected(configuration, "BayesianNN")) {
			Bayesian machineLearningBasedRS = LowcodersFactory.eINSTANCE.createBayesian();
			recommendationSystem = machineLearningBasedRS;
		}
		if (isSelected(configuration, "DecisionTree")) {
			DecisionTree machineLearningBasedRS = LowcodersFactory.eINSTANCE.createDecisionTree();
			recommendationSystem = machineLearningBasedRS;
		}

//		if (isSelected(configuration, "KNeighborhood")) {
//			MachineLearningBasedRS machineLearningBasedRS = LowcodersFactory.eINSTANCE.createMachineLearningBasedRS();
//			machineLearningBasedRS.setMachineLearningRSAlgoithm(MachineLearningRSAlgorithm.);
//			recommendationSystem = machineLearningBasedRS;
//		}
		if (isSelected(configuration, "HierarchicalClustering")) {
			DataMiningRS dataMiningRS = LowcodersFactory.eINSTANCE.createDataMiningRS();
			dataMiningRS.setDataMiningRSAlgorithm(DataMiningRSAlgorithm.CLUSTERING);
			recommendationSystem = dataMiningRS;
		}

		recommendationSystem.setName("GENERATED RECOMMENDER SYSTEM");
		if (isSelected(configuration, "Sklearn")) {
			recommendationSystem.setGenerator(PyLibType.SKLEARN);
		}
		if (isSelected(configuration, "Surprise")) {
			recommendationSystem.setGenerator(PyLibType.SURPRISE);
		}
		if (isSelected(configuration, "TensorFlow")) {
			recommendationSystem.setGenerator(PyLibType.TENSOR_FLOW);
		}
		if (isSelected(configuration, "PyTorch")) {
			recommendationSystem.setGenerator(PyLibType.PYTORCH);
		}
		// recommendationSystem.setGenerator(value);
		return recommendationSystem;
	}

	private boolean isSelected(Configuration configuration, String featureName) {
		return configuration.getSelectableFeature(featureName).getAutomatic() == Selection.SELECTED
				|| configuration.getSelectableFeature(featureName).getManual() == Selection.SELECTED;
	}

	private Configuration getConfiguration() {
		LibraryManager.registerLibrary(FMCoreLibrary.getInstance());
		final FileHandler<IFeatureModel> fh = FeatureModelManager.getFileHandler(featureModelPath);
		FeatureModelFormula featureModelFormula = new FeatureModelFormula(fh.getObject());
		Configuration configuration = ConfigurationManager.load(configurationPath);
		configuration.updateFeatures(featureModelFormula);
		return configuration;
	}

	private Dataset getDataSet(Configuration configuration) {
		Dataset dataset = null;

		if (isSelected(configuration, "UnsupervisedDataset")) {
			dataset = LowcodersFactory.eINSTANCE.createUnsupervisedDataset();
			dataset.setName("DATASET NAME");

		}
		if (isSelected(configuration, "SupervisedDataset")) {
			dataset = LowcodersFactory.eINSTANCE.createSupervisedDataset();
			dataset.setName("DATASET NAME");
		}
		// DataStructure
		if (dataset != null) {
			DataStructure dataStructure = null;
			if (isSelected(configuration, "Matrix"))
				dataStructure = LowcodersFactory.eINSTANCE.createMatrix();

			if (isSelected(configuration, "GraphData"))
				dataStructure = LowcodersFactory.eINSTANCE.createGraph();

			if (isSelected(configuration, "ARFF"))
				dataStructure = LowcodersFactory.eINSTANCE.createARFF();

			if (isSelected(configuration, "Tree"))
				dataStructure = LowcodersFactory.eINSTANCE.createTree();

			if (isSelected(configuration, "TextualData"))
				dataStructure = LowcodersFactory.eINSTANCE.createMatrix();

			if (dataStructure != null) {
				dataset.setDataStructure(dataStructure);
			}

			// Preprocessing
			List<PreprocessingTechnique> preprocessingTechniques = Lists.newArrayList();
			if (isSelected(configuration, "NLP"))
				preprocessingTechniques.add(PreprocessingTechnique.NLP);
			if (isSelected(configuration, "FeatureScaling"))
				preprocessingTechniques.add(PreprocessingTechnique.FEATURE_SCALING);
			if (isSelected(configuration, "Vectorization"))
				preprocessingTechniques.add(PreprocessingTechnique.VECTORIZATION);
			if (isSelected(configuration, "DuplicatesRemoval"))
				preprocessingTechniques.add(PreprocessingTechnique.DUPLICATES_REMOVAL);
			if (isSelected(configuration, "MissingDataManipulation"))
				preprocessingTechniques.add(PreprocessingTechnique.MISSING_DATA_MANIPULATION);
			if (isSelected(configuration, "Normalization"))
				preprocessingTechniques.add(PreprocessingTechnique.NORMALIZATION);
			dataset.getPreprocessing().addAll(preprocessingTechniques);
			if (isSelected(configuration, "Pandas"))
				dataset.getDatasetManipulationLibrary().add(DatasetManipulationLibrary.PANDAS);
			if (isSelected(configuration, "Pandas"))
				dataset.getDatasetManipulationLibrary().add(DatasetManipulationLibrary.NUMPY);

		}

		return dataset;
	}

	public static void serializeModel(RSModel wm, String fileName) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		Resource resource = resSet.createResource(URI.createURI(fileName));
		resource.getContents().add(wm);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	private static void temp() {
//		LibraryManager.registerLibrary(FMCoreLibrary.getInstance());
//		Configuration configuration = ConfigurationManager.load(configurationPath);
//		if (configuration != null) {
//			System.out.println("OK");
//			for (SelectableFeature c : configuration.getFeatures()) {
//				System.out.println(c.getName());
//			}
//		}
//		else System.out.println("KO");
////		
////		
////		/**
////		 * 
////		 */
////		
////		LibraryManager.registerLibrary(FMCoreLibrary.getInstance());
////		final IFeatureModel featureModel = FeatureModelManager.load(featureModelPath);
////		if (featureModel != null) {
////			FeatureModelFormula formula = new FeatureModelFormula(featureModel);
////			featureModel.getFeature("SupervisedNeuralNetwork");
////			final FeatureModelAnalyzer analyzer = formula.getAnalyzer();
//////			analyzer.analyzeFeatureModel(null);
//////			System.out.println("Feature model is " + (analyzer.isValid(null) ? "not " : "") + "void");
//////			System.out.println("Dead features: " + analyzer.getDeadFeatures(null));
//////			System.out.println(analyzer.getExplanation(featureModel.getFeature("Bluetooth")));
//////
//////			final SimpleSatSolver solver = new SimpleSatSolver(formula.getCNF());
//////			final Node query = new Implies(new Literal("Navigation"), new Literal("Ports"));
//////			System.out.print("Is \"FM => (" + query + ")\" a tautology? ");
//////			ClauseList queryClauses = Nodes.convert(formula.getCNF().getVariables(), new Not(query), true);
//////			solver.addClauses(queryClauses);
//////			switch (solver.hasSolution()) {
//////			case FALSE:
//////				System.out.println("yes");
//////				break;
//////			case TRUE:
//////				System.out.println("no");
//////				break;
//////			case TIMEOUT:
//////				System.out.println("cannot decide (timeout)");
//////				break;
//////			default:
//////				break;
//////			}
////		} else {
////			System.out.println("Feature model could not be read!");
////		}
//	}

}
