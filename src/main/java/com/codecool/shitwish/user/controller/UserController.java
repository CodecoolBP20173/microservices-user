package com.codecool.shitwish.user.controller;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public JSONObject getUser(){
        JSONObject obj = new JSONObject();
        obj.put("name", "kecske");

        return obj;
    }
}
