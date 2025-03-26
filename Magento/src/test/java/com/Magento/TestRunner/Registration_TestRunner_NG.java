package com.Magento.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\com.Magento.Feature\\1S_Registration.feature",
glue = {"com.Magento.StepDefinition"},
plugin= {"pretty","html:target/CucumberTestNgReport/registration_report.html"})


public class Registration_TestRunner_NG extends AbstractTestNGCucumberTests{

}
