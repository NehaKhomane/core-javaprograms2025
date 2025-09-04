package com.sunbeam.demo01;

public class program03 {
    public static void main(String[] args) {
        Employee e1=null;
        e1.displayEmployee();//Null pointer exception

        Employee e3=new Employee();
        Employee e2=new Employee(1,"abc",1000);
        e1.displayEmployee();
        e2.displayEmployee();

    }
}
