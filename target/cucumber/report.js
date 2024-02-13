$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:LoginTest.feature");
formatter.feature({
  "name": "test feature file",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.scenario({
  "name": "login using singe data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User launch browser and open the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_Test.user_launch_browser_and_open_the_URL()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click the email text box and enter the \"test34@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "Login_Test.user_click_the_email_text_box_and_enter_the(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click the password text box and enter the \"45678\"",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Test.user_click_the_password_text_box_and_enter_the(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Test.clicksubmitbutton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I validate the testresult",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});