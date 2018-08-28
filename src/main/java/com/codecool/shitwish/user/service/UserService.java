package com.codecool.shitwish.user.service;

import com.codecool.shitwish.user.model.UserModel;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void add(){}

    private void update(){}

    public void delete(){}

    public UserModel getUserById(int id){
        UserModel user = new UserModel();
        return user;
    }

    public UserModel getUserByEmail(String email){
        UserModel user = new UserModel();
        return user;
    }
}
