package com.sunbeam.demo03;

import com.sunbeam.demo02.Employ;

import java.util.Scanner;

public class pg011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student st;
        //only refrence can create----abstract class//
        st=new Desd();
        st.accept(sc);
        st.calculateTotalPercentage();
        System.out.println(st);
    }
}
