package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach=context.getBean("myCoach", Coach.class);
		
		boolean result=(theCoach==alphaCoach);
		System.out.println("Pointing to the same Object ?: "+result);
		
		System.out.println("\nM/m location for theCoach :"+theCoach);
		System.out.println("\nM/m location for alphaCoach :"+alphaCoach);
		
		context.close();

	}

}
