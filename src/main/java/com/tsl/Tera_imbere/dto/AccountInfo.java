package com.tsl.Tera_imbere.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountInfo {
    private String accountName;
    private String accountNumber;
    private String accountBalance;

    public AccountInfo() {
    }

    public AccountInfo(String accountName, String accountNumber, String accountBalance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }
}
