package com.example.interfaceprograms;

public class BankAccount {
    private double balance;
    private int accountnumber;
    private short int LastAssignedNumber=1000;

    public BankAccount(double balance) {
        this.balance = balance;
        LastAssignedNumber++;
        accountnumber=LastAssignedNumber;
    }
}
