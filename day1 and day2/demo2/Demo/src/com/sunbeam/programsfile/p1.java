package com.sunbeam.programsfile;

import java.util.Scanner;

public class p1 {

    int hr;
    int min;

    public  void acceptTime(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the hours");
        hr=sc.nextInt();
        System.out.println("Enter the minutes");
        min=sc.nextInt();
    }
    public void displayTime(){
        System.out.println("minutes is = " +hr +" :" +min  );

    }
}
