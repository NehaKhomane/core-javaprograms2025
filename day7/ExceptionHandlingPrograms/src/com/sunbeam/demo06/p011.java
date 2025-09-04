package com.sunbeam.demo06;

public class p011 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(12,"BMW23","bike",760);
         Vehicle vehicle1 = vehicle;
         System.out.println(vehicle);
         System.out.println(vehicle1);

         System.out.println("after change in vehicle1 =--");
         vehicle1.Modelno=15;  //change in field
         System.out.println(vehicle);
         System.out.println(vehicle1);
     }
}
