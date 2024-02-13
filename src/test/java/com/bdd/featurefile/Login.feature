Feature: Testing the login functionality of the application

Background:
When User click the email text box and enter the value
And User click the password text box and enter the value
And User click the login button

@test1
Scenario: Validate login with valid credentials
Then User validate whether it landed in homepage


Scenario: Add Product to cart
Then User validate whether it landed in homepage
When User search the product in searchicon
And User click AddToCartButton




