package com.fr3nzy;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;

    private Computer com;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("Setter called");
        this.age = age;
    }

//    public Laptop getLap() {
//        return lap;
//    }
//
//    public void setLap(Computer com) {
//        this.lap = lap;
//    }


    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public Alien(){
        System.out.println("Alien object created");
    }

//    @ConstructorProperties({"age", "lap"})
//    public Alien(int age, Laptop lap){
//        System.out.println("Parametrized constructor called");
//        this.age = age;
//        this.lap = lap;
//    }

    public void code(){
        System.out.println("Coding");
        com.compile();
    }
}
