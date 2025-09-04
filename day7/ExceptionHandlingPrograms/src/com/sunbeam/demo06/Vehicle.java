package com.sunbeam.demo06;

public class Vehicle implements Cloneable{
    int Modelno;
    String vehicleno;
    exceptionprogram appearance;

    Vehicle(){
        appearance=new exceptionprogram();
    }

     public Vehicle(int modelno, String vehicleno,String colorname,double colorcode) {
        this.Modelno = modelno;
        this.vehicleno = vehicleno;
        this.appearance = new exceptionprogram(colorname,colorcode);
    }
    @Override
    public Vehicle clone() throws CloneNotSupportedException {
        return (Vehicle) super.clone();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Modelno='" + Modelno + '\'' +
                ", vehicleno='" + vehicleno + '\'' +
                ", appearance=" + appearance +
                '}';
    }
}
