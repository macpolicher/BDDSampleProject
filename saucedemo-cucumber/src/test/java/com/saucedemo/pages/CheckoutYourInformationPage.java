package com.saucedemo.pages;

import org.openqa.selenium.By;

import com.saucedemo.base.BaseUtil;

public class CheckoutYourInformationPage extends BaseUtil {

	//Elements
	By _inputFirstName = By.id("first-name");
	By _inputLastName = By.id("last-name");
	By _inputZipCode = By.id("postal-code");
	By _buttonContinue = By.xpath("//input[@type='submit']");
	
	
	//Methods
	
	public void inputFirstName(String firstName) {
		driver.findElement(_inputFirstName).sendKeys(firstName);
	}
	public void inputLastName(String lastName) {
		driver.findElement(_inputLastName).sendKeys(lastName);
	}
	public void inputZipCode(String zipCode) {
		driver.findElement(_inputZipCode).sendKeys(zipCode);
	}
	public void clickButtonContine() {
		driver.findElement(_buttonContinue).click();
	}
	
}
