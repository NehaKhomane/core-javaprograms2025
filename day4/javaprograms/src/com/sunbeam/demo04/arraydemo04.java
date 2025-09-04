package com.sunbeam.demo04;
//------variable Arity method----//
public class arraydemo04 {
    public static void add(int... arr) {
        int result = 0;
        for (int e : arr)
            result += e;
        System.out.println("Addition - " + result);
    }
    public static void main(String[] args) {
        add(10,20);
        add(50,40,90);
    }
}
