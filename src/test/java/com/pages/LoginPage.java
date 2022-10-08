package com.pages;

import org.openqa.selenium.By;   
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	private By signin = By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span");
	private By email = By.xpath("//input[@id='ap_email']");
	private By cont = By.xpath("//input[@id='continue']");
	private By error=By.xpath("//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span");
	private By password = By.xpath("//*[@id=\"ap_password\"]");
	private By submitBtn = By.xpath("//input[@id='signInSubmit']");
	private By menu = By.xpath("//*[@id=\"nav-hamburger-menu\"]/i");
	private By user= By.xpath("//*[@id=\"hmenu-customer-name\"]/b");
	private By pswrdError = By.xpath("//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span");

	public void clicksignin() {
		driver.findElement(signin).click();
	}

	public void enterEmail(String arg) {

		driver.findElement(email).sendKeys(arg);
	}
	
	public void clickContinue() {
		driver.findElement(cont).click();
	}
	

	public void enterPassword(String arg) {
		driver.findElement(password).sendKeys(arg);
	}

	public void clickOnSubmitBtn() throws InterruptedException {
		driver.findElement(submitBtn).click();
	}
	
	public void loggedin() {
		driver.findElement(menu).click();
		driver.findElement(user).isDisplayed();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public String errormssg() {
		return driver.findElement(error).getText();
		
	}
	
	public void passwordError() {
		String actualpswrdError = driver.findElement(pswrdError).getText();
		String expectedpswrdError = "Your password is incorrect";
		Assert.assertEquals(actualpswrdError, expectedpswrdError);
	}
	
}

