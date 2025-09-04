package com.sunbeam.demos;
/****************** Neha Khomane(w3----250844221095)***************************************************/


import java.util.Scanner;

public class StringLengthCheck {

    public static void main(String[] args) throws ExceptionLineTooLong {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        try {
            checkStringLength(input);
            System.out.println("The string is accepted: " + input);
        } finally {
            sc.close();
        }
    }

    public static void checkStringLength(String str) throws ExceptionLineTooLong {
        if (str.length() > 80) {
            throw new ExceptionLineTooLong("The string is too long.");
        }
    }
}