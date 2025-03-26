package com.Magento.TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\com.Magento.Feature\\6S_Logging Out and Verifying Session End.feature", 
glue = {"com.Magento.StepDefinition" }, 
plugin = { "pretty","html:target/CucumberTestNgReport/Logging Out and Verifying Session End_report.html" })

public class LoggingOutAndVerifyingSessionEnd_TestRunner extends AbstractTestNGCucumberTests{

}
