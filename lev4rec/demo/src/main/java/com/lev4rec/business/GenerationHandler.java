package com.lev4rec.business;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import lev4rec.code.template.main.Generate;



//import lowcoders.RSModel;



public class GenerationHandler {
	
	/*
	
public static RSModel loadModel(String modelPath) {
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(LowcodersPackage.eINSTANCE.getNsURI(), LowcodersPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = resourceSet.getResource(URI.createURI(modelPath), true);
		RSModel model = (RSModel) resource.getContents().get(0);
		return model;
	}

public static void generateFromTML(String modelUri, String folderS) {
	
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

/*public static RSModel parseUserString(String dslString) {
	/*String keywords ="ADAM|ARFF|ASSOCIATION_RULE|AdditiveFeedback|AutomatedValidation|Bayesian|Boolean|BugTrackingSystem|CATALOG_COVERAGE|CLUSTERING|CONTENT_BASED|CONTEXT_AWARE|CONTROLLED_EXPERIMENT|COSINE_SIMILARITY|CROSSOVER|CSV|CategoricalData|Click|CodeRepository|CommunicationChannel|ContextValidation|ConvolutionalNN|CrossValidation|CustomRecommender|DEMOGRAPHIC|DUPLICATES_REMOVAL|DUPLICATION|DataMiningRS|DecisionTree|DeepNN|DependencyManager|E|EGGHOLDER_FUNCTION|ELLIOT|EPC|EUCLIDEAN_DISTANCE|EVENT_STREAM|Evaluation|F1_MEASURE|FEATURE_SCALING|FIELD_STUDIES|FIT_BIT|FLASK|FREQUENT_ITEM_SET|FeedForwardNN|FeedbackComponent|File|FilteringRS|Float|GINI|GRADIENT_DESCENT|GRAPH_BASED|GUIElement|GeneticAlgorithm|Graph|GroundTruthExtraction|HILL_CLIMBING|HYBRID|HybridFeedback|IDEIntegration|ITEM_BASED|ITEM_COVERAGE|ImplicitFeedback|Integer|JACCARD_DISTANCE|LBFGS|LEVENSHTEIN_DISTANCE|LIGHTFM|LIGHTGBM|LINEAR|MISSING_DATA_MANIPULATION|MSD|MachineLearningBasedRS|Matrix|NDCG|NEGATIVE|NLP|NORMALIZATION|NOVELTY|NUMERICAL|NUMPY|ORDINAL|PANDAS|PARTIAL_HYPER_MUTATION|POLY|POSITIVE|PRECISION|PRECOMPUTED|PYTORCH|Preprocessing|ProactiveHandler|QUALITATIVE|QUANTITATIVE|RBF|RECALL|RELU|REPACE_MUTATION|RSModel|RandomSplitting|Rating|RawOutcomes|ReactiveHandler|RecommendationContext|RecommendationHandler|RecommendationSetting|RecommendationUsage|RecommendedItem|RecurrentNN|SALE_DIVERSITY|SGD|SHRINK_MUTATION|SIGMOID|SIMULATED_ANNELING|SKLEARN|SPRING|SURPRISE|SVD|SVM|Selection|String|SupervisedDataset|TANH|TENSOR_FLOW|TEXT_MINING|TFIDF|TextualContent|Transformative|TraversableGraph|Tree|UNARY|USER_BASED|UnsupervisedDataset|UserEvent|UserStudy|VECTORIZATION|VSCodePlugin|Variable|VariableRelation|Visualization|WORD_EMBEDDINGS|WebApplication|WebIService|activationFunction|alpha|analysis|baselines|columns|condition|contents|context|cutoff|dataMiningRSAlgorithm|dataSource|dataStructure|dataset|datasetManipulationLibrary|dependatVariable|description|e|encoding|evaluation|event|eventType|expressedFeedback|false|feedback|filteringRSAlgorithm|fitnessFunction|format|generator|groundTruthExtractor|guielements|handler|host|indipendentVariables|isBuiltIn|isMissingValueAllowed|isMultiple|isProactiveSystem|item|kernel|key|learningRate|library|metadata|metrics|miniBatchSize|mutationOperator|nOfRecommendations|neighborhood|nodes|numEpochs|numHiddenLayer|numOfInsertion|numberOfFold|ordered|outcame|path|port|preprocessigTechnique|preprocessing|presentationLayer|query|randomState|recommendationSystem|recommendations|recommendedItems|recommender|relations|requiredTools|rootPath|scope|searchStrategy|settings|similarityCalculator|sizeGT|solver|source|sourcePath|splittingRules|target|targetVariable|testContext|true|type|usage|usageType|userContext|validationTechnique|value|variables|webService";
	String cleanKeys  = keywords.replace("|", "#");
	
	String[] splittedKeys= cleanKeys.split("#");
	
	HashMap< String, String> mapKeys = new HashMap<String, String>();
	
	HashMap<String, String> mapModel = new HashMap<String, String>();
	
	
	mapModel.put("RSModel", coarseModel.getName());
	
	if (coarseModel.getDataset()!= null) {
		mapModel.put("dataset", coarseModel.getDataset().eClass().getName());
	}		
	
	
	mapModel.put("evaluation", coarseModel.getEvaluation().eClass().getName());		
	
	
	String cleanSplitted = dslString.replace("X", "");
	
	RSModel model = fromStringToModel(cleanSplitted);
	//String rootElement = cleanSplitted[0].replaceAll("\\d", "");
	//System.out.println(rootElement);
	
	//cleanSplitted = ArrayUtils.remove(cleanSplitted, 0);	
	//cleanSplitted = ArrayUtils.addFirst(cleanSplitted, rootElement);	
	//System.out.println(Arrays.toString(cleanSplitted));
	
	
	return model;
	
}*/

/*public static void serializeModel(RSModel wm, String fileName) {
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
}*/

/*public static RSModel fromStringToModel( String user) {
	//Injector injector = new RsDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	ResourceSet resourceSet = new ResourceSetImpl();
	resourceSet.getPackageRegistry().put(LowcodersPackage.eINSTANCE.getNsURI(), LowcodersPackage.eINSTANCE);
	//ResourceSet rs = injector.getInstance(ResourceSet.class);
	//Resource resource = rs.createResource(URI.createURI("/generated/demo.rec"));
	Resource resource = resourceSet.createResource(URI.createURI("lev4rec/generated/demo.rec"));
	InputStream in = new ByteArrayInputStream(user.getBytes());
	try {
		resource.load(in, resourceSet.getLoadOptions());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	RSModel model = (RSModel) resource.getContents().get(0);
	
	
	return model;
}*/
	

}
