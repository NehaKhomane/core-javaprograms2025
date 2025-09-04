package com.sunbeam.demo03;


class persondemo{
    private int radius;
   private static double PI=3.14;

   public  persondemo(int radius){
       this.radius=radius;
   }
   public  void showpersondemo(){
       double area=Math.PI*radius*radius;
       System.out.println("Area is "+area);

   }
   public static double getPI(){
       return PI;
   }
}


public class programdemo01
{
    public static void main(String[] args) {
        System.out.println(persondemo.getPI());
    }

}
