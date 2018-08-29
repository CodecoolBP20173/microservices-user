package com.codecool.shitwish.user.service;

import com.codecool.shitwish.user.repository.UserModelRepository;
import com.codecool.shitwish.user.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class UserService {

    @Autowired
    private UserModelRepository repository;

    EntityManager em;

    public UserService(EntityManager em) {
        this.em = em;
    }

//    public void add(JSONObject user){}

    private void update(){}

    public void delete(int id){}

    public UserModel getUserById(int id){
        return repository.getOne(id);
    }

    public UserModel getUserByEmail(String email){
        UserModel user = new UserModel();
        return user;
    }
}
