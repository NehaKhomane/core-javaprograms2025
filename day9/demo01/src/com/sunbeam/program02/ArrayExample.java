package com.sunbeam.program02;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int arr[]={91,22,44,99,66};
        System.out.println("Before sorting ");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After sorting ");
        System.out.println(Arrays.toString(arr));

        Double arr1[]={20.11,12.55,99.54,98.43};
        System.out.println("Before sorting ");
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("After sorting ");
        System.out.println(Arrays.toString(arr1));


        String arr2[]={"k","c","b"};
        System.out.println("Before sorting ");
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("After sorting ");
        System.out.println(Arrays.toString(arr2));
    }
}
