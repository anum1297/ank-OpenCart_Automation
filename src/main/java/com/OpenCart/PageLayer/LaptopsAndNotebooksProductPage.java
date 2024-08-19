package com.OpenCart.PageLayer;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaptopsAndNotebooksProductPage {
	
	  WebDriver driver;

	    // Constructor to initialize the driver and PageFactory elements
	    public LaptopsAndNotebooksProductPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

		//-----------------------Object Repository-------------------------------------
	    
	    // Navigate to LaptopsAndNotebook product names on the page
	    @FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
	    WebElement LapAndNote;
	    
	    @FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	    WebElement AllLapAndNote;
	    
	    // Locate LaptopsAndNotebook product names on the page
	    @FindBy(xpath = "//div[@class='product-thumb']//div[@class='caption']/h4/a")
	    List<WebElement> Products;

	    // Locate all "Add to cart" buttons for the products
	    @FindBy(xpath = "//button[@id='button-cart']")
	    WebElement AddCartButton;

	    // Locate the checkout icon (shopping cart)
	    @FindBy(xpath = "//header/div[1]/div[1]/div[3]/div[1]/button[1]")
	    WebElement Itembtn;
	    
	    @FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[1]/p[1]/a[2]/strong[1]")
	    WebElement Checkoutbtn;

		//---------------------------Action Method ----------------------------------------------
	    
	    // Method to Navigate to LaptopsAndNotebook product page
	    
	    public void LAndN_Product() {
	    	LapAndNote.click();
	    	AllLapAndNote.click();
	    	
	    }
	    
	    // Method to add specified products to the cart
	    public void addProducts(String prod) {
	        for (int i = 0; i < Products.size(); i++) {
	            String productName = Products.get(i).getText();
	            if (productName.contains(prod)) {
	            	Products.get(i).click(); // Click the "Add to cart" button for the matching product
	            }
	        }
	    }
	    
	    // Method to click the AddToCart Button
	    public void AddToCart() {
	    	AddCartButton.click();
	    }

	    // Method to click the checkout icon and proceed to checkout
	    public void checkoutProducts() {
	    	Itembtn.click();
	    	Checkoutbtn.click();
	    }


}
