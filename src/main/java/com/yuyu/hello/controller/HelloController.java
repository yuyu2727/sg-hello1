package com.yuyu.hello.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/hello")
	public String helloPage(Model model) {
		model.addAttribute("greeting", "젠킨스배포ggg!! " );
		return "hello";
		
	}
}
