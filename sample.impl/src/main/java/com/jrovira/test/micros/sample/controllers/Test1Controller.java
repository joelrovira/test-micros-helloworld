package com.jrovira.test.micros.sample.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jrovira.test.micros.sample.services.Test1Service;

@RestController
public class Test1Controller implements Test1Service {

		@Override
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test() {
		return "Hello World!!!";
	}

}
