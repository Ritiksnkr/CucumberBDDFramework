package com.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.testng.Assert; 

import com.base.BasePage; 
import com.pages.LoginPage;

import DataProvider.ConfigFileReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginSteps extends BasePage {
	LoginPage loginpage = new LoginPage(driver);
	
	@Given("^user is on amazon homepage$")
	public void user_is_on_amazon_homepage() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^user clicks on signin$")
	public void user_clicks_on_signin() {
		loginpage.clicksignin();
	}

	@Then("^user enter email or mobile number$")
	public void user_enter_email_or_mobile_number() {
		loginpage.enterEmail(ConfigFileReader.getProperty("userId"));
		
	}

	@Then("^user click on continue$")
	public void user_click_on_continue(){
		loginpage.clickContinue();
	}

	@Then("^user enter password$")
	public void user_enter_password(){
		loginpage.enterPassword(ConfigFileReader.getProperty("password"));
	}

	@Then("^user click on submit$")
	public void user_click_on_submit() throws InterruptedException {
		loginpage.clickOnSubmitBtn();
		
	}

	@Then("^user logged in$")
	public void user_logged_in(){
		loginpage.loggedin();
	}
	
	@Then("^close browser$")
	public void close_browser() {
		loginpage.closeBrowser();
	}
	
	@Then("^user enter invalid email or mobile number$")
	public void user_enter_invalid_email_or_mobile_number(){
		loginpage.enterEmail(ConfigFileReader.getProperty("userID2"));
	}

	@Then("^user should not move further$")
	public void user_should_not_move_further(){
		String actualError = loginpage.errormssg();
		String expectedError = "We cannot find an account with that mobile number";
		Assert.assertEquals(actualError, expectedError);
	}
	
	@Then("^user enter valid mobile number as \"([^\"]*)\"$")
	public void user_enter_valid_mobile_number_as(String arg1){
		loginpage.enterEmail(arg1);
	}

	@Then("^user enter password as \"([^\"]*)\"$")
	public void user_enter_password_as(String arg1){
		loginpage.enterPassword(arg1);
	}
	
	@Then("^user click on signIn button$")
	public void user_click_on_signIn_button() throws InterruptedException{
		loginpage.clickOnSubmitBtn();
	}

	@Then("^user should not logged in$")
	public void user_should_not_logged_in(){
		loginpage.passwordError();
	}
}
