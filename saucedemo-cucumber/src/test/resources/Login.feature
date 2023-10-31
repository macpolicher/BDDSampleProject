Feature: Login Functionality
  I want to test the login functionality of Sauce Demo site.

  @validLogin
  Scenario Outline: Valid standard user Login functinality for Sauce Demo
    Given I am on Sauce Demo Login Page
    When I enter username <username> in the username field
    And I enter password <password> in the password field
    And I click the login button
    Then I should be able to see the product lists

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |

  @lockedOut
  Scenario Outline: Locked out user login functinality for Sauce Demo
    Given I am on Sauce Demo Login Page
    When I enter username <username> in the username field
    And I enter password <password> in the password field
    And I click the login button
    Then I should be able to see the locked out message

    Examples: 
      | username        | password     |
      | locked_out_user | secret_sauce |

