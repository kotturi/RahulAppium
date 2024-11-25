package org.rahulshettyacademy;

import org.rahulshettyacademy.pageObjects.Android.CartPage;
import org.rahulshettyacademy.pageObjects.Android.FormPage;
import org.rahulshettyacademy.pageObjects.Android.ProductCatalogue;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class eCommerce_tc_4_Hybrid  extends BaseTest{

	@Test(dataProvider = "getData")
	public void FillForm(String name,String gender) throws InterruptedException
	{
		FormPage formpage= new FormPage(driver);
		Thread.sleep(4000);
		/*
		 * formpage.setNameField("jyothi"); formpage.setGender("Female");
		 */
		formpage.setNameField(name);
		formpage.setGender(gender);
//		for (Map.Entry<keyType, valType> entry : map.entrySet()) {
//			keyType key = entry.getKey();
//			valType val = entry.getValue();
//			
//		}
		
			
	//	formpage.setCountrySelection("Algeria");
		formpage.ShopButton();
	  
		ProductCatalogue pc= new ProductCatalogue(driver);
		pc.addItemToCartByIndex(0);
	    pc.addItemToCartByIndex(0);
	    pc.SubmitForm();
	    
	    CartPage cart= new CartPage(driver);
	    cart.CompleteButton();
	    
	}
	@DataProvider
	public Object getData()
	{
		return new Object[][] {{"Jyothi","Female"},{"Sai","Male"}}; 
		
	}
}
