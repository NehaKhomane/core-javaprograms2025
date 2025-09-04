package com.sunbeam.demo01;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String address;
    private double fees;

    public Student() {

    }
    public Student(String name, int age,
                   String address, double fees) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.fees = fees;
    }
    public void acceptStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your age:");
        age = sc.nextInt();
        System.out.println("Enter your address:");
        address = sc.nextLine();
        System.out.println("Enter your fees:");
        fees = sc.nextDouble();
    }

    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Fees: " + fees);
        System.out.println("--------------");
    }
}
