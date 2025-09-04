package com.sunbeam.demo04;

public class arraydemo02 {
    public static void add(int[] arr){
        int result=0;

//        for(int ele:arr){
//            result+=ele;
//        }
        for(int i=0;i<arr.length;i++){
            result+=arr[i];
        }
        System.out.println(result);
    }


    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90,100};
        add(arr);
        int[]arr2={10,88};
        add(arr2);

    }
}
