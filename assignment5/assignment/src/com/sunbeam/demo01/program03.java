package com.sunbeam.demo01;
/***************** Neha khomane(W3)
 *  Write a java code to check string is palindrome.
 *  **********************************************/

import  java.util.Scanner;

public class program03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check for palindrome: ");
        String input = sc.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        sc.close();
    }
}
