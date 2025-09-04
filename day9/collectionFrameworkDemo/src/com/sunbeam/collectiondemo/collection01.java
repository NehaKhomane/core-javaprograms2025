package com.sunbeam.collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class collection01 {
    public static void main(String[] args) {
        List<String> l1=new ArrayList<>();
        l1.add("a");
        l1.add("b");
        l1.add("c");
        l1.add("d");
        l1.add("e");
        l1.add("f");
        l1.add("g");
        l1.add("h");
        l1.add("i");
        l1.add("j");
        for(String s:l1){
            System.out.println(s);
        }
        System.out.println("Element at index 1: "+l1.get(1));
        System.out.println("Element at index 2: "+l1.get(2));
        System.out.println("Element at index 3: "+l1.get(3));
        System.out.println("Element at index 4: "+l1.get(4));
        System.out.println("name of index 4 element: "+l1.get(4));
        System.out.println("last index of  element g: "+l1.lastIndexOf("g"));
        System.out.println("get first  element: "+l1.lastIndexOf("k"));
        System.out.println("size of element: "+l1.size());
        System.out.println("get last  element: "+l1.get(l1.size()-1));
l1.remove("g");
System.out.println(3);
System.out.println("g");
System.out.println("size of element: "+l1.size());

    }
}
