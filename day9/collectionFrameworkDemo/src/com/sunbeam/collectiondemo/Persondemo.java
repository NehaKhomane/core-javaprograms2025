package com.sunbeam.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

class Person{
    String name;
    int age;
    double weight;
    Person(){

    }
    Person(String name,int age,double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    public Person(int i) {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if(obj instanceof Person){
            Person other = (Person)obj;
            return this.age==other.age;
        }
        return false;
    }
}
public class Persondemo {
    public static void main(String[] args) {
        Collection<Person> persons = new ArrayList<>();
        persons.add(new Person("neha",1,67.8));
        persons.add(new Person("sneha",2,61.8));
        persons.add(new Person("riya",3,67.8));
        persons.add(new Person("anuja",4,78.8));

        for(Person person:persons){
            System.out.println(person);

        }
        Person p1=new Person(2);
        System.out.println(persons.contains(p1));

        Person p2=new Person("sneha",13,61.8);
        System.out.println(persons.remove(p2));

    }
}
