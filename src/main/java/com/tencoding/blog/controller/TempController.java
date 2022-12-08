package com.tencoding.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempController {
	
	@GetMapping("/temp/home")
	public String tempHome() {
		
		return "/home.html";
	}
	
	@GetMapping("/temp/img")
	public String tempImage() {
		return "/a.png";
	}
	
	@GetMapping("/temp/test")
	public String tempjsp() {
		// prefix : main --> /WEB-INF/views/
		// /test
		//subfix : .jsp 
		// /WEB-INF/views/test.jsp
		return "test";
	}
	
}
