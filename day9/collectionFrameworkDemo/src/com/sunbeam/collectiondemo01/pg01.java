package com.sunbeam.collectiondemo01;



import java.util.ArrayList;

public class pg01 {
    public static void main(String[] args) {
        ArrayList<Integer> persons=new ArrayList<Integer>();
           persons.add(1);
           persons.add(2);
           persons.add(3);
           persons.add(4);

           persons.add(5);
           persons.add(6);
           persons.add(7);
           persons.add(8);
           persons.add(9);
           persons.add(10);

           System.out.println(persons);
           persons.remove(2);
           System.out.println(persons);
           System.out.println(persons.size());
           System.out.println(persons.get(4));

    }
}
