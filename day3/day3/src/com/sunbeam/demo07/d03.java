package com.sunbeam.demo07;

public class d03 {
    public static void main(String[] args) {
        int[][] arr=new int[3][];//Ragged array
        arr[0]=new int[3];
        arr[1]=new int[3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;

        System.out.println("using for loop");
        for(int i=0;i<arr.length;i++){
            int[] arr2 =arr[i];
            for(int j=0;j<arr2.length;j++){
                int element=arr[i][j];
                System.out.print(element+"  ");
            }
        }
        System.out.println("Using for Each");
        for(int arr2[]:arr){
            for(int ele:arr2){
                System.out.print(ele+"  ");
            }
        }
    }
}
