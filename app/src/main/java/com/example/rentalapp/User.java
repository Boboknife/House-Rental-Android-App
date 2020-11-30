package com.example.rentalapp;

public class User {
    private String username;
    private String password;
    private String email;

    public User(){
        username = "";
        password = "";
        email = "";
    }

    // not sure if this is allowed
    public User(String u, String p , String e) {
        username = u;
        password = p;
        email = e;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
