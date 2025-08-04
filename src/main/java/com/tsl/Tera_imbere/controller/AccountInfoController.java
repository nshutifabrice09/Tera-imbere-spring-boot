package com.tsl.Tera_imbere.controller;

import com.tsl.Tera_imbere.model.AccountInfo;
import com.tsl.Tera_imbere.services.AccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class AccountInfoController {

    private final AccountInfoService accountInfoService;

    @Autowired
    public AccountInfoController(AccountInfoService accountInfoService){
        this.accountInfoService = accountInfoService;
    }

    @PostMapping("/accountInfo")
    public AccountInfo saveAccountInfo(@RequestBody AccountInfo accountInfo){
        return accountInfoService.saveAccountInfo(accountInfo);
    }

    @GetMapping("/accountInfos")
    public List<AccountInfo> accountInfoList(){
        return accountInfoService.getAllAccountInfos();
    }

    @GetMapping("/accountInfo/{id}")
    public AccountInfo getAccountInfo(@PathVariable ("id") Long id){
        return accountInfoService.getAccountInfoById(id);
    }

    @PutMapping("/update/accountInfo/{id}")
    public AccountInfo updateAccountInfo(@PathVariable ("id") Long id, @RequestBody AccountInfo accountInfo){
        return accountInfoService.updateAccountInfo(id, accountInfo);
    }

    @DeleteMapping("/delete/accountInfo/{id}")
    public void remove(@PathVariable ("id") Long id){
        accountInfoService.removeAccountInfo(id);
    }
}
