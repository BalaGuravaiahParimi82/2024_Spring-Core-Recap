package com.seleniumexpress.firstspringapp;

public class TeacherFactory {
	
	public static Teacher teacher(String subject)
	{
		switch (subject) {
	case "math": {
		
		return new MathTeacher();
	}
	case "science": {
		
		return new ScienceTeacher();
	}
	default:
		throw new IllegalArgumentException("Unexpected value: " + subject);
	}	
	}

}
