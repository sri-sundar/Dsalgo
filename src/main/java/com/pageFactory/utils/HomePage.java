package com.pageFactory.utils;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage  extends GetStartedPage
{

	WebDriver driver;
	
	public int DropdownmenuSizeO;
	//Data structure DropDown List
	@FindBy(xpath="//a[@class='nav-link dropdown-toggle']")
	//Select select =new Select(@FindBy(xpath="//a[@class='nav-link dropdown-toggle']"));
	
	WebElement DropdownLink_Home;
	@FindBy(xpath="//div[@class='card-body d-flex flex-column']")
	public List< WebElement> blockofDataStructure;
	
	//dropdown menu
	@FindBy(xpath="//div[@class='dropdown-menu show']")
	//Select DropMenuLink_Home=new Select(@FindBy(xpath="//div[@class='dropdown-menu show']");
	
	public List< WebElement> DropMenuLink_Home;
	
	//DropDown List-array
	@FindBy(xpath="//a[@class='dropdown-item' and @href='/array']")
	public WebElement ArrayList_Home;
	
	//DropDown List-linkedlist
	@FindBy(xpath="//a[@class='dropdown-item' and @href='/linked-list']")
	public  WebElement Linkedlist_Home;
	
	//DropDown List-Stack
	@FindBy(xpath="//a[@class='dropdown-item' and @href='/stack']")
	public WebElement StackDropDown_Home;
	
	//DropDown List--Queue
	@FindBy(xpath="//a[@class='dropdown-item' and @href='/queue']")
	public WebElement QueueList_Home;
	
	@FindBy(xpath="//a[@href='data-structures-introduction' ]")
	public WebElement GetStartedDSLink_Home;
	
	//DropDown List--Tree
	@FindBy(xpath="//a[@class='dropdown-item' and @href='/tree']")
	public  WebElement Tree_List_Home;
	
	//DropDown List==Graph
	@FindBy(xpath="//a[@class='dropdown-item' and @href='/graph']")
	public WebElement GraphList_Home;
	
	//DropDown List--Alert 
	@FindBy(xpath="//div[@class='alert alert-primary']")
	public WebElement Alert_Home;
	
	//Sign in Link
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	public WebElement SigninTxtbx_Home;
	
	
	//Register link
	@FindBy(xpath="//a[@href='/register']")
	public  WebElement RegisterLink_Home;
	
	public HomePage(WebDriver driver) {
		super(driver);
		//this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	
	
	public void ClickOnDropdownlist()
	{
		getstarted.click();
//		DropdownLink_Home.isSelected();
	
		DropdownLink_Home.click();
   
		for(int i=0; i<DropMenuLink_Home .size(); i++) {
		    System.out.println("Dropdown Menu:::"+DropMenuLink_Home.get(i).getText()+DropMenuLink_Home.size());
		    //Dimension DropdownmenuSize=DropMenuLink_Home.get(i).getSize();
		}
	 DropdownmenuSizeO=DropMenuLink_Home .size();
	}
	public void ClickOnArrayList_Home()
	{
		
		System.out.println("Dropdown button"+ArrayList_Home.isSelected());
		ArrayList_Home.click();
		System.out.println("Dropdown array button"+ArrayList_Home.getText());
		System.out.println("Alert message"+Alert_Home.getText());
	}
	
	public void dropdownTest() throws InterruptedException
	{
		for(WebElement dp:DropMenuLink_Home)
		{
		System.out.println("DropDown message"+dp.getText());
		if(dp.equals(GraphList_Home))
		{
			GraphList_Home.click();
			Thread.sleep(2000);
			break;
		}
		if(dp.equals(Linkedlist_Home))
		{
			Linkedlist_Home.click();
			Thread.sleep(2000);
			break;
		}
		if(dp.equals(QueueList_Home))
		{
			QueueList_Home.click();
			Thread.sleep(2000);
			break;
		}
		
		//dp.click();
		Thread.sleep(2000);
		}
	}
	

}
