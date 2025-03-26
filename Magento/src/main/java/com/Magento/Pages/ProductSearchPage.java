package com.Magento.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Magento.Browser.Browser;
import com.Magento.Locators.ProductSearchObjects;
import com.aventstack.extentreports.Status;

public class ProductSearchPage extends Browser {
	static ProductSearchObjects obj;

// Method for Searching the product
	public static void searchForProduct(String data) throws Exception {

		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Searching for the Product");
		logger1.log(Status.INFO, "searching for the Product");
		try {
			logger1.log(Status.PASS, "Product searched Successfully");

		} catch (Exception e) {
			System.out.println("Error in Searching the Product");
			logger1.log(Status.FAIL, "Failed while searching the Product");
		}
		extent.flush();

		obj = PageFactory.initElements(driver, ProductSearchObjects.class);
		try {
			wait.until(ExpectedConditions.visibilityOf(obj.Search));

			// obj.Search.click();
			obj.Search.sendKeys(data);
		} catch (Exception e) {
			System.out.println("Exception in searchForProduct Method" + e);
		}
	}

// Method for Selecting the Product From List
	public static void selectFromList() throws Exception {

		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Select the Product from List");
		logger1.log(Status.INFO, "Selecting the Product from List");
		try {
			logger1.log(Status.PASS, "Product is Selected from List Successfully");

		} catch (Exception e) {
			System.out.println("Error in Selecting the Product from List");
			logger1.log(Status.FAIL, "Failed while Selecting the Product frpm List");
		}
		extent.flush();

		obj = PageFactory.initElements(driver, ProductSearchObjects.class);
		try {
			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//div[@id='search_autocomplete']//ul[@role='listbox']//li")));
			for (int i = 0; i < obj.list.size(); i++) {
				if (obj.list.get(i).getText().contains("shirts for men")) {
					obj.list.get(i).click();
					break;
				}
			}
		}

		catch (Exception e) {
			System.out.println("Error in selectFromList Method");
		}
	}

}
