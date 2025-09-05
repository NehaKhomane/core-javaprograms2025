package com.Neha.FoodMenu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*************************************
 * Author :: Neha Khomane(W3)
 * Question :: Display food menu to user. User will select items from menu along
 * with the quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill )
 * Assign fixed prices to food items(hard code the prices) When user enters
 * 'Generate Bill'option , display total bill & exit.
 *************************************/

public class program02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        map.put("Dosa",40);
        map.put("Samosa ",30);
        map.put("Idli",20);
        System.out.print("Welcome to anna's Dosa: ");
        System.out.println("Printing the menu:");
        System.out.println("--------------------");
        int index=1;
        for(String key:map.keySet()){
            System.out.print(key+": ");
            System.out.println(map.get(key));
            index++;
        }
        System.out.println(index+ "Generate Bill");

        double totalBill = 0;
        boolean generateBill = false;
        while(!generateBill){
            System.out.print("Enter you choice (or press 4 submit Order and Generate Bill) :: ");
            int choice = sc.nextInt();
            if(choice==index){
                generateBill = true;
                System.out.println("=========Generating Bill==========");
                System.out.println("Total Bill ::" + totalBill);
            }
            else if (choice > 0 && choice < index){
                String selectedItem=(String) map.keySet().toArray()[choice-1];
                int price = map.get(selectedItem);
                System.out.println("Enter quality for: " +selectedItem+":");
                int quality = sc.nextInt();
                totalBill += price*quality;
                System.out.println(selectedItem+" "+price+" "+quality);
            }
        }
        System.out.println("Total bill is: "+totalBill);
        System.out.println("Thank you for your purches");
        sc.close();
    }
}
