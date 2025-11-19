package com.mohankumar.assignment2;
import java.util.Scanner;

class Commission {
    String name, address, phone;
    double sales_amount;

    // Method to accept details
    void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Phone: ");
        phone = sc.nextLine();

        System.out.print("Enter Sales Amount: ");
        sales_amount = sc.nextDouble();
    }

    // Method to calculate commission
    void calculateCommission() {
        double commission;
        if (sales_amount >= 100000) {
            commission = sales_amount * 0.10;
        } else if (sales_amount >= 50000) {
            commission = sales_amount * 0.05;
        } else if (sales_amount >= 30000) {
            commission = sales_amount * 0.03;
        } else {
            commission = 0;
        }

        System.out.println("\n--- Employee Commission Details ---");
        System.out.println("Employee Name: " + name);
        System.out.println("Sales Amount: " + sales_amount);
        System.out.println("Commission Earned: " + commission);
    }
}
