package com.bdd.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bdd.utility.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Test extends BaseClass{
	@Given("User launch browser and open the URL")
	public void user_launch_browser_and_open_the_URL() {
	  
	
	}

	@When("User click the email text box and enter the value")
	public void user_click_the_email_text_box_and_enter_the_value() throws InterruptedException, IOException {
		
		sigin.enteremail("test@gmaicm");
	  
	}

	@When("User click the password text box and enter the value")
	public void user_click_the_password_text_box_and_enter_the_value() throws IOException {
	   
		sigin.enterpass("12345");
	}
	
	@When("User click the email text box and enter the {string}")
	public void user_click_the_email_text_box_and_enter_the(String emai) throws InterruptedException, IOException {
		
		sigin.enteremail(emai);
	   
	}

	@When("User click the password text box and enter the {string}")
	public void user_click_the_password_text_box_and_enter_the(String pass) throws IOException {
		
		sigin.enterpass(pass);
	    
	}

	
	@When("User click the login button")
	public void clicksubmitbutton()
	{
		sigin.cicksubmit();
	}

	@Then("User validate whether it landed in homepage")
	public void user_validate_whether_it_landed_in_homepage() {
	
	 hmpg.verifyhmepagetite();
	}

	
	@Then("i vaidate {string} text in page tite")
	public void i_vaidate_text_in_page_tite(String expectedpagetite) {
	 
	}
}
