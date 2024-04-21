package com.seleniumexprees.firstspringapp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

@Component
public class BeanInfo implements BeanFactoryAware{

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		boolean singleton = beanFactory.isSingleton("player1");
		System.out.println("Bean is singleton : " + singleton);
	}
}
