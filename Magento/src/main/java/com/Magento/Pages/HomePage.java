package com.Magento.Pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Magento.Browser.Browser;
import com.Magento.Locators.HomePageObjects;
import com.Magento.ScreenShot.CapturingScreenShot;
import com.aventstack.extentreports.Status;

public class HomePage extends Browser {
	static HomePageObjects obj;

// Method for Clicking the Create An Account Link
	public static void clickCreateAnAccount() throws Exception {
		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Click the Create An Account");
		logger1.log(Status.INFO, "Clicking the Create An Account");
		try 
		{
			logger1.log(Status.PASS, "Clicking the Create An Account Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Clicking the Create An Account");
			logger1.log(Status.FAIL, "Failed while Clicking the Create An Account");
		}
		extent.flush();

		obj = PageFactory.initElements(driver, HomePageObjects.class);

		try 
		{
			obj.createAccountLink.click();
		} 
		catch (Exception e) 
		{
			System.out.println("Exception in clickCreateAnAccount Method" + e);
		}
	}

// Method for Clicking the Sign In Link
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

		try 
		{
			obj.signInLink.click();
		} 
		catch (Exception e) 
		{
			System.out.println("Exception in clickSignIn Method" + e);
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
			CapturingScreenShot.screenShot(text);
		} 
		catch (Exception e) 
		{
			System.out.println("Exception in getHomePageText Method" + e);
		}
		return text;
	}
}
