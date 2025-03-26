package com.Magento.Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import com.Magento.Browser.Browser;

public class AddingFirstProductsObjects extends Browser{
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[2]/div/a/span/span/img")
	public WebElement firstProduct;
	//*[@id="maincontent"]/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/a/span/span/img
	
	@FindAll(@FindBy(xpath="//div[@class=\"swatch-attribute-options clearfix\"]//div[@class=\"swatch-option text\"]"))
	public List <WebElement> sizeList;
	
	@FindAll(@FindBy(xpath="//div[@class=\"swatch-option color\"]"))
	public List <WebElement> colorList;
	
	@FindBy(xpath="//div[@class=\"control\"]//input[@type=\"number\"]")
	public WebElement quantityOfProduct;
	
	@FindBy(xpath="//div[@class=\"actions\"]//button[@title=\"Add to Cart\"]//span")
	public WebElement addToCartButton;
	
	@FindBy(xpath="//div[@data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]")
	public WebElement addedToCartMessage;

	
	
	

}
