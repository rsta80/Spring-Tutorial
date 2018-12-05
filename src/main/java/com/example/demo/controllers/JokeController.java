package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.services.JokeService;

@Controller
public class JokeController {
	
	private JokeService jokeService;
	
	@Autowired
	public JokeController(JokeService jokeService) {
		
		this.jokeService = jokeService;
		
	}
	
	@RequestMapping({"/",""})
	public String showJoke(Model model) {
		
		model.addAttribute("joke", jokeService.getJoke());		
		return "checknorris";
		
	}
	
	@RequestMapping(value = "/updateJoke", method = RequestMethod.GET)
    public @ResponseBody String processAJAXRequest() {
            
            // Process the request
            
            // Prepare the response string

            return jokeService.getJoke();

        }
	

}
