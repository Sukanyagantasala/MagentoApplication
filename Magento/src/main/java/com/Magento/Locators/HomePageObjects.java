package com.Magento.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Magento.Browser.Browser;

public class HomePageObjects extends Browser{
	
	@FindBy(xpath="//div[@class=\"panel header\"]//ul[@class=\"header links\"]//li[3]//a")
	public WebElement createAccountLink;
	
	@FindBy(xpath="//div[@class=\"panel header\"]//ul[@class=\"header links\"]//li[2]//a")
	public WebElement signInLink;
	
	@FindBy(xpath="//span[text()='Home Page']")
	public WebElement homePageText;

}
