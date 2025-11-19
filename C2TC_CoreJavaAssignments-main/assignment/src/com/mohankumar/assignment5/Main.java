package com.mohankumar.assignment5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // booking CSV details
        System.out.println("Enter (Event, Customer, No. of. Seats): \t");
        String[] details = sc.nextLine().split(",");
        String stageEvent = details[0];
        String customer = details[1];
        int noOfSeats = Integer.parseInt(details[2]);

        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

        System.out.println("Enter choice (1, 2 & 3): \t");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (choice) {
        	// Cash
            case 1:
            	System.out.println("Enter cash: \t");
                double cashAmount = sc.nextDouble();
                booking.makePayment(cashAmount);
                break;
            // Wallet
            case 2:
            	System.out.println("Enter wallet: \t");
                double walletAmount = sc.nextDouble();
                sc.nextLine();
                String walletNo = sc.nextLine();
                booking.makePayment(walletAmount, walletNo);
                break;
            // Credit Card
            case 3:
            	System.out.println("Enter credit card holder name: \t");
                String holderName = sc.nextLine();
                System.out.println("Enter credit card amount: \t");
                double cardAmount = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter credit card type: \t");
                String cardType = sc.nextLine();
                System.out.println("Enter credit card CCV: \t");
                String ccv = sc.nextLine();
                booking.makePayment(holderName, cardAmount, cardType, ccv);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
