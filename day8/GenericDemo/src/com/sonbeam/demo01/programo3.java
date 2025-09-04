package com.sonbeam.demo01;

class Vehicl <T>{
    private T t;

    public void setT(T t) {
        this.t = t;

    }
    public T getT() {
        return t;
    }

}

public class programo3 {
    public static void display(Vehicl<?> v){
        System.out.println(v.getT());
    }
    public static void main(String[] args) {
        Vehicl<Integer> v1 = new Vehicl<Integer>();
        v1.setT(10);
        display(v1);

        Vehicl<Double> v2 = new Vehicl<Double>();
        v2.setT(10.99);
        display(v2);
        Vehicl<Float> v3 = new Vehicl<Float>();
        v3.setT(10.99f);
        display(v3);





    }
}
