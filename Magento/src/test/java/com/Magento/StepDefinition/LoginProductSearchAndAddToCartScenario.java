package com.Magento.StepDefinition;

import com.Magento.Pages.AddToCartPage;
import com.Magento.Pages.CustomerLoginPage;
import com.Magento.Pages.HomePageLogin;
import com.Magento.Pages.ProductSearchPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginProductSearchAndAddToCartScenario {
	
	@And("User clicks on the link Sign In")
	public void user_clicks_on_the_link_sign_in() throws Exception {
		HomePageLogin.clickSignIn();
	}

	@When("User entered {string} the Email")
	public void user_entered_the_email(String string) throws Exception {
		CustomerLoginPage.enteringEmail(string);
	}

	@And("User entered {string} the Password")
	public void user_entered_the_password(String string) throws Exception {
		CustomerLoginPage.enteringPassword(string);
	}

	@And("User clicks  Sign In Button")
	public void user_clicks_sign_in_button() throws Exception {
		CustomerLoginPage.clickSignInButton();
	}

	@Then("User Search for a Product {string}")
	public void user_search_for_a_product(String string) throws Exception {
		ProductSearchPage.searchForProduct(string);
	}

	@And("User Click or Select a product from the Search Results page")
	public void user_click_or_select_a_product_from_the_search_results_page() throws Exception {
		ProductSearchPage.selectFromList();
	}

	@And("User Click on Add to Cart.")
	public void user_click_on_add_to_cart() throws Exception {
		AddToCartPage.productAddToCart();
		AddToCartPage.clickOnSizeFromList();
		AddToCartPage.clickOnColorFromList("Blue");
		AddToCartPage.addToCartButton();
	}
	
	@Then("User Verify that the product is added to the cart")
	public void user_verify_that_the_product_is_added_to_the_cart() throws Exception {
		AddToCartPage.getAddedToCartMessage();
	}



}
