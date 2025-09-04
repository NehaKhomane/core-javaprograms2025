package com.sunbeam.program01;

import java.util.Comparator;

class Person{
    int age;
    String name;
    double weight;

    Person(){

    }
    Person(int age, String name, double weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}


public class comparatorExample {
    public static void main(String[] args) {
     Person p1=new Person(65,"ABC",67.88);
     Person p2=new Person(6,"AC",6.88);

     class PersonComparator implements Comparator<Person> {
         @Override
         public int compare(Person o1, Person o2) {
             return Double.compare(o1.weight,o2.weight);
         }


     }
        PersonComparator personComparator=new PersonComparator();
     int result=personComparator.compare(p1,p2);
     System.out.println(result);

     if(result<0){
         System.out.println(" result is greater");


     }else if(result>0){
         System.out.println(" result is lesser");
     }
     else {
         System.out.println(" result is equal");
     }
    }
}
