package com.seleniumexpress.firstspringapp;

public class MathTeacher implements Teacher{
	
	public void teachMath()
	{
		System.out.println("Starting math class...");
	}

	@Override
	public void teach() {
		teachMath();
		
	}

}
