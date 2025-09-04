package com.sunbeam.demo04;

import java.util.Scanner;

class Dates{
    private int day;
    private int month;
    private int year;

    public Dates(){
        this(1,1,2018);

    }
    public Dates(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //facilitator
    public void acceptDates(){
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
    public int getDay() {
        return day;
    }
    //setter
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    //getters
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }




}
public class p02 {
    public static void main(String[] args) {
        Dates d = new Dates();
        d.displayDate();
        d.setYear(2018);
        System.out.println("Day: " + d.getDay() + " Month: " + d.getMonth() + " Year: " + d.getYear());
        
    }
}

