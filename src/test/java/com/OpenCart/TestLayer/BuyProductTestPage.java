package com.OpenCart.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OpenCart.PageLayer.CheckOutPage;
import com.OpenCart.PageLayer.LaptopsAndNotebooksProductPage;
import com.OpenCart.TestComponents.TestBase;


public class BuyProductTestPage extends TestBase{
	
	@Test
	public void VerifyBuyProductFunctionality() {
		
		 // Step 1: Open the login page of the application
        LogPage.OpenLoginPage(DataReader.getProperty("baseURL"));

        // Step 2: Perform login using valid credentials
        LogPage.LoginToApplication(DataReader.getProperty("username"), DataReader.getProperty("password"));
        
        // Step 3: Add products to the cart
        LaptopsAndNotebooksProductPage PG_Object = new LaptopsAndNotebooksProductPage(driver);
        
        PG_Object.LAndN_Product();
        
        PG_Object.addProducts(DataReader.getProperty("product1"));
        
        PG_Object.AddToCart();

        // Step 4: Proceed to checkout
        PG_Object.checkoutProducts();
		
        // Step 3: CheckOut products from the cart
        
        CheckOutPage CO_Object = new CheckOutPage(driver);
        
        CO_Object.CheckOutAndConfirmOrder();
        
		String Expect_Result = "Your order has been placed!";
		String Actual_Result = CO_Object.GetSuccessMsg();
		Assert.assertEquals(Actual_Result, Expect_Result);
		System.out.println("Order Placed");
       
		
	}

}
