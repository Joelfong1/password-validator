package com.example.joel_pc_2.password_validator;
/**
 * Created by Joel Fong on 2018-05-30
 */


import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorUnitTest {
    @Test
    public void isPassword() {
        assertEquals(1, Validator.validate("password"));
    }

    @Test
    public void passwordLength() {
        assertEquals(2, Validator.validate("lengthypassword"));
    }

    @Test
    public void hasSpecialChar() {
        assertEquals(2, Validator.validate("a!!!"));
    }

    @Test
    public void hasDigits() {
        assertEquals(2, Validator.validate("digit1"));
    }

    @Test
    public void hasCases() {
        assertEquals(2, Validator.validate("Cases"));
    }

    @Test
    public void passwordValidate() {
        assertEquals(5, Validator.validate("passWord-1234!"));
    }
}
