package com.sunbeam.demo01;
class vehicle{
    private String color;
    private int modelno;
    private  String name;
     vehicle(){

     }
    vehicle(String color,int modelno,String name)
    {
        this.color=color;
        this.modelno=modelno;
        this.name=name;

    }

    @Override
    public String toString() {
        return "vehicle{" +
                "color='" + color + '\'' +
                ", modelno=" + modelno +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
         if (obj == null)
             return false;
         if (obj == this)
             return true;
         if(obj instanceof vehicle){
             vehicle other = (vehicle) obj;//downcasting
             return this.color.equals(other.color)&&this.modelno==other.modelno;
         }
         return  false;


    }
}


public class demo03 {
    public static void main(String[] args) {
        vehicle obj = new vehicle("red",123,"jagwar");
        vehicle obj1 = new vehicle("red",123,"jagwar");
        System.out.println(obj);
        System.out.println(obj1);
        System.out.println(obj.equals(obj1));//upcasting
        System.out.println("obj == obj1" + (obj==obj1));
        System.out.println(obj.hashCode() == obj1.hashCode());
        System.out.println(obj1.hashCode());


    }
    public static void main1(String[] args) {
        vehicle obj = new vehicle("red",123,"jagwar");
        vehicle obj1 = new vehicle("red",123,"jagwar");
        System.out.println(obj);
        System.out.println(obj1);
        System.out.println(obj.hashCode() == obj1.hashCode());
        System.out.println(obj=obj1);
    }

}
