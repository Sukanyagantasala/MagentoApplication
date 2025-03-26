package com.Magento.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Magento.Browser.Browser;

public class AddingSecondProductsObjects extends Browser{
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/a/span/span/img[@alt=\"Adrienne Trek Jacket\"]")
	public WebElement secondProduct;
	

}
