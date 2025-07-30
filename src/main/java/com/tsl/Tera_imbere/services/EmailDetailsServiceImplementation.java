package com.tsl.Tera_imbere.services;
import com.tsl.Tera_imbere.model.EmailDetails;
import com.tsl.Tera_imbere.repository.EmailDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmailDetailsServiceImplementation implements EmailDetailsService{

    private final EmailDetailsRepository emailDetailsRepository;

    @Autowired
    public EmailDetailsServiceImplementation(EmailDetailsRepository emailDetailsRepository) {
        this.emailDetailsRepository = emailDetailsRepository;
    }
    

    @Override
    public List<EmailDetails> getAllEmailDetails() {
        return null;
    }

    @Override
    public EmailDetails getEmailDetailsById(Long id) {
        return emailDetailsRepository.findEmailDetailsById(id);
    }

    @Override
    public EmailDetails saveEmailDetails(EmailDetails emailDetails) {
        return emailDetailsRepository.save(emailDetails);
    }

    @Override
    public EmailDetails updateEmailDetails(Long id, EmailDetails emailDetails) {
        EmailDetails existEmailDetails = emailDetailsRepository.findEmailDetailsById(id);
        if(existEmailDetails != null){
            existEmailDetails.setRecipient(emailDetails.getRecipient());
            existEmailDetails.setMessageBody(existEmailDetails.getMessageBody());
            existEmailDetails.setSubject(emailDetails.getSubject());
            existEmailDetails.setAttachment(emailDetails.getAttachment());
            return emailDetailsRepository.save(emailDetails);
        }
        return null;
    }

    @Override
    public void removeEmailDetails(Long id) {
        emailDetailsRepository.deleteById(id);
    }
}
