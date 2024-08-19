package com.OpenCart.Commonutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ReusableScript {
	
	    public WebDriver driver;

	    // Constructor to introduce the WebDriver and PageFactory
	    public ReusableScript(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this); 
	    }
	    
		//-----------------------Object Repository-------------------------------------

	    // WebElement representing the LoginTitle 
	    @FindBy(xpath = "//li[@class='dropdown']//span[@class='hidden-xs hidden-sm hidden-md']")
	    WebElement TitleName;

		//---------------------------Action Method ----------------------------------------------

	    // Method to get the LoginTitle name and assert its value
	    public void getTitleName() {
	        String Title = TitleName.getText(); // Get text of the LoginTitle name element
	        Assert.assertEquals(Title, "My Account"); // Assert that the LoginTitle name matches "My Account"
	    }

}
