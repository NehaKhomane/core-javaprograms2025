package com.sunbeam.demo02;


import java.util.Scanner;

public class Employ {
    int id;
    double salary;

    public Employ() {

    }
    public Employ(int id, double salary) {
        this.id = id;
        this.salary = salary;

    }
    public void accept(Scanner scanner) {
        System.out.println("Enter the empid");
        int empid = scanner.nextInt();
        System.out.println("Enter the salary");
        double salary = scanner.nextDouble();
    }

    public void display() {
        System.out.println("Employ id : " + id);
        System.out.println("Employ salary : " + salary);
    }



}
