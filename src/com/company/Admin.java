package com.company;


//Abstraction
abstract class Admin  {

    private String username;
    private String password;

    public void setUsername(String newUsername) {
        username = newUsername;
    }

    public void setPassword(String newPassword)  {
        password = newPassword;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class AdminLogin extends Admin{

}
