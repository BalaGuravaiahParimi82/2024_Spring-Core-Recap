package com.seleniumexprees.firstspringapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
	public static void main( String[] args )
    {
		ApplicationContext container1 = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Person person1 = container1.getBean("person", Person.class);
		Person person2 = container1.getBean("person", Person.class);
		
		if(person1==person2) {
			System.out.println("Both Objects are Same");
		}
		else {
			System.out.println("Both Objects are different");
		}
		
		ApplicationContext container2 = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Person person3 = container2.getBean("person", Person.class);
		Person person4 = container2.getBean("person", Person.class);
		
		if(person3==person4) {
			System.out.println("Both Objects are Same");
		}
		else {
			System.out.println("Both Objects are different");
		}
    }
}
