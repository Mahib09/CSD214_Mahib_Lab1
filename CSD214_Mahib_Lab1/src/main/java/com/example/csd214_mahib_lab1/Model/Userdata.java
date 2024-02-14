package com.example.csd214_mahib_lab1.Model;

public class Userdata {
    private  int userid;
    private String username;
    private String email;
    private String password;
    public Userdata(int userid, String username, String email, String password) {
        this.userid = userid;
        this.username = username;
        this.email = email;
        this.password = password;
    }
    public int getUserId() {
        return userid;
    }
    public String getUserName() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    } }

