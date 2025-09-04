package com.sunbeam.demo04;

import java.util.Scanner;

interface  Acceptinterface{
    public  abstract  void accept(Scanner sc);
}
interface Displayinterface{
    public abstract  void display();
}
class bike implements  Acceptinterface, Displayinterface{
    int modelno;
    String name;
    @Override
    public void accept(Scanner sc) {
        System.out.println("Accept bike:");
    }
    @Override
    public void display() {
        System.out.println("Display bike:");
    }
}
class librabry implements   Acceptinterface,Displayinterface{
    int libraryno;
    String lname;
    @Override
    public void accept(Scanner sc) {
        System.out.println("Accept library:");
    }

    @Override
    public void display() {
        System.out.println("Display library:");
    }
}
class bed implements  Acceptinterface{
    int bedno;
    @Override
    public void accept(Scanner sc) {
        System.out.println("Accept bed:");
    }
}
public class interface02 {
    public static void main(String[] args) {
        System.out.println("Interface Example");
        Acceptinterface i1;
        i1=new bed();
        i1.accept(null);


    }

}
