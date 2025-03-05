package com.tsl.Tera_imbere.utilities;

import java.time.Year;

public class AccountUtilities {

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
