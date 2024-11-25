package org.rahulshettyacademy.pageObjects.Android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.rahulshettyacademy.utils.AndroidActions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CartPage extends AndroidActions {
	AndroidDriver driver;
	public CartPage(AndroidDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(className = "android.widget.CheckBox")
	private WebElement CartCheckbox;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnProceed")
	private WebElement btnComplete;
	
	
	
	public void CompleteButton()
	{
		CartCheckbox.click();
		btnComplete.click();
		
	}
	
	

}
