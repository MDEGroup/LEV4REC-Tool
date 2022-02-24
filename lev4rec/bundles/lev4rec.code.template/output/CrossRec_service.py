from flask import Flask
from flask import request
from flask import jsonify
import os
import json

from generated_business import load_dataset, get_recommendations, algorithm_settings

app = Flask(__name__)
@app.route("/get_recommendation", methods=["POST"])
def recommend():    
    json_data = request.get_json()    
    context = json_data["context"]
    n_items = json_data["n_items"]

    
  
    res = get_recommendations(context,n_items)
    
    try:
        
        message = {
            'status': 200,
            'message': 'OK',
            'results': res
        }
        return jsonify(message)
    except Exception:
        message = {
            'status': 500,
            'message': 'KO'
        }
        return message


if __name__ == '__main__':
    app.debug = True
    port = int(os.environ.get("PORT", 5000))
    app.run(host='0.0.0.0', port=port)

	