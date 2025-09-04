package com.sonbeam.demo01;

class Vehicle <V extends Number>{
    private V vehicle;//refrence

    public void setVehicle(V vehicle) {
        this.vehicle = vehicle;
    }
    public V getVehicle() {
        return vehicle;
    }
}


public class program02 {
    public static void main(String[] args) {
        Vehicle<Integer> vehicle = new Vehicle<Integer>();
        vehicle.setVehicle(5);
        Integer i1 = vehicle.getVehicle();
        System.out.println(i1);

        Vehicle<Double> vehicle2 = new Vehicle<Double>();
        vehicle2.setVehicle(5.11);
        Double i2 = vehicle2.getVehicle();
        System.out.println(i2);
// like String , Date are not allowed here becoz we take the Number type
    }
}
