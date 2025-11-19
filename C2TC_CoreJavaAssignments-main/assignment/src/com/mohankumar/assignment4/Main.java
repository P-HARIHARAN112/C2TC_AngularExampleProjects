package com.mohankumar.assignment4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice (1, 2 & 3): \t");
        int choice = sc.nextInt();
        System.out.println("Enter hours: \t");
        int hours = sc.nextInt();
        System.out.println("Enter cost: \t");
     
        double costPerHour = sc.nextDouble();

        Airfare flight;

        switch (choice) {
            case 1:
                flight = new AirIndia(hours, costPerHour);
                System.out.printf("Total: %.2f", flight.calculateAmount());
                break;

            case 2:
                flight = new KingFisher(hours, costPerHour);
                System.out.printf("Total: %.2f", flight.calculateAmount());
                break;

            case 3:
                flight = new Indigo(hours, costPerHour);
                System.out.printf("Total: %.2f", flight.calculateAmount());
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }

        sc.close();
    }
}
