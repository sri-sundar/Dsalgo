package com.pageFactory.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin extends HomePage
{
		
	
	WebDriver driver;
	GetStartedPage GetStart;
	
	//UserName Input Text Box
		@FindBy(xpath="//a[@href='/login']")
		public WebElement singinlink_home;
	
		@FindBy(id="id_username")
		public WebElement UserNameTxtbx_Home;
		
		//Password Input Text Box
		@FindBy(id="id_password")
		public WebElement PasswordTxtbx_Home;
		
		//Submit link
		@FindBy(xpath="//input[@type='submit' and @value='Login']")
		public WebElement SubmitLink_Home;
		
		@FindBy(xpath="//div[@class='alert alert-primary']")
		public WebElement alert_Error_Signin;
		
		@FindBy(xpath="//div[@class='alert alert-primary']")
		public WebElement alertloginMsg;

	public Signin(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}

	public void EnterUsername(String username)
	{
		UserNameTxtbx_Home.clear();
		UserNameTxtbx_Home.sendKeys(username);
		
	}
	public void EnterPassword(String password)
	{
		PasswordTxtbx_Home.clear();
		PasswordTxtbx_Home.sendKeys(password);
	}
	
	public HomePage SubmitLink()
	{
		SubmitLink_Home.click();
		return new HomePage(driver);
	}
	

	
}
