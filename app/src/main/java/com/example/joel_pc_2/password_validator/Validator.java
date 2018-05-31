package com.example.joel_pc_2.password_validator;

/**
 * Created by Joel Fong on 2018-05-30
 */


public class Validator {
    public static int validate(String password) {
        int rulesPassed = 0;

        if (!password.equalsIgnoreCase("password"))
                rulesPassed++;
        if (password.length() >= 8)
            rulesPassed++;

        return rulesPassed;
    }
}

