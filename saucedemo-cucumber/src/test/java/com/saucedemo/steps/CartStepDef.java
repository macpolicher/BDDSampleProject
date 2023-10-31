package com.saucedemo.steps;

import com.saucedemo.base.BaseUtil;
import com.saucedemo.pages.CartPage;

import io.cucumber.java.en.*;

public class CartStepDef extends BaseUtil{

	CartPage cartPage = new CartPage();
	
	@When("I click checkout from my cart")
	public void i_click_checkout_from_my_cart() {
		cartPage.verifyProductAddedToCartVisible(productName);
		cartPage.clickCheckOutButton();
	}
}
