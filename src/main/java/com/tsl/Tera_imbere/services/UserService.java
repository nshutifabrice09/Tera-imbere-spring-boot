package com.tsl.Tera_imbere.services;

import com.tsl.Tera_imbere.dto.BankResponse;
import com.tsl.Tera_imbere.dto.UserRequest;

public interface UserService {

    BankResponse createAccount(UserRequest userRequest);
}
