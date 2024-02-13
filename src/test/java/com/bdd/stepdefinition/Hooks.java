package com.bdd.stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import com.bdd.utility.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass{
	
	@Before(order=1)
	public void precnditin()
	{
		WebDriverManager.chromedriver().setup();
		
		driver	 = new ChromeDriver();
			
	driver.manage().window().maximize();


	driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
	}
	
	@Before(order=2)
	public void precnditin2()
	{
		System.out.println("Precnditin2");
	}
	
	@Before("@test1")
	public void precoditiontest()
	{
		System.out.println("Pre condition test");
	}
	
	@After("@test1")
	public void postcoditiontest()
	{
		System.out.println("Post condition test");
	}
	
	
	@After(order=2)
	public void pstcnditin()
	{
		driver.close();
		System.out.println("Pstcnditin");
	}

	@After(order=1)
	public void pstcnditin2()
	{
		
		System.out.println("Pstcnditin2");
	}

}
