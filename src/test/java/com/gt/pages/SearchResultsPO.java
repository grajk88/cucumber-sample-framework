package com.gt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;
import com.gt.utils.Base;

public class SearchResultsPO extends Base {

	@FindBy(css = "div[class*='search-results__item']")
	WebElement resultItems;
	
	@FindBy(id = "gtm-add")
	WebElement addToBagButton;
	
	@FindBy(css="a[class*='selectBox js-product-select--size']")
	WebElement sizeDropDown;

	public SearchResultsPO(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void selectAnItemName(String itemName) {		
		clickAText(itemName);
		waitForAnElementToBeVisible(addToBagButton, 30);
		clickAButton(addToBagButton);
	}

}
