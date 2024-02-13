package com.bdd.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestFile {
	
	@Given("to test precondition")
	public void to_test_precondition() {
	  
		  System.out.println("In Given statement");
	}

	@When("To test action steps")
	public void to_test_action_steps() {
	 
		  System.out.println("In when statement");
	}

	@Then("To test expcted result")
	public void to_test_expcted_result() {
	   System.out.println("In Then statement");
	}


}
