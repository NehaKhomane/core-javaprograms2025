package com.sunbeam.demo02;

import java.util.Scanner;

public class pg01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employ emp ;
        emp= new Manager();
        //emp=new salesman();
        emp.accept(sc);
        emp.display();

        if(emp instanceof Manager){
            Manager m=(Manager)emp;
            m.calsculateTotalSalary();

        }
        if(emp instanceof Salesman){
            Salesman s=(Salesman)emp;
            s.totalSalaryofSalesman();

        }
    }
}
