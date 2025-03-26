Feature:
Scenario Outline: Adding Multiple Products to Cart & Validating Cart Summary
Given User opens the Browser
And User navigates to the "https://magento.softwaretestingboard.com/" Webpage
And User Click the link SignIn in homepage
And User Enter the required details to Login
|TestData.xlsx|
And User Clicks on Signin button

# Search and Add First Product
And User Search for a '<Name>' Product
And User Select autosuggestion '<AutoSuggested1>' from List displayed
And User Select Product '<Product1>' in nextpage
And User Selects the Size,Color,Quantity in Search result page
|ProductDetails.xlsx|
And User Click on Add to Cart

# Search and Add Second Product
And User Search for a '<Name>' Product
And User Select autosuggestion '<AutoSuggested2>' from List displayed
And User Select Product '<Product2>' in nextpage
And User Selects the Size,Color,Quantity in Search result page
|ProductDetails.xlsx|
And User Click on Add to Cart

# Validate Cart Summary
And User Navigate to the cart page
And User Verify that the correct products and total price are displayed.
And User Closes the Browser
Examples:
|Name|AutoSuggested1|Product1|AutoSuggested2|Product2|
|men| mens T shirt|Balboa Persistence Tee| men jacket|Adrienne Trek Jacket|