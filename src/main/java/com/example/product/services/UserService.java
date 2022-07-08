package com.example.product.services;

import com.example.product.domain.dto.UserDTO;
import com.example.product.domain.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    void createNewUser(UserDTO userDTO);
}
