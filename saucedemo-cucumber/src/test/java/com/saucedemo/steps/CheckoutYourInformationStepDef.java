package com.saucedemo.steps;

import com.saucedemo.base.BaseUtil;
import com.saucedemo.pages.CheckoutYourInformationPage;

import io.cucumber.java.en.*;

public class CheckoutYourInformationStepDef extends BaseUtil{

	CheckoutYourInformationPage infoPage = new CheckoutYourInformationPage();
	
	@And("^I enter my first name (.*)$")
	public void i_enter_my_first_name(String firstName) {
		infoPage.inputFirstName(firstName);
	}
	
	@And("^I enter my last name (.*)$")
	public void i_enter_my_last_name_stark(String lastName) {
		infoPage.inputLastName(lastName);
	}
	
	@And("^I enter my Zip Code (.*)")
	public void i_enter_my_zip_code(String zipCode) {
		infoPage.inputZipCode(zipCode);
	}
	
	@And("I click continue from my checkout information page")
	public void i_click_continue_from_my_checkout_information_page() {
		infoPage.clickButtonContine();
	}
}
