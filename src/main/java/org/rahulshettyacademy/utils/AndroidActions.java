package org.rahulshettyacademy.utils;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AndroidActions {
	
	AndroidDriver driver;
	public AndroidActions(AndroidDriver driver)
	{
		//super(driver);

		this.driver=driver;
	}
	
	public void scroolTOText(String text)
	{
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollIntoView(text(\""+text+"\"));"));
		
		
	}

	
}
