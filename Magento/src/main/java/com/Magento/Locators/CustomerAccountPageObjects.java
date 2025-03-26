package com.Magento.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Magento.Browser.Browser;

public class CustomerAccountPageObjects extends Browser{
	
	@FindBy(xpath="//div[@class=\"control\"]//input[@id=\"firstname\"]")
	public WebElement firstName;
	
	@FindBy(xpath="//div[@class=\"control\"]//input[@id=\"lastname\"]")
	public WebElement lastName;
	
	@FindBy(xpath="//div[@class=\"control\"]//input[@id=\"email_address\"]")
	public WebElement email;
	
	@FindBy(xpath="//div[@class=\"control\"]//input[@id=\"password\"]")
	public WebElement password;
	
	@FindBy(xpath="//div[@class=\"control\"]//input[@id=\"password-confirmation\"]")
	public WebElement confirmPassword;
	
	@FindBy(xpath="//div[@class=\"primary\"]//span[text()=\"Create an Account\"]")
	public WebElement createAccount;
	
	@FindBy(xpath="//div[@class=\"control\"]//div[@id=\"email_address-error\"]")
	public WebElement errorMessage;

}
