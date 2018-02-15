package com.modern_business.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("itemController")
public class ItemController {

	@RequestMapping(value = "/item", method = RequestMethod.GET)
	public String itemsView() {
		return this.direct();
	}

	private String direct() {
		return "user/item";
	}

	private String redirect() {
		return "redirect:/item";
	}
}
