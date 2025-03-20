package com.tsl.Tera_imbere.services;

import com.tsl.Tera_imbere.dto.BankResponse;
import com.tsl.Tera_imbere.dto.EmailDetails;
import com.tsl.Tera_imbere.dto.UserRequest;
import com.tsl.Tera_imbere.model.User;
import com.tsl.Tera_imbere.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService{

    @Override
    public BankResponse createAccount(UserRequest userRequest) {
        return null;
    }

    @Autowired
    EmailService emailService;

}
