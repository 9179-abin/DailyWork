package com.cts.hackathon.shopify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping({"/","/index"})
	public String homePage() {
		return "index";
	}
	
	/*
	 * @RequestMapping("/login") public String loginUser() { return "userlogin"; }
	 */
}
