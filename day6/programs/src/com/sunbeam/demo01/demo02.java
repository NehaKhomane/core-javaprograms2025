package com.sunbeam.demo01;

class Date{
    int day;
    int month;
    int year;

    Date(){

    }
    Date(int d,int m,int y){
        day=d;
        month=m;
        year=y;
    }

    @Override
    public String toString() {
        return "Date{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
    }
}

public class demo02 {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d.month);

    }
}
