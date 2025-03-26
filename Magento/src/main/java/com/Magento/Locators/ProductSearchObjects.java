package com.Magento.Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import com.Magento.Browser.Browser;

public class ProductSearchObjects extends Browser{
	
	@FindBy(xpath="//div[@class=\"control\"]//input[@id=\"search\"]")
	public WebElement Search;
	
	@FindAll(@FindBy(xpath="//div[@id='search_autocomplete']//ul[@role='listbox']//li"))
	public List <WebElement> list; 

}
//div[@id="search_autocomplete"]//ul[@role="listbox"]//li