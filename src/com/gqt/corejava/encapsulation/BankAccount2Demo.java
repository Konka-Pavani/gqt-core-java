package com.gqt.corejava.encapsulation;
class BankAccount2 {
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

public class BankAccount2Demo {
    public static void main(String[] args) {
        BankAccount2 ba = new BankAccount2();
        ba.setAccountNumber("ACC456");
        ba.deposit(10000);
        ba.withdraw(3000);

        System.out.println("BankAccount2: " + ba.getAccountNumber() + " Balance=" + ba.getBalance());
    }
}
