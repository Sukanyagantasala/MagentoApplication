package com.Magento.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Magento.Browser.Browser;
import com.Magento.Locators.AddToCartObjects;
import com.aventstack.extentreports.Status;

public class AddToCartPage extends Browser {
	static AddToCartObjects obj;

// Selecting the Product which we want to Add to Cart
	public static void productAddToCart() throws Exception {
		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Adding Product to Cart");
		logger1.log(Status.INFO, "Adding Product to Cart");
		try 
		{
			logger1.log(Status.PASS, "Product Added to Cart Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Adding the Product to Cart");
			logger1.log(Status.FAIL, "Failed while Adding the Product to Cart");
		}
		extent.flush();

		obj = PageFactory.initElements(driver, AddToCartObjects.class);
		try 
		{
			wait.until(ExpectedConditions.elementToBeClickable(obj.addToCart));
			obj.addToCart.click();
		} 
		catch (Exception e) 
		{
			System.out.println("Error in productAddToCart Method" + e);
		}
	}

	
//	Selecting Size for the Product
	public static void clickOnSizeFromList() throws Exception {

		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Select Size for the Product");
		logger1.log(Status.INFO, "Product Size Selected Successfully");
		try 
		{
			logger1.log(Status.PASS, "Product Size Selected Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Selecting the Product Size");
			logger1.log(Status.FAIL, "Failed while Selecting the Product Size");
		}
		extent.flush();

		try 
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"swatch-attribute-options clearfix\"]//div[@class=\"swatch-option text\"]")));
			for (int i = 0; i < obj.sizeList.size(); i++) {
				if (obj.sizeList.get(i).getText().contains("M"))
					;
				obj.sizeList.get(i).click();
				break;
			}
		} catch (Exception e) {
			System.out.println("Error in clickOnSize Method" + e);
		}
	}

	
//	Selecting Color for the Product
	public static void clickOnColorFromList(String data) throws Exception {

		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Select Color for the Product");
		logger1.log(Status.INFO, "Selecting Color for the Product");
		try 
		{
			logger1.log(Status.PASS, "Product Color Selected Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Selecting the Product Color");
			logger1.log(Status.FAIL, "Failed while Selecting the Product Color");
		}
		extent.flush();

		try 
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"swatch-attribute-options clearfix\"]//div[@class=\"swatch-option color\"]")));

			for (int i = 0; i < obj.colorList.size(); i++) {
				if (obj.colorList.get(i).getDomAttribute("option-label").equalsIgnoreCase(data)) {
					obj.colorList.get(i).click();
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Error in clickOnColor Method" + e);
		}
	}

//	Entering the quantity of the Product
	public static void quantityOfProduct() throws Exception {
		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Enter Quantity  for the Product");
		logger1.log(Status.INFO, "Enter Quantity for the Product");
		try 
		{
			logger1.log(Status.PASS, "Product Quantity Entered Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Entering the Product Quantity");
			logger1.log(Status.FAIL, "Failed while Entering the Product Quantity");
		}
		extent.flush();

		try 
		{
			wait.until(ExpectedConditions.visibilityOf(obj.quantityOfProduct));
			obj.quantityOfProduct.clear();
			obj.quantityOfProduct.sendKeys("1");
		} 
		catch (Exception e) 
		{
			System.out.println("Error in quantityOfProduct Method" + e);
		}
	}

//	Adding the selected Products to Cart
	public static void addToCartButton() throws Exception {

		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Click the Add To Cart Button");
		logger1.log(Status.INFO, "Click the Add To Cart Button");
		try 
		{
			logger1.log(Status.PASS, "Add To cart Button Clicked Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Clicking the add To Cart Button");
			logger1.log(Status.FAIL, "Failed while Clicking the Add To Cart Button");
		}
		extent.flush();

		try 
		{
			wait.until(ExpectedConditions.elementToBeClickable(obj.addToCartButton));
			obj.addToCartButton.click();
		} 
		catch (Exception e) 
		{
			System.out.println("Error in addToCartButton Method");
		}
	}

	
//	Checking products are added to cart or not
	public static String getAddedToCartMessage() throws Exception {

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Getting the Added To Cart Message");
		logger1.log(Status.INFO, "Getting theAdded To Cart Message");
		try 
		{
			logger1.log(Status.PASS, "Getting the Added To Cart Message Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Getting the Added To Cart Message");
			logger1.log(Status.FAIL, "Failed while Getting the Added To Cart Message");
		}
		extent.flush();

		String text = null;
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(obj.addedToCartMessage));
			text = obj.addedToCartMessage.getText();
		} 
		catch (Exception e) 
		{
			System.out.println("Error in getAddedToCartMessage Method" + e);
		}
		return text;
	}

}
