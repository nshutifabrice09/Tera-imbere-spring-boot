package com.tsl.Tera_imbere.services;

import com.tsl.Tera_imbere.model.AccountInfo;
import com.tsl.Tera_imbere.repository.AccountInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountInfoServiceImplementation implements AccountInfoService{

    private final AccountInfoRepository accountInfoRepository;

    @Autowired
    public AccountInfoServiceImplementation (AccountInfoRepository accountInfoRepository){
        this.accountInfoRepository = accountInfoRepository;
    }

    @Override
    public List<AccountInfo> getAllAccountInfos() {
        return accountInfoRepository.findAll();
    }

    @Override
    public AccountInfo getAccountInfoById(Long id) {
        return accountInfoRepository.findAccountInfoById(id);
    }

    @Override
    public AccountInfo saveAccountInfo(AccountInfo accountInfo) {
        return accountInfoRepository.save(accountInfo);
    }

    @Override
    public AccountInfo updateAccountInfo(Long id, AccountInfo accountInfo) {
        AccountInfo existAccountInfo = accountInfoRepository.findAccountInfoById(id);
        if(existAccountInfo != null){
            existAccountInfo.setAccountName(accountInfo.getAccountName());
            existAccountInfo.setAccountName(accountInfo.getAccountNumber());
            existAccountInfo.setAccountBalance(accountInfo.getAccountBalance());
            return accountInfoRepository.save(existAccountInfo);
        }
        return null;
    }

    @Override
    public void removeAccountInfo(Long id) {
        accountInfoRepository.deleteById(id);
    }
}
