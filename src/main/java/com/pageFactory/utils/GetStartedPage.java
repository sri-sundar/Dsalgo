package com.pageFactory.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetStartedPage 
	{
	
WebDriver driver;
		
@FindBy(xpath="//button[contains(text(),'Get Started')]")
public
	 WebElement getstarted;

public GetStartedPage(WebDriver driver)
{
	this.driver=driver;
		PageFactory.initElements(driver, this);
}


public HomePage getstratedbutttonTest() {
		getstarted.click();
	 return new HomePage(driver);
}
	
	}

