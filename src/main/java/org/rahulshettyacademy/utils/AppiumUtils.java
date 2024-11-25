package org.rahulshettyacademy.utils;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.functions.ExpectedCondition;

public class AppiumUtils  {
	
	AppiumDriver driver;
	
	public AppiumUtils(AppiumDriver driver)
	{
		this.driver= driver;
	}
	
	public void waitForElementToAppear(WebElement ele)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3000));
		wait.until(ExpectedConditions.attributeContains( ele, "text", "cart"));
	}

}
