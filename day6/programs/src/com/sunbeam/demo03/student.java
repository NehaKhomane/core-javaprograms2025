package com.sunbeam.demo03;

import java.util.Scanner;

public abstract class student {
    int studid;
    String name;
    double Percentage;
    public student(){

     }
    public student(int studid, String name, double percentage) {
        this.studid = studid;
        this.name = name;
        this.Percentage = percentage;
    }
    public void accept(Scanner scanner){
         System.out.println("Enter the student ID");
         studid = scanner.nextInt();
         System.out.println("Enter the student name");
         name = scanner.next();
         System.out.println("Enter the student percentage");
         Percentage = scanner.nextDouble();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    public void display(){
         System.out.println("Student ID : "+studid);
         System.out.println("Student name : "+name);
         System.out.println("Student percentage : "+Percentage);
    }
    public abstract void calculateTotalPercentage();
}
