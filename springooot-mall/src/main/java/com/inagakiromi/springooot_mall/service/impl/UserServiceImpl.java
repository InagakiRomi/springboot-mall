package com.inagakiromi.springooot_mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.inagakiromi.springooot_mall.dao.UserDao;
import com.inagakiromi.springooot_mall.dto.ProductQueryParams;
import com.inagakiromi.springooot_mall.dto.UserRegisterRequest;
import com.inagakiromi.springooot_mall.model.User;
import com.inagakiromi.springooot_mall.service.UserService;

import io.micrometer.observation.annotation.Observed;

@Component
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId){
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest){
        return userDao.createUser(userRegisterRequest);
    }
}
