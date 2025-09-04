package com.sunbeam.demo01;
import java.util.Scanner;
/***************
 *  Write a java program to reverse a String****************
 *
 *  *********************************author-(Neha khomane)*****************/
public class program01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Reversed String: " + reversed);
        sc.close();
    }

}
