package com.modern_business.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("blogPostController")
public class BlogPostController {

	@RequestMapping(value = "/blog-post", method = RequestMethod.GET)
	public String blogPost() {
		return this.direct();
	}

	private String direct() {
		return "user/blog-post";
	}

	private String redirect() {
		return "redirect:/blog-post";
	}

}
