package com.codecool.shitwish.user.controller;

import com.codecool.shitwish.user.model.Test;
import com.codecool.shitwish.user.model.UserModel;
import com.codecool.shitwish.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService service;

//    @GetMapping("/sampleuser")
//    public JSONObject sampleUser(){
//        JSONObject obj = new JSONObject();
//        obj.put("usrID", 2);
//        obj.put("firstName", "Béláim");
//        obj.put("lastName", "kecske");
//        obj.put("email", "valami@akarmi.com");
//        obj.put("phoneNumber", "12345678");
//        obj.put("country", "france");
//        obj.put("city", "paris");
//        obj.put("zipCode", "2084");
//        obj.put("street", "kossuth lajos utca");
//        obj.put("profilePicture", "https://robohash.org/valami@akarmi.com.png");
//
//        return obj;
//    }

    @GetMapping("/user/{usrID}")
    public UserModel getUser(@PathVariable("usrID") int usrID){
        return service.getUserById(usrID);
    }

//    @GetMapping("/user")
//    public JSONObject getUser(String email){
//        JSONObject object = new JSONObject();
//        return object;
//    }
//
    @GetMapping("/adduser")
    public void addUser(JSONObject user){
        //TODO
    }
//
//    @GetMapping("/update/<usrID>")
//    public void updateUser(JSONObject user, int usrID){
//        //TODO
//    }

    @GetMapping("/delete/<usrID>")
    public void deleteUser(int usrID){
        //TODO
    }

    /*@PostMapping("/test")
    public String test(@RequestBody Test test){
        return test.getName();
    }*/

}
