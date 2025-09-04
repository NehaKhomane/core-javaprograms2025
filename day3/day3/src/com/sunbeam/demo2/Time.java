package com.sunbeam.demo2;

import java.util.Scanner;

class Date {
    private int hour;
    private int minute;
    private int second;

    public void acceptTime(int hour, int minute,
                           int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void acceptTime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hour");
        this.hour = sc.nextInt();
        System.out.println("Enter minute");
        this.minute = sc.nextInt();
        System.out.println("Enter second");
        this.second = sc.nextInt();
    }
    void displayTime() {
        System.out.println("Time is" +hour+ ": " +minute+ ":" +second );

    }

}
public class Time {
    public static void main(String[] args) {
        Date d = new Date();
        Date d1 = new Date();
        d.acceptTime();
        d.displayTime();
        d1.acceptTime();

        d1.displayTime();
    }
}