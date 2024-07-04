package com.pvsportswear.backpvsportswear.DTO;

public class LoginRequest {
    private String usernameOrEmail;
    private String password;

    LoginRequest(){}

    public LoginRequest(String password, String usernameOrEmail) {
        this.password = password;
        this.usernameOrEmail = usernameOrEmail;
    }

    //getters
    public String getUsernameOrEmail() {
        return usernameOrEmail;
    }

    public String getPassword() {
        return password;
    }
    
    //setters
    public void setUsernameOrEmail(String usernameOrEmail) {
        this.usernameOrEmail = usernameOrEmail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   

    
}
