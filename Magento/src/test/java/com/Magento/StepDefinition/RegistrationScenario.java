package com.Magento.StepDefinition;

import org.testng.Assert;

import com.Magento.Browser.Browser;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.Magento.Pages.CustomerAccountPage;
import com.Magento.Pages.HomePage;
import com.Magento.Pages.MyAccountPage;
public class RegistrationScenario {
	
	@Given("User opens the Browser")
	public void user_opens_the_browser() throws Exception {
//		Browser.init("Registration_ExtentReport");
//		Browser.init("LoginWithValidAndInvalidCredentials_ExtentReport");
//	    Browser.init("LoggingOutAndVerifyingSessionEnd_ExtentReport");
//		Browser.init("LoginProductSearchAndAddToCart_ExtentReport");
		Browser.init("AddingMultipleProductsToCartAndValidatingCartSummary_ExtentReport");
		
	    Browser.openBrowser();
	}

	@And("User navigates to the {string} Webpage")
	public void user_navigates_to_the_webpage(String string) throws Exception {
	   Browser.navigateToUrl(string);
	}

	@And("User click on the link Create Account")
	public void user_click_on_the_link_create_account() throws Exception {
		   HomePage.clickCreateAnAccount();
	}

	@When("User enters {string} the First Name")
	public void user_enters_the_first_name(String string) throws Exception {
	   CustomerAccountPage.enteringFirstName(string);
	}

	@And("User enters {string} the Last Name")
	public void user_enters_the_last_name(String string) throws Exception {
		CustomerAccountPage.enteringLastName(string);
	}

	@And("User enters {string} the Email")
	public void user_enters_the_email(String string) throws Exception {
		CustomerAccountPage.enteringEmail(string);
	}

	@And("User enters {string} the Password")
	public void user_enters_the_password(String string) throws Exception {
		CustomerAccountPage.enteringPassword(string);
	}

	@And("User enters {string} the Confirm Password")
	public void user_enters_the_confirm_password(String string) throws Exception {
		CustomerAccountPage.enteringConfirmPassword(string);
	}

	@And("User clicks on the Create Account Button")
	public void user_clicks_on_the_create_account_button() throws Exception {
		CustomerAccountPage.clickCreateAnAccount();
	}

	@Then("User verifies the Error Message {string}")
	public void user_verifies_the_error_message(String str) throws Exception {
		
		Assert.assertEquals(CustomerAccountPage.getErrorMessage(str),str);
		
		
	}

	@And("User closes the Browser")
	public void user_closes_the_browser() throws Exception {
		Browser.closeBrowser();
	    
	}

	@Then("User verifies that the user is registered successfully {string}")
	public void user_verifies_that_the_user_is_registered_successfully(String str) throws Exception {
	
	Assert.assertEquals(MyAccountPage.getSuccessMessage(str),str);
		
		
		
	    
	}
	




}
