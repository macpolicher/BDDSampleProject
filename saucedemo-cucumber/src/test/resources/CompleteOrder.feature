Feature: Complete Order Functionality
  I want to test the end to end Complete Order Functionality.

  @validCompleteOrder
  Scenario Outline: Valid end to end scenario for complete order
    Given I am on Sauce Demo Login Page
    When I enter username <username> in the username field
    And I enter password <password> in the password field
    And I click the login button
    Then I should be able to see the product lists
    When I add item to cart <item>
    And I view the cart
    And I click checkout from my cart
    And I enter my first name <firstName>
    And I enter my last name <lastName>
    And I enter my Zip Code <zipCode>
    And I click continue from my checkout information page
    And I click on finish
    Then I should be able to see the pony express logo

    Examples: 
      | username      | password     | item                     | firstName | lastName | zipCode |
      | standard_user | secret_sauce | Sauce Labs Onesie        | Tony      | Stark    |    1111 |
      | standard_user | secret_sauce | Sauce Labs Fleece Jacket | Peter     | Parker   |    2222 |
