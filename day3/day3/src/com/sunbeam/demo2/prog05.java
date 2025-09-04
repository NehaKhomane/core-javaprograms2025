package com.sunbeam.demo2;
class DatessDemos01{
    private int year;
    private int month;
    private int day;

    public DatessDemos01(){
        this.year=2000;
        this.month=1;
        this.day=23;
        //constructor chaining
    }
    public DatessDemos01(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;

    }
    public DatessDemos01(int year,int month){
        this(2000,month,20);
    }
    void displayDates(){
        System.out.println(year+"-"+month+"-"+day);
    }
}
public class prog05 {
    public static void main(String[] args) {
        DatessDemos01 demos01=new DatessDemos01();
        DatessDemos01 demos02=new DatessDemos01(2000,7,9);
        DatessDemos01 demos03=new DatessDemos01();
        DatessDemos01 demos04=new DatessDemos01(2000,6,9);
        demos01.displayDates();

        demos02.displayDates();
        demos03.displayDates();
        demos04.displayDates();
    }

}
