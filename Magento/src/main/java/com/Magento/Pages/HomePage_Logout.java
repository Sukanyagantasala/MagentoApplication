package com.Magento.Pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Magento.Browser.Browser;
import com.Magento.Locators.HomePageObjects_Logout;
import com.aventstack.extentreports.Status;

public class HomePage_Logout extends Browser {
	static HomePageObjects_Logout obj;

// Method for Clicking the Sign In Link
	public static void signInLink() {

		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Click on Sign In Link");
		logger1.log(Status.INFO, "Clicking Sign In Link");
		try 
		{
			logger1.log(Status.PASS, "Sign In Link clicked Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Clicking the Sign In Link");
			logger1.log(Status.FAIL, "Failed while Clicking the Sign In Link");
		}
		extent.flush();

		obj = PageFactory.initElements(driver, HomePageObjects_Logout.class);
		try 
		{

			wait.until(ExpectedConditions.elementToBeClickable(obj.signInLink));
			obj.signInLink.click();
		} 
		catch (Exception e) 
		{
			System.out.println("HomePage-While Clicking on Signin Link");
		}
	}

// Method for Getting the HomePage Text
	public static String homePageText() {

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
			wait.until(ExpectedConditions.visibilityOf(obj.homePageText));
		} 
		catch (Exception e) 
		{
			System.out.println("HomePage-While Getting Home Page text");
		}
		return obj.homePageText.getText();
	}

// Method for Clicking the DropDown
	public static void dropDown() {

		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Click the DropDown");
		logger1.log(Status.INFO, "Clicking the DropDown");
		try 
		{
			logger1.log(Status.PASS, "Clicking the DropDown Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Clicking the DropDown");
			logger1.log(Status.FAIL, "Failed while Clicking the DropDown");
		}
		extent.flush();

		try 
		{
			wait.until(ExpectedConditions.elementToBeClickable(obj.dropdown));
			obj.dropdown.click();
		} 
		catch (Exception e) 
		{
			System.out.println("HomePage-While Clicking on Dropdown");
		}
	}

//	Method for Clicking the SignOut Button
	public static void signOut() {
		
		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Click the SignOut");
		logger1.log(Status.INFO, "Clicking the SignOut");
		try 
		{
			logger1.log(Status.PASS, "Clicking the signOut Successfully");

		} catch (Exception e) {
			System.out.println("Error in Clicking the SignOut");
			logger1.log(Status.FAIL, "Failed while Clicking the SignOut");
		}
		extent.flush();

		try 
		{
			wait.until(ExpectedConditions.elementToBeClickable(obj.SignOut));
			obj.SignOut.click();

		} 
		catch (Exception e) 
		{
			System.out.println("HomePage-While Clicking on SignOut");
		}
	}

}
