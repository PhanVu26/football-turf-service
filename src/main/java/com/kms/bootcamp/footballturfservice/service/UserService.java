package com.kms.bootcamp.footballturfservice.service;

import com.kms.bootcamp.footballturfservice.entity.UserEntity;
import com.kms.bootcamp.footballturfservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserEntity findByUsername(String username) {
        UserEntity user = userRepository.findByUsername(username);
        if (user != null) return user;
        return new UserEntity();
    }

    public List<UserEntity> findAll() {
        List<UserEntity> users = userRepository.findAll();
        if (!CollectionUtils.isEmpty(users)) return users;
        return new ArrayList<>();
    }
}
