package com.sunbeam.demo05;

public class TimesExample {
    private  int hour;
    private  int minute;
    private  int second;

    public void sethour(int hour)  throws InvalidTimeException{
        if(hour<0 || hour>23)
            throw new InvalidTimeException();
            this.hour = hour;

    }
    public void setMinute(int minute) throws  InvalidTimeException{
        if(minute<0 || minute>59)
            throw new InvalidTimeException();
        this.minute = minute;
    }
    public  void setSecond( int second) throws InvalidTimeException{
        if (second<0 || second>59)
            throw  new InvalidTimeException();
        this.second = second;
    }

    @Override
    public String toString() {
        return "TimesExample{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
