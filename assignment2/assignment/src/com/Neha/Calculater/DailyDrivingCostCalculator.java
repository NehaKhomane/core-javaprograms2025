package com.Neha.Calculater;
/*******************
 * (Neha Khomane----W3)----------------------------------------------------------------------------
 * Q3. Create an application that calculates your daily driving cost, so that you can estimate how much
 * money could be saved by car pooling, which also has other advantages such as reducing carbon
 * emissions and reducing traffic congestion. The application should input the following information
 * and display the user’s cost per day of driving to work:
 * a) Total miles driven per day.
 * b) Cost per gallon of gasoline.
 * c) Average miles per gallon.
 * d) Parking fees per day.
 * e) Tolls per day.--------------------------------------******************************************/

import java.util.Scanner;

public class DailyDrivingCostCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter total miles driven per day: ");
        double milesPerDay = input.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = input.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        System.out.print("Enter parking fees per day: ");
        double parkingFees = input.nextDouble();

        System.out.print("Enter tolls per day: $");
        double tolls = input.nextDouble();


        double gallonsUsed = milesPerDay / milesPerGallon;
        double fuelCost = gallonsUsed * costPerGallon;
        double totalDailyCost = fuelCost + parkingFees + tolls;

        System.out.printf("\nEstimated Daily Driving Cost:", totalDailyCost);

        input.close();
    }
}

