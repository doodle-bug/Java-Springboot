package com.example.SpringBootDemo;

import org.springframework.stereotype.Component;

@Component
    /*
    the @Component annotation is used to mark a Java class as a Spring-managed bean. When Spring's 
    component-scanning mechanism detects a class annotated with @Component, it automatically registers 
    the class as a bean in the Spring ApplicationContext.
    */
public class Laptop {
    public void compile(){
        System.out.println("Compiling...");
    }
}
