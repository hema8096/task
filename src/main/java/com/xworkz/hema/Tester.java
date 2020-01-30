package com.xworkz.hema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
public static void main(String[] args) {
	try {
		String xmlPath = "spring.xml";
		
		ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
		labour refOfLabour = container.getBean(labour.class);
		refOfLabour.work();
		
	} catch(Exception e) {
		e.printStackTrace();
	}
}
}
