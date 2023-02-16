# LEV4REC Domain Syntax Language (DSL)

This document provides a briefly overview of the conceived domain syntax language (DSL) used to define a generic recommender system. The grammar has been generated from the LEV4REC RS Metamodel using the Eclipse Xtext framework. For the sake of presentation, we refer to the DSL as RsDsl throughout this document.    

## List of functions and features:

- RsDSL enables the specification of the wanted recommender systems by using the defined meta-concepts in the RS metamodel.
- RsDSL enables the specification of the system by means of a textual syntax.
- RsDSL editor supports syntax highlighthing, auto-complention, error markers, and auto-formatting features which are provided by the Ace.js external library

## RsDsl concepts

All concepts and entities used by the RsDsl grammar are inherited to the RS metamodel. In particular, *RsModel* is the root element that  
The user can specify attributes and relationships by using the web editor. We report the complete list of primitive data types in the following:



	- *RsModel*,
	- **,
	- *Tokenisation*, 
	- *PhraseExtractor*,
	- *NGramExtractor*,
	- *POSTagging*,
	- *Lemmatisation*,
	- *Stemming*,
	- *DependencyParsing*,
	- *Chunking*,
	- *SentimentAnalysis*,
	- *TextClassification*,
	- *TopicModelling*,
	- *TermExtraction*,
	- *NamedEntityRecognition*,
	- *RelationExtraction*, and
	- *CoreferenceResolution*.



## RsDsl Usage
The following section describes the usage of the RsDsl using the Docker installation of LEV4REC. 

### Design a custom recommender system



### Replicating the use cases







