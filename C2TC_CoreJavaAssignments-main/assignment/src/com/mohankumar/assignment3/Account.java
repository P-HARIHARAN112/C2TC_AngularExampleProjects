package com.mohankumar.assignment3;

abstract class Account {
    protected String accountHolder;
    protected double balance;

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        Bank.incrementAccounts();
    }

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    // concrete method
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate = 0.04; // 4% interest rate

    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    public void deposit(double amount) {
        balance += amount + (amount * interestRate);
        System.out.println("Deposited " + amount + " with interest. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class CheckingAccount extends Account {
    private double overdraftLimit = 1000;

    public CheckingAccount(String name, double balance) {
        super(name, balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }

    public double getBalance() {
        return balance;
    }
}
