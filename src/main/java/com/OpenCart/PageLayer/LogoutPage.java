package com.OpenCart.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
WebDriver driver;
	
	// Constructor to introduce the driver and PageFactory elements
	public LogoutPage(WebDriver driver) {
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
	
	// Locate the menu button (for logout)
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	WebElement menu;
	
	// Locate the logout option
	@FindBy(xpath = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[5]/a[1]")
	WebElement LogoutOption;

	
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
	
	// Method to log out from the application
	public void LogoutFromApplication() {
		menu.click();
		LogoutOption.click();
	}
	


}
