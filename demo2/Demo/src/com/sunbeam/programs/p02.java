package com.sunbeam.programs;

import java.util.Scanner;

public class p02 {
    int hr;
    int min;

    public  void acceptTime(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  the hours");
        hr=sc.nextInt();
        System.out.println("Enter  the minutes");
    }
    public void displayTime(){
        System.out.println("Time - +hr + :+min");
    }
}
