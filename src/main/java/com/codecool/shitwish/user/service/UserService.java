package com.codecool.shitwish.user.service;

import com.codecool.shitwish.user.repository.UserModelRepository;
import com.codecool.shitwish.user.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class UserService {

    @Autowired
    private static UserModelRepository repository;

    EntityManager em;

    public UserService(EntityManager em) {
        this.em = em;
    }

//    public void add(JSONObject user){}

    private void update(){}

    public void delete(int id){}

    public static UserModel getUserById(int id){
        return repository.getOne(id);
    }

    public UserModel getByEmail(String email){
        return repository.getByEmail(email);
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