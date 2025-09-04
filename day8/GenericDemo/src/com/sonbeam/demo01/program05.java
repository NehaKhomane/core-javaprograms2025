package com.sonbeam.demo01;
class Person<T>{
    private T t;
    public void setT(T t){
        this.t=t;

    }
    public T getT(){
        return t;
    }
}

public class program05 {
    public static  void displayPerson(Person<? super Integer> p){
        System.out.println(p.getT());

    }
    public static void main(String[] args) {
        Person<Integer> p = new Person<Integer>();
        p.setT(10);
        displayPerson(p);


        Person<Double> p1 = new Person<Double>();
        p1.setT(10.99);
        displayPerson(p);

        Person<Float> p2 = new Person<Float>();

        p2.setT(10.99f);

        displayPerson(p);
        Person<String> p3 = new Person<String>();

        p3.setT("hello");
        displayPerson(p);

    }
}
