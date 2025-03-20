package com.tsl.Tera_imbere.services;

import com.tsl.Tera_imbere.dto.EmailDetails;

public interface EmailService {

    void sendEmailAlert(EmailDetails emailDetails);
}
