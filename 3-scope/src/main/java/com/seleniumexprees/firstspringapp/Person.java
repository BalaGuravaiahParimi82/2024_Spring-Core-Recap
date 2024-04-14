package com.seleniumexprees.firstspringapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
@Lazy
public class Person {
	
	public Person() {
		System.out.println("Inside Person Constructor");
	}
	
	@Value("${name}")
	private String name;
	@Value("${role}")
	private String role;
	@Value("${org}")
	private String org;
	
	public void printversionInfo()
	{
		System.out.println("name : " + name + " role : " + role
				+ " org : " + org);
	}

}
