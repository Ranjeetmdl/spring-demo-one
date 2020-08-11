package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		/*
		 * load the spring configuration file and create spring container(i.e.
		 * ApplicationContext)
		 */
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get required bean from the Container
        Coach theCoach=context.getBean("myCoach", Coach.class);
        
		// call the method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

		// close the Container or context
        context.close();

	}

}
