package com.bdd.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bdd.utility.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePage_Test extends BaseClass{
	
	@When("User search the product in searchicon")
	public void searchproduct() throws IOException
	{
		
		hmpg.searchproductt();
	}

	@When("User click AddToCartButton")
	public void clickAddToCart()
	{
		hmpg.CickAddTCart();
	}
}
