package com.sunbeam.demo04;

public class arraydemo03 {
    public static  void add(int[] arr) {
        int res=0;
        for(int ele:arr){
            res=res+ele;
            System.out.println(res);
        }


    }
    public static void main(String[] args) {
        add(new int[]{10,88});
    }

}

