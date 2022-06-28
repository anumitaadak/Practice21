package com.junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIdChecker {
    public static boolean validateEmail(String RegExp, String testExp) {
        Pattern pattern = Pattern.compile(RegExp);
        Matcher matcher = pattern.matcher(testExp);
        return matcher.matches();
    }
}
