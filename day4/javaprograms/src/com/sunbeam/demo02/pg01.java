package com.sunbeam.demo02;

class Date{
    //Field Initializer
    private int day=1;
    private int month=1;
    private int year=2000;

    public String displayDate(){
        return  day+"-"+month+"-"+year;
    }
}


 public class pg01 {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d.displayDate());
        Date d1=new Date();
        System.out.println(d1.displayDate());
    }


}
