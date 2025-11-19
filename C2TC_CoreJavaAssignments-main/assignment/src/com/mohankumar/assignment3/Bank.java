package com.mohankumar.assignment3;

class Bank {
    private static int totalAccounts = 0; // shared among all bank objects

    public static void incrementAccounts() {
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}
