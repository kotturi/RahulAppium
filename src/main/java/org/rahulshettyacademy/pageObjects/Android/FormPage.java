package org.rahulshettyacademy.pageObjects.Android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.rahulshettyacademy.utils.AndroidActions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FormPage extends AndroidActions {
	AndroidDriver driver;
	public FormPage(AndroidDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	private WebElement nameField;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
	private WebElement Fgender;
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioMale")
	private WebElement Mgender;
	@AndroidFindBy(id="android:id/text1")
	private WebElement CountrySelection;
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private WebElement ShopButton;
	
	
	
	
	public void setNameField(String name)
	{
		nameField.sendKeys(name);
		driver.hideKeyboard();
	}
	
	public void setGender(String gender)
	{
		if(gender.contains("Female"))
			Fgender.click();
		else
			Mgender.click();
	}
	
	public void setCountrySelection(String countryName) throws InterruptedException
	{
		CountrySelection.click();
		Thread.sleep(2000);
		scroolTOText(countryName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='"+countryName+"']")).click();
	}
	public void ShopButton()
	{
		ShopButton.click();
	}
	
	

}
