

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
	data=pd.read_csv('')
	X = data.iloc[:,:-1].values
	return X
	return X,y





def run_cross_fold():
	X,y = load_dataset()
	from sklearn.model_selection import  KFold
    n_splits=0
    kf = KFold(n_splits = n_splits)	
	prec_all = 0
	acc_all = 0
	rec_all = 0
	f1_all = 0	
	list_metrics=[]
	for  train, test in kf.split(X):
		X_split, X_test, y_split, y_test = X[train],X[test], y[train], y[test]	
		sc=set_preprocessing()
		list_train=[]
        list_test =[]
        for x in X_split.tolist():
            list_train.append(str(x))
        for t in X_test.tolist():
            list_test.append(str(t))
        X_train=sc.fit_transform(list_train)
        X_test=sc.transform(list_test)     
		clf= algorithm_settings()
        clf.fit(X_train, y_split)        
        y_pred= clf.predict(X_test)				
	prec_all=(prec_all /n_splits)
    rec_all=(rec_all /n_splits)
    f1_all=(f1_all /n_splits)  
 
    list_metrics.append(prec_all)
    list_metrics.append(rec_all)
    list_metrics.append(f1_all)

	return list_metrics
    



"""
nb["cells"] = [nbf.v4.new_markdown_cell(text),
               nbf.v4.new_code_cell(code) ]

nbf.write(nb, 'CrossRec.ipynb')
