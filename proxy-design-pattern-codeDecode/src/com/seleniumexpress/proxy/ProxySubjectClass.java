package com.seleniumexpress.proxy;

public class ProxySubjectClass extends RealSubjectClass{
	
	public void method()
	{
		System.out.println("I am Proxy Method");
		System.out.println("Calling Real Method");
		super.method();
	}
		
}
