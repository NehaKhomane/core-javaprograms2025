package com.sunbeam.demo03;
//sub class
//employ is a person
import java.util.Scanner;

public class Employ extends Person {
    int empid;
    double salary;
    Employ() {
       System.out.println("Employee ()");
    }
    public Employ(int empid, double salary,String name,String mobile) {
        super(name,mobile);//constructor chaining between sub class and the super class

        this.empid = empid;
        double salary2 = salary;

    }
    public void acceptEmploy(Scanner sc) {
        System.out.println("Enter empid :");
        empid = sc.nextInt();
        System.out.println("Enter salary :");
        salary = sc.nextDouble();
        super.acceptPerson(sc);
    }
    public void displayEmploy() {
        System.out.println("Employee ID :"+empid);
        System.out.println("Employee Salary :"+salary);
        showPerson();
    }
}
