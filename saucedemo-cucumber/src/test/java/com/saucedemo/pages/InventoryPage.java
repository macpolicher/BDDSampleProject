package com.saucedemo.pages;

import static org.junit.Assert.assertTrue;


import org.openqa.selenium.By;
import com.saucedemo.base.BaseUtil;

public class InventoryPage extends BaseUtil{

	//Elements
	private By _productText = By.xpath("//div[@class='product_label']");
	private By _viewCart = By.xpath("//a[@href='./cart.html']");
	
	
	//Methods
	public void verifyProductVisible() {
		boolean displayed = driver.findElement(_productText).isDisplayed();
		assertTrue("The Product Label is not displayed!", displayed);
		
	}
	
	public void addItemToCart(String addedProductName){
		driver.findElement(By.xpath("//div[@class='inventory_item_name'][text()='"+ addedProductName+ "']"
				+ "/ancestor::div[@class='inventory_item']//button[text()='ADD TO CART']")).click();
		
		productName = addedProductName;
	}
	
	public void viewCart() {
		driver.findElement(_viewCart).click();
	}
	

}
