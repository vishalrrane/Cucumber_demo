Feature: Check the home page Functionality

  Background: User is Loged in
    Given user is on loginpage
    When user enter username "Admin" &  password "admin123"
    And Click on login Button
    Then User Navigate to Dashboard page


  Scenario: Check logout link
    When user click on profile
    Then Logout link is visible

  Scenario: check user management tab
    When user click on Admin
    Then user management tab displayed

  