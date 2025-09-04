package com.sunbeam.demo02;
//Field Initializer

class Car{
    private  String Brand;
    private int passingno;
    private double price;

    //Object Intializer
    {
       System.out.println("object Initializer");

    }
    //Object Initializer-1
    {
        System.out.println("object Constructor-1");

    }
    public Car(){}
    public Car(String Brand, int passingno, double price) {
        System.out.println("car parameterized constructor");
        this.Brand = Brand;
        this.passingno = passingno;
        this.price = price;
    }
 public String displayCar() {
        return  Brand +"/" +passingno+ "/" +price;
 }

}


public class pg05 {
    public static void main(String[] args) {
        Car c2=new Car();
        System.out.println(c2.displayCar());
        Car c1=new Car("BMW",1000,2000);
        System.out.println(c1.displayCar());

    }
}
