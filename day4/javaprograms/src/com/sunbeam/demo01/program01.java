package com.sunbeam.demo01;
//---------Array IndexOutofBoundsexception error----//
public class program01 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        arr1[0]=20;
        arr1[1]=30;
        arr1[2]=40;
        arr1[3]=50;
        arr1[4]=60;
        arr1[5]=70;
        arr1[6]=80;
        arr1[7]=90;
        arr1[8]=100;
        arr1[9]=200;

        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        System.out.println("Array index example"+arr1[10]);
    }
}
