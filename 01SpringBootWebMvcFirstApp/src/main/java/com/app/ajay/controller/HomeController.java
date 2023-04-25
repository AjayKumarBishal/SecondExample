package com.app.ajay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HomeController {

	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public String showHome() {
		return "Home";
	}
}
