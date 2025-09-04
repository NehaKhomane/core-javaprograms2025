package com.sunbeam.demo03;

import java.util.Scanner;

public class prg01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employ e1=new Employ();
        e1.acceptEmploy(sc);
        e1.displayEmploy();

        Student s2=new Student();

        s2.displayStudent();

    }
}
