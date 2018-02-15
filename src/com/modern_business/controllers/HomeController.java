package com.modern_business.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("homeController")
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		System.out.println("Hello");
		return "user/index";
	}
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		System.out.println("Hello");
		return "user/index";
	}

}
