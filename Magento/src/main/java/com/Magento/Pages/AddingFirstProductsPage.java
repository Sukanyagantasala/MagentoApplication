package com.Magento.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Magento.Browser.Browser;
import com.Magento.Locators.AddingFirstProductsObjects;
import com.aventstack.extentreports.Status;

public class AddingFirstProductsPage extends Browser {
	static AddingFirstProductsObjects obj;

//	Selecting the Product 
	public static void selectFirstProduct(String data) throws Exception {

		// code to generate "Extent Report"
		extent.attachReporter(reporter);
		logger1 = extent.createTest("Select First Product");
		logger1.log(Status.INFO, "Selecting First product");
		try 
		{
			logger1.log(Status.PASS, "First Product Selected Successfully");

		} 
		catch (Exception e) 
		{
			System.out.println("Error in Selecting the First Product");
			logger1.log(Status.FAIL, "Failed while Selecting the First Product");
		}
		extent.flush();

		obj = PageFactory.initElements(driver, AddingFirstProductsObjects.class);
		try 
		{
//			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/a/span/span/img")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[2]/div/a/span/span/img")));
			js.executeScript("arguments[0].scrollIntoView(true);", obj.firstProduct);
			js.executeScript("arguments[0].click();", obj.firstProduct);
			obj.firstProduct.click();
		} 
		catch (Exception e) 
		{
			System.out.println("Exception in selectFirstProduct" + e);
		}
	}

//	Selecting Size for the product
	
	public static void clickOnSizeFromList(String data) throws Exception {

		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Select Size for the Product");
		logger1.log(Status.INFO, "Select Size for the Product");
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

		obj = PageFactory.initElements(driver, AddingFirstProductsObjects.class);
		try 
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='product-options-wrapper']/div/div/div[1]/div/div")));
			for (int i = 0; i < obj.sizeList.size(); i++) {
				if (obj.sizeList.get(i).getText().equalsIgnoreCase(data)) {
					js.executeScript("arguments[0].click()", obj.sizeList.get(i));
					break;

				}
			}
		} catch (Exception e) {
			System.out.println("Error in clickOnSizeFromMethod Method" + e);
		}
	}

//	Selecting Color for the Product
	public static void clickOnColorFromList(String data) throws Exception {

		// code to generate "Extent Report"

		extent.attachReporter(reporter);
		logger1 = extent.createTest("Select Color for the Product");
		logger1.log(Status.INFO, "Select Color for the Product");
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

		obj = PageFactory.initElements(driver, AddingFirstProductsObjects.class);
		try 
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"swatch-option color\"]")));
			for (int i = 0; i < obj.colorList.size(); i++) {
				if (obj.colorList.get(i).getDomAttribute("option-label").equalsIgnoreCase(data)) {
					obj.colorList.get(i).click();
					break;
				}
			}

		} 
		catch (Exception e) 
		{
			System.out.println("Error in clickOnColorFromList Method" + e);
		}
	}

//	Entering Quantity for the Product
	public static void quantityOfProduct(String data) throws Exception {

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
			wait.until(ExpectedConditions.elementToBeClickable(obj.quantityOfProduct));
			obj.quantityOfProduct.clear();
			obj.quantityOfProduct.sendKeys(data);
		} 
		catch (Exception e) 
		{
			System.out.println("Error in quantityOfProduct Method" + e);
		}
	}


//	Adding the Selected Product to Cart
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

		// code to generate "Extent Report"

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
