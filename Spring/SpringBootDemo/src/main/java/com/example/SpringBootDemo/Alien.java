package com.example.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
    /*
    the @Component annotation is used to mark a Java class as a Spring-managed bean. When Spring's 
    component-scanning mechanism detects a class annotated with @Component, it automatically registers 
    the class as a bean in the Spring ApplicationContext.
    */
public class Alien {

    @Autowired
    // simplifies dependency injection by allowing Spring to resolve and inject beans automatically.
    Laptop laptop;

    public void code() {

        System.out.println("Coding.");
        laptop.compile();
    }
}
