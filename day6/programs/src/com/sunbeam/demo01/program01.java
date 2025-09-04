package com.sunbeam.demo01;

final class Employee {
   private final int empid=1;
    private String name;
    private int salary;

    {
        //empid=1   // we cant re- intialized the emp bcoz its a final

    }
    Employee() {
        //empid=1;
    }

    //getter //implementation is 100% complete
    public final String  getName() {
        return name;
    }

}
public class program01 {
    final int num1=10;
    final int num2=20;
    //final int num2=10;  //not ok

}
