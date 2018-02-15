package com.modern_business.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("adminHomeController")
public class AdminHomeController {

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String home() {
		return this.direct();
	}

	private String direct() {
		return "admin/index";
	}

	private String redirect() {
		return "redirect:/index";
	}

}
