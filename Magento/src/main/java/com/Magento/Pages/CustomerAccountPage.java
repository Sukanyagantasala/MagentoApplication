package com.Magento.Pages;

import org.openqa.selenium.support.PageFactory;

import com.Magento.Browser.Browser;
import com.Magento.Locators.CustomerAccountPageObjects;
import com.aventstack.extentreports.Status;

public class CustomerAccountPage extends Browser {
	static CustomerAccountPageObjects obj;

//	Method for Entering First Name 
	public static void enteringFirstName(String data) throws Exception {
		
		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Enter First Name");
		logger1.log(Status.INFO, "Entering First Name");
		try 
		{
			logger1.log(Status.PASS, "First Name Entered Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Entering the First Name");
			logger1.log(Status.FAIL, "Failed while Entering the First Name");
		}
		extent.flush();

		obj = PageFactory.initElements(driver, CustomerAccountPageObjects.class);

		try 
		{
			obj.firstName.sendKeys(data);
		} 
		catch (Exception e) 
		{
			System.out.println("Exception in EnteringFirstName Method" + e);
		}
	}


//	Method for Entering Last Name
	public static void enteringLastName(String data) throws Exception {
		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Enter Last Name");
		logger1.log(Status.INFO, "Entering the Last Name");
		try 
		{
			logger1.log(Status.PASS, "Last Name Entered Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Entering the Last Name");
			logger1.log(Status.FAIL, "Failed while Entering the Last Name");
		}
		extent.flush();

		try 
		{
			obj.lastName.sendKeys(data);
		} 
		catch (Exception e) 
		{
			System.out.println("Exception in enteringLastName Method" + e);
		}
	}

	
//	Method for Entering Email
	public static void enteringEmail(String data) throws Exception {

		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Enter Email");
		logger1.log(Status.INFO, "Entering the Email");
		try 
		{
			logger1.log(Status.PASS, "Email entered Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Entering the Email");
			logger1.log(Status.FAIL, "Failed while Entering the Email");
		}
		extent.flush();

		try 
		{
			obj.email.sendKeys(data);
		} 
		catch (Exception e) 
		{
			System.out.println("Exception in enteringEmail Method" + e);
		}
	}

	
// Method for Entering Password
	public static void enteringPassword(String data) throws Exception {

		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Enter Password");
		logger1.log(Status.INFO, "Entering the Password");
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
			obj.password.sendKeys(data);
		} 
		catch (Exception e) 
		{
			System.out.println("Exception in enteringPassword Method" + e);
		}
	}

//	Method for Entering Confirm Password
	public static void enteringConfirmPassword(String data) throws Exception {

		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Enter Confirm Password");
		logger1.log(Status.INFO, "Entering the Confirm Password");
		try 
		{
			logger1.log(Status.PASS, "Confirm Password Entered Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Entering the Confirm Password");
			logger1.log(Status.FAIL, "Failed while Entering the Confirm Password");
		}
		extent.flush();

		try 
		{
			obj.confirmPassword.sendKeys(data);
		} 
		catch (Exception e) 
		{
			System.out.println("Exception in enteringConfirmPassword Method" + e);
		}
	}

// Method for Clicking the Create An Account Button
	public static void clickCreateAnAccount() throws Exception {

		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Click Create An Account");
		logger1.log(Status.INFO, "Clicking the Create An Account");
		try 
		{
			logger1.log(Status.PASS, "Create An Account clicked Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in clicking the Create An Account");
			logger1.log(Status.FAIL, "Failed while clicking the Create An Account");
		}
		extent.flush();

		try 
		{
			obj.createAccount.click();
		} 
		catch (Exception e) 
		{
			System.out.println("Exception in clickCreateAnAccount Method" + e);
		}
	}

// Method for Getting the Error Message
	public static String getErrorMessage(String text) throws Exception {

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
			System.out.println("Exception in errorMessage Method" + e);
		}
		return text;
	}
}
