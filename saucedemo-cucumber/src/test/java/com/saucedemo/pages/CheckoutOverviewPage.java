package com.saucedemo.pages;

import org.openqa.selenium.By;

import com.saucedemo.base.BaseUtil;

public class CheckoutOverviewPage extends BaseUtil{

	//Elements
	private By _btnFinish = By.xpath("//a[@href='./checkout-complete.html']");
	
	
	
	//Methods
	public void clickFinishButon() {
		driver.findElement(_btnFinish).click();
	}
}
