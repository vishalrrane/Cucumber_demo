Feature: Feature to test Login Functionality

  Scenario: verify  login  successfully with valid credentials
    Given user is on the login page
    When user  enter  username and password
    And click on the Login button
    Then user is navigate to the dashboard page
