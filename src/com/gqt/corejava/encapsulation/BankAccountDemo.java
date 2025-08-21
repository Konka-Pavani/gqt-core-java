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

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setAccountNumber("ACC123");
        ba.deposit(5000);
        ba.withdraw(2000);

        System.out.println("BankAccount: " + ba.getAccountNumber() + " Balance=" + ba.getBalance());
    }
}
