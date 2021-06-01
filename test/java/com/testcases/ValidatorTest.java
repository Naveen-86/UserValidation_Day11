package com.testcases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTest {
    @Test
    void givenFirstName_itIsValid_returnTrue() {
        Validator validator = new Validator();
        boolean status = validator.validateFirstName("Bridgelabz");
        Assertions.assertEquals(true,status);
    }

    @Test
    void givenLastName_itIsValid_returnTrue() {
        Validator validator = new Validator();
        boolean status = validator.validateLastName("Bridgelabz");
        Assertions.assertEquals(true,status);
    }

    @Test
    void givenEmail_itIsValid_returnTrue() {
        Validator validator = new Validator();
        boolean status = validator.validateEmail("abc.xyz@bl.co.in");
        Assertions.assertEquals(true,status);
    }

    @Test
    void givenMobileNumber_itIsValid_returnTrue() {
        Validator validator = new Validator();
        boolean status = validator.validateMobileNumber("+91 9919819801");
        Assertions.assertEquals(true,status);
    }

    @Test
    void givenPasswordRule4_itIsValid_returnTrue() {
        Validator validator = new Validator();
        boolean status = validator.validatePassword("Nicena@1");
        Assertions.assertEquals(true,status);
    }
}