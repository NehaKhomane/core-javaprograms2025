package demo.sunbeam.demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    int roll;
    String name;
    Double score;
    Student(){}
    public Student(int roll, String name, Double score) {
        this.roll = roll;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.score.compareTo(o.score);
    }
}


public class program03 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(5,"neha",10.5));
        students.add(new Student(1,"priya",12.5));
        students.add(new Student(3,"riya",8.5));
        students.add(new Student(2,"shreya",6.5));
        students.add(new Student(4,"veena",16.5));

        System.out.println("Students Sorted On natural order:");
        Collections.sort(students);
        students.forEach(p -> System.out.println(p));;

        System.out.println("Student sorted on name asc order");
        Collections.sort(students,(p1,p2)->p1.name.compareTo(p2.name));
        students.forEach(p -> System.out.println(p));

        System.out.println("Students sorted on Score asc order");
        Collections.sort(students,(p1,p2)->Double.compare(p2.score,p1.score));
        students.forEach(p -> System.out.println(p));

        //Method Refrence(::)
        students.forEach(System.out::println);

    }
}
