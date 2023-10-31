package com.saucedemo.steps;

import com.saucedemo.base.BaseUtil;
import com.saucedemo.pages.CheckoutOverviewPage;

import io.cucumber.java.en.*;

public class CheckoutOverviewStepDef extends BaseUtil{

	CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();
	
	@When("I click on finish")
	public void i_click_on_finish() {
		checkoutOverviewPage.clickFinishButon();
	}
	
}
