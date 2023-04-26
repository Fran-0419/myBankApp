package com.nunezo.bank.models;

import com.nunezo.bank.models.data.AccountRepository;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;

//@Entity
//@Table(name = "users")
public class User {


    @Id
    @GeneratedValue
    private int id;


    private String name;


    private String lastName;


    private String email;

    private Account account;


    public User(String name, String lastName, String email ,Account account) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
