import pandas as pd		

def load_dataset():
	from surprise import Dataset
	data = Dataset.load_builtin('ml-100k')	
	return data

def algorithm_settings():


	neighborhood=40

	cutoff=10

	sim_funct='cosine'

	sim_settings = {'name': sim_funct,

               'user_based': is_user_based  # compute  similarities between items

               }

	from surprise import KNNWithMeans

	algo = KNNWithMeans(k=neighborhood, sim_options=sim_settings)




	return algo
def get_recommendations(context,n_items):
	from collections import defaultdict


	    data = load_dataset()


		trainset = data.build_full_trainset()


	    algo = algorithm_settings()


	    algo.fit(trainset)


	    testset = trainset.build_anti_testset()


	    predictions = algo.test(testset)


	    


	    top_n = defaultdict(list)


	    for uid, iid, true_r, est, _ in predictions:


	        top_n[uid].append((iid, est))


	    


	    for uid, user_ratings in top_n.items():


	        user_ratings.sort(key=lambda x: x[1] , reverse=True)


	        top_n[uid] = user_ratings[:n_items] 


	


		results = top_n.get(context)


	
	return results


