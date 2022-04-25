@tag
Feature: Search and add a product to basket 

  @run
  Scenario Outline: "<testCaseID>" - Search product and add to basket
  
   Background: 
    Given running "<testCaseID>"
    
    Given I am in the home page
    When I search for the product
    Then I should be displayed with the search results
    And I add the item to my shopping basket

    Examples: 
      | testCaseID |
      | TC_001     |
      | TC_002     |
