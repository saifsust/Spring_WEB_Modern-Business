package com.modern_business.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("blogHomeController")
public class BlogHomeController {

	@RequestMapping(value = "/blog-home", method = RequestMethod.GET)
	public String blogHome() {
		return this.direct();
	}

	private String direct() {
		return "blog-home";
	}

	private String redirect() {
		return "redirect:/blog-home";
	}

}
