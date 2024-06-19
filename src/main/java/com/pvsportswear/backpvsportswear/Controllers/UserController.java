package com.pvsportswear.backpvsportswear.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pvsportswear.backpvsportswear.Model.UserModel;

@RestController

public class UserController {
    
    @GetMapping("/user")
    public UserModel getUser(){
        
        return new UserModel(1, "Franze", "franzearroyo@gmail.com", "franze123");
    }
}
