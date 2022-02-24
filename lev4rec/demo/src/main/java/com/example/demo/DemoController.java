package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class DemoController {	
	@RequestMapping("/")
	public String index(Model model) {
		RSConfiguration config = new RSConfiguration();
		model.addAttribute("config",config);			
		return "index";
	}
	@RequestMapping(value="/", method = RequestMethod.POST)
	public String save(@ModelAttribute("config") RSConfiguration config) {		
		System.out.println(config.isCollaborativeFiltering());
		System.out.println(config.isItemBased());
		System.out.println(config.isUserBased());
		return "redirect:/";
	}

}
