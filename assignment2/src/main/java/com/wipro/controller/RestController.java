package com.wipro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class RestController {

	@GetMapping(path = "/branches")
	public String getBranches() {
		return "branches.html";
	}
	
	@GetMapping(path = "/services")
	public String getServices() {
		return "services.html";
	}
	
}
