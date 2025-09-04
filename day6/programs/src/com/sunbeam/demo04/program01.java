//-------Interface Example-----//

package com.sunbeam.demo04;

import java.util.Scanner;

interface Acceptable
{
    public abstract void accept( Scanner scanner);
}
class Dates implements Acceptable {
    int day;
    int month;
    int year;

    @Override
    public void accept(Scanner scanner) {
        System.out.println("Date::accept()");
    }
}
class Time implements Acceptable {
    int hour;
    int minute;
    @Override
    public void accept(Scanner scanner) {
        System.out.println("Time::accept()");
    }

}
class Car implements Acceptable{
    String name;
    String color;
    double price;
    @Override
    public void accept(Scanner scanner) {
        System.out.println("Car::accept()");
    }
}


public class program01 {
    public static void main(String[] args) {
        Acceptable a1;
        a1=new Time();
        a1.accept(null);
    }
}
