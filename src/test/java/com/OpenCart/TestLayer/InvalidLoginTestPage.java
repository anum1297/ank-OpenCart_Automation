package com.OpenCart.TestLayer;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.OpenCart.TestComponents.TestBase;

public class InvalidLoginTestPage extends TestBase {
	
    @Test
    public void VerifyInvalidLoginFunctionality() {
        
        // Read invalid credentials from properties file
        String invalidUsername = DataReader.getProperty("invalidUsername");
        String invalidPassword = DataReader.getProperty("invalidPassword");

        // Step 1: Open the login page of the application
        LogPage.OpenLoginPage(DataReader.getProperty("baseURL"));

        // Step 2: Attempt login with invalid credentials
        LogPage.LoginToApplication(invalidUsername, invalidPassword);

        // Step 3: Verify that an appropriate error message is displayed
        String expectedErrorMessage = "Warning: No match for E-Mail Address and/or Password.";
        String actualErrorMessage = InvalidLogPage.getErrorMessage(); // Fetch the error message displayed
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message does not match!"); // Assert that the error message matches the expected message
    }
}
