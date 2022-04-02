package com.pageFactory.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedList extends Signin
{

	
	@FindBy(xpath="//a[@href='/linked-list']")
	public WebElement linkedlist_dropdwn_list;
	
	@FindBy(xpath="//a[@href='linked-list']")
	public WebElement GetStarted_home_link;
	
	@FindBy(xpath="//h4[@class='bg-secondary text-white']")
	public WebElement welcomeLinkedMsg;
	
	@FindBy(xpath="//a[contains(@href,'introduction')]")
	public WebElement Linkedlist_Introlnk;
	
	@FindBy(xpath="//a[contains(@href,'creating-linked-list')]")
	public WebElement Linkedlist_Createlnk;
	
	@FindBy(xpath="//a[contains(@href,'traversal')]")
	public WebElement Linkedlist_traversallnk;
	
	@FindBy(xpath="//a[contains(@href,'types-of-linked-list')]")
	public WebElement Linkedlist_typeLinkedlnk;
	
	@FindBy(xpath="//a[contains(@href,'implement-linked-list-in-python')]")
	public WebElement Linkedlist_pythonlnk;
	
	@FindBy(xpath="//a[contains(@href,'insertion')]")
	public WebElement Linkedlist_Insertionlnk;
	
	@FindBy(xpath="//a[contains(@href,'deletion')]")
	public WebElement Linkedlist_deletionlnk;
	
	@FindBy(xpath="//a[@href='/tryEditor']")
	public WebElement Linkedlist_tryEditor;
	
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	public WebElement Linkedlist_textarea;
	
	@FindBy(xpath="//button[@type='button']")
	public WebElement Linkedlist_button;
	
	public  LinkedList(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void Introduction_click()
	{
		Linkedlist_Introlnk.click();
	}
	
	public void Createlnk_click()
	{
		Linkedlist_Createlnk.click();
	}
	
	
	public void traversal_click()
	{
		Linkedlist_traversallnk.click();
	}
	public void typeLinkedlnk_click()
	{
		Linkedlist_typeLinkedlnk.click();
	}
	
	public void pythonlnk_click()
	{
		Linkedlist_pythonlnk.click(); 
	}
	
	public void Insertionlnk_click()
	{
		Linkedlist_Insertionlnk.click(); 
	}
	
	public void Deletionlnk_click()
	{
		Linkedlist_deletionlnk.click(); 
	}
	
	
}
