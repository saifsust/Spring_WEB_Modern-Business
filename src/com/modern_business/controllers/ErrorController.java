package com.modern_business.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("errorController")
public class ErrorController {

	@RequestMapping(value="/404",method=RequestMethod.GET)
	public String error() {
		return this.direct();
	}

	private String direct() {
		return "404";
	}

	private String redirect() {
		return "redirect:/404";
	}

}
