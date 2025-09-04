package com.sunbeam.demo02;

import java.util.Scanner;

class Date{
    int day;
    int month;
    int year;

    public Date() {

    }
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }
    void displayDate(){
        System.out.println(day+"-"+month+"-"+year);
    }
}

//Dependacy class

class Vehical{
    String company;
    String licsenesno;

    public Vehical() {

    }

    public Vehical(String company, String licsenesno) {
        this.company = company;
        this.licsenesno = licsenesno;
    }
    public void acceptVehical(Scanner scanner){
        System.out.print("Enter company: ");
        company = scanner.nextLine();
        System.out.println("Enter licsence no");
        licsenesno = scanner.nextLine();

    }
    public void displayVehical(){
        System.out.println(this.company+"-"+this.licsenesno);
    }
}
//Dependent
class Customer{
    int emid;
    String name;
    double balance;
    Date doj;//Association (composition)
    Vehical vehical;//Association
    public Customer() {
        doj = new Date();
    }
    public Customer(int emid, String name, double balance, int day,int month,int year) {
        this.emid = emid;
        this.name = name;
        this.balance = balance;
        this.doj = new Date(day,month,year);
    }
    public void addVehical(Scanner scanner){
        vehical = new Vehical();
        vehical.acceptVehical(scanner);
    }
    void displayCustomer(){
        System.out.println(this.emid+"-"+this.name+"-"+this.balance);
        System.out.println("date of joininh-");
        doj.displayDate();
        if(vehical != null){
            vehical.displayVehical();
        }
    }


}

public class program02 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Customer customer1 = new Customer();
    customer1.displayCustomer();
    Customer customer2 = new Customer(1,"Abc",1000,1,1,2002);
    customer2.displayCustomer();
    Customer customer3 = new Customer(2,"XYZ",1000,1,1,2003);
    customer3.displayCustomer();
    customer3.addVehical(sc);
}
}
