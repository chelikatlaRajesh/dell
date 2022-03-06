package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@GetMapping("/")
	public String home() {
		
	return "welcome home";
		
	}
	
	@GetMapping("/getadmin")
	public String admin() {
		
	return "welcome admin";
		
	}
	
	@GetMapping("/getmanager")
	public String manager() {
		
	return "welcome manager";
		
	}
	
}
