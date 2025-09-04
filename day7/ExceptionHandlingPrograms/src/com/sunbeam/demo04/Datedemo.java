package com.sunbeam.demo04;

public class Datedemo {
    private int year;
    private int month;
    private int day;

    public void setYear(int year)
    {
        if (year < 0 || year > 12)
            throw  new InvalidDateException();//cunstom unchecked Exception
        this.year = year;

    }
    public void setMonth(int month){
        if (month < 0 || month > 12)
        throw new InvalidDateException();
        this.month = month;
    }
    public void setDay(int day) {
        if(day < 0 || day > 30)
            throw  new InvalidDateException();
        this.day = day;
    }

    @Override
    public String toString() {
        return "Datedemo{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
