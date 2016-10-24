package com.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest")
@RestController
public class MyController {

	@RequestMapping(method = RequestMethod.GET)
	public String myMethod(){
		
		return "hi";
	}
}
