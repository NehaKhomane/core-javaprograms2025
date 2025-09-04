package com.sunbeam.demo05;

import java.util.Scanner;

public class pg01 {
   public static void main(String[] args) {
       Employee e = new Employee();

       e.displayEmployee();

       Employee e1 = new Employee("Ac",23,"pune",980);
       e1.displayEmployee();
       Employee e2 = new Employee();
       e2.displayEmployee();

   }
}