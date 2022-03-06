package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller {

	@GetMapping("/getadmin")
	public String clerk() {
		return "from clerk";
	}
	
	
	@GetMapping("/getmanager")

	public String manager() {
		return "manager account";
	}
	
	
}
