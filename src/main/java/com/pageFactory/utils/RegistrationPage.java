package com.pageFactory.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends Signin
{


	@FindBy(xpath="//input[@id='id_username']")
	public WebElement RegUserName;
	
	@FindBy(xpath="//input[@id='id_password1']")
	public WebElement RegPassword;
	
	@FindBy(xpath="//input[@id='id_password2']")
	public  WebElement RegConfirmPassword;
	
	@FindBy(xpath="//input[@value='Register']")
	public WebElement Register;
	
	@FindBy(linkText="Login")
	public  WebElement RegLoginlink;
	
	@FindBy(xpath="//div[@class='alert alert-primary']")
	public WebElement Alertreg;
	
	@FindBy(xpath="//a[@href='linked-list']")
	public WebElement linkedlistGS;

	
	public RegistrationPage(WebDriver driver)
	
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUserName(String Username)
	{
		//getstarted.click();
		//RegisterLink_Home.click();
		RegUserName.clear();
		RegUserName.sendKeys(Username);	
	}
	
	public void EnterPassword(String Password)
	{
		RegPassword.clear();
		RegPassword.sendKeys(Password);
	}
	
	public void ReEnterPassword(String RePassword)
	
	{
		RegConfirmPassword.clear();
		RegConfirmPassword.sendKeys(RePassword);
	}
	public void ClickonResgister()
	{
		Register.click();
	}
	
	public HomePage ClickOnLoginLink()
	{
		RegLoginlink.click();
		return new HomePage(driver);
	}

	
}
