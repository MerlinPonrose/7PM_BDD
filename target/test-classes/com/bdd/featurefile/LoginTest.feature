@Test
Feature: test feature file


@sanity
Scenario: login using singe data
Given User launch browser and open the URL
When User click the email text box and enter the "test34@gmail.com"
And User click the password text box and enter the "45678"
And User click the login button
Then I validate the testresult