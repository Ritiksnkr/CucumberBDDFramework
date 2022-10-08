package com.pages;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import DataProvider.ConfigFileReader;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By logo = By.id("nav-logo-sprites");
	private By searchbox = By.xpath("//*[@id=\"twotabsearchtextbox\"]");
	private By clickSearch = By.xpath("//*[@id=\"nav-search-submit-button\"]");
	private By selectItem =By.linkText("Apple iPhone 13 (128GB) - Midnight");
	private By menu = By.xpath("//*[@id=\"nav-hamburger-menu\"]/span");
	
	
	public String getTitle() {
		return driver.getTitle();
	}
	public void verifyLogo() {
		driver.findElement(logo).isDisplayed();
	}
	
	public void verifyTitle() {
		driver.get(ConfigFileReader.getProperty("url"));
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	
	public void verifyMenu() {
		driver.findElement(menu).isSelected();
	}
	
	public void verifySearchBox() {
		driver.findElement(searchbox).isEnabled();
	}
	
	public void verifyTitle2() {
		driver.get(ConfigFileReader.getProperty("url"));
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More ";
		Assert.assertNotEquals(ActualTitle, ExpectedTitle);
	}
	
	public void SearchItem(String item) {
		driver.findElement(searchbox).sendKeys(item);
		driver.findElement(clickSearch).click();
	}
	
	public void SelectItem() {
		driver.findElement(selectItem).click();
	}
	
}