package com.pvsportswear.backpvsportswear.DTO;

public class RegistrationRequest {
    private String username;
    private String email;
    private String password;

    RegistrationRequest(){}

    public RegistrationRequest(String email, String password, String username) {
        this.email = email;
        this.password = password;
        this.username = username;
    }

    //getters
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    //setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
