package com.gt.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Context {

	private WebDriver driver;
	
	ExcelManipulation excelReader = new ExcelManipulation();

	@Before
	public void setUp() {
		
		excelReader.getTestData();
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();		
		options.addArguments("--headless");
		
		driver = new ChromeDriver(options);		
		driver.get("https://www.matalan.co.uk/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}

	public WebDriver getDriver() {
		return driver;
	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
