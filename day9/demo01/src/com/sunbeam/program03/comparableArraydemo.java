package com.sunbeam.program03;

import java.util.Arrays;

class Student implements Comparable<Student>{
    int id;
    String name;
    Double score;
    String department;

    Student(){

    }
    public Student(int id, String name, Double score, String department) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", department='" + department + '\'' +
                '}';
    }
    @Override
    public int compareTo(Student o) {
        return this.score.compareTo(o.score);
    }
}


public class comparableArraydemo {
    public static  void DisplayComparableArray(Student[] arr){
        System.out.println("------------------------------------");
        for (Student e:arr) {
            System.out.println(e);

        }
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
         Student arr[]=new Student[5];
         arr[0] =new Student(4,"neha",56.98,"DMC");
         arr[1]=new Student(2,"sneha",98.98,"DBDA");
         arr[2]=new Student(1,"shivam",76.98,"DAC");
         arr[3]=new Student(3,"gaurav",46.98,"DC");
         arr[4]=new Student(5,"sushant",26.98,"DMC");

         DisplayComparableArray(arr);
         System.out.println("-----------------Before sorting------------------");
         Arrays.sort(arr);
         System.out.println("--------------------After sorting");
         DisplayComparableArray(arr);



    }
}
