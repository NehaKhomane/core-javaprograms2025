package com.sunbeam.demo03;

class Hostel{
    private String name;
    private int fees;
    private int money;
    private String address;

    public Hostel() {
        System.out.println("Inside Hostel constructor");
        this.name = "TCG";
        this.fees = 100;
        this.money = 1000;
    }
    void displayHostel(){
        System.out.println("Name: " + this.name);
        System.out.println("Fees: " + this.fees);
        System.out.println("Money: " + this.money);
    }
}
public class programsdemo03 {
    public static void main(String[] args) {
        Hostel hostel = new Hostel();
        hostel.displayHostel();

    }
}
