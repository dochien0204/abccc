package com.example.product.services.impl;

import com.example.product.domain.dto.UserDTO;
import com.example.product.domain.entity.User;
import com.example.product.repositories.UserRepository;
import com.example.product.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public void createNewUser(UserDTO userDTO) {

    }


}
