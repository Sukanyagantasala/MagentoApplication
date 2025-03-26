package com.Magento.StepDefinition;

import com.Magento.Pages.CustomerLoginPage;

import com.Magento.Pages.HomePage_Logout;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoggingOutAndVerifyingSessionEndScenario {
	
	@And("User click on the link Sign In")
	public void user_click_on_the_link_sign_in() throws Exception {
		 HomePage_Logout.signInLink();
	    
	}

	@When("User enters the Valid Login Credentials")
	public void user_enters_the_valid_login_credentials(DataTable dataTable) throws Exception {
		
		List<List<String>> credentials = credentials
		("C:\\Users\\HELLO\\eclipse-workspace\\Magento\\src\\test\\resources\\com.Magento.Feature\\TestData.xlsx");
		dataTable = DataTable.create(credentials);
		System.out.println(dataTable.cell(0, 0));
		System.out.println(dataTable.cell(0, 1));
		CustomerLoginPage.enteringEmail(dataTable.cell(0, 0));
		CustomerLoginPage.enteringPassword(dataTable.cell(0, 1));
	}
	public static List<List<String>> credentials(String excelFilePath) throws Exception {
		List<List<String>> credentials = new ArrayList<>();
		FileInputStream file = new FileInputStream(new File(excelFilePath));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheetAt(0);
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			List<String> rowData = new ArrayList<>();
			if(row!=null) {
				for(int j=0;j<row.getLastCellNum();j++) {
					Cell cell=row.getCell(j);
					if(cell!=null) {
						rowData.add(cell.getStringCellValue());
					}else {
						rowData.add("");
					}
				}
			}
		credentials.add(rowData);
		}
	workbook.close();
	return credentials;
	}


	 
	

	@And("User clicks  the Sign In Button")
	public void user_clicks_the_sign_in_button() throws Exception {
	  CustomerLoginPage.clickSignInButton();
	}
	

	@And("User Click Logout from My Account")
	public void user_click_logout_from_my_account() {
		HomePage_Logout.dropDown();
		HomePage_Logout.signOut();
	    
	}

	@Then("User Verify that the session ends and the user is redirected to the homepage")
	public void user_verify_that_the_session_ends_and_the_user_is_redirected_to_the_homepage() {
		Assert.assertEquals(HomePage_Logout.homePageText(),"You are signed out");

	}




}
