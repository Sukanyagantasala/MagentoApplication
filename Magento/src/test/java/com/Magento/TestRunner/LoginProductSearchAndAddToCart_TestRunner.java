package com.Magento.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\com.Magento.Feature\\2S_Login,Product Search and Add to Cart.feature",
glue = {"com.Magento.StepDefinition"},
plugin= {"pretty","html:target/CucumberTestNgReport/Login,Product Search and Add to Cart_report.html"})


public class LoginProductSearchAndAddToCart_TestRunner extends AbstractTestNGCucumberTests{

}
