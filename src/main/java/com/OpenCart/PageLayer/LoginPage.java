package com.OpenCart.PageLayer;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
WebDriver driver;
	
	// Constructor to introduce the driver and PageFactory elements
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    
	//-----------------------Object Repository-------------------------------------

	// Locate the Login Page
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	WebElement MyAccountbtn;
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	WebElement Loginbtn;
	
	// Locate the username input field
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement Username;
	
	// Locate the password input field
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement Password;
    
	// Locate the login button
	@FindBy(xpath = "//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
	WebElement LoginButton;
	
	
	// Locate the error message element
//	@FindBy(xpath = "")
//	WebElement errorMessage;
	
	//---------------------------Action Method ----------------------------------------------
	
	// Method to open the login page with the given base URL
	public void OpenLoginPage(String baserURL) {
		driver.get(baserURL);
		MyAccountbtn.click();
		Loginbtn.click();
	}
	
	// Method to log in to the application with given username and password
	public void LoginToApplication(String username, String password) {
		Username.sendKeys(username);
		Password.sendKeys(password);
		LoginButton.click();
	}
	
	
	// Method to get the error message text
//	public String getErrorMessage() {
//        return errorMessage.getText();
//	}


}
