package com.gt.utils;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	WebDriver driver;
	WebDriverWait wait;

	public Base(WebDriver driver) {
		this.driver = driver;
	}

	public void validatePageTitle(String expectedPageTitle) {
		String actualTitle = driver.getTitle();
		Assert.assertTrue(actualTitle.contains(expectedPageTitle));
	}

	public void waitForAnElementToBeVisible(WebElement element, int seconds) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void clickAButton(WebElement element) {
		element.click();
	}

	public void enterAText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

	public void submitAForm(WebElement element) {
		element.submit();
	}
	
	public void clickAText(String textName) {
		String xpathString = "//*[text()='"+textName+"']";
		WebElement element = driver.findElement(By.xpath(xpathString));
		element.click();
	}
	
	public void selectAValueFromDropDown(WebElement element, String value) {
		// element.click();
		Select select = new Select(element);		
		select.selectByVisibleText(value);
	}

}
