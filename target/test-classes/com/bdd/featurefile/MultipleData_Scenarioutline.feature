@Multipledata
Feature: Testing the login functionality with mutipe test data


Scenario Outline: login using mutipe data
Given User launch browser and open the URL
When User click the email text box and enter the "<Emai>"
And User click the password text box and enter the "<Pass>"
And User click the login button

Examples:
|Emai|Pass|
|test@gmail.com|123456|
|abc@test.com|123456|
|test01@gmail.com|1256|
|test03@gmail.com|1236|
