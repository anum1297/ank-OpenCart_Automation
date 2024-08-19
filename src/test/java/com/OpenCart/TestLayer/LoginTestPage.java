package com.OpenCart.TestLayer;

import org.testng.annotations.Test;
import com.OpenCart.TestComponents.TestBase;


public class LoginTestPage extends TestBase{
	
	@Test
	public void VerifyLoginFunctionality() {
						
	 //--------------LoginPage---------------
		 // Step 1: Open the login page of the application
        LogPage.OpenLoginPage(DataReader.getProperty("baseURL"));
        
        // Step 2: Perform login using valid credentials
        LogPage.LoginToApplication(DataReader.getProperty("username"), DataReader.getProperty("password"));

		
	}

}
