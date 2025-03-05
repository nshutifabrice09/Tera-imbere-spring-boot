package com.tsl.Tera_imbere.services;

import com.tsl.Tera_imbere.dto.BankResponse;
import com.tsl.Tera_imbere.dto.UserRequest;
import com.tsl.Tera_imbere.model.User;
import com.tsl.Tera_imbere.utilities.AccountUtilities;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserServiceImplementation implements UserService{
    @Override
    public BankResponse createAccount(UserRequest userRequest) {
        return null;
    }
}
