package com.sunbeam.program01;

class Student implements Comparable<Student>{
    int  id;
    String name;
    double score;
    String department;
    Student(){

    }

    public Student(int id, String name, double score, String department) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.department = department;

    }

    @Override
    public String toString() {
        return "Student {id=" + id + ", name=" + name + ", score=" + score
                + ", department=" + department + "}";
    }
    @Override
    public int compareTo(Student o) {
        return Double.compare(this.score, o.score);

    }
}


public class comparableExample {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Neha",89.60,"DMC");
        Student s2 = new Student(2,"Sushant",78.09,"CDAC");

        int i = s1.compareTo(s2);
        System.out.println(i);
         if(i<0){
             System.out.println("i is greater");

         } else if (i>0) {
           System.out.println("i is lesser");

         }
         else  {
             System.out.println("i is equal");
         }

    }

}
