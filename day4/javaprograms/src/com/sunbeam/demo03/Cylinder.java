package com.sunbeam.demo03;
//------Static-----//
class Circle{
    int radius;
    static double PI;

    static{
        System.out.println("Static Block");
        PI=3.14;
    }
    public Circle(int r){
        this.radius=r;
    }
    public void  show(){
        double area=Math.PI*radius*radius;
        System.out.println("Area:"+area);
    }
}

public class Cylinder {
    public static void main(String[] args) {
        Circle c=new Circle(5);
        Circle c1=new Circle(5);
        Circle c2=new Circle(5);
        Circle c3=new Circle(5);
        c.show();
        c2.show();
        c3.show();


        c1.show();

        System.out.println(c1.radius);
        System.out.println(c2.radius);

    }


}
