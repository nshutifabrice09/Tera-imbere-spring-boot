package com.tsl.Tera_imbere.services;

import com.tsl.Tera_imbere.model.BankResponse;
import com.tsl.Tera_imbere.dto.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService{

    @Override
    public BankResponse createAccount(UserRequest userRequest) {
        return null;
    }

    @Autowired
    EmailDetailsService emailService;

}
