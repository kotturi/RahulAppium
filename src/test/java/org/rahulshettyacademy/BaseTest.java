package org.rahulshettyacademy;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	public AppiumDriverLocalService service;
	public AndroidDriver driver;
	
	
	@BeforeClass
	public void ConfigurationAppium() throws MalformedURLException, URISyntaxException
	{
		/*	
		 * DesiredCapabilities caps = new DesiredCapabilities();
		 * caps.setCapability("platformName", "Android");
		 * caps.setCapability("automationName", "UiAutomator2");
		 * caps.setCapability("platformVersion", "12.0");
		 * caps.setCapability("deviceName", "e590b90f"); driver = new AndroidDriver(new
		 * URL("http://127.0.0.1:4723/"), caps);
		 */
      //  return;

		//start server proggrametecaly
		/*
		 * AppiumDriverLocalService service= new AppiumServiceBuilder().
		 * withAppiumJS(new File(
		 * "C://Users//JYOTHI//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"
		 * )).withIPAddress("127.0.0.1").usingPort(4723).build(); service.start();
		 */
		
		
		UiAutomator2Options options= new UiAutomator2Options();
		options.setDeviceName("	");
		options.setApp("Downloads\\General-Store.apk"); //Downloads\General-Store.apk
		
		  driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);			 
		
			/*
			 * service= new AppiumServiceBuilder().withAppiumJS(new File(
			 * "C://Users//JYOTHI//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"
			 * )) .withIPAddress("127.0.0.1").usingPort(4723).build();
			 * 
			 * service.start(); System.out.println(" Service Started"); UiAutomator2Options
			 * op= new UiAutomator2Options();
			 * 
			 * System.out.println(" UiAutomator2Options Started");
			 * 
			 * op.setDeviceName("emulator-5554"); System.out.println(" emulator Started");
			 * op.setApp(
			 * "C:\\Users\\JYOTHI\\eclipse-workspace\\Appium\\src\\test\\java\\resources\\ApiDemos-debug.apk"
			 * ); System.out.println(" apk install Started");
			 * 
			 * DesiredCapabilities capabilities = new DesiredCapabilities();
			 * System.out.println(" capabilities  Started"); driver= new AndroidDriver(new
			 * URL("http://127.0.0.1:4723/wd/hub"),capabilities);
			 */
	}
	
	public void LongPress(WebElement element)
	{
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId()
			));
	}
	public void ScroolDown( )
	{
		boolean canScrollMore;
		do
		{
			
		 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 1.0));
				
		}while(canScrollMore);
	}
	
	@AfterClass
	public void tearDown()
	{
		//driver.close();
		//service.stop();
	}
}
