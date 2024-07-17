package com.ucb.tunehubapp.sysarch.api.model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class SignUp {
    private String email;
    private String password;

    // Getters and setters
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