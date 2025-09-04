package com.sunbeam.program03;

//------garbage collectiondemo-----//
class test1{
    test1(){
        System.out.println("test1 parameterless constructor");
    }
}

public class garbagecollectordemo {
    public static void testmethod(){
        test1 tests=new test1();
        tests = null;
        Runtime.getRuntime().gc();
    }

    public static void main(String[] args) {
        testmethod();
    }
}
