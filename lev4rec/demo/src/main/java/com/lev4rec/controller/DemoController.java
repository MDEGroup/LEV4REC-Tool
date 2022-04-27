package com.lev4rec.controller;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.annotation.Resource;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lev4rec.dto.RSConfiguration;

import lowcoders.RSModel;

import com.lev4rec.business.FeatureHandler;

@Controller
public class DemoController {	
	@RequestMapping("/")
	public String index(Model model) {
		RSConfiguration config = new RSConfiguration();
		model.addAttribute("config",config);			
		return "home.html";
	}
	@RequestMapping(value="/dsl", method = RequestMethod.POST)
	public String save(Model model, @ModelAttribute("config") RSConfiguration config) {
		
		FeatureHandler fh = new FeatureHandler();
		fh.getRSConfiguration(config);
		String s = "";
		try {
			s = fh.getXtexString(config);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		model.addAttribute("xtext", s);
		
		return "dsl.html";
	}
	
	@RequestMapping(value="/generate", method = RequestMethod.GET)
	public @ResponseBody String generate(@RequestParam("user_string") String dsl_string) {	
		
		
		
		RSModel coarse_model= FeatureHandler.loadModel("generated/demo.xmi");
		
		// da dsl string a xmi /  
		
		// Update model
		coarse_model.setName("KNN recsys");
		
		//RSModel fineGrainModel = FeatureHandler.parseUserString(dsl_string, coarse_model);
		//FeatureHandler.serializeModel(fineGrainModel, "generated/demo.xmi");
		
		
		FeatureHandler.generateFromTML("generated/demo.xmi", "generated");			
		
		return "";
	}
	
	/*@RequestMapping("/generate{user_string}")
	public @ResponseBody String getAttr(@PathVariable(value="user_string") String id, 
	                                 @RequestParam String user_string) {
		RSModel coarse_model= FeatureHandler.loadModel("generated/demo.xmi");
		coarse_model.setName("KNN recsys");
		FeatureHandler.serializeModel(coarse_model, "generated/demo.xmi");
		FeatureHandler.generateFromTML("generated/demo.xmi", "generated");			
		
		return "generate.html";	
		
	}*/
	
	/*@RequestMapping(path = "/generate", method = RequestMethod.GET)
	public ResponseEntity<ByteArrayResource> download(String param) throws IOException {

	    // ...
		
		RSModel coarse_model= FeatureHandler.loadModel("generated/demo.xmi");
		coarse_model.setName("KNN recsys");
		FeatureHandler.serializeModel(coarse_model, "generated/demo.xmi");
		FeatureHandler.generateFromTML("generated/demo.xmi", "generated");			
		File file = new File("generated/demo.xmi");
	    Path path = Paths.get(file.getAbsolutePath());
	    ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));
	    HttpHeaders headers = new HttpHeaders();
	    headers.set("Baeldung-Example-Header", 
	      "Value-ResponseEntityBuilderWithHttpHeaders");

	    return ResponseEntity.ok()
	            .headers(headers)
	            .contentLength(file.length())
	            .contentType(MediaType.APPLICATION_OCTET_STREAM)
	            .body(resource);
	}*/
	
	

}
