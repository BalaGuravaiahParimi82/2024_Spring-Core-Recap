package com.seleniumexpress.firstspringapp;


public class App 
{
    public static void main( String[] args )
    {
       //Teacher teacher = new ScienceTeacher();
       Teacher teacher = new MathTeacher();
       
       // Factory Design Pattern
       //Student student = new Student(teacher);
       //student.learn("science");  
       
       // Constructor Injection
       //Student student = new Student(teacher);
       //student.learn(); 
       
       
       // Setter Injection
       Student student = new Student();
       student.setTeacher(teacher);
       student.learn();
       
    }
}
