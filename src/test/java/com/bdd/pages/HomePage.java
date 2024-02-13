package com.bdd.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bdd.utility.BaseClass;



public class HomePage extends BaseClass{
	
	public static By AddTCartButtn = By.xpath("//button[text()='Add to cart']");
	public static By searchBar = By.id("small-searchterms");
	
	public static By searchbar = By.xpath("//button[@type='submit']");
	
	public void verifyhmepagetite()
	{
		
		com.verifyPageTitle("demo store");
	}
	
	public void CickAddTCart()
	{
		com.clickElement(AddTCartButtn);
	
	}
	
	public void searchproductt() throws IOException
	{
		com.enterValue(searchBar, "Build your own computer");
	
		com.clickElement(searchbar);
	
	}

}
