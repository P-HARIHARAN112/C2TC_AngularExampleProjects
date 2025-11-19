package com.mohankumar.assignment3;

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("Rajasekar", 5000);
        CheckingAccount ca = new CheckingAccount("Priyaddharshan", 3000);

        Transaction t = new Transaction();

        t.performTransaction(sa, "deposit", 2000);
        t.performTransaction(sa, "withdraw", 1500);

        t.performTransaction(ca, "deposit", 1000);
        t.performTransaction(ca, "withdraw", 3500);

        System.out.println("\nTotal accounts created: " + Bank.getTotalAccounts());
    }
}
