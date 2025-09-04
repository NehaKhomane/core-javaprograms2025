package com.sunbeam.demo05;

import java.util.Scanner;

interface Acceptable{
    public abstract void accept(Scanner sc);
}
class Date implements Acceptable{
    @Override
    public void accept(Scanner sc) {
        System.out.println("Date::accept()");
    }
}
class Time implements Acceptable{
    int hr;
    int min;
    @Override
    public void accept(Scanner sc) {
        System.out.println("Time::accept()");
    }
}
class Car implements Acceptable{
    String name;
    String model;
    String price;
    @Override
    public void accept(Scanner sc) {
        System.out.println("Car::accept()");
    }
}

public class prog01 {
    public static void main(String[] args) {
        Acceptable a1;
        a1=new Time();
        a1.accept(null);

    }

}
