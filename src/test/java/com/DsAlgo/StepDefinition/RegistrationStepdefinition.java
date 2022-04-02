package com.DsAlgo.StepDefinition;

import com.pageFactory.utils.Browser;
import com.pageFactory.utils.RegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class RegistrationStepdefinition extends Browser
{
	
	RegistrationPage Regpage=new RegistrationPage(driver);
	
	@Given("User is in Register Page")
	public void user_is_in_Register_Page() {
		
		driver.get("https://dsportalapp.herokuapp.com/register");   
	}

	@When("User enters valid username<username>")
	public void user_enters_valid_username_username(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		Regpage.EnterUserName(dataTable.row(1).get(0).trim());  
		Thread.sleep(2000);
	}

	@When("User enters valid password<password>")
	public void user_enters_valid_password_password(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Regpage.EnterPassword(dataTable.row(1).get(0).trim()); 
		Thread.sleep(2000);
	}

	@When("User reenters passwors<repassword>")
	public void user_reenters_passwors_repassword(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Regpage.ReEnterPassword(dataTable.row(1).get(0).trim());
		Thread.sleep(2000);
	}

	@When("User clicks the register button")
	public void user_clicks_the_register_button() throws InterruptedException {
		Regpage.ClickonResgister();
		Thread.sleep(2000);
	}

//	@Then("User redirects to Homepage with {string}")
//	public void user_redirects_to_Homepage_with(String expectedWelcome) {
//		System.out.println("Registration welcome msg"+Regpage.Alertreg.getText()); 
//		//Assert.assertEquals(Regpage.Alertreg.getText(),expectedWelcome);
//		
//			Regpage.linkedlistGS.click();
//		
//	}

	@Then("User redirects to Homepage with {string} <username>")
	public void user_redirects_to_Homepage_with_username(String string, io.cucumber.datatable.DataTable dataTable) {

 String expectedMsg=string.concat(dataTable.row(1).get(0));
 System.out.println("Concated Expected Msg"+expectedMsg);
 Assert.assertEquals(Regpage.Alertreg.getText(),expectedMsg);
 if(Regpage.Alertreg.getText().equals(expectedMsg))
 	{
	 Regpage.linkedlistGS.click();
	 }
	}
	
	
//	@Given("User is in Register Page invalid")
//	public void user_is_in_Register_Page_invalid() throws InterruptedException {
//		driver.navigate().to("https://dsportalapp.herokuapp.com/register");
//		Regpage.RegistrationPaged(driver);
//		
//		Thread.sleep(2000);
//	}

	@When("User enters invalid username {string}")
	public void user_enters_invalid_username(String uname) throws InterruptedException {
		//Regpage.RegistrationPaged(driver);
		Regpage.EnterUserName(uname);
		Thread.sleep(2000);
//		Regpage.RegistrationPaged(driver);
//		Regpage.getstarted.click();
//		Regpage.RegisterLink_Home.click();
//		Regpage.RegUserName.clear();
//		Regpage.RegUserName.sendKeys(uname);	
	}

	@When("User enters invalid password {string}")
	public void user_enters_invalid_password(String passwd) throws InterruptedException {
		Regpage.EnterPassword(passwd);
		Thread.sleep(2000);
	}

	@When("User reenters invalid password {string}")
	public void user_reenters_invalid_password(String repasswd) throws InterruptedException {
		Regpage.ReEnterPassword(repasswd);
		Thread.sleep(2000);
	}

	@Then("User gets the alert Message")
	public void user_gets_the_alert_Message() {
		Regpage.ClickonResgister();
		driver.close();
		System.out.println("Alert Msg"+Regpage.Alertreg.getText());
	}






}
