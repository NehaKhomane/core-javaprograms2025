package com.sunbeam.demo2;
class TimeDemo{
    private int hour;
    private int minute;
    private int second;

    public void intiallizeTime(){
        System.out.println("intiallizeDate");
        this.hour=1;
        this.minute=1;
        this.second=200;
    }
    void displayTime(){
        System.out.println("displayDate is-" +this.hour+":"+this.minute+":"+this.second);


    }

}

public class prog01 {
    public static void main(String[] args) {
        TimeDemo time = new TimeDemo();
        time.intiallizeTime();
        TimeDemo time1 = new TimeDemo();
        time1.intiallizeTime();
        TimeDemo time2 = new TimeDemo();
        time2.intiallizeTime();

        time.displayTime();
        time1.displayTime();
        time2.displayTime();


    }

}
