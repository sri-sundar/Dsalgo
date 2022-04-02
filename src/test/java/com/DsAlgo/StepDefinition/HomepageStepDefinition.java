package com.DsAlgo.StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pageFactory.utils.Browser;
import com.pageFactory.utils.GetStartedPage;
import com.pageFactory.utils.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class HomepageStepDefinition extends Browser 
{
	
	 //WebDriver driver;
	//GetStartedPage GetStart;
	HomePage Home=new HomePage(driver);
	
	String currentExpect_homepage_Url="https://dsportalapp.herokuapp.com/";
	String Expected_loginPage_Url="https://dsportalapp.herokuapp.com/login";
	
	@Given("User opens Home Page")
	public void user_opens_Home_Page() 
	{
		
		driver.get("https://dsportalapp.herokuapp.com/");
		System.out.println("driver.getCurrentUrl()"+driver.getCurrentUrl());
		//Assert.assertEquals(driver.getCurrentUrl(), Expected_loginPage_Url);
	    
	}

	@When("User clicks {string} drop down")
	public void user_clicks_drop_down(String string) throws InterruptedException 
	{
		Home.ClickOnDropdownlist();
		Thread.sleep(5000);
	
	}
	@Then("User should see {int} different data structure entries in that dropdown")
	public void user_should_see_different_data_structure_entries_in_that_dropdown(Integer expectedcount )
	{  
//		Home.ArrayList_Home_Click(); 
//		Home.SigninTxtbx_Home.click();
		//Assert.assertSame(Home.DropdownmenuSizeO,expectedcount );
		System.out.println("size of ds"+Home.blockofDataStructure.size());
		
	}
	@When("User selects any data structures item from the drop down without Sign in")
	public void user_selects_any_data_structures_item_from_the_drop_down_without_Sign_in() throws InterruptedException
	{
        
		//System.out.println("In List:::::::::::"+Home.DropMenuLink_Home.getText());
		Home.QueueList_Home.click();
		//System.out.println("In List:::::::::::"+Home.QueueList_Home.getText());
		Thread.sleep(3000);
		// System.out.println("In List:::::::::::"+Home.QueueList_Home.getText());

	}
	
	@When("User clicks any of the {string} buttons below the data structures")
	public void user_clicks_any_of_the_buttons_below_the_data_structures(String string) throws InterruptedException
	{
		Home.GetStartedDSLink_Home.click();
		Thread.sleep(3000);
	    System.out.println("Get Started ::::::"+Home.GetStartedDSLink_Home.getText());
	    //System.out.println("In List:::::::::::"+Home.QueueList_Home.getText());

	}
	
	@Then("It should alert the user with a message {string}")
	public void it_should_alert_the_user_with_a_message(String ErrorMessage) {
		Assert.assertEquals(Home.Alert_Home.getText(), ErrorMessage);
	}

	@Then("user should be redirected to Sign in page")
	public void user_should_be_redirected_to_Sign_in_page() 
	{
		//String ExpectedUrl="https://dsportalapp.herokuapp.com/login";
		 //Home.SigninTxtbx_Home.click(); 
		 Assert.assertEquals(driver.getCurrentUrl(), Expected_loginPage_Url);
	}

}




	



	



