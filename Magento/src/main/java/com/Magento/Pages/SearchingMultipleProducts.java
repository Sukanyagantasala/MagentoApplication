package com.Magento.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Magento.Browser.Browser;
import com.Magento.Locators.SearchingMultipleProductsObjects;
import com.aventstack.extentreports.Status;

public class SearchingMultipleProducts extends Browser {

	static SearchingMultipleProductsObjects obj;

// Method for Searching Multiple Products
	public static void searchForMultipleProducts(String data) throws Exception {

		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Searching for Multiple Products");
		logger1.log(Status.INFO, "searching for Multiple Products");
		try 
		{
			logger1.log(Status.PASS, "Multiple Products searched Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Searching the Multiple Products");
			logger1.log(Status.FAIL, "Failed while searching the Multiple Products");
		}
		extent.flush();

		obj = PageFactory.initElements(driver, SearchingMultipleProductsObjects.class);
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(obj.Search));
			obj.Search.sendKeys(data);
		} 
		catch (Exception e) 
		{
			System.out.println("Exception in searchForMultipleProducts Method" + e);
		}
	}

//	Method for selecting Multiple Products From List
	public static void selectFromList(String data) throws Exception {

		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Select the Product from List");
		logger1.log(Status.INFO, "Selecting the Product from List");
		try 
		{
			logger1.log(Status.PASS, "Product is Selected from List Successfully");

		} 
		catch (Exception e) {
			System.out.println("Error in Selecting the Product from List");
			logger1.log(Status.FAIL, "Failed while Selecting the Product frpm List");
		}
		extent.flush();

		obj = PageFactory.initElements(driver, SearchingMultipleProductsObjects.class);
		try 
		{
			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//div[@id='search_autocomplete']//ul[@role='listbox']//li")));
			for (int i = 0; i < obj.list.size(); i++) {
				if (obj.list.get(i).getText().contains(data)) {
					obj.list.get(i).click();
					break;
				}
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Error in selectFromList Method" + e);
		}
	}

}
