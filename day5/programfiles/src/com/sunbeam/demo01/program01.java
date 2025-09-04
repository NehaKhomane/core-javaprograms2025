package com.sunbeam.demo01;

public class program01 {
    public static void main(String[] args) {
        Bankaccount bankaccount = new Bankaccount();
        Bankaccount bankaccount1 = new Bankaccount("anil",100);
        Bankaccount bankaccount2 = new Bankaccount("neha",65400);
        bankaccount.displayAccNoDetails();
        bankaccount1.displayAccNoDetails();
        bankaccount2.displayAccNoDetails();
    }


}
