package com.stackroute.restaurantspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class RestaurantController {
	

//
//	@RequestMapping(value = "/" , method = RequestMethod.GET)
//	public String getIndexPage() {
//		return "thymleaf/index";
//	}

	@RequestMapping(value = "/home" , method = RequestMethod.GET)
	public String displayRestaurant() {
		
		return "Hi app is under development";
	}
	
}
