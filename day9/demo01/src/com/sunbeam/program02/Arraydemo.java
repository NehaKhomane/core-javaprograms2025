package com.sunbeam.program02;

import java.util.Arrays;

public class Arraydemo {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        System.out.println(Arrays.toString(arr1));
        Double[] arr2={1.0,2.0,3.0,4.0,5.0};
        System.out.println(Arrays.toString(arr2));
        String[] arr3={"A","B","C","D"};
        System.out.println(Arrays.toString(arr3));
        Float[] arr4={1.0F,2.0F,3.0F,4.0F};
        System.out.println(Arrays.toString(arr4));

        Integer[] arr5={1,2,3,4,5};//non primitive
        System.out.println(Arrays.toString(arr5));
    }
}
