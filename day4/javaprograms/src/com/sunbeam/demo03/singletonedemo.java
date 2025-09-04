package com.sunbeam.demo03;
//------Singletonedemo----//
class Singletone{
    private static Singletone singleton =null;
    private Singletone(){
        System.out.println("Inside the Singletone Constructor");
    }
    public static Singletone getInstance() {
        if (singleton == null)
            singleton = new Singletone();
            return singleton;

    }
}

public class singletonedemo {
    public static void main(String[] args) {
        Singletone singleton = Singletone.getInstance();
        Singletone singleton2 = Singletone.getInstance();
        Singletone singleton3 = Singletone.getInstance();
        Singletone singleton4 = Singletone.getInstance();
        Singletone singleton5 = Singletone.getInstance();
    }

}
