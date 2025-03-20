package com.tsl.Tera_imbere.utilities;

import java.time.Year;

public class AccountUtilities {
    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "This user already exists!";
    public static final String ACCOUNT_CREATION_SUCCESS = "002";
    public static final String ACCOUNT_CREATION_MESSAGE = "Account has been created successfully.";


    public static String generateAccountNumber(){
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;

        //Generate a random number between min and max

        int randNumber= (int) Math.floor(Math.random()* (max - min + 1) +min);

        //Convert the current and randomNumber to strings and concatenate.

        String year = String.valueOf(currentYear);

        String randomNumber = String.valueOf(randNumber);
        StringBuilder accountNumber = new StringBuilder();
        return accountNumber.append(year).append(randomNumber).toString();
    }
}
