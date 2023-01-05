package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping(value ="/welcome")
	public String welcome(Model model) {
		
		model.addAttribute("msg", "Welcome To ExceptionHandling..");
		
		String name = null;
		name.length();
		
		return "welcome";
	
	}
	
	/*
	 * @ExceptionHandler(value = NullPointerException.class) 
	 *public String handleException(Model model) {
	 * 
	 * model.addAttribute("errMsg", "Something Went Wrong..!!");
	 * 
	 * 
	 * return "error";
	 * 
	 * }
	 */

}
