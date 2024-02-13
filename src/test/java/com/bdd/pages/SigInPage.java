package com.bdd.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;





public class SigInPage extends com.bdd.utility.BaseClass{
	
	public static By Email = By.id("Email");
	
	public static By Pass = By.id("Password");
	
	public static By Submit = By.xpath("(//button[@type='submit'])[2]");
	
	
	public void enteremail(String emai) throws InterruptedException, IOException
	{
			com.enterValue(Email,emai);
			Thread.sleep(2000);
	}
	
	public void enterpass(String pass) throws IOException
	{
		com.enterValue(Pass,pass);
	}
	
	public void cicksubmit()
	{
		com.clickElement(Submit);
	}
	

}
