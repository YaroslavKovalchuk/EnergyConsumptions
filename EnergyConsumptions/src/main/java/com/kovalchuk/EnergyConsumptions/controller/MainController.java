package com.kovalchuk.EnergyConsumptions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
	
	@GetMapping
	public String homePage() {
		
		return "<h2> Hey, everyone! </h2>";
		
	}

}
