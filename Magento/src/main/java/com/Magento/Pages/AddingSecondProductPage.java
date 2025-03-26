package com.Magento.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Magento.Browser.Browser;
import com.Magento.Locators.AddingSecondProductsObjects;
import com.aventstack.extentreports.Status;

public class AddingSecondProductPage extends Browser {
	static AddingSecondProductsObjects obj;

// Selecting the Product
	public static void selectSecondProduct(String data) throws Exception {
		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Select Second Product");
		logger1.log(Status.INFO, "Selecting Second Product");
		try 
		{
			logger1.log(Status.PASS, "Second Product Selected Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Selecting the Second Product");
			logger1.log(Status.FAIL, "Failed while Selecting the Second Product");
		}
		extent.flush();

		obj = PageFactory.initElements(driver, AddingSecondProductsObjects.class);
		try 
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/a/span/span/img[@alt=\"Adrienne Trek Jacket\"]")));
			js.executeScript("arguments[0].scrollIntoView(true);", obj.secondProduct);
			js.executeScript("arguments[0].click();", obj.secondProduct);
			obj.secondProduct.click();
		} 
		catch (Exception e) 
		{
			System.out.println("Exception in selectSecondProduct" + e);
		}
	}

}
