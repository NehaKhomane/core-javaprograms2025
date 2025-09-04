package com.sonbeam.demo02;

 class Student implements Comparable<Student>{
     String name;
     int age;

     Student (){

     }
     public Student(String name, int age){
         this.name=name;
         this.age=age;
     }

     @Override
     public String toString() {
         return "Student {name=" + name + ", age=" + age + "}";

     }
     @Override
     public int compareTo(Student o) {
         return this.name.compareTo(o.name);
     }
 }
 class Employee implements Comparable<Employee>{
     String name;
     double salary;
     Employee (){

     }
     public Employee(String name,double salary){
         this.name=name;
         this.salary=salary;
     }
     @Override
     public String toString() {
         return "Employee {name=" + name + ", salary=" + salary + "}";

     }
     @Override
     public int compareTo(Employee o) {
         if(this.salary> o.salary)
             return 1;
         else if(this.salary< o.salary)
             return -1;
         return 0;

     }
 }

public class comparableExample {
     public static void main(String[] args) {
         Student student=new Student("neha",13);
         Student student1=new Student("sneha",3);
         Student student2=new Student("priya",13);

         Employee employee=new Employee("neha",99.20);
         Employee employee1=new Employee("priya",99.20);
         Employee employee2=new Employee("neha",99.20);

         int res=employee.compareTo(employee1);
         System.out.println(res);
         if(res>0){
             System.out.println("employee have no salary");
         } else if (res<10000) {
             System.out.println("employee have salary");

         }else {
             System.out.println("employee placed");
         }

         int result;
         result=student.compareTo(student2);
         if(result>0){
             System.out.println("Student fail");
         } else if (result <0) {
             System.out.println("Student success");

         }else {
             System.out.println("Student result declare");
         }

     }
}
