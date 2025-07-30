package com.tsl.Tera_imbere.services;

import com.tsl.Tera_imbere.model.BankResponse;
import com.tsl.Tera_imbere.dto.UserRequest;
import com.tsl.Tera_imbere.model.User;

import java.util.List;

public interface UserService {

    List<User> userList();
    User getUserById(Long id);
    User saveUser(User user);
    User updateUser(Long id, User user);
    void removeUser (Long id);

}
