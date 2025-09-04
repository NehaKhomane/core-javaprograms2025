package com.sunbeam.demo02;

import java.util.Scanner;

public class Manager extends Employ {
    double bonus;

    public Manager(){

    }
    public Manager(int id,double salary,double bonus) {
        super(id,salary);
        this.bonus=bonus;
    }

    @Override
    public void accept(Scanner scanner) {
        super.accept(scanner);
        System.out.println("bonus-" +bonus);
        bonus=scanner.nextDouble();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Bonus : " + bonus);
    }
    public void calsculateTotalSalary(){
        double totalSalary=salary+bonus;
        System.out.println("Total Salary : "+totalSalary);
    }
}
