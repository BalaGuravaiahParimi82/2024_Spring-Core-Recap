package com.seleniumexprees.firstspringapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
	public static void main( String[] args )
    {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
//		MathTeacher mathTeacher = context.getBean("mathTeacher1", MathTeacher.class);
//		mathTeacher.teach();
		
//		ScienceTeacher scienceTeacher = context.getBean("scienceTeacher", ScienceTeacher.class);
//		scienceTeacher.teach();
		
		Student student = context.getBean("student", Student.class);
		student.learn();
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
//       //Teacher teacher = new ScienceTeacher();
//       Teacher teacher = new MathTeacher();
//       
//       // Factory Design Pattern
//       //Student student = new Student(teacher);
//       //student.learn("science");  
//       
//       // Constructor Injection
//       //Student student = new Student(teacher);
//       //student.learn(); 
//       
//       
//       // Setter Injection
//       Student student = new Student();
//       student.setTeacher(teacher);
//       student.learn();
       
    }
}
