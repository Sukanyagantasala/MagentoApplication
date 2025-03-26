package com.Magento.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Magento.Browser.Browser;

public class MyAccountPageObjects extends Browser{
	
	
	@FindBy(xpath="//div[@data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]")
	public WebElement successfullyRegisteredMessage;
	
	@FindBy(xpath="//h1[@class=\"page-title\"]//span[text()=\"My Account']")
	public WebElement myAccountText;
	

}
