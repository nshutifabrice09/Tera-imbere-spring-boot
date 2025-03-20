package com.tsl.Tera_imbere.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    private String firstName;
    private String lastName;
    private String otherName;
    private String gender;
    private String city;
    private String address;
    private String email;
    private String phoneNumber;
    private String password;

}
