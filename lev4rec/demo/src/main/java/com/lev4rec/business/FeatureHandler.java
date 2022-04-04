package com.lev4rec.business;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xml.sax.SAXException;
import org.xtext.lev4recgrammar.first.RsDslStandaloneSetup;

import com.google.common.collect.Lists;
import com.lev4rec.dto.RSConfiguration;

import lev4rec.code.template.main.Generate;
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
import lowcoders.LowcodersPackage;
import lowcoders.PreprocessingTechnique;
import lowcoders.PresentationLayer;
import lowcoders.PyLibType;
import lowcoders.RSModel;
import lowcoders.RecommendationSystem;
import lowcoders.RecurrentNN;
import lowcoders.ValidationLibrary;
import lowcoders.WebIService;
import lowcoders.WebInterfaceLibrary;



public class FeatureHandler {
	
	private final RSConfiguration config;
	

	public void getRSConfiguration(RSConfiguration config) {
		// TODO Auto-generated method stub
		FeatureHandler i = new FeatureHandler();
		try {
			serializeModel(i.generate(config), "generated/demo.xmi");
				
			
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static RSModel loadModel(String modelPath) {
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(LowcodersPackage.eINSTANCE.getNsURI(), LowcodersPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = resourceSet.getResource(URI.createURI(modelPath), true);
		RSModel model = (RSModel) resource.getContents().get(0);
		return model;
	}
	
/*public static void generateFromTML(String modelUri, String folderS) {
		
		try {
			List<String> arguments = new ArrayList<String>();
			System.out.print("\t" + "Generate all the files from the template...");
			File folder = new File(folderS);
			Generate generator = new Generate(loadModel(modelUri), folder, arguments);
			generator.doGenerate(new BasicMonitor());
			System.out.println("Generated!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}*/

	

	
	
	public FeatureHandler() {
		this.config = new RSConfiguration();
		

	}
	public RSModel generate(RSConfiguration config) throws ParserConfigurationException, SAXException, IOException {
		
		RSModel model = LowcodersFactory.eINSTANCE.createRSModel();
		model.setName("Generated Model");
		Dataset dataset = getDataSet(config);
		if (dataset != null)
			model.setDataset(dataset);
		RecommendationSystem recommendationSystem = getRecommendationSystem(config);
		if (recommendationSystem != null)
			model.setRecommendationSystem(recommendationSystem);

		Evaluation evaluation = getEvaluation(config);
		model.setEvaluation(evaluation);
		PresentationLayer presentationLayer = getPresentationLayer(config);
		if (presentationLayer != null)
			model.setPresentationLayer(presentationLayer);

		return model;
	}
	
	
	public Dataset getDataSet(RSConfiguration config) {
		
		Dataset dataset = null;

		if (config.isUnsupervisedDataset()) {
			dataset = LowcodersFactory.eINSTANCE.createUnsupervisedDataset();		

		}
		if (config.isSupervisedDataset()) {
			dataset = LowcodersFactory.eINSTANCE.createSupervisedDataset();			
		}
		dataset.setName("DATASET NAME");
		// DataStructure
		if (dataset != null) {
			DataStructure dataStructure = null;
			if (config.isMatrix())
				dataStructure = LowcodersFactory.eINSTANCE.createMatrix();

			if (config.isGraphData())
				dataStructure = LowcodersFactory.eINSTANCE.createGraph();

			if (config.isARFF())
				dataStructure = LowcodersFactory.eINSTANCE.createARFF();

			if (config.isTree())
				dataStructure = LowcodersFactory.eINSTANCE.createTree();

			if (config.isTextualData())
				dataStructure = LowcodersFactory.eINSTANCE.createMatrix();

			if (dataStructure != null) {
				dataset.setDataStructure(dataStructure);
			}

			// Preprocessing
			List<PreprocessingTechnique> preprocessingTechniques = Lists.newArrayList();
			if (config.isNLP())
				preprocessingTechniques.add(PreprocessingTechnique.NLP);
			if (config.isFeatureScaling())
				preprocessingTechniques.add(PreprocessingTechnique.FEATURE_SCALING);
			if (config.isVectorization())
				preprocessingTechniques.add(PreprocessingTechnique.VECTORIZATION);
			if (config.isDuplicatesRemoval())
				preprocessingTechniques.add(PreprocessingTechnique.DUPLICATES_REMOVAL);
			if (config.isMissingDataManipulation())
				preprocessingTechniques.add(PreprocessingTechnique.MISSING_DATA_MANIPULATION);
			if (config.isNormalization())
				preprocessingTechniques.add(PreprocessingTechnique.NORMALIZATION);
			dataset.getPreprocessing().addAll(preprocessingTechniques);
			if (config.isPandas())
				dataset.getDatasetManipulationLibrary().add(DatasetManipulationLibrary.PANDAS);
			if (config.isNumpy())
				dataset.getDatasetManipulationLibrary().add(DatasetManipulationLibrary.NUMPY);

		}

		return dataset;
		
	}
	
	public RecommendationSystem getRecommendationSystem(RSConfiguration config) {
		RecommendationSystem recommendationSystem = null;

		// COLLABORATIVE FILTERING
		if (config.isItemBased()) {
			FilteringRS filtering = LowcodersFactory.eINSTANCE.createFilteringRS();
			filtering.setFilteringRSAlgorithm(FilteringRSAlgorithm.ITEM_BASED);
			recommendationSystem = filtering;
		}
		if (config.isUserBased()) {
			FilteringRS filtering = LowcodersFactory.eINSTANCE.createFilteringRS();
			filtering.setFilteringRSAlgorithm(FilteringRSAlgorithm.USER_BASED);
			recommendationSystem = filtering;
		}

		if (config.isContentBased()) {
			FilteringRS filtering = LowcodersFactory.eINSTANCE.createFilteringRS();
			filtering.setFilteringRSAlgorithm(FilteringRSAlgorithm.CONTENT_BASED);
			recommendationSystem = filtering;
		}
		// CLASSIFICATION
		/*
		if (config.isSVM()) {
			MachineLearningBasedRS machineLearning = LowcodersFactory.eINSTANCE.createMachineLearningBasedRS();
			machineLearning.setMachineLearningRSAlgoithm(MachineLearningBasedRS.SVM);
			recommendationSystem = machineLearning;
		}
		if (config.isMNB()) {
			MachineLearningBasedRS machineLearning = LowcodersFactory.eINSTANCE.createMachineLearningBasedRS();
			machineLearning.setMachineLearningRSAlgoithm(MachineLearningBasedRS.MNB);
			recommendationSystem = machineLearning;
//		}*/

		if (config.isSupervisedRNN() || config.isUnsupervisedRNN()) {
			RecurrentNN machineLearningBasedRS = LowcodersFactory.eINSTANCE.createRecurrentNN();
			recommendationSystem = machineLearningBasedRS;
		}
		if (config.isSupervisedDNN() || config.isUnsupervisedDNN()) {
			
			DeepNN machineLearningBasedRS = LowcodersFactory.eINSTANCE.createDeepNN();
			
			recommendationSystem = machineLearningBasedRS;
		}
		
		if (config.isSupervisedFeedForwardNN()
				|| config.isUnsupervisedFeedForwardNN()) {
			FeedForwardNN machineLearningBasedRS = LowcodersFactory.eINSTANCE.createFeedForwardNN();
			recommendationSystem = machineLearningBasedRS;
		}

	
		if (config.isBayesianNN()) {
			Bayesian machineLearningBasedRS = LowcodersFactory.eINSTANCE.createBayesian();
			recommendationSystem = machineLearningBasedRS;
		}
		if (config.isDecisionTree()) {
			DecisionTree machineLearningBasedRS = LowcodersFactory.eINSTANCE.createDecisionTree();
			recommendationSystem = machineLearningBasedRS;
		}

//		if (isSelected(configuration, "KNeighborhood")) {
//			MachineLearningBasedRS machineLearningBasedRS = LowcodersFactory.eINSTANCE.createMachineLearningBasedRS();
//			machineLearningBasedRS.setMachineLearningRSAlgoithm(MachineLearningRSAlgorithm.);
//			recommendationSystem = machineLearningBasedRS;
//		}
		if (config.isMiningAlgorithm()) {
			DataMiningRS dataMiningRS = LowcodersFactory.eINSTANCE.createDataMiningRS();
			dataMiningRS.setDataMiningRSAlgorithm(DataMiningRSAlgorithm.CLUSTERING);
			recommendationSystem = dataMiningRS;
		}

		recommendationSystem.setName("GENERATED RECOMMENDER SYSTEM");
		if (config.isSklearn()) {
			recommendationSystem.setGenerator(PyLibType.SKLEARN);
		}
		if (config.isSurprise()) {
			recommendationSystem.setGenerator(PyLibType.SURPRISE);
		}
		if (config.isTensorFlow()) {
			recommendationSystem.setGenerator(PyLibType.TENSOR_FLOW);
		}
		if (config.isPyTorch()) {
			recommendationSystem.setGenerator(PyLibType.PYTORCH);
		}
		// recommendationSystem.setGenerator(value);
		return recommendationSystem;
	}
	
	public Evaluation getEvaluation(RSConfiguration config) {
		Evaluation evaluation = LowcodersFactory.eINSTANCE.createEvaluation();
		AutomatedValidation automatedValidation = null;
		if (config.isSplittingKfold()) {
			automatedValidation = LowcodersFactory.eINSTANCE.createCrossValidation();
			if (config.isSKCrossFold() ||config.isSKRandomSplit())
				automatedValidation.setLibrary(ValidationLibrary.SKLEARN);
			if (config.isSurpriseCrossFold() || config.isSurpriseRandomSplit())
				automatedValidation.setLibrary(ValidationLibrary.SURPRISE);
			evaluation.getValidationTechnique().add(automatedValidation);
		}
		if (config.isRandomSpltting()) {
			automatedValidation = LowcodersFactory.eINSTANCE.createRandomSplitting();
			if (config.isSKCrossFold() || config.isSKRandomSplit())
				automatedValidation.setLibrary(ValidationLibrary.SKLEARN);
			if (config.isSurpriseCrossFold() || config.isSurpriseRandomSplit())
				automatedValidation.setLibrary(ValidationLibrary.SURPRISE);
			evaluation.getValidationTechnique().add(automatedValidation);
		}
		//if (isSelected(configuration, "UserStudy"))
			//evaluation.getValidationTechnique().add(LowcodersFactory.eINSTANCE.createUserStudy());
		return evaluation;
	}
	
	public PresentationLayer getPresentationLayer(RSConfiguration config) {
		PresentationLayer presentationLayer = null;
		if (config.isWebInterface()) {
			WebIService webInterface = LowcodersFactory.eINSTANCE.createWebIService();
			if (config.isFlask())
				webInterface.setLibrary(WebInterfaceLibrary.FLASK);
			if (config.isSpring())
				webInterface.setLibrary(WebInterfaceLibrary.SPRING);
			presentationLayer = webInterface;
		}
		if (config.isIDEPlugin()) {
			presentationLayer = LowcodersFactory.eINSTANCE.createIDEIntegration();
		}
		if (config.isRawOutcomes())
			presentationLayer = LowcodersFactory.eINSTANCE.createRawOutcomes();
		return presentationLayer;
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

}
