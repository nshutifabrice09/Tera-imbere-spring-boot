package com.tsl.Tera_imbere.services;

import com.tsl.Tera_imbere.model.EmailDetails;

import java.util.List;

public interface EmailDetailsService {

    List<EmailDetails> getAllEmailDetails();
    EmailDetails getEmailDetailsById(Long id);
    EmailDetails saveEmailDetails(EmailDetails emailDetails);
    EmailDetails updateEmailDetails(Long id, EmailDetails emailDetails);
    void removeEmailDetails(Long id);

}
