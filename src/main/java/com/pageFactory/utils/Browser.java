package com.pageFactory.utils;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver driver;
//	public static WebDriver setup(WebDriver driver)
////	   {
	public  Browser()
	{
		//initialize the webdriver
//	if(driver != null)
//		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		//driver.get("https://dsportalapp.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
		}
		
		
		
		
	

	
}
