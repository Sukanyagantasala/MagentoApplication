package com.Magento.Pages;

import org.openqa.selenium.support.PageFactory;

import com.Magento.Browser.Browser;
import com.Magento.Locators.MyAccountPageObjects;
import com.aventstack.extentreports.Status;

public class MyAccountPage extends Browser {
	static MyAccountPageObjects obj;

// Method for Getting the Success Message
	public static String getSuccessMessage(String text) throws Exception {
		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Getting the Success Message");
		logger1.log(Status.INFO, "Getting the Success Message");
		try 
		{
			logger1.log(Status.PASS, "Getting the Success Message Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Getting the Success Message");
			logger1.log(Status.FAIL, "Failed while Getting the Success Message");
		}
		extent.flush();

		obj = PageFactory.initElements(driver, MyAccountPageObjects.class);
		try 
		{
			text = obj.successfullyRegisteredMessage.getText();
		} 
		catch (Exception e) 
		{
			System.out.println("Exception in getSuccessMessage" + e);
		}
		return text;
	}

// Method for Getting the My Account Text
	public static String getMyAccounText(String text) throws Exception {

		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Getting the My Account Text");
		logger1.log(Status.INFO, "Getting the My Account Text");
		try 
		{
			logger1.log(Status.PASS, "Getting the My Account Text Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Getting the My Account Text");
			logger1.log(Status.FAIL, "Failed while Getting the My Account Text");
		}
		extent.flush();

		try 
		{
			text = obj.myAccountText.getText();
		} 
		catch (Exception e) 
		{
			System.out.println("Exception in getSuccessMessage" + e);
		}
		return text;
	}
}
