package com.sunbeam.demo04;

import java.util.Scanner;

public class pg01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Persondemo pd=new Persondemo();
        pd.accept(sc);

        Studentdemo sd=new Studentdemo();
        sd.accept(sc);
    }
}
