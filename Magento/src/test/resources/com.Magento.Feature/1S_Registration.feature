Feature: : User Registration
Background: 
Given User opens the Browser
And User navigates to the "https://magento.softwaretestingboard.com/" Webpage
And User click on the link Create Account

Scenario Outline: User Registration with Invalid Data Handling
When User enters '<First Name>' the First Name
And User enters '<Last Name>' the Last Name
And User enters '<Email>' the Email
And User enters '<Password>' the Password
And User enters '<Confirm Password>' the Confirm Password
And User clicks on the Create Account Button
Then User verifies the Error Message '<ErrorMessage>'
And User closes the Browser
Examples:
|First Name|Last Name|Email|Password|Confirm Password|ErrorMessage|
|Sukanya|Gantasala|saisukanya|SaiSukanya@123|SaiSukanya@123|Please enter a valid email address (Ex: johndoe@domain.com).|

Scenario Outline: User Registration with Valid Data Handling
When User enters '<First Name>' the First Name
And User enters '<Last Name>' the Last Name
And User enters '<Email>' the Email
And User enters '<Password>' the Password
And User enters '<Confirm Password>' the Confirm Password
And User clicks on the Create Account Button
Then User verifies that the user is registered successfully '<SuccessMessage>'
And User closes the Browser
Examples:
|First Name|Last Name|Email|Password|Confirm Password|SuccessMessage|
|Sukanya|Gantasala|saisukanya39@gmail.com|SaiSukanya@123|SaiSukanya@123|Thank you for registering with Main Website Store.|
