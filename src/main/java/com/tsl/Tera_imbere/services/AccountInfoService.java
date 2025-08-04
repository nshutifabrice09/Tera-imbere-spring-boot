package com.tsl.Tera_imbere.services;

import com.tsl.Tera_imbere.model.AccountInfo;

import java.util.List;

public interface AccountInfoService {
    List<AccountInfo> getAllAccountInfos();
    AccountInfo getAccountInfoById(Long id);
    AccountInfo saveAccountInfo(AccountInfo accountInfo);
    AccountInfo updateAccountInfo(Long id, AccountInfo accountInfo);
    void removeAccountInfo(Long id);
}
