package com.modern_business.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("aboutController")
public class AboutController {

	private ModelAndView model;

	@GetMapping(value = "/about")
	public String initialView() {
		return direct();
	}

	private String direct() {
		return "user/about";
	}
}
