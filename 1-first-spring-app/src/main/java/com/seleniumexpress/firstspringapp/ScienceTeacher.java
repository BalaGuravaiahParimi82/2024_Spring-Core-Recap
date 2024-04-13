package com.seleniumexpress.firstspringapp;

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
