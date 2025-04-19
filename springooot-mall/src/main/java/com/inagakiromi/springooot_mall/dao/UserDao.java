package com.inagakiromi.springooot_mall.dao;

import com.inagakiromi.springooot_mall.dto.UserRegisterRequest;
import com.inagakiromi.springooot_mall.model.User;

public interface UserDao {
    User getUserById(Integer userId);

    User getUserByEmail(String email);
    
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
