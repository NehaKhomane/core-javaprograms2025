package com.sunbeam.demo2;
class Datesdemo02{
    private  int hour;
    private int minute;
    private int second;

    public Datesdemo02(){
        this(1,1,2001);//this statement
        System.out.println(" Paremeterless Constructor");
    }
    public Datesdemo02(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;

    }
    public Datesdemo02(int hour,int minute){
        this(hour,minute,1);
    }
    void displayDates02(){
        System.out.println("Hour:"+hour);
        System.out.println("Minute:"+minute);
        System.out.println("Second:"+second);
    }
}
public class prog06 {
    public static void main(String[] args) {
        Datesdemo02 demo02 = new Datesdemo02();
        Datesdemo02 demo021 = new Datesdemo02(2,25,44);
        Datesdemo02 demo022 = new Datesdemo02();
        Datesdemo02 demo023 = new Datesdemo02(3,3,8);
        demo02.displayDates02();
        demo021.displayDates02();
        demo022.displayDates02();

        demo023.displayDates02();
    }

}
