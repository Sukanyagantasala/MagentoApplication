package com.Magento.StepDefinition;

import org.testng.Assert;

import com.Magento.Browser.Browser;
import com.Magento.Pages.CustomerLoginPage;
import com.Magento.Pages.HomePageLogin;
import com.Magento.ScreenShot.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithValidAndInvalidCredentialsScenario {
	
	
	@When("User enter {string} the Email")
	public void user_enter_the_email(String string) throws Exception {
	    CustomerLoginPage.enteringEmail(string);
	}

	@And("User enter {string} the Password")
	public void user_enter_the_password(String string) throws Exception {
	    CustomerLoginPage.enteringPassword(string);
	}

	@And("click on the link Sign In")
	public void click_on_the_link() throws Exception {
	    HomePageLogin.clickSignIn();
	}

	@And("User clicks on the Sign In Button")
	public void user_clicks_on_the_sign_in_button() throws Exception {
		CustomerLoginPage.clickSignInButton();
	    
	}

	@And("User Closes the Browser")
	public void user_closes_the_browser() throws Exception {
	    Browser.closeBrowser();
	}

	@Then("User verify the Error Message {string}")
	public void user_verify_the_error_message(String str) {
	    try
	    {
	    	Assert.assertEquals(CustomerLoginPage.getErrormessageText(str),str);
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
	}

	
	
	@Then("User Verify that Home Page is displayed after login {string}")
	public void user_verify_that_is_displayed_after_login(String str) {
		try
		{
			Assert.assertEquals(HomePageLogin.getHomePageText(str), str);
			CapturingScreenShot.screenShot(str);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	   
	}




}
