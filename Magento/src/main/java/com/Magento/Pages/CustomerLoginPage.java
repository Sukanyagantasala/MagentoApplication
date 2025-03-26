package com.Magento.Pages;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Magento.Browser.Browser;
import com.Magento.Locators.CustomerLoginPageObjects;
import com.aventstack.extentreports.Status;

public class CustomerLoginPage extends Browser {
	static CustomerLoginPageObjects obj;

//	Method for Entering the Email
	public static void enteringEmail(String data) throws Exception {
		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Enter Email");
		logger1.log(Status.INFO, "Entering Email");
		try 
		{
			logger1.log(Status.PASS, "Email Entered Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Entering the Email");
			logger1.log(Status.FAIL, "Failed while Entering the Email");
		}
		extent.flush();

		obj = PageFactory.initElements(driver, CustomerLoginPageObjects.class);
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(obj.enteringEmail));
			obj.enteringEmail.sendKeys(data);

//			obj.enteringEmail.sendKeys(data);
		} 
		catch (Exception e) 
		{
			System.out.println("Exception in enteringEmail Method" + e);
		}

	}

// Method for Entering the Password
	public static void enteringPassword(String data) throws Exception {
		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Enter Password");
		logger1.log(Status.INFO, "Entering Password");
		try 
		{
			logger1.log(Status.PASS, "Password Entered Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Entering the Password");
			logger1.log(Status.FAIL, "Failed while Entering the Password");
		}
		extent.flush();

		try 
		{
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(obj.enteringPassword)).sendKeys(data);

			// obj.enteringPassword.sendKeys(data);
		} 
		catch (Exception e) 
		{
			System.out.println("Exception in enteringPassword Method" + e);
		}
	}

//	Method for Clicking the Sign In Button
	public static void clickSignInButton() throws Exception {
		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Click Sign In Button");
		logger1.log(Status.INFO, "Clicking Sign In Button");
		try 
		{
			logger1.log(Status.PASS, "Sign In Button clicked Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Clicking the Sign In Button");
			logger1.log(Status.FAIL, "Failed while Clicking the Sign In Button");
		}
		extent.flush();

		try 
		{
			wait.until(ExpectedConditions.elementToBeClickable(obj.signInButton));
			obj.signInButton.click();


		} 
		catch (Exception e) 
		{
			System.out.println("Exception in clicking");
		}
	}

// Method for Getting the Error Message
	public static String getErrormessageText(String text) throws Exception {
		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Getting the Error Message");
		logger1.log(Status.INFO, "Getting the Error Message");
		try 
		{
			logger1.log(Status.PASS, "Getting the Error Message Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Getting the Error Message");
			logger1.log(Status.FAIL, "Failed while Getting the Error Message");
		}
		extent.flush();

		try 
		{
			text = obj.errorMessage.getText();
		} 
		catch (Exception e) 
		{
			System.out.println("Exception in getErrormessageText" + e);
		}
		return text;
	}

}
