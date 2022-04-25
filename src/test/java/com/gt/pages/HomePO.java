package com.gt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gt.utils.Base;

public class HomePO extends Base {

	@FindBy(name = "q")
	WebElement searchTextbox;

	public HomePO(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void searchProduct(String product) {
		enterAText(searchTextbox, product);
		submitAForm(searchTextbox);
	}

}
