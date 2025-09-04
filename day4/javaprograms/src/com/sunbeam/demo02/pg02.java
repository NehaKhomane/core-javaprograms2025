package com.sunbeam.demo02;

class Time{
    private int hour;
    private int minute;
    private int second;
     //Instance /Object Initializer
    {
        System.out.println("Inside the Object Initializer");
        this.minute=60;
        this.second=60;
        this.hour=60;
    }
    public String displayTime(){
        return hour+":"+minute+":"+second;
    }
}
public class pg02 {
    public static void main(String[] args) {
       Time t=new Time();
       System.out.println(t.displayTime());
       Time t1=new Time();
       System.out.println(t1.displayTime());

    }

}
