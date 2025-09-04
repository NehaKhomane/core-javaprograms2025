package com.sunbeam.program03;

import java.util.Arrays;
import java.util.Comparator;

class Employee implements Comparable<Employee>{
    int id;
    String name;
    double salary;
    Employee(){

    }
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.id-o.id;
    }
}


public class comparableComparatordemo {
    public static void displayComparableArray(Employee[] arr){
        System.out.println("------------------------------");
        for(Employee e:arr){
            System.out.println(e);
            System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) {
        Employee[] arr = new Employee[5];
        arr[0]=new Employee(3,"ABC",50000.00);
        arr[1]=new Employee(2,"DEF",10000.00);
        arr[2]=new Employee(1,"GHI",20000.00);
        arr[3]=new Employee(5,"JKL",30000.00);
        arr[4]=new Employee(4,"KLM",40000.00);

        displayComparableArray(arr);
        System.out.println("---------------before sorting---------------");
        Arrays.sort(arr);
        System.out.println("---------------after sorting---------------");
        displayComparableArray(arr);

         class EmployeeComparator  implements Comparator<Employee> {
             @Override
             public int compare(Employee o1, Employee o2) {
                 return o1.id-o2.id;
             }
         }
        EmployeeComparator employeeComparator = new EmployeeComparator();
         Arrays.sort(arr,employeeComparator);
         System.out.println("---------------After sorting Id---------------");
         displayComparableArray(arr);




         class EmployeeSalaryComparator  implements Comparator<Employee> {
             @Override
             public int compare(Employee o1, Employee o2) {
                 return Double.compare(o1.salary,o2.salary);
             }
         }
        EmployeeSalaryComparator employeeSalaryComparator = new EmployeeSalaryComparator();
         Arrays.sort(arr,employeeSalaryComparator);
         System.out.println("---------------After sorting Salary---------------");
         displayComparableArray(arr);
    }
}
