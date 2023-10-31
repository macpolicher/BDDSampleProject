package com.saucedemo.steps;
import com.saucedemo.base.BaseUtil;
import com.saucedemo.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDef extends BaseUtil{
	LoginPage loginPage = new LoginPage();
	
	@Before
	public void setUp() {
		//Initialize the WebDriver before each scenario
		setUpWebDriver();
	}
	
	@After
	public void tearDown() {
		//quit the driver after each scenario is finished
		driver.quit();
	}
	
	@Given("I am on Sauce Demo Login Page")
	public void i_am_on_sauce_demo_login_page() {
		//Go to Sauce Demo Site
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
	}

	@When("^I enter username (.*) in the username field$")
	public void i_enter_username_in_the_username_field(String username) {
		loginPage.inputUsername(username);
	}


	@And("^I enter password (.*) in the password field$")
	public void i_enter_password_in_the_password_field(String password) {
		loginPage.inputPassword(password);
	}
	
	@And("I click the login button")
	public void i_click_the_login_button() {
		loginPage.clickBtnLogin();
	}
	
	@Then("I should be able to see the locked out message")
	public void i_should_be_able_to_see_the_locked_out_message() {
		loginPage.verifyLockedOutMessageVisible();
	}

}
