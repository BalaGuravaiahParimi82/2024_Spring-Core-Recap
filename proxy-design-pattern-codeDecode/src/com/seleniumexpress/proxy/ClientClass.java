package com.seleniumexpress.proxy;

public class ClientClass {
	
	public static void main(String[] args) {
		Subject proxy = new ProxySubjectClass();
		proxy.method();
	}
}
