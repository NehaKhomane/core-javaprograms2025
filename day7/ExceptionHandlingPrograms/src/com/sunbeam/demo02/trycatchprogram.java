package com.sunbeam.demo02;

import java.util.Scanner;

public class trycatchprogram {
    //----Arithmatic Exception error--//
    public static void division(int a , int b){
        int sum = a/b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("enter first number");
            int a=sc.nextInt();
            System.out.println("enter second number");
            int b=sc.nextInt();
            division(a,b);
        }
        finally{
            System.out.println("Inside the finally block");
            sc.close();
        }
         System.out.println("Finish the program execution");
    }
}
