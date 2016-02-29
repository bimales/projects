package org.bm.spring.aop;

import org.bm.spring.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(final String[] args) {
		final ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		final ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
		System.out.println("Name : " + shapeService.getCircle().getName());
	}

}
