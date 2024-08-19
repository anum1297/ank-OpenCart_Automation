package com.OpenCart.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
 WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	//-----------------Object Repository----------
	
	// Locate the Register Page
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	WebElement MyAccountbtn;
	
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	WebElement Registerbtn;
	
		@FindBy(xpath="//input[@id='input-firstname']")
		 WebElement FirstName_txt_box;
		
		@FindBy(xpath="//input[@id='input-lastname']")
		 WebElement LastName_txt_box;
		
		@FindBy(xpath="//input[@id='input-email']")
		 WebElement Email_txt_box;
		
		@FindBy(xpath="//input[@id='input-telephone']")
		 WebElement Telephone_txt_box;
		
		@FindBy(xpath="//input[@id='input-password']")
		 WebElement Password_txt_box;
		
		@FindBy(xpath="//input[@id='input-confirm']")
		 WebElement PasswordConfirm_txt_box;
		
		@FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
		 WebElement Policy_Check_box;
		
		@FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
		 WebElement Continue_bottun;
		
		@FindBy(xpath="//h1[contains(text(),'Your Account Has Been Created!')]")
		 WebElement Success_txt;	
		
		//---------------Action Method -------------
		
		// Method to open the Register page with the given base URL
		public void OpenRegisterPage(String baserURL) {
			driver.get(baserURL);
			MyAccountbtn.click();
			Registerbtn.click();
		}
		public void EnterFirstName(String firstname) {
			FirstName_txt_box.sendKeys(firstname);
		}
		
		public void EnterLastName(String lastname) {
			LastName_txt_box.sendKeys(lastname);
		}
		public void EnterEmail(String email) {
			Email_txt_box.sendKeys(email);
		}
		public void EnterTelephone(String Tele) {
			Telephone_txt_box.sendKeys(Tele);
		}
		
		public void EnterPassword(String Pass) {
			PasswordConfirm_txt_box.sendKeys(Pass);
		}
		public void EnterPasswordConfirm(String PassCon) {
			Password_txt_box.sendKeys(PassCon);
		}
		public void CheckPolicyBox() {
			Policy_Check_box.click();
		}
		public void ClickOnContinueBtn() {
			Continue_bottun.click();
		}
		public String GetSuccessTxt() {
			String text = Success_txt.getText();
			return text;
		}


}
