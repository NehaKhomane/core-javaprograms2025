package com.sunbeam.collectiondemo01;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Laptop{
    int id;
    String name;
    double price;

    Laptop(){

    }
    Laptop(int id){
        this.id = id;
    }

    Laptop(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" + "id=" + id + ", name=" + name + ", price=" + price + '}';

    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Laptop laptop))
            return false;
        Laptop l = (Laptop) o;
        return id == laptop.id ;
    }


}

public class programs01 {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<Laptop>();
        laptops.add(new Laptop(1, "Laptop 1", 100.00));
        laptops.add(new Laptop(2, "Laptop 2", 200.00));
        laptops.add(new Laptop(3, "Laptop 3", 300.00));
        laptops.add(new Laptop(4, "Laptop 4", 400.00));

        for (Laptop l : laptops) {
            System.out.println(l);
            System.out.println(laptops.get(2));
            Laptop l2 = new Laptop(3);
            System.out.println(laptops.indexOf(l2));
            laptops.remove(4);
            System.out.println(laptops.remove(2));
            System.out.println(laptops.size());

        }

    }
}
