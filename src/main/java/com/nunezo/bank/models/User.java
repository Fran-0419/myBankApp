package com.nunezo.bank.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class User {


    @Id
    @GeneratedValue
    private int id;


    @NotNull(message = "Name is required")
    private String name;


    @NotNull(message = "Last name is required")
    private String lastName;


    @NotNull(message = "Email is required")
    private String email;


    @NotNull
    @Size(min = 10, max =40)
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;


//    public User(String name, String lastName, String email ,Account account) {
//        this.name = name;
//        this.lastName = lastName;
//        this.email = email;
//    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
