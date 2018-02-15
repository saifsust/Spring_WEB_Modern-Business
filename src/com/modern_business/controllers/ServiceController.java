package com.modern_business.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("serviceController")
public class ServiceController {

	@RequestMapping(value = "/services", method = RequestMethod.GET)
	public String service() {
		return this.direct();
	}

	private String direct() {
		return "services";
	}

	private String redirect() {
		return "redirect:/services";
	}

}
