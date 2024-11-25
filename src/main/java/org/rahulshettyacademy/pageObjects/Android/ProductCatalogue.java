package org.rahulshettyacademy.pageObjects.Android;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.rahulshettyacademy.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProductCatalogue extends AndroidActions
{
	AndroidDriver driver;
	public ProductCatalogue(AndroidDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this );
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ADD TO CART']")
	private List<WebElement> linkaddToCart;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
	private WebElement addToCart;
	
	
	public void addItemToCartByIndex(int index)
	{
		linkaddToCart.get(index).click();
	}
	public ProductCatalogue SubmitForm() {
		addToCart.click();
		return new ProductCatalogue(driver);
		
	}

}
