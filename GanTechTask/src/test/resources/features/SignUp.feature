Feature: Verification of the register page validation functionality

  Background: User is open the Main page
    Given User navigate to the Main page - "https://moneygaming.qa.gameaccount.com/"
    Then User should see the Main page

  Scenario Outline: Verify validation functionality of 'SignUp' page
    Given As a new moneygaming.com player
    When I want to be able to register using my minimum details,title - '<title>', user name - '<userName>', last name -'<lastName>'
    Then So that I can see validation error message under birth date field - "This field is required"
    Examples:
      | title | userName | lastName |
      | Mr    | Borys    | Baskakov |