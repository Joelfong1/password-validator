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
    public void isPasswordCaps() {
        assertEquals(1, Validator.validate("PASSWORD"));
    }

    @Test
    public void passwordLength() {
        assertEquals(1, Validator.validate("1234567"));
    }

    @Test
    public void passwordValidate() {
        assertEquals(2, Validator.validate("password1234"));
    }
}
