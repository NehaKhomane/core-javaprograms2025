package com.sunbeam.demo05;

import java.util.Scanner;

public class Employee {
    private String name;
    private int age;
    private String address;
    private double salary;

      public Employee(){
          this("Abc",23,
                  "Pune",500);
      }
    public Employee(String name, int age, String address, double salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;

    }
    public void acceptEmployee(Scanner scanner){
          System.out.println("Enter your name");
          name = scanner.next();
          System.out.println("Enter your age");
          age = scanner.nextInt();
          System.out.println("Enter your address");
          address = scanner.next();
          System.out.println("Enter your salary");
          salary = scanner.nextDouble();
    }
    public void displayEmployee(){
          System.out.println("Name:"+name);
          System.out.println("Age:"+age);
          System.out.println("Address:"+address);
          System.out.println("Salary:"+salary);
    }


}
