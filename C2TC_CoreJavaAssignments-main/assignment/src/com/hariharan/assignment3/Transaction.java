package com.mohankumar.assignment3;

final class Transaction {
    private final double transactionFee = 10.0; // fixed transaction fee

    public final void performTransaction(Account account, String type, double amount) {
        System.out.println("\nProcessing Transaction...");
        if (type.equalsIgnoreCase("deposit")) {
            account.deposit(amount);
        } else if (type.equalsIgnoreCase("withdraw")) {
            account.withdraw(amount);
        } else {
            System.out.println("Invalid transaction type.");
        }
        System.out.println("Transaction fee of " + transactionFee + " applied.");
    }
}
