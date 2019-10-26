package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/")
	public String getStart() {
		return "Application Started..!";
	}
	
	@GetMapping("/getHello")
	public String getHello() {
		return "Hello World";
	}

}
