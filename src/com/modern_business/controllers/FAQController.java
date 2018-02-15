package com.modern_business.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("fAQCOntroller")
public class FAQController {

	@RequestMapping(value = "/faq", method = RequestMethod.GET)
	public String FAQ() {
		return this.direct();
	}

	private String direct() {
		return "user/faq";
	}

	private String redirect() {
		return "redirect:/faq";
	}

}
