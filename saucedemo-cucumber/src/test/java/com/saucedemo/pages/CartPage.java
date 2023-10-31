package com.saucedemo.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.saucedemo.base.BaseUtil;

public class CartPage extends BaseUtil{

	//Elements
	private By _checkOutButton = By.xpath("//a[@href='./checkout-step-one.html']");
	
	
	//Methods
	public void verifyProductAddedToCartVisible(String productName) {
		WebElement product = driver.findElement(By.xpath("//div[@class='inventory_item_name'][contains(text(), '"+ productName+ "')]"));
		assertTrue("The Product is not Displayed!", product.isDisplayed());
		String productText = product.getText();
		assertTrue("Product is not added to cart: "+ productName, productText.contains(productName));
		
	}
	
	public void clickCheckOutButton() {
		driver.findElement(_checkOutButton).click();
	}
}
