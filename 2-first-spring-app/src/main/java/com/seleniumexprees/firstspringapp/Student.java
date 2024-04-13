package com.seleniumexprees.firstspringapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Student {
	
	// MathTeacher mathTeacher = new MathTeacher();
		// ScienceTeacher scienceTeacher = new ScienceTeacher();

		// Teacher teacher = new MathTeacher();
		// Teacher teacher = new ScienceTeacher();
		
//	    @Autowired
//	    @Qualifier("mathTeacher")
		Teacher teacher;

		// public Student(Teacher teacher) {
		// this.teacher = teacher;
		// }
	    
	    public Student(Teacher teacher) {
			this.teacher=teacher;
		}

//		@Autowired
//	    @Qualifier("mathTeacher")
//		public void setTeacher(Teacher teacher) {
//			this.teacher = teacher;
//		}	

//		// Factory Design Pattern
//		public void learn(String subject) {
//			// mathTeacher.teachMath();
//			// scienceTeacher.TeachScience();
	//
//			// subject --> create object of that particular subject
	//
//			this.teacher = TeacherFactory.teacher(subject);
//			teacher.teach();
//			System.out.println("learn");
//		}

		// Constructor Injection
//		public void learn()
//		{
//			//mathTeacher.teachMath();
//			//scienceTeacher.TeachScience();
//			// subject --> created using Constructor of Student
//			teacher.teach();
//			System.out.println("learn");
//		}

		// Setter Injection
		public void learn() {
			// mathTeacher.teachMath();
			// scienceTeacher.TeachScience();
			// subject --> created using Constructor of Student
			teacher.teach();
			System.out.println("learn");
		}

}
