package com.stepDefinition;

import com.base.BasePage;  
import com.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeSteps extends BasePage {
	HomePage homepage = new HomePage(driver);
	
	@Given("^I am on amazon homepage$")
	public void i_am_on_amazon_homepage(){
		System.out.println(homepage.getTitle());	
	}

	@When("^I verify logo$")
	public void i_verify_logo(){
		homepage.verifyLogo();
	}

	@When("^I verify title$")
	public void i_verify_title(){
		homepage.verifyTitle();
	}

	@When("^I verify menu$")
	public void i_verify_menu(){
		homepage.verifyMenu();
	}

	@When("^I verify searchbox$")
	public void i_verify_searchbox(){
		homepage.verifySearchBox();
	}
	
	@When("^I verifying title$")
	public void i_verifying_title(){
		homepage.verifyTitle2();
	}

	@Then("^Title verification should be unsuccesful$")
	public void title_verification_should_be_unsuccesful(){
		homepage.verifyTitle2();
	}
	
	@Given("^User is on amazon homepage$")
	public void user_is_on_amazon_homepage(){
	}

	@When("^User search \"([^\"]*)\" on searchbox$")
	public void user_search_on_searchbox(String item){
		homepage.SearchItem(item);
	}

	@When("^User select item$")
	public void user_select_item() throws InterruptedException{
		homepage.SelectItem();
	}

}
