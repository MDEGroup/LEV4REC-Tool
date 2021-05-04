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



import glob,os
X=[]
y=[]
code_loc='./code25/'
name_file= ['c', 'c#', 'c++','java', 'css', 'haskell', 'html', 'java', 'javascript', 'lua', 'objective-c', 'perl', 'php', 'python','ruby', 'r', 'scala', 'sql', 'swift', 'vb.net','markdown','bash']
for item in name_file:
    code_loc_current=code_loc+item+'/'
    file_list = glob.glob(os.path.join(code_loc_current, "*.txt"))
    i = 0
    for file_path in file_list:
        f=open(file_path,'r', encoding='utf8', errors='ignore')
        data=f.read()
        #print(f)
        label=item
        num_lines = sum(1 for line in open(file_path))
        X.append(data)
        y.append(label)

from sklearn.feature_extraction.text import TfidfTransformer, TfidfVectorizer
count_vect = TfidfVectorizer(input='train', stop_words={'english'}, lowercase=True, analyzer='word')
train_vectors = count_vect.fit_transform(X)
train_vectors.shape
tfidf_transformer = TfidfTransformer()
train_tfidf = tfidf_transformer.fit_transform(train_vectors)
train_tfidf.shape







from sklearn.naive_bayes import MultinomialNB
clf = MultinomialNB().fit(train_tfidf, y)






var = input("Please enter a code snippet: ")
docs_new = [var]
X_new_counts = count_vect.transform(docs_new)
X_new_tfidf = tfidf_transformer.transform(X_new_counts)

predicted = clf.predict(X_new_tfidf)
print('predicted as',predicted)







"""
nb["cells"] = [nbf.v4.new_markdown_cell(text),
               nbf.v4.new_code_cell(code) ]

nbf.write(nb, 'SCC.ipynb')
