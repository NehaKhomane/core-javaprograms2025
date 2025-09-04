package com.sunbeam.demo01;

import java.util.Scanner;

public class Employee {
    private int empid;
    private String name;
    private double salary;

    public Employee() {

    }

    public Employee(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    public void acceptEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ID");
        empid = sc.nextInt();
        System.out.println("Enter your name");
        name = sc.next();
        System.out.println("Enter your salary");
        salary = sc.nextDouble();
    }
    public void displayEmployee(){
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

}
