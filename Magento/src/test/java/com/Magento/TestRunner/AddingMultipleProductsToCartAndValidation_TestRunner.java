package com.Magento.TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\com.Magento.Feature\\5S_Adding Multiple Products to Cart And Validating Cart Summary.feature",
glue = {"com.Magento.StepDefinition"},
plugin= {"pretty","html:target/CucumberTestNgReport/Adding Multiple Products to Cart And Validating Cart Summary.html"})

public class AddingMultipleProductsToCartAndValidation_TestRunner extends AbstractTestNGCucumberTests{

}
