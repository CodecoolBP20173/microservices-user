package com.codecool.shitwish.user.service;

import com.codecool.shitwish.user.repository.UserModelRepository;
import com.codecool.shitwish.user.model.UserModel;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
public class UserService {

    @Autowired
    private UserModelRepository repository;

    public UserService() {
    }

    private void update(){}

    public void delete(int id){}

    public UserModel getUserById(int id){
        return repository.getOne(id);
    }

    public UserModel getByEmail(String email){
        return repository.getByEmail(email);
    }

    @Transactional
    public void addUser(UserModel user){
        //if (!repository.findAll().contains(user)){
        repository.save(user);
        //}
        //else throw new IllegalArgumentException("This user already exists");
    }
}


/* @Transactional
    public void addToCart(int userId, int productId){
        if(cartRepository.findByUserId(userId) == null){
            cartRepository.save(new Cart(userId));
        }
        Cart cart = cartRepository.findByUserId(userId);

        cart.addProduct(productId);
        cartRepository.save(cart);} */