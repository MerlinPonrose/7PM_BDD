package com.bdd.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bdd.pages.HomePage;
import com.bdd.pages.SigInPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	
	
	public static SigInPage sigin = new SigInPage();
	
	public static HomePage hmpg = new HomePage();
	
	public static Selenium_Common com = new Selenium_Common();
	
	
	//public static ExtentSparkReporter spark;
	
	
	
}
