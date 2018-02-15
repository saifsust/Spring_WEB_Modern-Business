package com.modern_business.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("productsController")
public class ProductsController {

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public String produectView() {
		return this.direct();
	}

	private String direct() {
		return "products";
	}

	private String redirect() {
		return "redirect:/products";
	}
}
