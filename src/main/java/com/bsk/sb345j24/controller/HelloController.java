package com.bsk.sb345j24.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sb345")
public class HelloController {
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello SB345 with Jdk24 World!!!";
	}
}
