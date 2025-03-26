package com.Magento.StepDefinition;

import com.Magento.Pages.AddingFirstProductsPage;
import com.Magento.Pages.AddingSecondProductPage;
import com.Magento.Pages.CartPage;
import com.Magento.Pages.CustomerLoginPage;
import com.Magento.Pages.HomePageLogin;
import com.Magento.Pages.SearchingMultipleProducts;
import org.apache.poi.ss.usermodel.DataFormatter;
import io.cucumber.java.en.And;
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

public class AddingMultipleProductsToCartAndValidatingCartSummaryScenario {

	@And("User Click the link SignIn in homepage")
	public void user_click_the_link_sign_in_in_homepage() throws Exception {
		HomePageLogin.clickSignIn();
	}

	@And("User Enter the required details to Login")
	public void user_enter_the_required_details_to_login(DataTable dataTable) throws Exception {
		List<List<String>> credentials = credentials(
	    "C:\\Users\\HELLO\\eclipse-workspace\\Magento\\src\\test\\resources\\com.Magento.Feature\\TestData.xlsx");
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
			if (row != null) {
				for (int j = 0; j < row.getLastCellNum(); j++) {
					Cell cell = row.getCell(j);
					if (cell != null) {
						rowData.add(cell.getStringCellValue());
					} else {
						rowData.add("");
					}
				}
			}
			credentials.add(rowData);
		}
		workbook.close();
		return credentials;
	}

	@And("User Clicks on Signin button")
	public void user_clicks_on_signin_button() throws Exception {
		CustomerLoginPage.clickSignInButton();
	}

	@And("User Search for a {string} Product")
	public void user_search_for_a_product(String string) throws Exception {
		SearchingMultipleProducts.searchForMultipleProducts(string);
	}

	@And("User Select autosuggestion {string} from List displayed")
	public void user_select_autosuggestion_from_list_displayed(String string) throws Exception {
		SearchingMultipleProducts.selectFromList(string);
		
	}

	@And("User Select Product {string} in nextpage")
	public void user_select_product_in_nextpage(String string) throws Exception {
		AddingFirstProductsPage.selectFirstProduct(string);
		AddingSecondProductPage.selectSecondProduct(string);
	}

	@And("User Selects the Size,Color,Quantity in Search result page")
	public void user_selects_the_size_color_quantity_in_search_result_page(DataTable dataTable) throws Exception {
		List<List<String>> credentials1 = credentials1(
			    "C:\\Users\\HELLO\\eclipse-workspace\\Magento\\src\\test\\resources\\com.Magento.Feature\\ProductDetails.xlsx");
				dataTable = DataTable.create(credentials1);
				System.out.println(dataTable.cell(0, 0));
				System.out.println(dataTable.cell(0, 1));
				System.out.println(dataTable.cell(0, 2));
				AddingFirstProductsPage.clickOnSizeFromList(dataTable.cell(0, 0));
				AddingFirstProductsPage.clickOnColorFromList(dataTable.cell(0, 1));
				AddingFirstProductsPage.quantityOfProduct(dataTable.cell(0, 2));
			}

			public static List<List<String>> credentials1(String excelFilePath) throws Exception {
				List<List<String>> credentials1 = new ArrayList<>();
				FileInputStream file = new FileInputStream(new File(excelFilePath));
				XSSFWorkbook workbook = new XSSFWorkbook(file);
				DataFormatter dataFormatter = new DataFormatter();

				Sheet sheet = workbook.getSheetAt(0);
				for (int i = 0; i <= sheet.getLastRowNum(); i++) {
					Row row = sheet.getRow(i);
					List<String> rowData = new ArrayList<>();
					if (row != null) {
						for (int j = 0; j < row.getLastCellNum(); j++) {
							Cell cell = row.getCell(j);
							if (cell != null) {
//								rowData.add(cell.getStringCellValue());
								rowData.add(dataFormatter.formatCellValue(cell));

							} else {
								rowData.add("");
							}
						}
					}
					credentials1.add(rowData);
				}
				workbook.close();
				return credentials1;
			}

	

	@And("User Click on Add to Cart")
	public void user_click_on_add_to_cart() throws Exception {
		AddingFirstProductsPage.addToCartButton();
		AddingFirstProductsPage.getAddedToCartMessage();
	}

	@And("User Navigate to the cart page")
	public void user_navigate_to_the_cart_page() throws Exception {
		CartPage.clickOnCartButton();
	}

	@And("User Verify that the correct products and total price are displayed.")
	public void user_verify_that_the_correct_products_and_total_price_are_displayed() throws Exception {
//		Assert.assertEquals(CartPage.getFisrtProduct(),"Radiant Tee");
//		Assert.assertEquals(CartPage.getSecondProduct(),"Selene Yoga Hoodie");
		Assert.assertEquals(CartPage.getTotalPrice(),"$127.00");

	}

}
