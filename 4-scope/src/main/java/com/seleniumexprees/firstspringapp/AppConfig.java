package com.seleniumexprees.firstspringapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.annotation.Scope;

@ComponentScan("com.seleniumexprees.firstspringapp")
@Configuration
public class AppConfig {
	
	@Bean
	@Scope("prototype")
	public Player player1()
	{
		return new Player();
	}
	
	@Bean
	public Player player2()
	{
		return new Player();
	}
	

}
