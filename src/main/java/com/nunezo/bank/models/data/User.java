package com.nunezo.bank.models.data;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

//@Entity
//@Table(name = "users")
public class User {


    @Id
    @GeneratedValue
    private int id;


    private String name;


    private String lastName;


    private String email;

    public User(String name, String lastName, String email) {
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
