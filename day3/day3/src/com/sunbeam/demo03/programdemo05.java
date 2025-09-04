package com.sunbeam.demo03;

class Vehicles{
    private String color;
    private String model;
    private double price;
    public Vehicles(){
        System.out.println("Inside Vehicles parameter constructor");
    }
    public Vehicles(String color, String model, double price) {
       System.out.println("Inside Vehicles parameterized constructor");
       this.color = color;
       this.model = model;
       this.price = price;
    }
    void displayVehicle01(){
        System.out.println("Vehicles displayed by constructor" +this.color+this.model+this.price);
    }
}

public class programdemo05 {
    public static void main(String[] args) {
       Vehicles vehicles = new Vehicles();

         Vehicles vehicles1 = new Vehicles("red","blue",500);
    }
}
