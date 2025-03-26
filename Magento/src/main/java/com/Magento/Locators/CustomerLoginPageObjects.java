package com.Magento.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Magento.Browser.Browser;

public class CustomerLoginPageObjects extends Browser{
	
	@FindBy(xpath="//div[@class=\"control\"]//input[@id=\"email\"]")
	public WebElement enteringEmail;
	
	@FindBy(xpath="//div[@class=\"control\"]//input[@type=\"password\"]")
	public WebElement enteringPassword;
	
	@FindBy(xpath="//div[@class=\"primary\"]//button[@class=\"action login primary\"]//span[text()=\"Sign In\"]")
	public WebElement signInButton;
	
//	@FindBy(xpath="//div[@class=\"control\"]//div[@class=\"mage-error\"]")
	@FindBy(xpath="//*[@id=\"email-error\"]")
	public WebElement errorMessage;

}
//*[@id="email-error"]