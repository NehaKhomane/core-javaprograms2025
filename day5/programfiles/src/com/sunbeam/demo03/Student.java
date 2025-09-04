package com.sunbeam.demo03;

import java.util.Scanner;

public class Student extends Person {
    int rollno;
    double marks;

    public void acceptStudent(Scanner sc){
        System.out.println("Enter rollno");
        rollno=sc.nextInt();
        System.out.println("Enter marks");
        marks=sc.nextDouble();
        acceptPerson(sc);
    }
    public void displayStudent(){
        System.out.println("Enter rollno");
        System.out.println("Enter marks");
        showPerson();
    }
}
