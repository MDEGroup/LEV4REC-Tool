/*
 * generated by Xtext 2.23.0
 */
package org.xtext.lev4recgrammar.first.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.lev4recgrammar.first.rsDsl.Evaluation
import org.xtext.lev4recgrammar.first.rsDsl.RSModel
import org.xtext.lev4recgrammar.first.services.RsDslGrammarAccess

import org.xtext.lev4recgrammar.first.rsDsl.UnsupervisedDataset
import org.xtext.lev4recgrammar.first.rsDsl.RecommendationSystem
import org.xtext.lev4recgrammar.first.rsDsl.DatasetManipulationLibrary
import com.google.common.base.Strings

class RsDslFormatter extends AbstractFormatter2 {
	
	@Inject extension RsDslGrammarAccess

	def dispatch void format(RSModel rSModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		
		rSModel.regionFor.keyword('{').append[newLine]
		
		
		rSModel.regionFor.keyword('}').prepend[newLine]
		//rSModel.regionFor.keyword(':').append[newLine]
		rSModel.dataset.regionFor.keyword('{').append[newLine]
		rSModel.dataset.regionFor.keyword('}').prepend[newLine]
		rSModel.dataset.allRegionsFor.keyword(']').append[newLine]
		rSModel.dataset.regionFor.keyword("preprocessing").prepend[indent]		
		rSModel.dataset.regionFor.keyword("path").prepend[newLine]
		
		
		rSModel.presentationLayer.format
		
		
		rSModel.evaluation.format
		rSModel.regionFor.keyword("validationTechnique").prepend[newLine]
		rSModel.evaluation.regionFor.keyword("library").prepend[newLine]
		
		rSModel.recommendationSystem.format
		rSModel.feedback.format
	}

	def dispatch void format(Evaluation evaluation, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		
		evaluation.regionFor.keyword('{').append[newLine]
		evaluation.regionFor.keyword('}').prepend[newLine]
		
		for (validationTechnique : evaluation.validationTechnique) {
			validationTechnique.format
		}
	}
	
	// TODO: implement for FeedbackComponent, Variable, UnsupervisedDataset, SupervisedDataset, Graph, Tree, RecommendationHandler, RecommendationUsage, ProactiveHandler, ReactiveHandler, CrossValidation, MachineLearningBasedRS, FilteringRS, DataMiningRS, CustomRecommender, GeneticAlgorithm, DeepNN, ConvolutionalNN, Bayesian, RecurrentNN, SVM, DecisionTree, FeedForwardNN, ImplicitFeedback, HybridFeedback, AdditiveFeedback, Rating


		def dispatch void format(RecommendationSystem recsys, extension IFormattableDocument document) {
		
		recsys.regionFor.keyword('{').append[newLine]
		recsys.regionFor.keyword('}').append[newLine]
	}
	

	




}


