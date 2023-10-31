package com.saucedemo.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtil {
	//Global variables
	public static String productName;
	
	
	//WebDriver setup
	public static WebDriver driver;
	public void setUpWebDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	

	public void tearDown() {
		driver.quit();
	}


}
