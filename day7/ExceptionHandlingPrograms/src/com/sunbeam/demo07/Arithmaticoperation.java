package com.sunbeam.demo07;

import java.util.Scanner;

enum Arithmetic {
    EXIT,
    ADD,
    SUB,
    MUL,
    DIV,
}

public class Arithmaticoperation {
    public static Arithmetic  menu(Scanner sc) {
        System.out.println("0.Exit");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter your choice-");
       Arithmetic  [] arr= Arithmetic.values();
       Arithmetic choice=arr[sc.nextInt()];
       return choice;
    }
    public static void main(String[] args) {
        Arithmetic choice;
        Scanner sc = new Scanner(System.in);
        while((choice=menu(sc))!=Arithmetic.EXIT){
            switch(choice){
                case ADD:
                    System.out.println("Addition");
                    break;
                case MUL:
                    System.out.println("Multiplication");
                    break;
                    case SUB:
                        System.out.println("Subtraction");
                        break;
                        case DIV:
                            System.out.println("Division");
                            break;
            }
        }
    }
}
