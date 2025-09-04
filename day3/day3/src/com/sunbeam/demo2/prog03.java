package com.sunbeam.demo2;

class DatessDemos
{
    int year;
    int month;
    int day;
    int hour;
    int minute;
    int second;
   public DatessDemos()
    {
        System.out.println("Paramerless constructor");

    }
    public DatessDemos(int year,int month,int day,int hour,int minute,int second)
    {
          System.out.println("Parameterized constructor");
    }
    void displayDatessDemos(){
       System.out.println("year="+this.year);
        System.out.println("month="+this.month);
        System.out.println("day="+this.day);
        System.out.println("hour="+this.hour);

        System.out.println("minute="+this.minute);
        System.out.println("second="+this.second);
    }

}
public class prog03 {
    public static void main(String[] args) {
        DatessDemos demos=new DatessDemos();
        DatessDemos demos1=new DatessDemos(2002,02,12,4,13,43);
    }

}
