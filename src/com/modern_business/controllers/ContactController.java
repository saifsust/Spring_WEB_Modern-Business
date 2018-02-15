package com.modern_business.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("contactController")
public class ContactController {

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contact() {
		return this.direct();
	}

	private String direct() {
		return "contact";
	}

	private String redirect() {
		return "redirect:/contact";
	}

}
