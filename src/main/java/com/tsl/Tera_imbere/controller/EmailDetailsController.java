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
    
}
