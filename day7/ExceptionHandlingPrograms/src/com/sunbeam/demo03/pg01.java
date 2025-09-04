package com.sunbeam.demo03;

public class pg01 {
    public static void main(String[] args) {
        Timedemo timedemo = new Timedemo();
        try{
            timedemo.setHour(2);//unchecked
            timedemo.setMinute(3);//checked
            timedemo.setSecond(33);
            System.out.println(timedemo);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("exit");
    }
}
