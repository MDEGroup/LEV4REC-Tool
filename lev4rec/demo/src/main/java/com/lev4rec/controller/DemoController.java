package com.lev4rec.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lev4rec.dto.RSConfiguration;
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
	public String save(@ModelAttribute("config") RSConfiguration config) {			
		FeatureHandler fh = new FeatureHandler();
		fh.getRSConfiguration(config);
		
		return "dsl";
	}
	@RequestMapping("/generate")
	public String generate() {			
		return "generate.html";
	}
	
	

}
