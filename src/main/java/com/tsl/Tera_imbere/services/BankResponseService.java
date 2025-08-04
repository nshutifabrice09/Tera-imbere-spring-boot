package com.tsl.Tera_imbere.services;

import com.tsl.Tera_imbere.model.BankResponse;

import java.util.List;

public interface BankResponseService {
    List<BankResponse> getAllBankResponses();
    BankResponse getBankResponse(Long id);
    BankResponse saveBankResponse(BankResponse bankResponse, Long accountInfoId);
    BankResponse updateBankResponse(Long id, BankResponse bankResponse);
    void removeBankResponse(Long id);
}
