package com.Magento.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects_Logout {
	
//	@FindBy(xpath="xpath=\"//div[@class=\\\"panel header\\\"]//ul[@class=\\\"header links\\\"]//li[2]//a\"")
//	public WebElement signInLink;
//	
//	@FindBy(xpath="//ul[@class=\"header links\"]//li[3]")
//	public WebElement signOut;
	
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
	public WebElement signInLink;
	@FindBy(xpath="//div[1]/h1/span")
	public WebElement homePageText;
	@FindBy(xpath="//header/div[1]/div/ul/li[2]/span/button")
	public WebElement dropdown;
	@FindBy(xpath="//header/div[1]/div/ul/li[2]/div/ul/li[3]/a")
	public WebElement SignOut;
//	@FindBy(xpath="//input[@id='search']")
}