package com.sunbeam.demo03;

import java.util.Scanner;
//parent class
public class Person {
    String name;
    String mobile;
    Person() {

    }
    public Person(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }
    public void acceptPerson(Scanner scanner) {
        System.out.println("Enter your name");
        name = scanner.nextLine();
        System.out.println("Enter your mobile");
        mobile = scanner.nextLine();
    }
    public void showPerson() {
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobile);
    }
}
