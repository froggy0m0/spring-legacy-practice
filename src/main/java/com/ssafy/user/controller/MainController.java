package com.ssafy.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * Handles requests for the application home page.
 */
@Controller
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
}
