package com.sunbeam.demo07;

public class d01 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        arr[5]=60;

        System.out.println("Using For Loop");
        for(int i=0;i<arr.length;i++){
            int ele=arr[i];
            System.out.print(ele+"  ");
        }
        System.out.println("\n");
        System.out.println("Using For-each Loop");
        for(int ele:arr){
            System.out.print(ele+"Element ");
        }
    }
}
