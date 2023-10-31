package com.saucedemo.pages;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import com.saucedemo.base.BaseUtil;
public class CheckoutCompletePage extends BaseUtil{

	//Elements
	private By _logoPonyExpress = By.xpath("//img[@class='pony_express']");
	
	//Methods
	public void verifyPonyExpressLogoIsVisible() {
		boolean logoPresent = driver.findElement(_logoPonyExpress).isDisplayed();
		assertTrue("The Pony Express Logo is not Visible!", logoPresent);
	}
}
