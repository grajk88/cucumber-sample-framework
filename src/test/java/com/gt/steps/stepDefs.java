package com.gt.steps;

import org.openqa.selenium.WebDriver;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import com.gt.pages.HomePO;
import com.gt.pages.SearchResultsPO;
import com.gt.utils.Base;
import com.gt.utils.Context;
import com.gt.utils.ExcelManipulation;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefs {

	private Context context;
	
	WebDriver driver;
	Base base;
	HomePO homePO;
	SearchResultsPO searchResultsPO;
	Scenario scenario;
	ExcelManipulation testData = new ExcelManipulation();
	Recordset recordset;

	public stepDefs(Context context) {
		this.context = context;
		driver = context.getDriver();
	}
	
	@Given("running {string}")
	public void testcaseid_is_executed(String testCaseId) {		
		try {
			System.out.println("Executing Test Case " + testCaseId);
			// recordset = testData.getTestData(testCaseId);
			while (recordset.next()) {
				System.out.println(recordset.getField("itemName") + "****************************");
			}
		} catch (FilloException e) {
			e.printStackTrace();
		}
		
	}

	@Given("I am in the home page")
	public void i_am_in_the_home_page() {
		base = new Base(driver);
		base.validatePageTitle("Online Clothes Shopping - Shop Latest Fashion – Matalan");
	}

	//@When("I search for {string}")
	@When("I search for the product")
	public void i_search_for_belt() {
		homePO = new HomePO(driver);
		//homePO.searchProduct(product);
	}

	@Then("I should be displayed with the search results")
	public void i_should_be_displyed_with_the_search_results() {
		// base.validatePageTitle("Search Results");
	}

	@Then("I add {string} to my shopping basket")
	@Then("I add the item to my shopping basket")
	public void i_add_black_pu_woven_belt_to_my_shopping_basket() {
		// searchResultsPO = new SearchResultsPO(driver);
		//searchResultsPO.selectAnItemName(itemName);
	}

}
