package com.codecool.shitwish.user.controller;

import com.codecool.shitwish.user.model.Test;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public JSONObject getUser(){
        JSONObject obj = new JSONObject();
        obj.put("name", "kecske");

        return obj;
    }

    @GetMapping("/adduser")
    public void addUser(JSONObject user){
        //TODO
    }

    @GetMapping("/update/<usrID>")
    public void updateUser(JSONObject user, int usrID){
        //TODO
    }

    @GetMapping("/delete/<usrID>")
    public void deleteUser(int usrID){
        //TODO
    }

    @PostMapping("/test")
    public String test(@RequestBody Test test){
        return test.getName();
    }

}
