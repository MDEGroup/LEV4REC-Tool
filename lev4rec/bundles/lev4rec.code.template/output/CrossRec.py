

import nbformat as nbf

nb = nbf.v4.new_notebook()

text = """\
# Lowcode model generator
Generated recommneder system from model."""

code = """\
import pandas as pd
import warnings
warnings.filterwarnings("ignore")
##TODO Generating dataset
from surprise import Dataset, Reader

	data = pd.read_csv('results.csv', sep=",")
	return data
 


	neighborhood=40
	cutoff=10
	sim_funct='cosine'
	sim_settings = {'name': sim_funct,
               'user_based': is_user_based  # compute  similarities between items
               }
	from surprise import KNNWithMeans
	algo = KNNWithMeans(k=neighborhood, sim_options=sim_settings)


def get_recommendations(context,n_items):
	lista = []
    [lista.append(["query", lib, 1]) for lib in context]
    df = pd.read_csv('result.csv', sep=",")
    queryDF = pd.DataFrame(lista,columns=['ProjectID', 'LibID', 'rating'])   
    df = df.append(queryDF, ignore_index=True)
    reader = Reader(rating_scale=(0, 1))
    data = Dataset.load_from_df(df[['ProjectID', 'LibID', 'rating']], reader)
    
    algo = algorithm settings()
   	k = 0
    #TRAIN
    trainset = data.build_full_trainset()
    algo.fit(trainset)
    list_ird = [trainset.to_raw_iid(key) for key in trainset.ir.keys()]
    result = {}
    for elem in list_ird:
        k = algo.predict(uid="query", iid=elem)
        result[elem] = k.est
    sorted_result = {k: v for k, v in sorted(result.items(), key=lambda item: item[1], reverse=True)}

    results = list(sorted_result.keys())[ : n_items]

	return results

"""
nb["cells"] = [nbf.v4.new_markdown_cell(text),
               nbf.v4.new_code_cell(code) ]

nbf.write(nb, 'CrossRec.ipynb')
