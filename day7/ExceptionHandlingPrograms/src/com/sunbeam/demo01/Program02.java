package com.sunbeam.demo01;
//--------StackOverflowError Program------//
public class Program02 {
    public static void main(String[] args) {
        time();
        System.out.println("Hello World");
    }
    public static  void time(){
        double num1;
        time();
    }
}
