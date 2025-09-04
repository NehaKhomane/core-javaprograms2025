package com.sunbeam.demo04;

import java.util.Scanner;

class Date{
    private int day;
    private int month;
    private int year;

    public Date(){
        this(1,1,2018);

    }
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void acceptDate(){
        System.out.println("Inside acceptDate method");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        this.day = sc.nextInt();
        System.out.print("Enter month: ");
        this.month = sc.nextInt();
        System.out.print("Enter year: ");
        this.year = sc.nextInt();

    }
    void displayDate(){
        System.out.println("Day: " + this.day + " Month: " + this.month + " Year: " + this.year);

    }

}
public class p01 {
    public static void main(String[] args) {
      Date d = new Date();
      d.displayDate();

      Date d1 = new Date();
      d1.acceptDate();

      Date d2 = new Date();
      d2.acceptDate();
      d2.displayDate();
    }
}
