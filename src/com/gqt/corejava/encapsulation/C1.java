package com.gqt.corejava.encapsulation;
class BankAccount {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public double getBalance() { return balance; }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) {
        if(amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance!");
    }
}

public class C1 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setAccountNumber("BA1001");
        ba.deposit(2000);
        ba.withdraw(500);

        System.out.println("Account: " + ba.getAccountNumber() + " Balance=" + ba.getBalance());
    }
}
