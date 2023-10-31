package com.saucedemo.pages;


import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import com.saucedemo.base.BaseUtil;
public class LoginPage extends BaseUtil{

	//Elements
	private By _inputUsername = By.id("user-name");
	private By _inputPassword = By.id("password");
	private By _btnLogin = By.id("login-button");
	private By _txtLockedOutMessage = By.xpath("//h3[@data-test='error']");
	
	
	//Methods
	public void inputUsername(String username) {
		driver.findElement(_inputUsername).sendKeys(username);
	}
	public void inputPassword(String password) {
		driver.findElement(_inputPassword).sendKeys(password);
	}
	public void clickBtnLogin() {
		driver.findElement(_btnLogin).click();
	}
	
	public void verifyLockedOutMessageVisible() {
		String errorMessage = driver.findElement(_txtLockedOutMessage).getText();
		assertTrue("Error message is not correct: " + errorMessage, errorMessage.contains("Sorry, this user has been locked out."));
	}
	
}
