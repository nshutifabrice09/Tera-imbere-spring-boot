package com.tsl.Tera_imbere.services;

import com.tsl.Tera_imbere.dto.EmailDetails;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImplementation implements EmailService{
    public EmailServiceImplementation(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

//        try{
//            SimpleMailMessage mailMessage = new SimpleMailMessage();
//            mailMessage.setFrom(senderEmail);
//            mailMessage.setTo(emailDetails.getRecipient());
//            mailMessage.setTo(emailDetails.getMessageBody());
//            mailMessage.setTo(emailDetails.getSubject());
//            mailMessage.setTo(emailDetails.getAttachment());
//
//            javaMailSender.send(mailMessage);
//            System.out.println("Email sent successfully.");
//
//        }catch (MailException mailException){
//            throw new RuntimeException(mailException);
//        }
//    }

    private final JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String senderEmail;


    @Override
    public void sendEmailAlert(EmailDetails emailDetails) {

    }
}
