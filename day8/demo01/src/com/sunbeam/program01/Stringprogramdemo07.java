package com.sunbeam.program01;

public class Stringprogramdemo07 {
    public static void main(String[] args) {
        String str1 = "SUNBEAM";
        String str2 = "Sunbeam";
        String str3 =str1.toUpperCase().intern();//get the memory in string literal pool
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
    }
}
