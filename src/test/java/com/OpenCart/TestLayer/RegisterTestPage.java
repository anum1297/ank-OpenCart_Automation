package com.OpenCart.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.OpenCart.PageLayer.RegisterPage;
import com.OpenCart.TestComponents.TestBase;


public class RegisterTestPage extends TestBase{
	
	@Test
	public void VerifyRegistorFunctionality() {
		
        
        // Step 1: Open the Register page of the application
        RegisPage.OpenRegisterPage(DataReader.getProperty("baseURL"));
        
		//-----------------Register Page-----------------
        
        // Read Customer Info from properties file
        String firstName = DataReader.getProperty("firstName");
        String lastName = DataReader.getProperty("lastName");
        String enterEmail = DataReader.getProperty("enterEmail");
        String enterTelephone = DataReader.getProperty("enterTelephone");
        String enterPassword = DataReader.getProperty("enterPassword");
        String enterPasswordConfirm = DataReader.getProperty("enterPasswordConfirm");


        RegisterPage regis_page = new RegisterPage(driver);

		regis_page.EnterFirstName(firstName);
		regis_page.EnterLastName(lastName);
		regis_page.EnterEmail(enterEmail);
		regis_page.EnterTelephone(enterTelephone);
		regis_page.EnterPassword(enterPassword);
		regis_page.EnterPasswordConfirm(enterPasswordConfirm);
		regis_page.CheckPolicyBox();
		regis_page.ClickOnContinueBtn();
		
		String Expected_Result = "Your Account Has Been Created!";
		String Actual_Result = regis_page.GetSuccessTxt();
		Assert.assertEquals(Actual_Result, Expected_Result);		
	}

}
