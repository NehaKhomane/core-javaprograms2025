package com.sunbeam.demo02;

import java.util.Scanner;

public class Salesman extends Employ{
    int noofProducts;
    double commission;

    public Salesman(){

    }
    public Salesman(int id,  double salary, int noofProducts, double commission) {
        super(id, salary);
        this.noofProducts = noofProducts;
        this.commission = commission;


    }

    @Override
    public void accept(Scanner scanner) {
        super.accept(scanner);
        System.out.println("Enter number of products : ");
        noofProducts = scanner.nextInt();
        System.out.println("Enter commission : ");
        commission = scanner.nextDouble();

    }
    @Override
    public void display() {
        super.display();
        System.out.println("Enter number of products  : " +noofProducts);
        System.out.println("Enter commission : " +commission);

    }
    public void totalSalaryofSalesman(){
        double totalSalary = salary+commission;
        System.out.println("Total salary : "+totalSalary);
    }
}
