package com.Magento.Browser;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Browser {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions act;
	public static JavascriptExecutor js;
	
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	public static ExtentTest logger1;
	
	
	public static void init(String reportName)
	{
		extent=new ExtentReports();
		reporter=new ExtentSparkReporter
		(System.getProperty("user.dir")+"//target//ExtentReports//"+reportName+".html");
	}
	
//	Open the browser based on the choice
	
	public static void openBrowser()throws Exception
	{
		// code to generate "Extent Report"
		
		extent.attachReporter(reporter);
		logger1=extent.createTest("Open Browser");
		logger1.log(Status.INFO, "Opening the Browser");
		try
		{
			logger1.log(Status.PASS, "Browser Opened Successfully");
		
		}
		catch(Exception e)
		{
			System.out.println("Error in opeening the Browser");
			logger1.log(Status.FAIL, "Failed while Opening the Browser");
		}
		extent.flush();
		
		try
		{
			String choice=Utility.properties("browser");
			if (choice.equalsIgnoreCase("Chrome"))
            	driver = new ChromeDriver();
			else if (choice.equalsIgnoreCase("Edge"))
            	driver = new EdgeDriver();


		}
		catch(Exception e)
		{
			System.out.println("Exception in openBrowser Method" +e);
		}
	}
	
//	Method for Navigating To URL
	public static void navigateToUrl(String str) throws Exception {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Navigate URL");
		logger1.log(Status.INFO, "Navigating to the URL");
		try
		{
			logger1.log(Status.PASS, "Successfully navigated to the URL Page");
		}
		
		catch(Exception e)
		{
			System.out.println("Error in navigating the URL");
			logger1.log(Status.FAIL, "Failed while navigating to the URL");
		}
		extent.flush();
		
		try
		{
			driver.get(str);
			driver.manage().window().maximize();
			act=new Actions(driver);
			wait=new WebDriverWait(driver,Duration.ofSeconds(20));
			js=(JavascriptExecutor)driver;
		}
		catch(Exception e)
		{
			System.out.println("Exception in navigateToUrl method" +e);
		}
	}
	
// Method for Closing the Browser
	public static void closeBrowser() throws Exception{
		
		extent.attachReporter(reporter);
		logger1=extent.createTest("Close Browser");
		logger1.log(Status.INFO, "Closing the Browser");
		try
		{
			logger1.log(Status.PASS, "Browser Closed Successfully");
		}
		
		catch(Exception e)
		{
			System.out.println("Error in closing the Browser");
			logger1.log(Status.FAIL, "Failed while Closing the Browser");
		}
		extent.flush();
		
		try
		{
			driver.quit();
		}
		catch(Exception e)
		{
			System.out.println("Exception in closeBrowser method" +e);
		}
	}
}
