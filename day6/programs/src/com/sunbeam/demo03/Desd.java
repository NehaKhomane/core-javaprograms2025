package com.sunbeam.demo03;

import java.util.Scanner;

public class Desd  extends  student{
    double  fees;
    public Desd(){

    }
    public Desd( int studid,String name, double percentage, double fees){
        super( studid, name, percentage );
        this.fees = fees;

    }

    @Override
    public void accept(Scanner scanner) {
        super.accept(scanner);
        System.out.print("Enter fees: ");
        fees = scanner.nextDouble();
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("fees -",fees);
    }

    @Override
    public void calculateTotalPercentage() {
        double total=fees+100;
        System.out.printf("%.2f", +total);
    }
}
