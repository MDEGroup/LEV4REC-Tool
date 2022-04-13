

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



	data = pd.read_csv('"insert', sep=",")	
	return data
 


	is_user_based=False
	neighborhood=0
	cutoff=0
	sim_funct='cosine'
	sim_settings = {'name': sim_funct,
               'user_based': is_user_based  # compute  similarities between items
               }
	from surprise import KNNWithMeans
	algo = KNNWithMeans(k=neighborhood, sim_options=sim_settings)



"""
nb["cells"] = [nbf.v4.new_markdown_cell(text),
               nbf.v4.new_code_cell(code) ]

nbf.write(nb, 'KNN recsys.ipynb')
