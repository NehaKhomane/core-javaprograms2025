package com.sonbeam.demo01;
//Generic class example----//

class Box<T>{
    private T t;//refrence
    public void set(T t){
        this.t=t;
    }
    public T get(){
        return t;
    }
}



public class program01 {
    public static void main(String[] args) {
        Box<Integer> box=new Box<Integer>();
        box.set(new Integer(10));
        Integer i=box.get();
        System.out.println(i);

        Box<String> box1=new Box<String>();
        box1.set("Hello");
        String s=box1.get();
        System.out.println(s);

        Box<Double> box2=new Box<Double>();
        box2.set(10.5);
        double a=box2.get();
        System.out.println(a);


    }
}
