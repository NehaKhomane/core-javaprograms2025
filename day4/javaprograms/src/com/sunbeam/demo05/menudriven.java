package com.sunbeam.demo05;

import java.util.Scanner;

public class menudriven {
    public static  int menu(Scanner scanner){
        System.out.println("-------------");
        System.out.println("0.Exit");
        System.out.println("1.Add Student");
        System.out.println("2.Display Student");
        System.out.println("3.Find Student Roll No");
        return  scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] arr = new Student[5];
        int choice;
        int index = 0;
        int rollno;
        while ((choice = menu(scanner)) != 0) {
            switch (choice) {
                case 1:
                    if (index < 5) {
                        arr[0] = new Student(1, "Anil", 50, 98);
                        arr[1] = new Student(2, "Mukesh", 55, 78);
                        arr[2] = new Student(3, "Ramesh", 60, 99);
                        arr[3] = new Student(4, "Suresh", 65, 99);
                        arr[4] = new Student(5, "Ram", 70, 77);
                        index = 5;
                    } else
                        System.out.println("Course is full");
                    break;
                case 2:
                    for (Student s : arr)
                        if (s != null)
                            s.displayStudent();
                    break;

                case 3:
                    System.out.println("Enter the rollno of student to search");
                    rollno = scanner.nextInt();
                    for (Student s : arr)
                        if (s != null)
                            if (rollno == s.getrollno())
                                s.displayStudent();
                    break;
                default:

                    System.out.println("WRONG ");
                    break;
            }

        }

    }

    }


