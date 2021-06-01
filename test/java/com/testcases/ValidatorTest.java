package com.testcases;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidatorTest {
    public String email;
    public boolean status;
    Validator validator = new Validator();

    public ValidatorTest(String email, boolean status) {
        this.email = email;
        this.status = status;
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{{"abc@yahoo.com",true},{"abcyahoo.com",false}});
    }

    @Test
    public void emailChecker() {
        try {
            System.out.println(this.email);
            boolean result = validator.validateEmail(email);
            Assert.assertEquals(this.status, result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}