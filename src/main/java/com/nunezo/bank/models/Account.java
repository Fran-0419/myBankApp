package com.nunezo.bank.models;

import com.nunezo.bank.models.data.AccountRepository;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Account {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(max=10)
    private int accountNum;

    public Account(int accountNum) {
        this.accountNum = accountNum;
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

    public void deposit(double amount){
        this.accountNum += amount;
    }

    public void withdraw(double amount){
        this.accountNum -= amount;
    }
}
