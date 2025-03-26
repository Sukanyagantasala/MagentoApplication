package com.Magento.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartObjects {
	
	@FindBy(xpath="//div[@class=\"minicart-wrapper\"]")
	public WebElement clickOnCartButton;
	
	@FindBy(xpath="//*[@id=\"mini-cart\"]/li[2]/div/div/strong/a")
	public WebElement getFisrtProduct;
	
	@FindBy(xpath="//*[@id=\"mini-cart\"]/li[1]/div/div/strong/a")
	public WebElement getSecondProduct;
	
	@FindBy(xpath="//*[@id=\"minicart-content-wrapper\"]/div[2]/div[2]/div/span/span")
	public WebElement getTotalPrice;

}
