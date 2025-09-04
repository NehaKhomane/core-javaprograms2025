package com.sunbeam.demo01;

public class Bankaccount {
    private static int generateAccNo=1000;
    private int accNo;
    private String name;
    private double balance;

    {
        generateAccNo++;
        accNo=generateAccNo;
    }
    public Bankaccount() {

    }
    public Bankaccount(String name,double balance) {
        this.name=name;
        this.balance=balance;
    }
    public void displayAccNoDetails() {
        System.out.println("Account No: "+accNo);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
    }
}
