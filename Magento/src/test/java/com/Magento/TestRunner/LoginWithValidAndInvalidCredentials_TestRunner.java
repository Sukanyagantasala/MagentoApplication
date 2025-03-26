package com.Magento.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\com.Magento.Feature\\4S_Login with Valid & Invalid Credentials.feature", 
glue = {"com.Magento.StepDefinition" }, 
plugin = { "pretty","html:target/CucumberTestNgReport/Login with Valid & Invalid Credentials_report.html" })

public class LoginWithValidAndInvalidCredentials_TestRunner extends AbstractTestNGCucumberTests {

}


