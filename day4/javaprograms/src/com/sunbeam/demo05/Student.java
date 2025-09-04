package com.sunbeam.demo05;

import java.util.Scanner;

public class Student {
    private int rollno;
    String name;
    int age;
    float score;
    public Student() {

    }

    public Student(int rollno, String name, int age, float score) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.score = score;
    }
    public void acceptStudent(Scanner scanner) {
        System.out.println("Enter your rollno");
        rollno = scanner.nextInt();
        System.out.println("Enter your name");
        name = scanner.next();
        System.out.println("Enter your age");
        age = scanner.nextInt();
        System.out.println("Enter your score");
        score = scanner.nextFloat();

    }
    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);
    }
    public int getrollno() {
        return rollno;
    }
}
