package com.ucb.tunehubapp.sysarch.dto;



public class LoginDTO {



    private String name;

    private String email;

    private String password;

    public LoginDTO(String name, String email, String password) {

        this.name = name;
        this.email = email;
        this.password = password;
    }

    public LoginDTO() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "PersonDTO{" +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}