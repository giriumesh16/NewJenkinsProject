package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	int beanDefinitionCount = context.getBeanDefinitionCount();
	System.out.println(beanDefinitionCount);
	
	String[] names = context.getBeanDefinitionNames();
	
	for (String name:names ) {
		System.out.println(name);
	}
	
	}

}
