package com.codecool.shitwish.user;

import com.codecool.shitwish.user.model.UserModel;
import com.codecool.shitwish.user.repository.UserModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserApplication {

    @Autowired
    private UserModelRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

    @Bean
    public CommandLineRunner init() {
        return (String... args) -> {
            repository.save(new UserModel("firstName", "lastName", "hashedPassword", "email",
                    "phoneNumber", "country", "city", "zipCode", "street",
                    "profilePicture"));

        };
    }
}
