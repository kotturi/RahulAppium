package org.rahulshettyacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.rahulshettyacademy.pageObjects.Android.CartPage;
import org.rahulshettyacademy.pageObjects.Android.FormPage;
import org.rahulshettyacademy.pageObjects.Android.ProductCatalogue;
import org.testng.Assert;
import org.testng.annotations.Test;

public class eCommerce_tc_2  extends BaseTest{

	@Test
	public void FillFormErrorMessage() throws InterruptedException
	{
		FormPage formpage= new FormPage(driver);		
		Thread.sleep(4000);		
		formpage.setGender("Male");
	//	formpage.setCountrySelection("Algeria");
		formpage.ShopButton();	  
	String toastMessage= driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getText();
	Assert.assertEquals(toastMessage,"Please enter your name");
	    
	}
	/*
	 * @Test(priority = 2) public void FillForm() throws InterruptedException {
	 * FormPage formpage= new FormPage(driver);
	 * 
	 * Thread.sleep(4000); formpage.setNameField("jyothi");
	 * formpage.setGender("Female"); // formpage.setCountrySelection("Algeria");
	 * formpage.ShopButton();
	 * 
	 * ProductCatalogue pc= new ProductCatalogue(driver);
	 * pc.addItemToCartByIndex(0); pc.addItemToCartByIndex(0); pc.SubmitForm();
	 * 
	 * CartPage cart= new CartPage(driver); cart.CompleteButton();
	 * 
	 * }
	 */
}
