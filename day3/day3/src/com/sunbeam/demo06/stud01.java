package com.sunbeam.demo06;


import com.sunbeam.demo05.Employee;

import java.util.Scanner;

public class stud01 {
    private String name;
    private int age;
    private double weight;
    public stud01(){
        this("neha",43,99.21);

    }
    public stud01(String name,int age,double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;

    }
    public void acceptStudent(Scanner scanner){
        System.out.println("Enter your name:" + "");
        name = scanner.next();
        System.out.println("Enter your age:" + "");
        age = scanner.nextInt();
        System.out.println("Enter your weight:" + "");
        weight = scanner.nextDouble();

    }
    public void showStudent(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Weight:"+weight);
    }

}
