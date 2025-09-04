package com.sunbeam.demo04;

import java.util.Scanner;

abstract class Acceptable1
{
    public abstract void accept(Scanner sc);
}
class Student extends Acceptable1{
    int Sroll;
    String Sname;

    @Override
    public void accept(Scanner sc) {
        System.out.println("Stuent::accept");


        }
    }
    class book extends Acceptable1
    {
        int Book;
        String Bookname;
        @Override
        public void accept(Scanner sc) {
            System.out.println("book::accept");
        }
    }
class product extends Acceptable1
{
    int Product;
    double Price;
    @Override
    public void accept(Scanner sc) {
        System.out.println("product::accept");
    }
}

public class abstractClassExample {
    public static void main(String[] args) {
       // Acceptable a2; //upcasting
      //  a2 = new book();
        Acceptable1 a3;
        a3 = new product();
        a3.accept(null);
    }
}
