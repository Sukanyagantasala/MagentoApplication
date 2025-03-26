Feature: Login with Valid & Invalid Credentials
Background: 
Given User opens the Browser
And User navigates to the "https://magento.softwaretestingboard.com/" Webpage
And click on the link Sign In
 
Scenario Outline: Login with Invalid Credentials
When User enter '<Email>' the Email
And User enter '<Password>' the Password
And User clicks on the Sign In Button
Then User verify the Error Message '<ErrorMessage>'
And User Closes the Browser
Examples: 
|Email|Password|ErrorMessage|
|saisukanya|SaiSukanya@123|Please enter a valid email address (Ex: johndoe@domain.com).|

Scenario Outline: Login with Valid Credentials
When User enter '<Email>' the Email
And User enter '<Password>' the Password
And User clicks on the Sign In Button
Then User Verify that Home Page is displayed after login '<Home Page>'
And User Closes the Browser
Examples: 
|Email|Password|Home Page|
|saisukanya@gmail.com|SaiSukanya@123|Home Page|