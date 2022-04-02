package com.DsAlgo.StepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pageFactory.utils.Browser;
import com.pageFactory.utils.GetStartedPage;
import com.pageFactory.utils.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class getstartedStepDefinition extends Browser
{
	
	//WebDriver driver;
	GetStartedPage GetStart=new GetStartedPage(driver);
 
	
	@Given("User is in DsAlgo Stating Page")
	public void user_is_in_DsAlgo_Stating_Page() 
	{
		
		driver.get("https://dsportalapp.herokuapp.com/");
		
	}

	@When("User clicks {string}")
	public void user_clicks(String string) {
		GetStart.getstratedbutttonTest(); 
	}

	@Then("User should be directed to Home page")
	public void user_should_be_directed_to_Home_page() 
	{
		Assert.assertEquals(driver.getTitle(),"NumpyNinja");
		

	}
	
	
	
}
