package com.testcases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2}[a-z]*";
    private static final String EMAIL_PATTERN = "^[a][b][c][.][a-z]{3}[@][b][l][.][c][o][.][a-z]{2}";
    private static final String MOBILE_NUMBER_PATTERN = "^^[+91]+ [6-9]{1}[0-9]{9}";
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}";
    public boolean validateFirstName(String firstName)
    {
        return patternChecker(firstName, NAME_PATTERN);
    }

    public boolean validateLastName(String lastName)
    {
        return patternChecker(lastName, NAME_PATTERN);
    }

    public boolean validateEmail(String email)
    {
        return patternChecker(email, EMAIL_PATTERN);
    }

    public boolean validateMobileNumber(String mobileNumber)
    {
        return patternChecker(mobileNumber, MOBILE_NUMBER_PATTERN);
    }

    public boolean validatePassword(String password)
    {
        return patternChecker(password, PASSWORD_PATTERN);
    }

    private static boolean patternChecker(String input, String inputPattern)
    {
        Pattern pattern = Pattern.compile(inputPattern);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }
}