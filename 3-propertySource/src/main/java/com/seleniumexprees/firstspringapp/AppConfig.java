package com.seleniumexprees.firstspringapp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@ComponentScan("com.seleniumexprees.firstspringapp")
@Configuration
@PropertySources(value = {
		@PropertySource(value = "classpath:app.properties"),
		@PropertySource(value = "file:/C:/Spring Boot 2024/3-propertiesfileForProject3/src/myapp.properties")	
})
//@PropertySource(value = "classpath:app.properties")
//@PropertySource(value = "file:/C:/Spring Boot 2024/3-propertiesfileForProject3/src/myapp.properties")
public class AppConfig {
	

}
