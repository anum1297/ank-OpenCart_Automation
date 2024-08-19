package com.OpenCart.PageLayer;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckOutPage {
	
    WebDriver driver;
    Actions builder;

    // Constructor to initialize the driver, PageFactory elements, and Actions class
    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        builder = new Actions(driver);
    }
    
	//-----------------------Object Repository-------------------------------------

    // Locate Billing details on the checkout page
    @FindBy(xpath = "//input[@id='button-payment-address']")
    WebElement BillingDetailsContinue_btn;
    
    // Locate Delivery details on the checkout page
    @FindBy(xpath = "//input[@id='button-shipping-address']")
    WebElement DeliveryDetailsContinue_btn;

    // Locate Delivery Method on the checkout page
    @FindBy(xpath = "//input[@id='button-shipping-method']")
    WebElement DeliveryMethodContinue_btn;
    
    // Locate T&C check Box and Payment Method on the checkout page
    
    @FindBy(xpath = "//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/input[1]")
    WebElement TAndC_CheckBox;
    
    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement PaymentMethodContinue_btn;
    
    // Locate the Confirm Order button
    @FindBy(xpath = "//input[@id='button-confirm']")
    WebElement ConfirmOrder_btn;

    // Locate the Success Massage
	@FindBy(xpath="//h1[contains(text(),'Your order has been placed!')]")
	WebElement Success_Msg;
    
	//---------------------------Action Method ----------------------------------------------

    // Method to validate that specified products are in the checkout list
	
	public void CheckOutAndConfirmOrder() {
		BillingDetailsContinue_btn.click();
		DeliveryDetailsContinue_btn.click();
		DeliveryMethodContinue_btn.click();
		TAndC_CheckBox.click();
		PaymentMethodContinue_btn.click();
		ConfirmOrder_btn.click();
		
	}
	
	public String GetSuccessMsg() {
		String text = (Success_Msg).getText();
		return text;
	}

   

}
