package com.Han.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
public class IndexController {
	@RequestMapping({"/","/index"})
	public String index() {
		return "index";
	}
}
