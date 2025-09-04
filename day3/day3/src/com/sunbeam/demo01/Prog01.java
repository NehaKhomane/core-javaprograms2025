package com.sunbeam.demo01;

public class Prog01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.acceptStudent();
        student.displayStudent();
        Student student1 = new Student("neha",25,
                "gpp",200);

        student1.displayStudent();

    }
}
