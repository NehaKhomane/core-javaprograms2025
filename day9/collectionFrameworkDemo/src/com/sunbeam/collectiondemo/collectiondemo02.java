package com.sunbeam.collectiondemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class Student {
    int id;
    String name;
    double score;
    Student(){
        System.out.println("Student constructor");
    }
    Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Student)) {
            return false;
        }
            Student student = (Student)obj;
            return id==student.id;


    }
}


public class collectiondemo02 {
    public static void main(String[] args) {
         List<Student> students = new ArrayList<>();
//         List<Student> students2 = new LinkedList<>();
//         List<Student> students3 = new Vector<>();
        students.add(new Student(3,"C",9845));
        students.add(new Student(4,"D",845));
        students.add(new Student(1,"A",985));
        students.add(new Student(2,"B",9845));
        students.add(new Student(5,"E",9865));
        students.add(new Student(6,"F",745))
        ;
        for  (Student student : students) {
            System.out.println(student);

            System.out.println(student.id);
            System.out.println("Student at index 2" +students.indexOf(2));
            System.out.println("Student at index 3" +students.indexOf(3));
            System.out.println("Student at index 4" +students.lastIndexOf(4));
            System.out.println("Student at index 5" +students.size());
            Student s1 = (Student)students.get(students.indexOf(student));
            students.remove(s1);
            students.add(student);

        }

    }
}
