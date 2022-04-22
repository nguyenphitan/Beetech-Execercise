package com.nguyenphitan.testaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class TestAspect {
	private Logger logger = LoggerFactory.getLogger(TestAspect.class);
	
	@Before("execution(* com.nguyenphitan.testaop.controller.TestController.get(..))")
	public void before(JoinPoint joinPoint) {
		logger.info("before called " + joinPoint.toString());
	}
	
	@After("execution(* com.nguyenphitan.testaop.controller.TestController.get(..))")
	public void after(JoinPoint joinPoint) {
		logger.info("after called " + joinPoint.toString());
	}
	
}
