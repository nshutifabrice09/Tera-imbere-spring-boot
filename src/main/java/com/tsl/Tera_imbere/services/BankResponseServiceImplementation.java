package com.tsl.Tera_imbere.services;

import com.tsl.Tera_imbere.model.AccountInfo;
import com.tsl.Tera_imbere.model.BankResponse;
import com.tsl.Tera_imbere.repository.AccountInfoRepository;
import com.tsl.Tera_imbere.repository.BankResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankResponseServiceImplementation implements BankResponseService{

    private final BankResponseRepository bankResponseRepository;
    private final AccountInfoRepository accountInfoRepository;

    @Autowired
    public BankResponseServiceImplementation(BankResponseRepository bankResponseRepository, AccountInfoRepository accountInfoRepository) {
        this.bankResponseRepository = bankResponseRepository;
        this.accountInfoRepository = accountInfoRepository;
    }

    @Override
    public List<BankResponse> getAllBankResponses() {
        return bankResponseRepository.findAll();
    }

    @Override
    public BankResponse getBankResponse(Long id) {
        return bankResponseRepository.findBankResponseById(id);
    }

    @Override
    public BankResponse saveBankResponse(BankResponse bankResponse, Long accountInfoId) {
        AccountInfo accountInfo = accountInfoRepository.findAccountInfoById(accountInfoId);
        bankResponse.setAccountInfo(accountInfo);
        return bankResponseRepository.save(bankResponse);
    }

    @Override
    public BankResponse updateBankResponse(Long id, BankResponse bankResponse) {
        BankResponse existBankResponse = bankResponseRepository.findBankResponseById(id);
        if(existBankResponse != null){
            existBankResponse.setResponseCode(existBankResponse.getResponseCode());
            return bankResponseRepository.save(existBankResponse);
        }
        return null;
    }


    @Override
    public void removeBankResponse(Long id) {
        accountInfoRepository.deleteById(id);
    }
}
