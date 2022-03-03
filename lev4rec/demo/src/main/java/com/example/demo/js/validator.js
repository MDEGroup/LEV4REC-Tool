/**
 * 
 */

 function disable_sub_features(id, id_to_disable){
	const checkbox = document.getElementById(id, id_to_disable)
	checkbox.addEventListener('change', (event) => {
	  if (event.currentTarget.checked) {
	    document.getElementById(id_to_disable).disabled = true;
	  } else {		
	    document.getElementById(id_to_disable).disabled = false;
	  }
		})
	}
	
function disable_sub_feature_with_parent(current,parent_id, map_sub_feature){
	const checkbox = document.getElementById(current)
	
	list_sub=map_sub_feature[parent_id] 
	
	
	
	checkbox.addEventListener('change', (event) => {
		  if (event.currentTarget.checked) {
			  for(var i = 0; i < list_sub.length; i++) { 				  
				  document.getElementById(list_sub[i]).disabled = true;
			  }  
			  
		   
		  } else {		
			  for(var i = 0; i < list_sub.length; i++) { 				  
				  document.getElementById(list_sub[i]).disabled = false;
			  }  
		  }
		})
	}


function show_sub_features_2(current) {	
	const checkbox = document.getElementById(current)
	console.log(current)
	var x = document.getElementById("supervised_sub");
	if(x){
		
		checkbox.addEventListener('change', (event) => {
			  if (event.currentTarget.checked) {
				  if (x.style.display === "none") {
					    x.style.display = "block";
					  } 
			    
			  	  }
			  else{
				  if (x.style.display === "block") {
					    x.style.display = "none";
					  } 
			  }
			  
			  
				})
		
	}
	
	}



function show_sub_features(current) {	
	const checkbox = document.getElementById(current)
	console.log(current)
	switch (current)
		{
		   case "algorithm_feature_parent_1":			   
		   		var x = document.getElementById("collaborative_sub");	  	   
		   case "algorithm_feature_parent_2":
			   break;
		   case "algorithm_feature_parent_3":
			    var x = document.getElementById("classification_sub");	  
		  
			    
		}
	if(x){
		
		checkbox.addEventListener('change', (event) => {
			  if (event.currentTarget.checked) {
				  if (x.style.display === "none") {
					    x.style.display = "block";
					  } 
			    
			  	  }
			  else{
				  if (x.style.display === "block") {
					    x.style.display = "none";
					  } 
			  }
			  
			  
				})
		
	}
	
	}
	
function disable_parent(list_key,current,map_features){	
	

	const index = list_key.indexOf(current)
	
	if (index > -1) {
	  list_key.splice(index, 1) // 2nd parameter means remove one item only
	}
	
	const checkbox = document.getElementById(current)
	checkbox.addEventListener('change', (event) => {
	  if (event.currentTarget.checked) {
		  
		for (var i = 0; i < list_key.length;i++){
			document.getElementById(list_key[i]).disabled = true;
			//disable_sub_feature_with_parent(current,list_key[i],map_features)
		}	    
	  } else {			    
		  for (var i = 0; i < list_key.length;i++){
				document.getElementById(list_key[i]).disabled =false;		    
				//disable_sub_feature_with_parent(current,list_key[i],map_features)
			}
	  }
	})
	}


function get_list_checkboxes(){
	var inputs = document.getElementsByTagName("input");
	var checkboxes=[]
	for(var i = 0; i < inputs.length; i++) {
	    if(inputs[i].type == "checkbox") {	
	        checkboxes.push(inputs[i].id)
	    }  
	}
	return checkboxes	
	
}

function get_list_sub_field(){
	var inputs = document.getElementsByTagName("ul");
	var list_sub_fields=[]
	for(var i = 0; i < inputs.length; i++) {	   
		list_sub_fields.push(inputs[i].id)    
	}
	return list_sub_fields	
	
}


function get_data_structure_features(){
	var data_struct_features=[];
	checkboxes=get_list_checkboxes()
	for(var i = 0; i < checkboxes.length; i++) {	    
	    if (checkboxes[i].includes("feature_parent")){
	    	data_struct_features.push(checkboxes[i])
	    }
	}



function set_constraints(id){	
	
	checkboxes=get_list_checkboxes()
	
	var map_features = {}
	
	var key_parents = []
	
	var coll_features = []
	
	var class_features = []
	
	
	for(var i = 0; i < checkboxes.length; i++) {	    
	    if (checkboxes[i].includes("feature_parent")){
	    	key_parents.push(checkboxes[i])
	    }
	}
	
	
	
	for(var i = 0; i < checkboxes.length; i++) {	    
	    if (checkboxes[i].includes("coll")){
	    	coll_features.push(checkboxes[i])
	    }
	}
	
	for(var i = 0; i < checkboxes.length; i++) {	    
	    if (checkboxes[i].includes("class")){	    	
	    	class_features.push(checkboxes[i])
	    }
	}
	
	
	
	map_features[key_parents[0]] = coll_features
	map_features[key_parents[2]] = class_features	
	
	disable_parent(key_parents, id, map_features)
	sub_field=get_list_sub_field()
	
	show_sub_features(id)
	
	
	
}