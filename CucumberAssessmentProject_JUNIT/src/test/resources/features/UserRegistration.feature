@User-Register
Feature: User registeration with valid and invalid email address
 In order to validate the registration
 we will test with randomly generated valid and invalid email address
 
 Background:
Given I am on the home page of fashion website "http://automationpractice.com/index.php"
When I click on Sign in 

@User-Register-InvalidEmail
Scenario: Error message while registring with invalid email

And I enter "invalid" email address
And I click on Create an account button
Then I should see error message "Invalid email address."

@User-Register-ValidEmail
Scenario: Registration successful with valid email

And I enter a "valid" email in the Email address field
And I click on Create an account button
And I fill the user registration form with random generated values on Create An Account page
And I click on Register button
Then I should be successfully registered and land on "My Account" page

