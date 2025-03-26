Feature:  Logging Out and Verifying Session End
Scenario: 
Given User opens the Browser
And User navigates to the "https://magento.softwaretestingboard.com/" Webpage
And User click on the link Sign In
When User enters the Valid Login Credentials
|TestData.xlsx|
And User clicks  the Sign In Button
And User Click Logout from My Account
Then User Verify that the session ends and the user is redirected to the homepage
And User Closes the Browser
