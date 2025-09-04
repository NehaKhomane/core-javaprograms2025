package com.sunbeam.demo04;

import java.util.Scanner;

public class Persondemo {
    String name;
    String mobile;

    Persondemo() {
    }
    public Persondemo(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }
    public void accept(Scanner scanner) {
        System.out.println("Enter name");
        name = scanner.next();
        System.out.println("Enter mobile");
        mobile = scanner.next();
    }
    public void displayPersondemo() {
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobile);
    }


}
