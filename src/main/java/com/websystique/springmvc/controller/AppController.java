package com.websystique.springmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.converter.json.Jackson2ObjectMapperFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class AppController {


	
	@Autowired
	MessageSource messageSource;

	@RequestMapping("/")
	public String startPage(ModelMap model) {
		return "/test";
	}

	@RequestMapping(value="/ss1", method = RequestMethod.POST,consumes = "application/json")
	public String post1( @RequestBody Marker marker) {
		System.out.println("CTR:"+marker);
		System.out.println("CTR:"+marker);

		return "OKAY";
	}



}
