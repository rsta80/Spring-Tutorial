package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafForm {
	
	@RequestMapping("/profile")
	public String showJoke(Model model) {
		
		//model.addAttribute("joke", jokeService.getJoke());		
		return "checknorris";
		
	}

}
