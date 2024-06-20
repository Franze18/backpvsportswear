package com.pvsportswear.backpvsportswear.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pvsportswear.backpvsportswear.Model.UserModel;

@RestController

public class UserController {
    
    @GetMapping("/user")
    public UserModel getUser(){       
        return new UserModel(1, "Franze", "franzearroyo@gmail.com", "franze123");
    }

    @GetMapping("/users")
    public List<UserModel>getUsers(){
        List<UserModel>users = new ArrayList<>();
        users.add(new UserModel(1,"Steve","steve@gmail.com","test123"));
        users.add(new UserModel(2,"Dogie","dogie@gmail.com","test1234"));
        users.add(new UserModel(3,"Alas","alas@gmail.com","test12345"));
        return users;
    }

    @GetMapping("/user/{name}")
    public UserModel getUserFromNAME(@PathVariable("name")String name){
        return new UserModel(1, "Francia", "franciaarroyo@gmail.com", "francia123");
    }
}
