package com.jrovira.test.micros.sample.services;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("test1")
public interface Test1Service {

	@RequestMapping(value="/test", method=RequestMethod.GET)
	String test();
}
