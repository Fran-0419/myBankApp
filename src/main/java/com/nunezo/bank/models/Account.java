package com.nunezo.bank.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Account {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(max=10)
    private int accountNum;

    private double balance;

    @OneToOne(mappedBy = "account")
    private User user;

    public Account(int accountNum) {
        this.accountNum = accountNum;
    }

    public Account() {
    }


    public int getId() {
        return id;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public double isBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance  -= amount;
    }
}
