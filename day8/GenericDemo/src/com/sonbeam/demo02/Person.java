package com.sonbeam.demo02;

class girls implements  Comparable<girls>{
    int age;
    String name;
    double weight;

    girls(){

    }
    public girls(int age, String name, double weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Person{"+age+","+name+","+weight+"}";
    }

    @Override
    public int compareTo(girls o) {
        return Double.compare(this.weight,o.weight);
    }
}


public class Person {
    public static void main(String[] args) {
        girls g1=new girls(2,"sham",2000);
        girls e2=new girls(3,"priya",3000);

        int result=g1.compareTo(e2);
        System.out.println(result);
        if(result>0){
            System.out.println("Person is greater");
        } else if (result<0) {
            System.out.println("Person is lesser");

        }
        System.out.println("both are equals");

    }

}
