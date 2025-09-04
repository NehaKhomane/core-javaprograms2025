package com.sunbeam.collectiondemo01;

import java.util.Vector;

public class pg02 {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        for(int i=0;i<=10;i++){
            v.add(i);

            for(int j=0;j<10;j++){
                v.add(j);
                v.add(i);

                System.out.println(v.size());
                System.out.println(v.get(v.size()-1));
                System.out.println(v.capacity());
            }

        }
    }
}
