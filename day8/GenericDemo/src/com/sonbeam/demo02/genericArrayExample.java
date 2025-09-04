package com.sonbeam.demo02;
//generic method
class notebook <T>{
    private T t;
}



public class genericArrayExample {
    public static <T> void displayArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        displayArray(arr);

        String[] str = {"a", "b", "c", "d"};
        displayArray(str);

        Double[] doubleArr = {1.1, 2.2, 3.3, 4.4};
        displayArray(doubleArr);
        Float[] floatArr = {1.1f, 2.2f, 3.3f, 4.4f};
        displayArray(floatArr);
        Long[] longArr = {1L, 2L, 3L, 4L};
        displayArray(longArr);
        Short[] shortArr = {(short) 1, (short) 2, (short) 3, (short) 4};
        displayArray(shortArr);
    }
}
