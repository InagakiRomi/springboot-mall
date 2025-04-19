package com.inagakiromi.springooot_mall.service;

import com.inagakiromi.springooot_mall.dto.UserLoginRequest;
import com.inagakiromi.springooot_mall.dto.UserRegisterRequest;
import com.inagakiromi.springooot_mall.model.User;

public interface UserService {
    
    User getUserById(Integer userId);
    
    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
