package com.sunbeam.demo03;

public class Timedemo {

    private int hour;
    private int minute;
    private int second;

    public void setHour(int hour) {
        if (hour < 0 || hour > 23)
            throw new RuntimeException();//un-Checked Exception
        this.hour = hour;
    }
    public void setMinute(int minute) throws Exception {
        if (minute < 0 || minute > 59)
            throw new Exception();
        this.minute = minute; //checked exception
    }
    public void setSecond(int second) throws Exception {
        if (second < 0 || second > 59)
            throw new Exception();
        this.second = second;
    }

    @Override
    public String toString() {
        return "Date{" + "hour=" + hour + ", minute=" + minute + ", second=" + second + '}';
    }
}
