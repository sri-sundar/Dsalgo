package com.DsAlgo.StepDefinition;

import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.pageFactory.utils.LinkedList;
import com.pageFactory.utils.Signin;
import com.pageFactory.utils.Browser;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LinkedlistStepDefinition extends Browser {
	
	LinkedList list=new LinkedList(driver);
	
	
	@Given("The user is in the Home page after logged in with valid <username> valid <password>")
	public void the_user_is_in_the_Home_page_after_logged_in_with_valid_username_valid_password(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		driver.navigate().to("https://dsportalapp.herokuapp.com/home"); 
		list.singinlink_home.click();
		list.EnterUsername(dataTable.row(1).get(0).trim());
		Thread.sleep(1000);
		list.EnterPassword(dataTable.row(1).get(1).trim());
		Thread.sleep(1000);
		list.SubmitLink();
	}
	@When("The user clicks the {string} button in Linked List Pane")
	public void the_user_clicks_the_button_in_Linked_List_Pane(String string) {
		
		list.GetStarted_home_link.click(); 
		
	}

//	@Then("The user should be directed to {string} Page")
//	public void the_user_should_be_directed_to_Page(String Expstring) {
//	 AssertJUnit.assertEquals(driver.getTitle(), Expstring);  
//	}

//	@Given("The user is in the Linked List  page after logged in")
//	public void the_user_is_in_the_Linked_List_page_after_logged_in() {
//		driver.get("https://dsportalapp.herokuapp.com/linked-list/");
//	}
//	@When("The user clicks Introduction button")
//	public void the_user_clicks_Introduction_button() throws InterruptedException {
//		list.Introduction_click();
//		  Thread.sleep(2000);   
//	}
//
//	@Then("The user should be directed to Introduction  of Linked List Page")
//	public void the_user_should_be_directed_to_Introduction_of_Linked_List_Page() {
//		String acttitle=driver.getTitle();
//		Assert.assertEquals(acttitle,"Introduction");
//	}

	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) throws InterruptedException {
	   switch(string) 
	   {
	   case "Introduction":
		  list.Introduction_click();
		  Thread.sleep(2000);
		   break;
	   case "Creating a Linked List":
		   list.Createlnk_click();
		   Thread.sleep(2000);
		   break;
	   case "Types of Linked List":
		   list.typeLinkedlnk_click();
		   Thread.sleep(2000);
		   break;
	   case "Implement Linked List in Python"  :
		   list.pythonlnk_click();
		   Thread.sleep(2000);
		   break;
	   case "Traversal":
		   list.traversal_click();
		   Thread.sleep(2000);
		   break;
	   case "Insertion":
		   list.Insertionlnk_click();
		   Thread.sleep(2000);
		   break;
	   case "Deletion":
		   list.Deletionlnk_click();
		   Thread.sleep(2000);
		  break; 
	   }
	}

	@Then("The user should be directed to {string}  of Linked List Page")
	public void the_user_should_be_directed_to_of_Linked_List_Page(String string) {
		String actitle=driver.getTitle();
	//Assert.assertEquals(actitle, string);  
	list.Linkedlist_tryEditor.click();
	}
	@Then("user enters text in textarea")
	public void user_enters_text_in_textarea() throws InterruptedException {
	  list.Linkedlist_textarea.sendKeys("print 'Hello'");
	  Thread.sleep(3000);
	}

	@Then("clicks the run button")
	public void clicks_the_run_button() throws InterruptedException {
		list.Linkedlist_button.click();
		Thread.sleep(3000);
		driver.close();
	    
	}
}

	
	
	

