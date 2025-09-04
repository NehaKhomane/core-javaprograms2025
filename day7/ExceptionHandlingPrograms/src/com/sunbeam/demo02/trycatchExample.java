package com.sunbeam.demo02;

import java.util.Scanner;
//----Arithmatic Exception---//
public class trycatchExample {
    public static void division(int a, int b){
        int c=a/b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        //-------try with resources example------//
        try(Scanner sc=new Scanner(System.in);) {
            System.out.println("Enter first number");
            int a=sc.nextInt();
            System.out.println("Enter second number");
            int b=sc.nextInt();
            division(a,b);
        }

        System.out.print("program fisnish successfully");
    }
}
