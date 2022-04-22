package com.nguyenphitan.testaop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestController {
	private Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@GetMapping()
	public String get() {
		logger.info("get is called.");
		return "get";
	}
	
}
