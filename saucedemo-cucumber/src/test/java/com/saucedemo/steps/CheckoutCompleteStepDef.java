package com.saucedemo.steps;

import com.saucedemo.base.BaseUtil;
import com.saucedemo.pages.CheckoutCompletePage;
import io.cucumber.java.en.Then;

public class CheckoutCompleteStepDef extends BaseUtil{

	CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();
	
	@Then("I should be able to see the pony express logo")
	public void i_should_be_able_to_see_the_pony_express_logo() {
		checkoutCompletePage.verifyPonyExpressLogoIsVisible();
	}
}
