package com.seleniumexprees.firstspringapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.seleniumexprees.firstspringapp")
@Configuration
public class ApplicationConfiguration {
	
	
	@Bean("student")
	public Student craeteStudentBean(@Autowired @Qualifier("mathTeacher") Teacher teacher)
	{
		return new Student(teacher);
	}

}
