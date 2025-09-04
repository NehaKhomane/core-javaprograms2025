package com.sunbeam.demo03;

class Vehical{
    private String color;
    private String model;
    private double price;

    public void initializeVehicle(){
        System.out.println("Inside Vehical Intializer");
         this.color = "red";
        this.model = "BMW";
       this.price = 10000;
    }
    void displayVehicalDetails(){
        System.out.println("Color: " + this.color);
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + this.price);
    }
    }

public class programsdemo01 {
    public static void main(String[] args) {
        Vehical vehical = new Vehical();
        vehical.initializeVehicle();
        vehical.displayVehicalDetails();

        Vehical vehical2 = new Vehical();
        vehical2.initializeVehicle();
        vehical2.displayVehicalDetails();

        Vehical vehical3 = new Vehical();
        vehical3.initializeVehicle();
        vehical3.displayVehicalDetails();
    }
}
