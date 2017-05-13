package com.libapp.entity.request;

/**
 * Created by akshayshivanne on 4/23/2017.
 */
public class AddUserRequest {

    private String userName;

    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
