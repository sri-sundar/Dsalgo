package com.DsAlgo.StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.pageFactory.utils.Browser;
import com.pageFactory.utils.Signin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninStepDefinition extends Browser

{
	
	Signin signin=new Signin(driver); 
	
	@Given("User is in the Sign in page")
	public void user_is_in_the_Sign_in_page() {
	 driver.get("https://dsportalapp.herokuapp.com/login");   
	 
	}
	@When("User enters <username> without filling <password> and click login")
	public void user_enters_username_without_filling_password_and_click_login(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		//System.out.println("validationMessage:::::"+signin.UserNameTxtbx_Home.getAttribute("validationMessage"));
		signin.EnterUsername(dataTable.row(1).get(0).trim()); 
		//signin.EnterPassword(dataTable.row(1).get(1));
		signin.SubmitLink();
		Thread.sleep(1000);
	}
	

	@Then("It should display an error {string} below Password textbox")
	public void it_should_display_an_error_below_Password_textbox(String validationMessageExpected) {
	  String validationMessageActual=signin.PasswordTxtbx_Home.getAttribute("validationMessage");
	  Assert.assertEquals(validationMessageActual, validationMessageExpected);
	  //driver.close();
	}

	
	

	@When("User enters invalid <username> and click sign in")
	public void user_enters_invalid_username_and_click_sign_in(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		signin.EnterUsername(dataTable.row(1).get(0).trim());
		signin.EnterPassword(dataTable.row(1).get(1).trim());
		signin.SubmitLink();
		Thread.sleep(1000);
	}

	@Then("It should display an error {string}")
	public void it_should_display_an_error(String AlertErrorMsg) {
		String ErrorMsg_aler_Home= signin.alert_Error_Signin.getText();
		Assert.assertEquals(ErrorMsg_aler_Home, AlertErrorMsg );
		//driver.close();
	}

	@When("User enters an invalid <username>+ <password> combination")
	public void user_enters_an_invalid_username_password_combination(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		signin.EnterUsername(dataTable.row(1).get(0).trim());
		signin.EnterPassword(dataTable.row(1).get(1).trim());
		signin.SubmitLink();
		Thread.sleep(1000);
	}

	@Then("System should alert user {string}")
	public void system_should_alert_user(String AlertErrorMsg) {
	 String ErrorMsg_aler_Home= signin.alert_Error_Signin.getText();
	 Assert.assertEquals(ErrorMsg_aler_Home, AlertErrorMsg );
		//driver.close();
	}
	@When("User enters with valid <username> valid <password>")
	public void user_enters_with_valid_username_valid_password(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		signin.EnterUsername(dataTable.row(1).get(0).trim());
		signin.EnterPassword(dataTable.row(1).get(1).trim());
		signin.SubmitLink();
		Thread.sleep(1000);
	}

	@Then("User should be redirected to Home Page with the message {string}")
	public void user_should_be_redirected_to_Home_Page_with_the_message(String loggingMsg) {
		driver.navigate().to("https://dsportalapp.herokuapp.com/home");
		String ActualloginMsg=signin.alertloginMsg.getText();
		Assert.assertEquals(ActualloginMsg, loggingMsg);
		
	}


	


}
