package com.sunbeam.demo02;
//field initializer
class  person{
    private int  id =1;//Initializer
    private String name;
    private int age;

    //Object Initializer
    {
        id=2; //Assignment
        name="Neha";//Initialization
        age=200;

    }
    //constructor Initializer
    public person(){
        id=3;
        name="sneha";
        age=300;

    }
    public String DisplayName(){
        return  id+" "+name+" "+age;
    }
}


public class pg04 {
    public static void main(String[] args) {
        person p1=new person();
        System.out.println(p1.DisplayName());
    }
}
