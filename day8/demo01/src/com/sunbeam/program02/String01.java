package com.sunbeam.program02;
//-----String Buffer and String Builder-----//
public class String01 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Sunbeam");//thread safe
        StringBuilder sb1 = new StringBuilder("Sunbeam");//not thread safe
        sb.append("DMC");
        sb1.append("pg-DMC");
        System.out.println(sb.toString());
        System.out.println(sb1.toString());
    }
}
