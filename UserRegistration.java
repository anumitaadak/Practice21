package com.junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {


    public boolean validateName(String RegExp, String testExp) {
        Pattern pattern = Pattern.compile(RegExp);
        Matcher matcher = pattern.matcher(testExp);
        return matcher.matches();
    }

    public boolean validatePassword(String RegExp, String testExp) {
        Pattern pattern = Pattern.compile(RegExp);
        Matcher matcher = pattern.matcher(testExp);
        return matcher.matches();
    }

    public boolean validateMobileNo(String RegExp, String testExp) {
        Pattern pattern = Pattern.compile(RegExp);
        Matcher matcher = pattern.matcher(testExp);
        return matcher.matches();
    }

    public boolean validateEmail(String RegExp, String testExp) {
        Pattern pattern = Pattern.compile(RegExp);
        Matcher matcher = pattern.matcher(testExp);
        return matcher.matches();
    }
}
