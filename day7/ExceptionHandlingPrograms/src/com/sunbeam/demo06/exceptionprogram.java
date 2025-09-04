package com.sunbeam.demo06;

public class exceptionprogram {
    String colorname;
    double colorcode;

    exceptionprogram(){

    }

  public exceptionprogram(String colorname, double colorcode) {
        this.colorname = colorname;
        this.colorcode = colorcode;
    }

    @Override
    public String toString() {
        return "exceptionprogram{" +
                "colorname='" + colorname + '\'' +
                ", colorcode=" + colorcode +
                '}';
    }
}
