package com.sonbeam.demo01;
class Book<T>{
    T t;
    public void setT(T t){
        this.t=t;
    }
    public T getT(){
        return t;
    }
}

public class program04 {
    public static void displayBox(Book<?  extends  Number >b){
        System.out.println(b.getT());
    }
    public static void main(String[] args) {

        Book<Float> b = new Book<Float>();
        b.setT(10.99f);
        displayBox(b);

        Book<String> b1 = new Book<String>();
        b1.setT("hello");
       // displayBox(b1); //not ok

        Book<Integer> b2 = new Book<Integer>();
        b2.setT(1);
        displayBox(b2);
    }
}
