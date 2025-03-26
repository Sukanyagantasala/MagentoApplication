package com.Magento.Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import com.Magento.Browser.Browser;

public class AddToCartObjects extends Browser{
	
//	@FindBy(xpath="//main[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/div/div[4]/div/div[1]/form/button/span")
	
//	@FindBy(xpath="//div[@class=\"actions-primary\"]//form//button//span[text()=\"Add to Cart\"]")
	
	@FindBy(xpath="//div[@class=\"product-item-info\"]//span[@class=\"product-image-wrapper\"]//img[@alt=\"Chloe Compete Tank\"]")
	public WebElement addToCart;
	
	@FindAll(@FindBy(xpath="//div[@class=\"swatch-attribute-options clearfix\"]//div[@class=\"swatch-option text\"]"))
	public List <WebElement> sizeList;
	
	@FindAll(@FindBy(xpath="//div[@class=\"swatch-option color\"]"))
//	public WebElement colorList;
	public List<WebElement> colorList;
	
	@FindBy(xpath="//div[@class=\"control\"]//input[@type=\"number\"]")
	public WebElement quantityOfProduct;
	
	@FindBy(xpath="//div[@class=\"actions\"]//button//span[text()=\"Add to Cart\"]")
	public WebElement addToCartButton;
	
	@FindBy(xpath="//div[@data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]")
	public WebElement addedToCartMessage;

}
