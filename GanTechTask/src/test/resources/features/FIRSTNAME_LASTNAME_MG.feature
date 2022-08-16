Feature: Verification of the register page validation functionality

  Background: User is open the Main page
    Given User navigate to the Main page - "https://moneygaming.qa.gameaccount.com/"
    Then User should see the Main page

  Scenario Outline: Verify validation functionality of valid value in 'Password' field
    Given As a new moneygaming.com player
    When Player should be able to enter valid password in password field - '<password>'
    And Player click on Join Now button
    Then Player should not see validation error message under password field - "Password must be at least 6 characters long with at least one number and at least one special character"
    Examples:
      | password |
      | 12345! |
      | abcd5@ |
      | 5@abcd |
      | #9abcd |
      | ab*8cd |
      | ab*8cd123456 |


  Scenario Outline: Verify validation functionality of invalid value in 'Password' field
    Given As a new moneygaming.com player
    When Player should be able to enter invalid password in password field - '<password>'
    And Player click on Join Now button
    Then Player should see validation error message under password field - "Password must be at least 6 characters long with at least one number and at least one special character"
    Examples:
      | password |
      | 1 |
      | a |
      | @ |
      | 5@abc |
      | 123456 |
      | !@#$%^& |
      | 1@345 |
      | asdfgh |
      | asdfg1 |
      | asdfg@ |

