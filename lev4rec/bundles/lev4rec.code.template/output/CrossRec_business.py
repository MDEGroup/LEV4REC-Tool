import pandas as pd		

def load_dataset():
from surprise import Dataset, Reader

	data = pd.read_csv('results.csv', sep=",")
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





	import pandas as pd


	import os


	import numpy as np


	


	from scipy.sparse import coo_matrix


	from lightfm import LightFM


	from lightfm.evaluation import precision_at_k, auc_score, recall_at_k


	from collections import defaultdict


	import collections


	


	


	def get_freq_rating(df_columns, list_filtered, out_path):


	    with open(out_path, 'w', encoding='utf-8', errors='ignore') as res:


	        for col, freq in zip(df_columns,list_filtered):


	            res.write(col+','+str(freq)+'\n')


	


	


	


	def preprocess_repo_name(list_repos):


	    preprocessed_list=[]


	    for r in list_repos:


	        preprocessed_list.append(str(r).replace('git://github.com/','').replace('/','__').replace('.git',''))


	    return preprocessed_list


	


	def get_crossrec_matrix(csv_file):


	


	    df=pd.read_csv(csv_file, sep=';')


	    


	    return df


	


	  


	def add_missing_lib(list_rec, crossrec_data):


	    


	    


	    already_in = crossrec_data.columns.values.tolist()


	


	    print(len(already_in))


	    missing = [lib for lib in already_in if lib not in list_rec]


	    


	    return missing


	


	


	


	def get_crossrec_recommendations(cutoff, stored_path):


	    list_recs=[]


	  


	    for i in range (1,10):     


	        for f in os.listdir(stored_path+'Round'+str(i)+'/Recommendations/'):


	            with open(stored_path+'/Round'+str(i)+'/Recommendations/'+f, 'r', encoding='utf-8', errors='ignore') as rec_file:


	                lines=rec_file.readlines()                


	                for l in lines[:cutoff]:


	                    splitted=l.split('\t')


	                    list_recs.append(splitted[0].replace('#DEP#','').strip())


	                         


	                                 


	    return list_recs


	


	


	def get_freq_rec_items(list_recs, df_filtered):


	    


	    list_freqs=[]     


	    for rec in list_recs:               


	        list_freqs.append(df_filtered[rec].sum())


	        


	    return list_freqs


	


	


	


	    


	def fit_model(train):


	    model = LightFM(learning_rate=0.02, loss='warp')    


	    model.fit(train, epochs=70)   


	    return model


	


	                


	def map_test_to_ids(list_projects,list_recs, folder, cutoff):


	    unique=set(list_recs) 


	    lib_ids=np.arange(len(unique))   


	    #libs


	    unique=set(list_recs) 


	    list_lib_freqs=get_freq_rec_items(unique)   


	    dict_lib_ids=dict(zip(unique, lib_ids))    


	    dict_lib_freq=dict(zip(lib_ids,list_lib_freqs))


	    


	    #projects


	    proj_ids=np.arange(len(list_projects))


	    dict_proj_ids=dict(zip(list_projects, proj_ids))    


	    


	    list_ids_rec = []


	    list_ids_proj = []


	    


	    for f in os.listdir(folder):


	        list_ids_proj.append(dict_proj_ids.get(f))


	        #print("project id ",dict_proj_ids.get(f))


	        with open(folder+f, 'r', encoding='utf-8', errors='ignore') as rec_file:


	            lines=rec_file.readlines()            


	            for l in lines[:cutoff]:


	                splitted=l.split('\t')


	                lib=splitted[0].replace('#DEP#','')


	                #print('lib id ', dict_lib_ids.get(lib))


	                list_ids_rec.append(dict_lib_ids.get(lib))    


	            


	    


	    


	    row = np.repeat(list_ids_proj,cutoff)


	    col = np.array(list_ids_rec)    


	    list_ratings=[]


	    for lib_id in list_ids_rec:


	        list_ratings.append(dict_lib_freq.get(lib_id))


	        


	    data = np.array(list_ratings)


	    return coo_matrix((data, (row, col)), shape=(len(row), len(col)))


	


	


	   


	


	def map_train_to_ids(list_projects, list_recs, df):


	    unique=set(list_recs) 


	    lib_ids=np.arange(len(unique))     


	    list_lib_freqs=get_freq_rec_items(unique,df)   


	    dict_lib_ids=dict(zip(unique, lib_ids))    


	    dict_lib_freq=dict(zip(lib_ids,list_lib_freqs))   


	    


	    proj_ids=np.arange(len(list_projects))    


	    dict_proj_ids=dict(zip(list_projects, proj_ids))    


	    


	    reverse_dict_proj=dict(zip(proj_ids, list_projects))


	    reverse_dict_lib= dict(zip(lib_ids,unique))


	        


	    return proj_ids, dict_proj_ids, lib_ids, dict_lib_ids, dict_lib_freq, reverse_dict_proj , reverse_dict_lib  


	


	


	 


	def build_coo_matrix(dict_proj_ids, dict_lib_ids,dict_lib_freq, cutoff):


	    #x= 5


	    list_ids_rec = []


	    list_ids_proj = []    


	    


	    for i in range(1,10):


	        for f in os.listdir('D:/repositoryGitHub/CrossRec/experimental_results/CrossRec/Round'+str(i)+'/Recommendations/'):


	                      


	                list_ids_proj.append(dict_proj_ids.get(f))                


	                #print("project id ",dict_proj_ids.get(f))


	                


	                with open('D:/repositoryGitHub/CrossRec/experimental_results/CrossRec/Round'+str(i)+'/Recommendations/'+f, 'r', encoding='utf-8', errors='ignore') as rec_file:


	                    lines=rec_file.readlines()                    


	                    for l in lines[:cutoff]:


	                        splitted=l.split('\t')


	                        lib=splitted[0].replace('#DEP#','')


	                        #print('lib id ', dict_lib_ids.get(lib))


	                        list_ids_rec.append(dict_lib_ids.get(lib))             


	                    


	    


	    row = np.repeat(list_ids_proj,cutoff)    


	    col = np.array(list_ids_rec)       


	    


	    list_ratings=[]


	    for lib_id in list_ids_rec:


	        list_ratings.append(dict_lib_freq.get(lib_id))        


	    data = np.array(list_ratings)    


	    return coo_matrix((data, (row, col)), shape=(len(row), len(col)))


	                


	


	


	def get_test_libs(test_ratings):  


	


	    dict_test_projects=test_ratings.todok()   


	    


	    temp_dict={}  


	    


	    for key, value in dict_test_projects.items():


	        temp_dict.update({key[0]: key[1]})


	    


	    grouped_dict = defaultdict(list)


	    


	    for key, value in sorted(temp_dict.items()):


	        grouped_dict[value].append(key)        


	


	        


	    return grouped_dict


	


	


	


	


	


	def preprocess_crossrec_lib(string):


	     splitted=string.split('\t')


	     lib=splitted[0].replace('#DEP#','')


	     return lib


	    


	


	


	


	


	def get_ranked_recommendations(model, path_test, dict_proj, proj , dict_lib, cutoff , df_train, out_file, string_lib):


	    list_libs = []


	    


	    


	         


	    ranked_dict = {}


	    with open(path_test, 'r', encoding='utf8', errors='ignore') as test_file:


	        proj_id=dict_proj.get(proj)


	        lines = test_file.readlines()


	        


	    


	        


	        for l in lines[:cutoff]:


	            lib=preprocess_crossrec_lib(l)                


	            #print('lib id ', dict_lib_ids.get(lib))


	            list_libs.append(dict_lib.get(lib)) 


	            


	        scores=model.predict(user_ids=proj_id, item_ids=list_libs)


	        


	        


	        results_list=list(preprocess_crossrec_lib(l) for l in lines[:cutoff])


	        ranks=np.argsort(-scores)


	        


	        for score, lib in zip(ranks, results_list):


	            ranked_dict.update({score:lib})            


	            


	        ranked_items= collections.OrderedDict(sorted(ranked_dict.items()))


	            


	        return ranked_items


	        


	        


	def get_lib_name(dict_rec,key, map_lib):


	    list_libs=[]


	    list_to_map = dict_rec.get(key)


	    for l in list_to_map:


	        list_libs.append(map_lib.get(l))


	    


	    return list_libs


	


	


	


	


	


	def main_ltr():


	


	    tot=1200        


	    cutoff=10


	    lib_folder='junit'        


	      


	    rank=1000        


	    lib_to_check= 'com.google.guava:guava'      


	    csv_path='./crossrec_data.csv'


	    results_path='D:/backup_datasets/UserFeedback/LTR/results_LTR/results_rank_positive/cutoff_'+str(cutoff)+'/'+lib_folder+'/rank_comparison_'+str(rank)+'.csv'


	    


	    path_stored_results= 'D:/repositoryGitHub/CrossRec/experimental_results/CrossRec/'    


	    


	    


	    df_crossrec=pd.read_csv(csv_path, sep=';')   


	    


	    


	    


	    


	    list_repo_name=preprocess_repo_name(df_crossrec['REPO'])       


	    df_crossrec['REPO'] = list_repo_name


	    #print(df_crossrec.columns)


		## positive##


	    ratings=np.ones(rank, dtype='int')


	    


	    


	    


	    


	    zero_ratings=np.zeros(tot-rank, dtype='int')


	    


	    mutated_ratings= np.concatenate((ratings, zero_ratings), axis=None)


	    df_crossrec[lib_to_check]= mutated_ratings    


	    


	    


	        


	    


	    train_recs=get_crossrec_recommendations(cutoff, path_stored_results)     


	   


	    


	    


	    


	    


	    


	    


	    


	    id_projects, map_projects, id_libs, map_lib, lib_ratings, reverse_proj, reverse_lib = map_train_to_ids(df_crossrec['REPO'], train_recs, df_crossrec)


	    train_rating_matrix= build_coo_matrix(map_projects, map_lib, lib_ratings, cutoff)  


	    


	    


	    model=fit_model(train_rating_matrix) 


	    


	    


	    for i in range(1,2):


	        test_path = path_stored_results+'Round'+str(i)+'/Recommendations/'


	        


	        for test_file in os.listdir(test_path):           


	            


	            ranked_items=get_ranked_recommendations(model, test_path+test_file, map_projects,test_file, map_lib, cutoff, df_crossrec, results_path, lib_to_check) 


	            if test_file == 'projectdanube__xdi2':                


	                return ranked_items


	                       


	                    


	         


	    


	    


	    


	    print("file rank "+ str(rank) + ' created for '+ lib_to_check)


	    


	    


	def get_feedback_list():    


	    ranked_results=main_ltr()


	    list_results=[]


	    for key,value in ranked_results.items():        


	        list_results.append(value)


	        


	    return list_results


	


	


	


	


	



