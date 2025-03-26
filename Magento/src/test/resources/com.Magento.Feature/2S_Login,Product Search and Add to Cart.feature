Feature: 
Scenario Outline: Login, Product Search and Add to Cart
Given User opens the Browser
And User navigates to the "https://magento.softwaretestingboard.com/" Webpage
And User clicks on the link Sign In
When User entered '<Email>' the Email
And User entered '<Password>' the Password
And User clicks  Sign In Button
Then User Search for a Product '<Product>'
And User Click or Select a product from the Search Results page
And User Click on Add to Cart.
Then User Verify that the product is added to the cart
And User closes the Browser
Examples: 
|Email|Password|Product|
|saisukanya@gmail.com|SaiSukanya@123|Shirts|


