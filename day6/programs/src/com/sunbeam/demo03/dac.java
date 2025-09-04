package com.sunbeam.demo03;

import java.util.Scanner;

public class dac  extends student {
     int placementcount;
     public dac() {

     }
     public dac(int studid, String name, double percentage,int placementcount) {
         super(studid, name, percentage);
        this.placementcount = placementcount;
     }

    @Override
    public void accept(Scanner scanner) {
        super.accept(scanner);
        System.out.println("Enter place count");
        placementcount = scanner.nextInt();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Place count: " + placementcount);
    }

    @Override
    public void calculateTotalPercentage() {
        double total= placementcount;
        System.out.println("Total percentage: " + total);
    }
}
