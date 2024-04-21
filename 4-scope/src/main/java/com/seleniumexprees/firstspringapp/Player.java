package com.seleniumexprees.firstspringapp;

import org.springframework.beans.factory.BeanNameAware;

public class Player implements BeanNameAware{
	
	public Player() {
		System.out.println("Player is initializing");
	}
	
	public void play()
	{
		
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("bean is : " + name);
	}

}
