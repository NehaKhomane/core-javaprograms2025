package com.sunbeam.demo04;


import java.util.Scanner;

public class Studentdemo extends Persondemo {
    int rollno;
    double marks;

    public void acceptStudent1(Scanner sc){
        System.out.println("Enter the rollno");
        rollno = sc.nextInt();
        System.out.println("Enter the marks");
        marks = sc.nextDouble();
        super.accept(sc);
    }
    public void displayStudent1(){
        System.out.println("Roll no:"+rollno);
        System.out.println("Marks:"+marks);
        displayPersondemo();
    }

}
