package com.xworkz.hema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	
	public static void main(String[] args) {
		try {
			
			String metoInfo = "spring.xml";
			ApplicationContext spring = new ClassPathXmlApplicationContext(metoInfo);
			Rocket ref = spring.getBean(Rocket.class);
			ref.launch();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}

}
