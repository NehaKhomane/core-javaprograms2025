package com.sunbeam.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;

public class collectionprogram03 {
    public static void main(String[] args) {
        Collection<Integer> c=new ArrayList<Integer>();
   //     Collection<Integer> c1 = new ArrayDeque<>();
//        Collection<Integer> c1 = new LinkedHashSet<>();

        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);

        System.out.println("size of c" +c.size());
        for(Integer i:c){
            System.out.println(i);
        }
    }
}
