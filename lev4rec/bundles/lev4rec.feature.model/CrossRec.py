[comment encoding = UTF-8 /]
[module generate('https://it.disim.univaq/lowcode')]

[import lev4rec::code::template::utils::generateSURDataset/]
[import lev4rec::code::template::utils::generateSKDataset /]

[import lev4rec::code::template::utils::generateRecommenderSystem/]
[import lev4rec::code::template::utils::generateContextValidation/]
[import lev4rec::code::template::utils::generateCrossFoldValidation/]
[import lev4rec::code::template::utils::generatePreprocessingTechnique/]
[template public generateRecSys(recSys : RSModel)]
[comment @main/]
[file (recSys.name+ '.py', false, 'UTF-8')]

def load_dataset():
[if recSys.recommendationSystem.generator = PyLibType :: SURPRISE]
[generateSURDataset(dataset)/]
[/if]
[if recommendationSystem.generator = PyLibType :: SKLEARN]
[generateSKDataset(dataset)/]
[/if]
[if (recSys.dataset.preprocessing -> size()>0)]
[for (pr : PreprocessingTechnique | recSys.dataset.preprocessing)]
def set_preprocessing():
[generatePreprocessingTechnique(pr,recSys)/]
	return preprocess
[/for]
[/if]
def algorithm_settings():
[generateRecommenderSystem(recSys)/]
	return algo
[for (val : ValidationTechnique | recSys.evaluation.validationTechnique)]
[if (val.oclIsTypeOf(lowcoders::ContextValidation))]
def get_recommendations(context,n_items):
[generateContextValidation(recSys)/]
	return results
[/if]
[if (val.oclIsTypeOf(lowcoders::CrossValidation))]
def run_cross_fold():
[generateCrossFoldValidation(recSys)/]
[/if]


[/for]
[/file]

[/template]