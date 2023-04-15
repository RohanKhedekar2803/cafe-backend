package com.example.resto.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@GetMapping("/ab")
	String test() {
		return "testing works....";
	}
}
