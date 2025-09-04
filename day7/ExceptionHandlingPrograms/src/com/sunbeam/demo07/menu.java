package com.sunbeam.demo07;

import java.util.Scanner;

public class menu {
    public static int menus(Scanner scanner) {
        System.out.println("0.Exit");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        while((choice=menus(scanner))!=0){
            switch(choice){
                case 0:
                    System.out.println("Exit");
                    break;
                    case 1:
                        System.out.println("Addition");
                        break;
                        case 2:
                            System.out.println("Subtraction");
                            break;
                            case 3:
                                System.out.println("Multiplication");
                                break;

            }
        }
    }
}
