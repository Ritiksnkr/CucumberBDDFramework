package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;

public class SignupPage {
	WebDriver driver;
	LoginPage login;

	public SignupPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By logInSignUpPage = By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span");
	By clickSignUp = By.xpath("//*[@id=\"createAccountSubmit\"]");
	By uname = By.id("ap_customer_name");
	By umob = By.xpath("//*[@id=\"ap_phone_number\"]");
	By pswrd = By.xpath("//*[@id=\"ap_password\"]");
	By submit = By.xpath("//*[@id=\"continue\"]");
	By otp = By.id("auth-pv-enter-code");
	By puzl= By.xpath("//*[@id=\"cvf-page-content\"]/div/div/div/div[1]/span");
	By signUperror = By.xpath("//*[@id=\"auth-phoneNumber-invalid-phone-alert\"]/div/div");
	
	
	public void SignInSignUp() {
		driver.findElement(logInSignUpPage).click();
		
	}
	public void createAccount() {
		driver.findElement(clickSignUp).click();
	}
	
	public void enterDetails(String ar1, String ar2, String ar3) {
		driver.findElement(uname).sendKeys(ar1);
		driver.findElement(umob).sendKeys(ar2);
		driver.findElement(pswrd).sendKeys(ar3);
	}
	public void clickContinue() {
		driver.findElement(submit).click();
	}
	public void puzzle() {
		String actual = driver.findElement(puzl).getText();
		String expected="Solve this puzzle to protect your account";
		Assert.assertEquals(expected, actual);
	}
	public void SignUpError() {
		String actualsignupError = driver.findElement(signUperror).getText();
		String expectedsignupError = "The mobile number you entered does not seem to be valid";
		Assert.assertEquals(actualsignupError, expectedsignupError);
	}
}

