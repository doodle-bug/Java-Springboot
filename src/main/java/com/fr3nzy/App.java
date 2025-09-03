package com.fr3nzy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        the above statement wilfl give you the container and create all the objects which are under the bean tag of spring.xml file
//        we're using XML way of configuring spring project for this time, other ways are Java based and annotations(learn later)
        Alien obj = (Alien) context.getBean("alien1");
//        "alien" is the id for the ALien bean which is specified in the spring.xml file
//        obj.setAge(21);
        System.out.println(obj.getAge());
        obj.code();
/*
        Alien obj2 = (Alien) context.getBean("alien1");
        even if you run .getBean() two times, the object will be created only once
        that's why obj2.age will also be 21 rather than 0 if there would have been two different objects
        System.out.println(obj2.age);f
        obj2.code();
*/
        Desktop obj1 = context.getBean("com", Desktop.class);

    }
}
