package com.sunbeam.demo05;

public class program2 {
    public static void main(String[] args) {
        TimesExample timesExample = new TimesExample();
        try {
            timesExample.sethour(10);
            timesExample.setMinute(22);
            timesExample.setSecond(11);
            System.out.println(timesExample.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        System.exit(0);
    }
}
