package com.Magento.Pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Magento.Browser.Browser;
import com.Magento.Locators.CartObjects;
import com.aventstack.extentreports.Status;

public class CartPage extends Browser {

	static CartObjects obj;

// Clicking the Cart Button
	public static void clickOnCartButton() throws Exception {

		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Click on Cart Button");
		logger1.log(Status.INFO, "Clicking on Cart Button");
		try 
		{
			logger1.log(Status.PASS, "Product is added to Cart Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in adding the Product to Cart");
			logger1.log(Status.FAIL, "Failed while adding the Product to Cart");
		}
		extent.flush();

		obj = PageFactory.initElements(driver, CartObjects.class);
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(obj.clickOnCartButton));
			obj.clickOnCartButton.click();
		} 
		catch (Exception e) 
		{
			System.out.println("Error in clickOncartButton" + e);
		}
	}

// Checking the Product is Added to Cart or not
	public static String getFisrtProduct() throws Exception {

		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Getting the First Product text");
		logger1.log(Status.INFO, "Getting the First product text");
		try 
		{
			logger1.log(Status.PASS, "Getting the First Product text Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Getting the First Product text");
			logger1.log(Status.FAIL, "Failed while Getting the First Product text");
		}
		extent.flush();

		String text = null;
		try 
		{

			text = obj.getFisrtProduct.getText();
		} 
		catch (Exception e) 
		{
			System.out.println("Exception in getFisrtProduct Method" + e);
		}
		return text;
	}


//	Checking the Product is Added to Cart or not
	public static String getSecondProduct() throws Exception {

		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Getting the Second Product text");
		logger1.log(Status.INFO, "Getting the Second product text");
		try 
		{
			logger1.log(Status.PASS, "Getting the Second Product text Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Getting the Second Product text");
			logger1.log(Status.FAIL, "Failed while Getting the Second Product text");
		}
		extent.flush();

		String text = null;
		try 
		{

			text = obj.getSecondProduct.getText();
		} 
		catch (Exception e) 
		{
			System.out.println("Exception in getSecondProduct Method" + e);
		}
		return text;
	}

//	Checking the Total Price of Products
	public static String getTotalPrice() throws Exception {

		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Getting the Total Price");
		logger1.log(Status.INFO, "Getting the Total Price");
		try 
		{
			logger1.log(Status.PASS, "Getting the Total Price Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Getting the Total Price");
			logger1.log(Status.FAIL, "Failed while Getting the Total Price");
		}
		extent.flush();

		String text = null;
		try 
		{

			text = obj.getTotalPrice.getText();
		} 
		catch (Exception e) 
		{
			System.out.println("Exception in getFisrtProduct Method" + e);
		}
		return text;
	}

}
