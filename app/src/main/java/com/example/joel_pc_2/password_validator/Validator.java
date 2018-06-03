package com.example.joel_pc_2.password_validator;

/**
 * Created by Joel Fong on 2018-05-30
 */


public class Validator {
    public static int validate(String password) {
        int rulesPassed = 0;

        //First 2 rules
        if (!password.equalsIgnoreCase("password"))
            rulesPassed++;
        if (password.length() >= 8)
            rulesPassed++;

        //Added Rules
        //Special character check
        if (!password.matches("[a-zA-Z0-9]*"))
            rulesPassed++;

        //Includes digits
        if (password.matches("(^.*[0-9].*)"))
            rulesPassed++;

        //Includes multiple Cases
        if (password.matches("(^.*[a-z].*)") && password.matches("(^.*[A-Z].*)"))
            rulesPassed++;

        return rulesPassed;
    }
}

