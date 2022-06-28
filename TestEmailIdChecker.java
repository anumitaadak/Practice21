package com.junit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class TestEmailIdChecker {
    private String inputEmail;
    private boolean expectedResult;
    private EmailIdChecker emailIdChecker;

    @Before
    public void initialize(){
        emailIdChecker = new EmailIdChecker();
    }

    public TestEmailIdChecker(String inputEmail,boolean expectedResult){
        this.inputEmail = inputEmail;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection emailInputs() {
        return Arrays.asList(new Object[][]{{"abc@yahoo.com",false},{"abc-100@yahoo.com",false},{"abc.100@yahoo.com",false}
                ,{"abc111@abc.com",false},{"abc-100@abc.net",false},{"abc.100@abc.com.au",false},{"abc@1.com",false},
                {"abc@gmail.com.com",false},{"abc+100@gmail.com",false}} );
    }

        @Test
        public void givenEmail_whenChecked_shouldReturnHappy(){
            //boolean result = EmailIdChecker.validateEmail("^[a-z]{3}[.][x-z]{3}[@][a-z]{2}[.][c]{1}[o]{1}[.][i][n]$", inputEmail);
           // assertTrue(result);
            System.out.println("Parameterized email is : " + inputEmail);
            assertEquals(expectedResult,
                    EmailIdChecker.validateEmail("^[a-z]{3}[.][x-z]{3}[@][a-z]{2}[.][c]{1}[o]{1}[.][i][n]$", inputEmail));
        }
    }

