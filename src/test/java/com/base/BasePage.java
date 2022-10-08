package com.base;

import java.io.IOException; 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import DataProvider.ConfigFileReader;

public class BasePage {
	public static WebDriver driver;

	public static void InitializeUrl() throws IOException {
		if (ConfigFileReader.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/ritiksonker/Downloads/chromedriver_win32 (1)/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (ConfigFileReader.getProperty("browser").equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:/Users/ritiksonker/Downloads/edgedriver_win64/msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (ConfigFileReader.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:/Users/ritiksonker/Downloads/geckodriver-v0.31.0-win64/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(ConfigFileReader.getProperty("implicitime")),
				TimeUnit.SECONDS);
		driver.get(ConfigFileReader.getProperty("url"));
	}
	
	public static void teardown() {
		driver.quit();
	}

}
