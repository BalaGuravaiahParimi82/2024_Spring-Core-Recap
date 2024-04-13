package com.seleniumexprees.firstspringapp;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {
	
	public void TeachScience()
	{
		System.out.println("Starting Science Class");
	}

	@Override
	public void teach() {
		TeachScience();
		
	}

}

