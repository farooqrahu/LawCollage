package com.law.collage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		return "index";
	}

	@RequestMapping("/index")
	public String lawHome() {
		return "law_home";
	}

}
