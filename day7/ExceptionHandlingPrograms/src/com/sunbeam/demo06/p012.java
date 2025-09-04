package com.sunbeam.demo06;

public class p012 {
    public static void main(String[] args) {
     Vehicle vehicle=new Vehicle(12,"BMW23","bike",760);
     try{
         Vehicle vehicle1=(Vehicle) vehicle.clone();
         System.out.println(vehicle1);
         System.out.println(vehicle);
         System.out.println("after change in vehicle vehicle1");
         vehicle1.Modelno=18;
         System.out.println(vehicle1);
         System.out.println(vehicle);
     } catch (CloneNotSupportedException e) {
         e.printStackTrace();
     }
    }
}
