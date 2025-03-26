package com.Magento.Pages;

import org.openqa.selenium.support.PageFactory;

import com.Magento.Browser.Browser;
import com.Magento.Locators.CustomerLoginPageObjects;
import com.Magento.Locators.HomePageObjects_Login;
import com.aventstack.extentreports.Status;

public class HomePageLogin extends Browser {
	static HomePageObjects_Login obj;

// Method for Clicking Sign In
	public static void clickSignIn() throws Exception {
		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Click the Sign In");
		logger1.log(Status.INFO, "Clicking the Sign In");
		try 
		{
			logger1.log(Status.PASS, "Clicking the Sign In Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Clicking the Sign In");
			logger1.log(Status.FAIL, "Failed while Clicking the Sign In");
		}
		extent.flush();

		obj = PageFactory.initElements(driver, HomePageObjects_Login.class);
		try 
		{
			obj.signInLink.click();
		}

		catch(Exception e) 
		{
			System.out.println("Exception in getHomePageText" + e);
		}
	}

// Method for Getting the HomePage Text
	public static String getHomePageText(String text) throws Exception {

		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Getting the Home Page text");
		logger1.log(Status.INFO, "Getting the Home Page text");
		try 
		{
			logger1.log(Status.PASS, "Getting the Home Page text Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Getting the Home Page text");
			logger1.log(Status.FAIL, "Failed while Getting the Home Page text");
		}
		extent.flush();

		try 
		{
			text = obj.homePageText.getText();
		}

		catch (Exception e) 
		{
			System.out.println("Exception in getHomePageText" + e);
		}
		return text;
	}

}
