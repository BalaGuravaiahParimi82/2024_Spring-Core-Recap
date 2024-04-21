package com.seleniumexprees.firstspringapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext container1 = new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
