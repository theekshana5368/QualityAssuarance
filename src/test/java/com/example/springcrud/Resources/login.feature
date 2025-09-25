Feature: Client Registration
  Description: This feature tests adding a new client with valid and invalid credentials


Scenario Outline: Login with valid and Invalid Credentials 

    Given User is on Home Page 
    When User navigate to Client Page
    Then User enters "<name>", "<email>" and "<address>"
    And User clicks Submit button
    Then User should get into Home page
    And new client should be added

Examples: 
        |Name|Email|Address|Case|
        |Gihan|gihan@gmail.com|Ratmalana|Valid|
        |Sahan|""|Ambepussa|InValid|