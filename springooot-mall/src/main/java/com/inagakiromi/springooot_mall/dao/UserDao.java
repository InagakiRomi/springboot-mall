package com.inagakiromi.springooot_mall.dao;

import com.inagakiromi.springooot_mall.dto.UserRegisterRequest;
import com.inagakiromi.springooot_mall.model.User;

public interface UserDao {
    User getUserById(Integer userId);
    
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
