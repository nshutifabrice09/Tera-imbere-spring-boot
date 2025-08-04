package com.tsl.Tera_imbere.controller;

import com.tsl.Tera_imbere.model.BankResponse;
import com.tsl.Tera_imbere.services.BankResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class BankResponseController {

    private final BankResponseService bankResponseService;

    @Autowired
    public BankResponseController(BankResponseService bankResponseService) {
        this.bankResponseService = bankResponseService;
    }

    @PostMapping("/bankResponseService/{accountInfoId}")
    public BankResponse saveBankResponse(@RequestBody BankResponse bankResponse, @PathVariable ("accountInfoId") Long accountInfoId){
        return bankResponseService.saveBankResponse(bankResponse, accountInfoId);
    }

    @GetMapping("/bankResponses")
    public List<BankResponse> bankResponseList(){
        return bankResponseService.getAllBankResponses();
    }

    @GetMapping("/bankResponse/{id}")
    public BankResponse getBankResponse(@PathVariable ("id") Long id){
        return bankResponseService.getBankResponse(id);
    }

    @PutMapping("/update/bankResponse/{id}")
    public BankResponse updateBankResponse(@PathVariable ("id") Long id, @RequestBody BankResponse bankResponse){
        return bankResponseService.updateBankResponse(id, bankResponse);
    }

    @DeleteMapping("/delete/bankResponse/{id}")
    public void remove(@PathVariable ("id") Long id){
        bankResponseService.removeBankResponse(id);
    }

}
