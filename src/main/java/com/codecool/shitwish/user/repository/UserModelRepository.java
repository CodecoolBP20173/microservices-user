package com.codecool.shitwish.user.repository;

import com.codecool.shitwish.user.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserModelRepository extends JpaRepository<UserModel, Integer> {
}
