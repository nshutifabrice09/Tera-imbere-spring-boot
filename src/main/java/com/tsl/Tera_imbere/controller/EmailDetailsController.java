package com.tsl.Tera_imbere.controller;

import com.tsl.Tera_imbere.model.EmailDetails;
import com.tsl.Tera_imbere.services.EmailDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class EmailDetailsController {

    private final EmailDetailsService emailDetailsService;

    @Autowired
    public EmailDetailsController(EmailDetailsService emailDetailsService) {
        this.emailDetailsService = emailDetailsService;
    }

    @PostMapping("/'emailDetail")
    public EmailDetails saveEmailDetails(@RequestBody EmailDetails emailDetails){
        return emailDetailsService.saveEmailDetails(emailDetails);
    }
    @GetMapping("/emailDetails")
    public List<EmailDetails> emailDetailsList(){
        return emailDetailsService.getAllEmailDetails();
    }

    @GetMapping("/emailDetail/{id}")
    public EmailDetails getEmailDetails(@PathVariable ("id") Long id){
        return emailDetailsService.getEmailDetailsById(id);
    }

    @PutMapping("/update/emailDetail/{id}")
    public EmailDetails updateEmailDetail(@PathVariable ("id") Long id, @RequestBody EmailDetails emailDetails){
        return emailDetailsService.updateEmailDetails(id, emailDetails);
    }

    @DeleteMapping("/delete/emailDetail/{id}")
    public void removeEmailDetail(@PathVariable ("id") Long id){
        emailDetailsService.removeEmailDetails(id);
    }
}
