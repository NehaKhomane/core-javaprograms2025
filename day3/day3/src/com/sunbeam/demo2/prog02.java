package com.sunbeam.demo2;

class Datedemo{
   private int year;
  private String month;
  private int day;
  private int hour;
  private int minute;
  private int second;

  public Datedemo(){//Parameterless Constructor
      this.year=2000;
      this.month="july";
      this.day=23;
      this.hour=3;
      this.minute=30;
      this.second=6;
      System.out.println("This is parameterless constructor");

  }
  void DisplayDate(){
      System.out.println("Date this here :" +this.year+
              "/" +this.month+"/" +this.day+"/"+this.hour+"/"+this.minute+"/"+this.second);

  }

}

public class prog02 {
    public static void main(String[] args) {
        Datedemo datedemo=new Datedemo();
        datedemo.DisplayDate();
        Datedemo datedemo1=new Datedemo();
        datedemo1.DisplayDate();

    }

}
