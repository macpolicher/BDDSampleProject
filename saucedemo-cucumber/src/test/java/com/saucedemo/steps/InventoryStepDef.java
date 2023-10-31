package com.saucedemo.steps;

import com.saucedemo.base.BaseUtil;
import com.saucedemo.pages.InventoryPage;
import io.cucumber.java.en.*;

public class InventoryStepDef extends BaseUtil{
	InventoryPage inventoryPage = new InventoryPage();
	
	@Then("I should be able to see the product lists")
	public void i_should_be_able_to_see_the_product_lists() {
		inventoryPage.verifyProductVisible();
	}
	
	@When("^I add item to cart (.*)$")
	public void i_add_item_to_cart_sauce_labs_onesie(String itemName) {
		inventoryPage.addItemToCart(itemName);
		
	}
	
	@And("I view the cart")
	public void i_view_the_cart() {
		inventoryPage.viewCart();
	}
	
	
}
