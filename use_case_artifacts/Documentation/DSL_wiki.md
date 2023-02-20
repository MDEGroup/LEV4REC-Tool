# LEV4REC Domain Syntax Language (DSL)

This document provides a briefly overview of the conceived domain syntax language (DSL) used to define a generic recommender system. The grammar has been generated from the LEV4REC RS Metamodel using the Eclipse [Xtext](https://www.eclipse.org/Xtext/index.html) framework. The conceived grammar adhere to the [Xtext grammar language](https://www.eclipse.org/Xtext/documentation/301_grammarlanguage.html) that allows the definition of custom entities and meta-concepts. For the sake of presentation, we refer to the DSL as RsDsl throughout this document.    

## List of functions and features:

- RsDSL enables the specification of the wanted recommender systems by using the defined meta-concepts in the RS metamodel.
- RsDSL enables the specification of the system by means of a textual syntax.
- RsDSL editor supports syntax highlighting, auto-complention, error markers, and auto-formatting features which are provided by the [Ace Javascript library](https://ace.c9.io/)

## RsDsl concepts

All concepts and entities used by the RsDsl grammar are inherited to the RS metamodel. In particular, *RsModel* is the root element that contains the four main components of the system, i.e., *Dataset*, *RecommendationSystem*, *Evaluation*, and *PresentationLayer*.  
The user can specify attributes and relationships by using the textual grammar embedded in the web editor. We report the complete list of primitive data types in the following:



	- *RsModel*
    	- *Dataset*
    	- *RecommendationSystem*
    	- *Evaluation*
    	- *PresentationLayer*
	- *UnsupervisedDataset->Dataset* 
	- *SupervisedDataset->Dataset* 
	- *MachineLearningBasedRS_Impl->RecommendationSystem*
	- *FilteringRS->RecommendationSystem*
	- *DataMiningRS->RecommendationSystem*
	- *GeneticAlgorithm->RecommendationSystem*
	- *DeepNN->RecommendationSystem*
	- *ConvolutionalNN->RecommendationSystem*
	- *Bayesian->RecommendationSystem*
	- *RecurrentNN->RecommendationSystem*
	- *SVM->RecommendationSystem*
	- *DecisionTree->RecommendationSystem*
	- *FeedForwardNN->RecommendationSystem*



where the -> is the superClass relation. The complete set of entities, including the conceived grammar rules, are defined in the [RsDsl.xtext](https://github.com/MDEGroup/LEV4REC-Tool/blob/main/lev4rec/bundles/org.xtext.lev4rec.parent/org.xtext.lev4rec/src/org/xtext/lev4recgrammar/first/RsDsl.xtext) file. It is worth noting that all the source code can be automatically generated from this file by doing:

` Right click > Generate Xtext artifacts `


## RS metamodel

All the concepts that can be expressed by the RsDsl derives from the [RS metamodel](https://github.com/MDEGroup/LEV4REC-Tool/blob/main/use_case_artifacts/LEV4REC_meta_model.png). For the sake of presentation, we list below each sub-component of the system and the corresponding meta-classes: 

` DataStructure entities `

![image info](img_src/lowcode_dsl_dataset_datastructure.png)

` RecommenderSystem entities `

![image info](img_src/lowcodersDSL_RecommenderSystem.png)


` Evaluation entities `

![image info](img_src/lowcodersDSL_ValidationTechnique.png)

It is worth noting that not all the metaclasses have the corresponding implementation in the Acceleo templates. Nevertheless, the use cases presented in the paper are fully covered.   



## RS Constraints

For each component, we conceive a set of logical constraints that drives the user during the design phase. The constraints refer to the [RS feature model](https://github.com/MDEGroup/LEV4REC-Tool/blob/main/use_case_artifacts/LEV4REC_feature_model.png). The constraints and the a short description is defined as follows:


![image info](img_src/ConstraintsTable.png)


## Generate the Web Editor

The web editor has been automatically generated from the Xtext project. To this end, we follow the steps provided by the [Xtext official documentation](https://www.eclipse.org/Xtext/documentation/330_web_support.html).





## RsDsl Usage
The following section describes the usage of the RsDsl using the Docker installation of LEV4REC. 


### Replicating the use cases

#### Filtering Algorithm

Using the RS Configuration Form, the user can specify the KNN algorithm as follows: 



![image info](img_src/filtering_component.png)

Afterward, the user can fine-tune the specification by adding additional parameters. The whole KNN settings should be similar to the following:



![image info](img_src/filtering_editor.png)



### ML-based approach

The procedure can be followed to AURORA, a classification approach based on feed-forward neural network. 

First, the user can select the proper type of network from the RS Configuration form:

![image info](img_src/ml_component_form.png)


Once all the components have been selected, LEV4REC generates automatically the DSL string that the user can customize:


![image info](img_src/ml_editor.png)










