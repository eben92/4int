package com.company;

public class Customer  {
    private String username;
    private String password;


    public void setUsername(String newUsername) {
        username = newUsername;
    }

    public void setPassword(String newPassword) {
        password = newPassword;
    }

//    get credentials
    public String getUsername(){
        return username;
    }

    public String getPassword() {
        return password;
    }

}
