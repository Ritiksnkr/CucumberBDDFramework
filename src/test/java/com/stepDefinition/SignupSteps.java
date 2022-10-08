package com.stepDefinition;

import com.base.BasePage;
import com.pages.SignupPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignupSteps extends BasePage {
	SignupPage signup = new SignupPage(driver);

	@When("^user clicks on signin/signup button$")
	public void user_clicks_on_signin_signup_button() {
		signup.SignInSignUp();
	}

	@Then("^user click on create new account$")
	public void user_click_on_create_new_account() {
		signup.createAccount();
	}

	@Then("^user  enter name as \"([^\"]*)\", mobile number as \"([^\"]*)\", and password as \"([^\"]*)\"$")
	public void user_enter_name_as_mobile_number_as_and_password_as(String arg1, String arg2, String arg3) {
		signup.enterDetails(arg1, arg2, arg3);
	}

	@Then("^user signed in$")
	public void user_signed_in() {
		signup.puzzle();
	}
	
	@Then("^user  enter name as \"([^\"]*)\", invalid mobile number as \"([^\"]*)\", and password as \"([^\"]*)\"$")
	public void user_enter_name_as_invalid_mobile_number_as_and_password_as(String arg1, String arg2, String arg3){
		signup.enterDetails(arg1, arg2, arg3);
	}

	@Then("^user registration unsuccesful$")
	public void user_registration_unsuccesful(){
		signup.SignUpError();
	}
}
