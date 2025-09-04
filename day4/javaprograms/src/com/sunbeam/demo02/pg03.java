package com.sunbeam.demo02;
//Field Initializer
class Vehical{
    private String name="BMW";
    private int modelno;
    private double price;
//Object INitializer
    {
        modelno=100;
        price=1000.0;
    }

    //Constructor Intializer
    public Vehical(){

    }
    public Vehical(String name,int modelno,double price){
        this.name=name;
        this.modelno=modelno;
        this.price=price;
    }
    public String DisplayName(){
        return name+" "+modelno+" "+price;
    }

}


public class pg03 {
    public static void main(String[] args) {
        Vehical v=new Vehical();
        System.out.println(v.DisplayName());
        Vehical v1=new Vehical("BMW",1000,2000);
    }
}
