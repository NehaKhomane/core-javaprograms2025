package com.sunbeam.demo07;
//multidimentional array
public class d02 {
    public static void main(String[] args) {
        int[][] arr=new int[3][4];
        arr[0][0]=10;
        arr[0][1]=20;
        arr[0][2]=30;
        arr[0][3]=40;
        arr[1][0]=20;
        arr[1][1]=30;
        arr[1][2]=40;

        System.out.println("Using for loop");
        for(int i=0;i<arr.length;i++){
            int[] arr2=arr[i];
            for(int j=0;j<arr2.length;j++){
                int ele=arr[i][j];
                System.out.print(ele+"  ");
            }
        }
        System.out.println("Using for each loop");
        for(int arr2[]:arr){
            for(int ele:arr2){
                System.out.println(ele+"  ");
            }
        }


    }
}
