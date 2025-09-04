package com.sunbeam.demo01;

public class program04 {
    public static void main(String[] args) {
        Employee [] arr=new Employee[5];

        arr[0]=new Employee(1,"Neha",10000);
        arr[1]=new Employee(2,"gaurav",2000);
        arr[2]=new Employee(3,"kumar",3000);
        arr[3]=new Employee(4,"kumari",4000);
        arr[4]=new Employee(5,"mari",5000);

        System.out.println("using for loop");
        for(int i=0;i<arr.length;i++)
        {
            Employee e=arr[i];
            e.displayEmployee();
        }
        System.out.println("using Each loop");
        for(Employee e:arr)
            e.displayEmployee();
    }
}
