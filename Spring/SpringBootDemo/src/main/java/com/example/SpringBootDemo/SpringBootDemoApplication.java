package com.example.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
		// Application context is core interface in spring's IoC container and holds beans with their configuration.
		/* SpringApplication.run() serves as entry point for springboot framework. It sets up the application context
			including scanning and registering beans */
		
		
//		System.out.println("Spring trial.");
		Alien obj = context.getBean(Alien.class);
		// .getBean() method is used to retrieve beans from the Spring container by name, type, or both.
		
		obj.code();
	}
}
