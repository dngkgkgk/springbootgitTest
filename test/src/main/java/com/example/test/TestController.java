package com.example.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/")
	public String test(){
		System.out.println("옵니까??");
		return "view/test.html";
	}
}
