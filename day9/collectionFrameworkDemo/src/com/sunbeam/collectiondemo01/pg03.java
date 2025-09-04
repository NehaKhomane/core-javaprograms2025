package com.sunbeam.collectiondemo01;

import java.util.ArrayList;
import java.util.List;

public class pg03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");


        for(String s: list){
            System.out.println(s);

        }

        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.indexOf(2));
        System.out.println(list.lastIndexOf(2));
        System.out.println(list.subList(2,4));
        list.clear();
        list.add("a");

        list.add("b");
        list.add("c");
        list.remove(1);
        System.out.println(list.size());

    }
}
